/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.item;

import java.util.List;

import com.sackcastellon.betterwood.api.Blocks;
import com.sackcastellon.betterwood.api.Tabs;
import com.sackcastellon.betterwood.lib.Reference;
import com.sackcastellon.betterwood.loader.LoreLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MetaItemDoor extends Item {

	private final int subtypes;

	private final ItemPartMaterial[] materials;
	
	private final String lore = LoreLoader.Material;
	
	private final IIcon[] iconArray;

	public MetaItemDoor(ItemPartMaterial[] material)
	{
		super();
		
		this.setCreativeTab(Tabs.tabBW);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Door");
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        
        this.materials = material;
        this.subtypes = material.length;
        
        this.iconArray = new IIcon[this.subtypes];
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4)
	{
    	int i = MathHelper.clamp_int(itemStack.getItemDamage(), 0, this.subtypes - 1);
		list.add(this.lore + ": " + materials[i].getLore());
		
		if (itemStack.isItemEnchanted())
		{
			list.add("");
		}
	}
	
	@Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
    	int i = MathHelper.clamp_int(itemStack.getItemDamage(), 0, this.subtypes - 1);
        return super.getUnlocalizedName() + "." + this.materials[i].getMaterial();
    }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tab, List list)
    {
		for (int meta = 0; meta < this.subtypes; ++meta) {
        	list.add(new ItemStack(item, 1, meta));
    	}
    }
	
	private String getPath(int damage) {
		return Reference.TexturePath + this.getUnlocalizedName().substring(5).toLowerCase() + this.materials[damage].getPath();
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < this.subtypes; ++i)
        {
            this.iconArray[i] = iconRegister.registerIcon(this.getPath(i));
        }
    }
	
	@Override
    public IIcon getIconFromDamage(int damage)
    {
        int i = MathHelper.clamp_int(damage, 0, this.subtypes - 1);
        return this.iconArray[i];
    }
	
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else
        {
            ++y;

            Block[] blocks = new Block[] {Blocks.OakDoor, Blocks.SpruceDoor, Blocks.BirchDoor, Blocks.JungleDoor, Blocks.AcaciaDoor, Blocks.DarkOakDoor};
        	int i = MathHelper.clamp_int(itemStack.getItemDamage(), 0, this.subtypes - 1);
        	
        	Block block = blocks[i];

            if (player.canPlayerEdit(x, y, z, par7, itemStack) && player.canPlayerEdit(x, y + 1, z, par7, itemStack))
            {
                if (!block.canPlaceBlockAt(world, x, y, z))
                {
                    return false;
                }
                else
                {
                    int i1 = MathHelper.floor_double((double)((player.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
                    placeDoorBlock(world, x, y, z, i1, block);
                    --itemStack.stackSize;
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }

    public static void placeDoorBlock(World world, int x, int y, int z, int par4, Block block)
    {
        byte b0 = 0;
        byte b1 = 0;

        if (par4 == 0)
        {
            b1 = 1;
        }

        if (par4 == 1)
        {
            b0 = -1;
        }

        if (par4 == 2)
        {
            b1 = -1;
        }

        if (par4 == 3)
        {
            b0 = 1;
        }

        int i1 = (world.getBlock(x - b0, y, z - b1).isBlockNormalCube() ? 1 : 0) + (world.getBlock(x - b0, y + 1, z - b1).isBlockNormalCube() ? 1 : 0);
        int j1 = (world.getBlock(x + b0, y, z + b1).isBlockNormalCube() ? 1 : 0) + (world.getBlock(x + b0, y + 1, z + b1).isBlockNormalCube() ? 1 : 0);

        boolean flag = world.getBlock(x - b0, y, z - b1) == block || world.getBlock(x - b0, y + 1, z - b1) == block;
        boolean flag1 = world.getBlock(x + b0, y, z + b1) == block || world.getBlock(x + b0, y + 1, z + b1) == block;
        boolean flag2 = false;

        if (flag && !flag1)
        {
            flag2 = true;
        }
        else if (j1 > i1)
        {
            flag2 = true;
        }
        
        world.setBlock(x, y, z, block, par4, 2);
        world.setBlock(x, y + 1, z, block, 8 | (flag2 ? 1 : 0), 2);
        
        world.notifyBlocksOfNeighborChange(x, y, z, block);
        world.notifyBlocksOfNeighborChange(x, y + 1, z, block);
    }
}