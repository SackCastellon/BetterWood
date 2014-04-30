/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.register;

import com.sackcastellon.betterwood.api.Items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryRegister
{
	public static void init()
	{
		register();
	}

	private static void register()
	{
		for(int i = 0; i < 6; ++i)
		{
			OreDictionary.registerOre("stickWood", new ItemStack(Items.Stick, 1, i));
		}
	}
}
