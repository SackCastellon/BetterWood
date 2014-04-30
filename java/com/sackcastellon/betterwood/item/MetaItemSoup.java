/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and his resources are licensed under a
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MetaItemSoup extends ItemFood {

	private final int subtypes;

	private final ItemPartMaterial[] materials;
	
	private final String lore = LoreLoader.Material;
	
	private final IIcon[] iconArray;

	private final Item returnItem;

	public MetaItemSoup(ItemPartMaterial[] material, Item item)
	{
		super(6, false);
		
		this.setCreativeTab(Tabs.tabBW);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Soup");
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        
        this.returnItem = item;
        
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
	
	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player)
	{
		super.onEaten(itemStack, world, player);
		return new ItemStack(returnItem, 1, itemStack.getItemDamage());
	}
}
