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
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MetaItemHangingEntity extends Item {

	private final int subtypes;

	private final ItemPartMaterial[] materials;
	
	private final String lore = LoreLoader.Material;
	
	private final IIcon[] iconArray;

	private final int type;

	private boolean isWip;

	public MetaItemHangingEntity(ItemPartMaterial[] material, int type)
	{
		super();
		
        this.type = type;
		
		this.setCreativeTab(Tabs.tabBW);
		this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
		
		if (type == 0)
		{
			this.setUnlocalizedName("Painting");
		}
		
		else if (type == 1)
		{
			this.setUnlocalizedName("ItemFrame");
		}
        
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
	
	@Override
    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10)
    {
        if (side == 0)
        {
            return false;
        }
        else if (side == 1)
        {
            return false;
        }
        else
        {
            int direction = Direction.facingToDirection[side];
            EntityHanging entityhanging = this.createHangingEntity(world, x, y, z, direction);

            if (!player.canPlayerEdit(x, y, z, side, itemStack))
            {
                return false;
            }
            else
            {
                if (entityhanging != null && entityhanging.onValidSurface())
                {
                    if (!world.isRemote)
                    {
                        world.spawnEntityInWorld(entityhanging);
                    }

                    --itemStack.stackSize;
                }

                return true;
            }
        }
    }

    /**
     * Create the hanging entity associated to this item.
     */
    private EntityHanging createHangingEntity(World world, int x, int y, int z, int par5)
    {
		if (type == 0)
		{
			return new EntityPainting(world, x, y, z, par5);
		}
		
		else if (type == 1)
		{
			return new EntityItemFrame(world, x, y, z, par5);
		}
		
		else
		{
			return null;
		}
    }
}