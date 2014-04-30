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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemSword extends net.minecraft.item.ItemSword {

	private final String pathHead = Reference.TexturePath + "head/sword/";
	private final String pathHandle = Reference.TexturePath + "handle/sword/";

	private IIcon headIcon;
	private IIcon handleIcon;
	
	private final String headMaterial;
	private final String handleMaterial;

	private final String headLore;
	private final String handleLore;
	
	private final String head = LoreLoader.HeadSword;
	private final String handle = LoreLoader.HandleSword;

	public ItemSword(ItemPartMaterial head, ItemPartMaterial handle)
	{
		super(head.getToolMaterial());
		
		this.setCreativeTab(Tabs.tabBW);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Sword");
        
    	this.headMaterial = head.getMaterial();
    	this.handleMaterial = handle.getMaterial();

    	this.headLore = head.getLore();
    	this.handleLore = handle.getLore();
	}
	
	public ItemSword(ItemPartMaterial head)
	{
		super(head.getToolMaterial());
		
		this.setCreativeTab(Tabs.tabBW);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Sword");
        
    	this.headMaterial = head.getMaterial();
    	this.handleMaterial = head.getMaterial();

    	this.headLore = head.getLore();
    	this.handleLore = head.getLore();
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4)
	{
		list.add(this.head + ": " + this.headLore);
		list.add(this.handle + ": " + this.handleLore);
		
		if (itemStack.isItemEnchanted())
		{
			list.add("");
		}
	}
	
    public String getUnlocalizedName(ItemStack par1ItemStack)
    {
        return super.getUnlocalizedName() + "." + this.headMaterial + "." + this.handleMaterial;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		this.headIcon = iconRegister.registerIcon(this.pathHead + this.headMaterial);
		this.handleIcon = iconRegister.registerIcon(this.pathHandle + this.handleMaterial);
    }
	
	@Override
	public boolean requiresMultipleRenderPasses()
	{
		return true;
	}
	
	@Override
    public int getRenderPasses(int metadata)
    {
        return 2;
    }
	
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(int metadata, int pass)
    {
		return pass == 1 ? this.headIcon : this.handleIcon;
    }
}