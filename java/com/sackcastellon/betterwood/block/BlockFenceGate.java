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
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockFenceGate extends net.minecraft.block.BlockFenceGate 
{
	private ItemPartMaterial material;
	
	public BlockFenceGate(ItemPartMaterial material)
	{
		super();

		this.material = material;
		
		this.setBlockName("FenceGate");
		this.setCreativeTab(Tabs.tabBW);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
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
	
	@Override
    public IIcon getIcon(int par1, int par2)
    {
        return this.blockIcon;
    }
}