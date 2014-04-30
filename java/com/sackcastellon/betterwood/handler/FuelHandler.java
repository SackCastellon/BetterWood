/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.handler;

import com.sackcastellon.betterwood.api.Blocks;
import com.sackcastellon.betterwood.api.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) 
	{
		Item item = fuel.getItem();
		
		// Items
		
		if(item == Items.Stick)
		{
			return 100;
		}
		
		// Tools
		
		else if(Items.isWoodenTool(item))
		{
			return 200;
		}
		
		// Blocks
		
		else if(Blocks.isWoodenBlock(item))
		{
			return 300;
		}
		
		else
		{
			return 0;	
		}
	}
}