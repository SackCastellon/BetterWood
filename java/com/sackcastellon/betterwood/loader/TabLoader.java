/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.loader;

import com.sackcastellon.betterwood.api.Tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabLoader {

	public static void init()
	{
		bw();
		if (Loader.isModLoaded("ExtrabiomesXL")) { ebxl(); }
		if (Loader.isModLoaded("BiomesOPlenty")) { bop(); }
	}
	
	private static void bw()
	{
		Tabs.tabBW = new CreativeTabs("BetterWood")
		{
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem()
			{
				return Items.iron_axe;
			}
        };
	}
	
	private static void ebxl()
	{
		Tabs.tabEBXL = new CreativeTabs("BetterWood.EBXL")
		{
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem()
			{
				return Items.iron_axe;
			}
        };
	}
	
	private static void bop()
	{
		Tabs.tabBoP = new CreativeTabs("BetterWood.BoP")
		{
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem()
			{
				return Items.iron_axe;
			}
        }; 
	}
}