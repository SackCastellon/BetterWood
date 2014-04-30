/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.item;

import com.sackcastellon.betterwood.loader.LoreLoader;

import net.minecraft.item.Item.ToolMaterial;

public enum ItemPartMaterial
{
	oak(ToolMaterial.WOOD, "Oak", LoreLoader.Oak, "vanilla"),
	spruce(ToolMaterial.WOOD, "Spruce", LoreLoader.Spruce, "vanilla"),
	birch(ToolMaterial.WOOD, "Birch", LoreLoader.Birch, "vanilla"),
	jungle(ToolMaterial.WOOD, "Jungle", LoreLoader.Jungle, "vanilla"),
	acacia(ToolMaterial.WOOD, "Acacia", LoreLoader.Acacia, "vanilla"),
	darkOak(ToolMaterial.WOOD, "DarkOak", LoreLoader.DarkOak, "vanilla"),
	stone(ToolMaterial.STONE, "Stone", LoreLoader.Stone, "vanilla"),
	iron(ToolMaterial.IRON, "Iron", LoreLoader.Iron, "vanilla"),
	gold(ToolMaterial.GOLD, "Gold", LoreLoader.Gold, "vanilla"),
	diamond(ToolMaterial.EMERALD, "Diamond", LoreLoader.Diamond, "vanilla"),
	
	ebxl_redwood(ToolMaterial.WOOD, "Redwood", LoreLoader.EBXL_Redwood, "ebxl"),
	ebxl_fir(ToolMaterial.WOOD, "Fir", LoreLoader.EBXL_Fir, "ebxl"),
	ebxl_acacia(ToolMaterial.WOOD, "Acacia", LoreLoader.EBXL_Acacia, "ebxl"),
	ebxl_cypress(ToolMaterial.WOOD, "Cypress", LoreLoader.EBXL_Cypress, "ebxl"),
	ebxl_japaneseMaple(ToolMaterial.WOOD, "JapaneseMaple", LoreLoader.EBXL_JapaneseMaple, "ebxl"),
	ebxl_rainbowEucalyptus(ToolMaterial.WOOD, "RainbowEucalyptus", LoreLoader.EBXL_RainbowEucalyptus, "ebxl"),
	ebxl_autumn(ToolMaterial.WOOD, "Autumn", LoreLoader.EBXL_Autumn, "ebxl"),
	ebxl_baldCypress(ToolMaterial.WOOD, "BaldCypress", LoreLoader.EBXL_BaldCypress, "ebxl"),
	ebxl_sakura(ToolMaterial.WOOD, "Sakura", LoreLoader.EBXL_Sakura, "ebxl"),
	
	;
	
	private final ToolMaterial toolMaterial;
	private final String material;
	private final String lore;
	private final String mod;
	
	private ItemPartMaterial(ToolMaterial toolMaterial, String material, String lore, String mod)
	{
		this.toolMaterial = toolMaterial;
		this.material = material;
		this.lore = lore;
		this.mod = mod;
	}
	
	public ToolMaterial getToolMaterial()
	{
		return this.toolMaterial;
	}
	
	public String getMaterial()
	{
		return this.material;
	}
	
	public String getLore()
	{
		return this.lore;
	}
	
	public String getMod()
	{
		return this.mod;
	}
	
	public String getPath()
	{
		return "/" + this.mod + "/" + this.material;
	}
}
