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

import com.sackcastellon.betterwood.api.Tabs;
import com.sackcastellon.betterwood.lib.Reference;
import com.sackcastellon.betterwood.loader.LoreLoader;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MetaItemSign extends Item {

	private final int subtypes;

	private final ItemPartMaterial[] materials;
	
	private final String lore = LoreLoader.Material;
	
	private final IIcon[] iconArray;

	private boolean isWip;

	public MetaItemSign(ItemPartMaterial[] material)
	{
		super();
		
		this.setCreativeTab(Tabs.tabBW);
		this.setMaxStackSize(16);
		this.setUnlocalizedName("Sign");
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
		
		if (isWip)
		{
			list.add("");
			list.add(EnumChatFormatting.RED + "This item is WIP,");
			list.add(EnumChatFormatting.RED + "so maybe still have no function.");
		}
		
		if (itemStack.isItemEnchanted())
		{
			list.add("");
		}
	}
	
	public Item setWip(boolean isWip)
	{
		if(isWip)
		{
			this.isWip = true;
		}
		
		else
		{
			this.isWip = false;
		}
		return this;
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
	
	private String getPath(int damage)
	{
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

	@Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10)
    {
        if (par7 == 0)
        {
            return false;
        }
        else if (!world.getBlock(x, y, z).getMaterial().isSolid())
        {
            return false;
        }
        else
        {
            if (par7 == 1)
            {
                ++y;
            }

            if (par7 == 2)
            {
                --z;
            }

            if (par7 == 3)
            {
                ++z;
            }

            if (par7 == 4)
            {
                --x;
            }

            if (par7 == 5)
            {
                ++x;
            }

            if (!player.canPlayerEdit(x, y, z, par7, itemStack))
            {
                return false;
            }
            else if (!Blocks.standing_sign.canPlaceBlockAt(world, x, y, z))
            {
                return false;
            }
            else if (world.isRemote)
            {
                return true;
            }
            else
            {
                if (par7 == 1)
                {
                    int i1 = MathHelper.floor_double((double)((player.rotationYaw + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15;
                    world.setBlock(x, y, z, Blocks.standing_sign, i1, 3);
                }
                else
                {
                    world.setBlock(x, y, z, Blocks.wall_sign, par7, 3);
                }

                --itemStack.stackSize;
                TileEntitySign tileentitysign = (TileEntitySign)world.getTileEntity(x, y, z);

                if (tileentitysign != null)
                {
                    player.func_146100_a(tileentitysign);
                }

                return true;
            }
        }
    }
}