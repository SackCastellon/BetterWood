/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.loader;

import java.util.Iterator;
import java.util.List;

import com.sackcastellon.betterwood.api.Blocks;
import com.sackcastellon.betterwood.api.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeLoader
{
	public static void init()
	{
		vanilla.init();
	}
	
	private static class vanilla
	{
		private static void init()
		{
			/* Vanilla */
			remove();
			patch();
			
			/* Blocks */
			blocks();
			bookshelf();
			button();
			fence();
			fenceGate();
			pressurePlate();
			lever();
			torchOn();
			ladder();
			trapdoor();
			
			/* Items */
			items();
			sword();
			shovel();
			pickaxe();
			axe();
			hoe();
			bow();
		}
		
		@SuppressWarnings("unchecked")
		private static void remove()
		{
			List<IRecipe> recipe = CraftingManager.getInstance().getRecipeList();
			
			Iterator<IRecipe> r = recipe.iterator();
	          
			while (r.hasNext()) {
				
				ItemStack is = r.next().getRecipeOutput();
				
				if (is != null && (
						is.getItem() == net.minecraft.init.Items.stick ||
						is.getItem() == net.minecraft.init.Items.bowl ||
						is.getItem() == net.minecraft.init.Items.wooden_door ||
						is.getItem() == net.minecraft.init.Items.wooden_sword ||
						is.getItem() == net.minecraft.init.Items.stone_sword ||
						is.getItem() == net.minecraft.init.Items.iron_sword ||
						is.getItem() == net.minecraft.init.Items.golden_sword ||
						is.getItem() == net.minecraft.init.Items.diamond_sword ||
						is.getItem() == net.minecraft.init.Items.wooden_shovel ||
						is.getItem() == net.minecraft.init.Items.stone_shovel ||
						is.getItem() == net.minecraft.init.Items.iron_shovel ||
						is.getItem() == net.minecraft.init.Items.golden_shovel ||
						is.getItem() == net.minecraft.init.Items.diamond_shovel ||
						is.getItem() == net.minecraft.init.Items.wooden_pickaxe ||
						is.getItem() == net.minecraft.init.Items.stone_pickaxe ||
						is.getItem() == net.minecraft.init.Items.iron_pickaxe ||
						is.getItem() == net.minecraft.init.Items.golden_pickaxe ||
						is.getItem() == net.minecraft.init.Items.diamond_pickaxe ||
						is.getItem() == net.minecraft.init.Items.wooden_axe ||
						is.getItem() == net.minecraft.init.Items.stone_axe ||
						is.getItem() == net.minecraft.init.Items.iron_axe ||
						is.getItem() == net.minecraft.init.Items.golden_axe ||
						is.getItem() == net.minecraft.init.Items.diamond_axe ||
						is.getItem() == net.minecraft.init.Items.wooden_hoe ||
						is.getItem() == net.minecraft.init.Items.stone_hoe ||
						is.getItem() == net.minecraft.init.Items.iron_hoe ||
						is.getItem() == net.minecraft.init.Items.golden_hoe ||
						is.getItem() == net.minecraft.init.Items.diamond_hoe ||
						is.getItem() == net.minecraft.init.Items.bow ||
						is.getItem() == net.minecraft.init.Items.sign ||
						is.getItem() == net.minecraft.init.Items.fishing_rod ||
						is.getItem() == net.minecraft.init.Items.item_frame ||
						is.getItem() == net.minecraft.init.Items.painting ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.fence) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.fence_gate) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.ladder) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.rail) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.golden_rail) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.activator_rail) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.tripwire_hook) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.wooden_button) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.wooden_pressure_plate) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.bookshelf) ||
						is.getItem() == Item.getItemFromBlock(net.minecraft.init.Blocks.lit_pumpkin)))
				{
					r.remove();
				}
			}
		}
		
		private static void patch()
		{
			for(int a = 0; a < 6; ++a)
			{
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.wooden_sword), new Object[] {"w", "w", "s", 'w', "plankWood", 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.stone_sword), new Object[] {"w", "w", "s", 'w', new ItemStack(net.minecraft.init.Blocks.cobblestone), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.iron_sword), new Object[] {"w", "w", "s", 'w', new ItemStack(net.minecraft.init.Items.iron_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.golden_sword), new Object[] {"w", "w", "s", 'w', new ItemStack(net.minecraft.init.Items.gold_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.diamond_sword), new Object[] {"w", "w", "s", 'w', new ItemStack(net.minecraft.init.Items.diamond), 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.wooden_shovel), new Object[] {"w", "s", "s", 'w', "plankWood", 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.stone_shovel), new Object[] {"w", "s", "s", 'w', new ItemStack(net.minecraft.init.Blocks.cobblestone), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.iron_shovel), new Object[] {"w", "s", "s", 'w', new ItemStack(net.minecraft.init.Items.iron_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.golden_shovel), new Object[] {"w", "s", "s", 'w', new ItemStack(net.minecraft.init.Items.gold_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.diamond_shovel), new Object[] {"w", "s", "s", 'w', new ItemStack(net.minecraft.init.Items.diamond), 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.wooden_pickaxe), new Object[] {"www", " s ", " s ", 'w', "plankWood", 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.stone_pickaxe), new Object[] {"www", " s ", " s ", 'w', new ItemStack(net.minecraft.init.Blocks.cobblestone), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.iron_pickaxe), new Object[] {"www", " s ", " s ", 'w', new ItemStack(net.minecraft.init.Items.iron_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.golden_pickaxe), new Object[] {"www", " s ", " s ", 'w', new ItemStack(net.minecraft.init.Items.gold_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.diamond_pickaxe), new Object[] {"www", " s ", " s ", 'w', new ItemStack(net.minecraft.init.Items.diamond), 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.wooden_axe), new Object[] {"ww", "ws", " s", 'w', "plankWood", 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.stone_axe), new Object[] {"ww", "ws", " s", 'w', new ItemStack(net.minecraft.init.Blocks.cobblestone), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.iron_axe), new Object[] {"ww", "ws", " s", 'w', new ItemStack(net.minecraft.init.Items.iron_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.golden_axe), new Object[] {"ww", "ws", " s", 'w', new ItemStack(net.minecraft.init.Items.gold_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.diamond_axe), new Object[] {"ww", "ws", " s", 'w', new ItemStack(net.minecraft.init.Items.diamond), 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.wooden_hoe), new Object[] {"ww", " s", " s", 'w', "plankWood", 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.stone_hoe), new Object[] {"ww", " s", " s", 'w', new ItemStack(net.minecraft.init.Blocks.cobblestone), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.iron_hoe), new Object[] {"ww", " s", " s", 'w', new ItemStack(net.minecraft.init.Items.iron_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.golden_hoe), new Object[] {"ww", " s", " s", 'w', new ItemStack(net.minecraft.init.Items.gold_ingot), 's', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.diamond_hoe), new Object[] {"ww", " s", " s", 'w', new ItemStack(net.minecraft.init.Items.diamond), 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.bow), new Object[] {" ws", "w s", " ws", 's', new ItemStack(net.minecraft.init.Items.string), 'w', "stickWood"}));
								
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.stick, 4), new Object[] {"w", "w", 'w', "plankWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.bowl, 4), new Object[] {"w w", " w ", 'w', "plankWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.wooden_door, 1), new Object[] {"ww", "ww", "ww", 'w', "plankWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.sign, 3), new Object[] {"www", "www", " s ", 'w', "plankWood", 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.fishing_rod, 1), new Object[] {"  w", " ws", "w s", 'w', "stickWood", 's', new ItemStack(net.minecraft.init.Items.string)}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.item_frame, 1), new Object[] {"sss", "sls", "sss", 'l', new ItemStack(net.minecraft.init.Items.leather), 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.painting, 1), new Object[] {"sss", "sws", "sss", 'l', new ItemStack(net.minecraft.init.Blocks.wool, 1, a), 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Items.arrow, 1), new Object[] {"X", "#", "Y", 'Y', new ItemStack(net.minecraft.init.Items.feather), 'X', new ItemStack(net.minecraft.init.Items.flint), '#', "stickWood"}));
				
				//=========================================================================================//
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.fence, 2), new Object[] {"sss", "sss", 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.fence_gate, 1), new Object[] {"sws", "sws", 'w', "plankWood", 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.ladder, 3), new Object[] {"s s", "sss", "s s", 's', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.activator_rail, 6), new Object[] {"X X", "XSX", "X X", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'S', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.activator_rail, 6), new Object[] {"X X", "XSX", "XRX", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'R', new ItemStack(net.minecraft.init.Items.redstone), 'S', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.activator_rail, 6), new Object[] {"XSX", "X#X", "XSX", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), '#', new ItemStack(net.minecraft.init.Blocks.redstone_torch), 'S', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.tripwire_hook, 2), new Object[] {"I", "S", "#", '#', "plankWood", 'S', "stickWood", 'I', new ItemStack(net.minecraft.init.Items.iron_ingot)}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.torch, 4), new Object[] {"X", "#", 'X', new ItemStack(net.minecraft.init.Items.coal, 1, a), '#', "stickWood"}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.redstone_torch, 1), new Object[] {"X", "#", 'X', new ItemStack(net.minecraft.init.Items.redstone), '#', "stickWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.wooden_button, 1), new Object[] {"w", 'w', "plankWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.wooden_pressure_plate, 1), new Object[] {"ww", 'w', "plankWood"}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.bookshelf, 1), new Object[] {"###", "XXX", "###", '#', "plankWood", 'X', new ItemStack(net.minecraft.init.Items.book)}));
				
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.lit_pumpkin, 4), new Object[] {"X", "#", 'X', new ItemStack(net.minecraft.init.Blocks.pumpkin), '#', new ItemStack(Blocks.OakTorchOn)}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.lit_pumpkin, 4), new Object[] {"X", "#", 'X', new ItemStack(net.minecraft.init.Blocks.pumpkin), '#', new ItemStack(Blocks.SpruceTorchOn)}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.lit_pumpkin, 4), new Object[] {"X", "#", 'X', new ItemStack(net.minecraft.init.Blocks.pumpkin), '#', new ItemStack(Blocks.BirchTorchOn)}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.lit_pumpkin, 4), new Object[] {"X", "#", 'X', new ItemStack(net.minecraft.init.Blocks.pumpkin), '#', new ItemStack(Blocks.JungleTorchOn)}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.lit_pumpkin, 4), new Object[] {"X", "#", 'X', new ItemStack(net.minecraft.init.Blocks.pumpkin), '#', new ItemStack(Blocks.AcaciaTorchOn)}));
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(net.minecraft.init.Blocks.lit_pumpkin, 4), new Object[] {"X", "#", 'X', new ItemStack(net.minecraft.init.Blocks.pumpkin), '#', new ItemStack(Blocks.DarkOakTorchOn)}));
			}
		}
		
		private static void blocks() {}
		
		private static void bookshelf()
		{
	        GameRegistry.addRecipe(new ItemStack(Blocks.OakBookshelf, 1), new Object[] {"PPP", "BBB", "PPP", 'P', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'B', net.minecraft.init.Items.book});
	        GameRegistry.addRecipe(new ItemStack(Blocks.SpruceBookshelf, 1), new Object[] {"PPP", "BBB", "PPP", 'P', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'B', net.minecraft.init.Items.book});
	        GameRegistry.addRecipe(new ItemStack(Blocks.BirchBookshelf, 1), new Object[] {"PPP", "BBB", "PPP", 'P', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'B', net.minecraft.init.Items.book});
	        GameRegistry.addRecipe(new ItemStack(Blocks.JungleBookshelf, 1), new Object[] {"PPP", "BBB", "PPP", 'P', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'B', net.minecraft.init.Items.book});
	        GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaBookshelf, 1), new Object[] {"PPP", "BBB", "PPP", 'P', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'B', net.minecraft.init.Items.book});
	        GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakBookshelf, 1), new Object[] {"PPP", "BBB", "PPP", 'P', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'B', net.minecraft.init.Items.book});
		}
		
		private static void button()
		{
			GameRegistry.addRecipe(new ItemStack(Blocks.OakButton, 1), new Object[] {"W", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Blocks.SpruceButton, 1), new Object[] {"W", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Blocks.BirchButton, 1), new Object[] {"W", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Blocks.JungleButton, 1), new Object[] {"W", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaButton, 1), new Object[] {"W", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakButton, 1), new Object[] {"W", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5)});
		}
		
		private static void fence()
		{
	        GameRegistry.addRecipe(new ItemStack(Blocks.OakFence, 2), new Object[] {"###", "###", '#', new ItemStack(Items.Stick, 1, 0)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.SpruceFence, 2), new Object[] {"###", "###", '#', new ItemStack(Items.Stick, 1, 1)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.BirchFence, 2), new Object[] {"###", "###", '#', new ItemStack(Items.Stick, 1, 2)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.JungleFence, 2), new Object[] {"###", "###", '#', new ItemStack(Items.Stick, 1, 3)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaFence, 2), new Object[] {"###", "###", '#', new ItemStack(Items.Stick, 1, 4)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakFence, 2), new Object[] {"###", "###", '#', new ItemStack(Items.Stick, 1, 5)});
		}
		
		private static void fenceGate()
		{
	        GameRegistry.addRecipe(new ItemStack(Blocks.OakFenceGate), new Object[] {"ZXZ", "ZXZ", 'Z', new ItemStack(Items.Stick, 1, 0), 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.SpruceFenceGate), new Object[] {"ZXZ", "ZXZ", 'Z', new ItemStack(Items.Stick, 1, 1), 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.BirchFenceGate), new Object[] {"ZXZ", "ZXZ", 'Z', new ItemStack(Items.Stick, 1, 2), 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.JungleFenceGate), new Object[] {"ZXZ", "ZXZ", 'Z', new ItemStack(Items.Stick, 1, 3), 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaFenceGate), new Object[] {"ZXZ", "ZXZ", 'Z', new ItemStack(Items.Stick, 1, 4), 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakFenceGate), new Object[] {"ZXZ", "ZXZ", 'Z', new ItemStack(Items.Stick, 1, 5), 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5)});
		}
		
		private static void pressurePlate()
		{
			GameRegistry.addRecipe(new ItemStack(Blocks.OakPressurePlate), new Object[] {"WW", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Blocks.SprucePressurePlate), new Object[] {"WW", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Blocks.BirchPressurePlate), new Object[] {"WW", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Blocks.JunglePressurePlate), new Object[] {"WW", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaPressurePlate), new Object[] {"WW", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakPressurePlate), new Object[] {"WW", 'W', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5)});
		}
		
		private static void lever()
		{
	        GameRegistry.addRecipe(new ItemStack(Blocks.OakLever), new Object[] {"X", "#", 'X', new ItemStack(Items.Stick, 1, 0), '#', net.minecraft.init.Blocks.cobblestone});
	        GameRegistry.addRecipe(new ItemStack(Blocks.SpruceLever), new Object[] {"X", "#", 'X', new ItemStack(Items.Stick, 1, 1), '#', net.minecraft.init.Blocks.cobblestone});
	        GameRegistry.addRecipe(new ItemStack(Blocks.BirchLever), new Object[] {"X", "#", 'X', new ItemStack(Items.Stick, 1, 2), '#', net.minecraft.init.Blocks.cobblestone});
	        GameRegistry.addRecipe(new ItemStack(Blocks.JungleLever), new Object[] {"X", "#", 'X', new ItemStack(Items.Stick, 1, 3), '#', net.minecraft.init.Blocks.cobblestone});
	        GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaLever), new Object[] {"X", "#", 'X', new ItemStack(Items.Stick, 1, 4), '#', net.minecraft.init.Blocks.cobblestone});
	        GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakLever), new Object[] {"X", "#", 'X', new ItemStack(Items.Stick, 1, 5), '#', net.minecraft.init.Blocks.cobblestone});
		}
		
		private static void torchOn()
		{
			for(int i = 0; i < 2; ++i)
			{
		        GameRegistry.addRecipe(new ItemStack(Blocks.OakTorchOn, 4), new Object[] {"C", "S", 'C', new ItemStack(net.minecraft.init.Items.coal, 1, i), 'S', new ItemStack(Items.Stick, 1, 0)});
		        GameRegistry.addRecipe(new ItemStack(Blocks.SpruceTorchOn, 4), new Object[] {"C", "S", 'C', new ItemStack(net.minecraft.init.Items.coal, 1, i), 'S', new ItemStack(Items.Stick, 1, 1)});
		        GameRegistry.addRecipe(new ItemStack(Blocks.BirchTorchOn, 4), new Object[] {"C", "S", 'C', new ItemStack(net.minecraft.init.Items.coal, 1, i), 'S', new ItemStack(Items.Stick, 1, 2)});
		        GameRegistry.addRecipe(new ItemStack(Blocks.JungleTorchOn, 4), new Object[] {"C", "S", 'C', new ItemStack(net.minecraft.init.Items.coal, 1, i), 'S', new ItemStack(Items.Stick, 1, 3)});
		        GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaTorchOn, 4), new Object[] {"C", "S", 'C', new ItemStack(net.minecraft.init.Items.coal, 1, i), 'S', new ItemStack(Items.Stick, 1, 4)});
		        GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakTorchOn, 4), new Object[] {"C", "S", 'C', new ItemStack(net.minecraft.init.Items.coal, 1, i), 'S', new ItemStack(Items.Stick, 1, 5)});
			}
		}
		
		private static void ladder()
		{
	        GameRegistry.addRecipe(new ItemStack(Blocks.OakLadder, 3), new Object[] {"X X", "XXX", "X X", 'X', new ItemStack(Items.Stick, 1, 0)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.SpruceLadder, 3), new Object[] {"X X", "XXX", "X X", 'X', new ItemStack(Items.Stick, 1, 1)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.BirchLadder, 3), new Object[] {"X X", "XXX", "X X", 'X', new ItemStack(Items.Stick, 1, 2)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.JungleLadder, 3), new Object[] {"X X", "XXX", "X X", 'X', new ItemStack(Items.Stick, 1, 3)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaLadder, 3), new Object[] {"X X", "XXX", "X X", 'X', new ItemStack(Items.Stick, 1, 4)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakLadder, 3), new Object[] {"X X", "XXX", "X X", 'X', new ItemStack(Items.Stick, 1, 5)});
		}
		
		private static void trapdoor()
		{
	        GameRegistry.addRecipe(new ItemStack(Blocks.OakTrapdoor, 2), new Object[] {"XXX", "XXX", 'X', new ItemStack(Items.Stick, 1, 0)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.SpruceTrapdoor, 2), new Object[] {"XXX", "XXX", 'X', new ItemStack(Items.Stick, 1, 1)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.BirchTrapdoor, 2), new Object[] {"XXX", "XXX", 'X', new ItemStack(Items.Stick, 1, 2)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.JungleTrapdoor, 2), new Object[] {"XXX", "XXX", 'X', new ItemStack(Items.Stick, 1, 3)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.AcaciaTrapdoor, 2), new Object[] {"XXX", "XXX", 'X', new ItemStack(Items.Stick, 1, 4)});
	        GameRegistry.addRecipe(new ItemStack(Blocks.DarkOakTrapdoor, 2), new Object[] {"XXX", "XXX", 'X', new ItemStack(Items.Stick, 1, 5)});
		}

		private static void items()
		{
			for(int a = 0; a < 6; ++a)
			{
				GameRegistry.addRecipe(new ItemStack(Items.Stick, 4, a), new Object[] {"p", "p", 'p', new ItemStack(net.minecraft.init.Blocks.planks, 1, a)});
				
				GameRegistry.addRecipe(new ItemStack(Items.Bowl, 4, a), new Object[] {"p p", " p ", 'p', new ItemStack(net.minecraft.init.Blocks.planks, 1, a)});
				
				GameRegistry.addShapelessRecipe(new ItemStack(Items.Soup, 1, a), new Object[] {new ItemStack(net.minecraft.init.Blocks.red_mushroom), new ItemStack(net.minecraft.init.Blocks.brown_mushroom), new ItemStack(Items.Bowl, 1, a)});
				
				GameRegistry.addRecipe(new ItemStack(Items.Door, 1, a), new Object[] {"pp", "pp", "pp", 'p', new ItemStack(net.minecraft.init.Blocks.planks, 1, a)});
			}
		}
		
		private static void sword()
		{
			GameRegistry.addRecipe(new ItemStack(Items.OakOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.OakSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.OakBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.OakJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.OakAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.OakDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.SpruceOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.BirchOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.JungleOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.StoneOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.IronOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.IronSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.IronBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.IronJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.IronAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.IronDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.GoldOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.DiamondOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondSpruceSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondBirchSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondJungleSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondAcaciaSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondDarkOakSword), new Object[] {"X", "X", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 5)});
		}
		
		private static void shovel()
		{
			GameRegistry.addRecipe(new ItemStack(Items.OakOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.OakSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.OakBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.OakJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.OakAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.OakDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.SpruceOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.BirchOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.JungleOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.StoneOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.IronOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.IronSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.IronBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.IronJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.IronAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.IronDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.GoldOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.DiamondOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondSpruceShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondBirchShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondJungleShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondAcaciaShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondDarkOakShovel), new Object[] {"X", "Y", "Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 5)});
		}
		
		private static void pickaxe()
		{
			GameRegistry.addRecipe(new ItemStack(Items.OakOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.OakSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.OakBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.OakJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.OakAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.OakDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.SpruceOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.BirchOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.JungleOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.StoneOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.IronOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.IronSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.IronBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.IronJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.IronAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.IronDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.GoldOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.DiamondOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondSprucePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondBirchPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondJunglePickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondAcaciaPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondDarkOakPickaxe), new Object[] {"XXX", " Y ", " Y ", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 5)});
		}
		
		private static void axe()
		{
			GameRegistry.addRecipe(new ItemStack(Items.OakOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.OakSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.OakBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.OakJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.OakAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.OakDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.SpruceOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.BirchOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.JungleOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.StoneOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.IronOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.IronSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.IronBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.IronJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.IronAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.IronDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.GoldOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.DiamondOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondSpruceAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondBirchAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondJungleAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondAcaciaAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondDarkOakAxe), new Object[] {"XX", "XY", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 5)});
		}
		
		private static void hoe()
		{
			GameRegistry.addRecipe(new ItemStack(Items.OakOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.OakSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.OakBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.OakJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.OakAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.OakDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 0), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.SpruceOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.SpruceDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 1), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.BirchOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.BirchDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 2), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.JungleOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.JungleDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 3), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.AcaciaDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 4), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DarkOakDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.planks, 1, 5), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			
			GameRegistry.addRecipe(new ItemStack(Items.StoneOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.StoneDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Blocks.cobblestone), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.IronOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.IronSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.IronBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.IronJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.IronAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.IronDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.iron_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.GoldOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.GoldDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.gold_ingot), 'Y', new ItemStack(Items.Stick, 1, 5)});
			
			GameRegistry.addRecipe(new ItemStack(Items.DiamondOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 0)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondSpruceHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 1)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondBirchHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondJungleHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 3)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondAcaciaHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 4)});
			GameRegistry.addRecipe(new ItemStack(Items.DiamondDarkOakHoe), new Object[] {"XX", " Y", " Y", 'X', new ItemStack(net.minecraft.init.Items.diamond), 'Y', new ItemStack(Items.Stick, 1, 5)});
		}

		private static void bow()
		{	
	        GameRegistry.addRecipe(new ItemStack(Items.SpruceBow, 1), new Object[] {" #X", "# X", " #X", 'X', new ItemStack(net.minecraft.init.Items.string), '#', new ItemStack(Items.Stick, 1, 0)});
	        GameRegistry.addRecipe(new ItemStack(Items.SpruceBow, 1), new Object[] {" #X", "# X", " #X", 'X', new ItemStack(net.minecraft.init.Items.string), '#', new ItemStack(Items.Stick, 1, 1)});
	        GameRegistry.addRecipe(new ItemStack(Items.BirchBow, 1), new Object[] {" #X", "# X", " #X", 'X', new ItemStack(net.minecraft.init.Items.string), '#', new ItemStack(Items.Stick, 1, 2)});
	        GameRegistry.addRecipe(new ItemStack(Items.JungleBow, 1), new Object[] {" #X", "# X", " #X", 'X', new ItemStack(net.minecraft.init.Items.string), '#', new ItemStack(Items.Stick, 1, 3)});
	        GameRegistry.addRecipe(new ItemStack(Items.AcaciaBow, 1), new Object[] {" #X", "# X", " #X", 'X', new ItemStack(net.minecraft.init.Items.string), '#', new ItemStack(Items.Stick, 1, 4)});
	        GameRegistry.addRecipe(new ItemStack(Items.DarkOakBow, 1), new Object[] {" #X", "# X", " #X", 'X', new ItemStack(net.minecraft.init.Items.string), '#', new ItemStack(Items.Stick, 1, 5)});
		}
	}
}