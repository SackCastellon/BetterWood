/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.block;

import com.sackcastellon.betterwood.api.Tabs;
import com.sackcastellon.betterwood.item.ItemPartMaterial;
import com.sackcastellon.betterwood.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockPressurePlate extends net.minecraft.block.BlockPressurePlate
{
	private ItemPartMaterial material;

	public BlockPressurePlate(ItemPartMaterial material)
	{
		super(null, Material.wood, Sensitivity.everything);
		
		this.material = material;
		
		this.setBlockName("PressurePlate");
		this.setCreativeTab(Tabs.tabBW);
		this.setHardness(0.5F);
		this.setStepSound(soundTypeWood);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return super.getUnlocalizedName() + "." + this.material.getMaterial();
	}
	
	public String getTexturePath()
	{
		return Reference.TexturePath + "planks" + this.material.getPath();
	}
	
	@Override
	@SideOnly(Side.CLIENT)		
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(this.getTexturePath());
	}
}