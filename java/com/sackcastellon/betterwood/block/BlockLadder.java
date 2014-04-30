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

import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLadder extends net.minecraft.block.BlockLadder
{
	private ItemPartMaterial material;

	public BlockLadder(ItemPartMaterial material) {
		super();
		
		this.material = material;
		
		this.setBlockName("Ladder");
    	this.setCreativeTab(Tabs.tabBW);
		this.setHardness(0.4F);
		this.setStepSound(soundTypeWood);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return super.getUnlocalizedName() + "." + this.material.getMaterial();
	}
	
	public String getTexturePath()
	{
		return Reference.TexturePath + "ladder" + this.material.getPath();
	}
	
	@Override
	@SideOnly(Side.CLIENT)		
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(this.getTexturePath());
	}
}