/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.register;

import com.sackcastellon.betterwood.api.Blocks;

//import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister
{
	public static void init()
	{
    	vanilla();
//    	if (Loader.isModLoaded("ExtrabiomesXL")) { ebxl(); }
//    	if (Loader.isModLoaded("BiomesOPlenty")) { bop(); }
	}
	
	private static void vanilla()
	{
		GameRegistry.registerBlock(Blocks.OakBookshelf, "Oak_Bookshelf");
		GameRegistry.registerBlock(Blocks.SpruceBookshelf, "Soruce_Bookshelf");
		GameRegistry.registerBlock(Blocks.BirchBookshelf, "Birch_Bookshelf");
		GameRegistry.registerBlock(Blocks.JungleBookshelf, "Jungle_Bookshelf");
		GameRegistry.registerBlock(Blocks.AcaciaBookshelf, "Acacia_Bookshelf");
		GameRegistry.registerBlock(Blocks.DarkOakBookshelf, "DarkOak_Bookshelf");

		GameRegistry.registerBlock(Blocks.OakFence, "Oak_Fence");
		GameRegistry.registerBlock(Blocks.SpruceFence, "Spruce_Fence");
		GameRegistry.registerBlock(Blocks.BirchFence, "Birch_Fence");
		GameRegistry.registerBlock(Blocks.JungleFence, "Jungle_Fence");
		GameRegistry.registerBlock(Blocks.AcaciaFence, "Acacia_Fence");
		GameRegistry.registerBlock(Blocks.DarkOakFence, "DarkOak_Fence");

		GameRegistry.registerBlock(Blocks.OakFenceGate, "Oak_FenceGate");
		GameRegistry.registerBlock(Blocks.SpruceFenceGate, "Spruce_FenceGate");
		GameRegistry.registerBlock(Blocks.BirchFenceGate, "Birch_FenceGate");
		GameRegistry.registerBlock(Blocks.JungleFenceGate, "Jungle_FenceGate");
		GameRegistry.registerBlock(Blocks.AcaciaFenceGate, "Acacia_FenceGate");
		GameRegistry.registerBlock(Blocks.DarkOakFenceGate, "DarkOak_FenceGate");

		GameRegistry.registerBlock(Blocks.OakButton, "Oak_Button");
		GameRegistry.registerBlock(Blocks.SpruceButton, "Spruce_Button");
		GameRegistry.registerBlock(Blocks.BirchButton, "Birch_Button");
		GameRegistry.registerBlock(Blocks.JungleButton, "Jungle_Button");
		GameRegistry.registerBlock(Blocks.AcaciaButton, "Acacia_Button");
		GameRegistry.registerBlock(Blocks.DarkOakButton, "DarkOak_Button");

		GameRegistry.registerBlock(Blocks.OakPressurePlate, "Oak_PressurePlate");
		GameRegistry.registerBlock(Blocks.SprucePressurePlate, "Spruce_PressurePlate");
		GameRegistry.registerBlock(Blocks.BirchPressurePlate, "Birch_PressurePlate");
		GameRegistry.registerBlock(Blocks.JunglePressurePlate, "Jungle_PressurePlate");
		GameRegistry.registerBlock(Blocks.AcaciaPressurePlate, "Acacia_PressurePlate");
		GameRegistry.registerBlock(Blocks.DarkOakPressurePlate, "DarkOak_PressurePlate");

		GameRegistry.registerBlock(Blocks.OakLever, "Oak_Lever");
		GameRegistry.registerBlock(Blocks.SpruceLever, "Spruce_Lever");
		GameRegistry.registerBlock(Blocks.BirchLever, "Birch_Lever");
		GameRegistry.registerBlock(Blocks.JungleLever, "Jungle_Lever");
		GameRegistry.registerBlock(Blocks.AcaciaLever, "Acacia_Lever");
		GameRegistry.registerBlock(Blocks.DarkOakLever, "DarkOak_Lever");

		GameRegistry.registerBlock(Blocks.OakLadder, "Oak_Ladder");
		GameRegistry.registerBlock(Blocks.SpruceLadder, "Spruce_Ladder");
		GameRegistry.registerBlock(Blocks.BirchLadder, "Birch_Ladder");
		GameRegistry.registerBlock(Blocks.JungleLadder, "Jungle_Ladder");
		GameRegistry.registerBlock(Blocks.AcaciaLadder, "Acacia_Ladder");
		GameRegistry.registerBlock(Blocks.DarkOakLadder, "DarkOak_Ladder");

		GameRegistry.registerBlock(Blocks.OakTorchOn, "Oak_Torch");
		GameRegistry.registerBlock(Blocks.SpruceTorchOn, "Spruce_Torch");
		GameRegistry.registerBlock(Blocks.BirchTorchOn, "Birch_Torch");
		GameRegistry.registerBlock(Blocks.JungleTorchOn, "Jungle_Torch");
		GameRegistry.registerBlock(Blocks.AcaciaTorchOn, "Acacia_Torch");
		GameRegistry.registerBlock(Blocks.DarkOakTorchOn, "DarkOak_Torch");

		GameRegistry.registerBlock(Blocks.OakDoor, "Oak_Door");
		GameRegistry.registerBlock(Blocks.SpruceDoor, "Spruce_Door");
		GameRegistry.registerBlock(Blocks.BirchDoor, "Birch_Door");
		GameRegistry.registerBlock(Blocks.JungleDoor, "Jungle_Door");
		GameRegistry.registerBlock(Blocks.AcaciaDoor, "Acacia_Door");
		GameRegistry.registerBlock(Blocks.DarkOakDoor, "DarkOak_Door");
		
		GameRegistry.registerBlock(Blocks.OakTrapdoor, "Oak_Trapdoor");
		GameRegistry.registerBlock(Blocks.SpruceTrapdoor, "Spruce_Trapdoor");
		GameRegistry.registerBlock(Blocks.BirchTrapdoor, "Birch_Trapdoor");
		GameRegistry.registerBlock(Blocks.JungleTrapdoor, "Jungle_Trapdoor");
		GameRegistry.registerBlock(Blocks.AcaciaTrapdoor, "Acacia_Trapdoor");
		GameRegistry.registerBlock(Blocks.DarkOakTrapdoor, "DarkOak_Trapdoor");
	}
/*	
	private static void ebxl() {
		
		registerBlock(Blocks.EBXL_RedwoodBookshelf, "EBXL:Redwood_Bookshelf");
		registerBlock(Blocks.EBXL_FirBookshelf, "EBXL:Fir_Bookshelf");
		registerBlock(Blocks.EBXL_AcaciaBookshelf, "EBXL:Acacia_Bookshelf");
		registerBlock(Blocks.EBXL_CypressBookshelf, "EBXL:Cypress_Bookshelf");
		registerBlock(Blocks.EBXL_JapaneseMapleBookshelf, "EBXL:JapaneseMaple_Bookshelf");
		registerBlock(Blocks.EBXL_RainbowEucalyptusBookshelf, "EBXL:RainbowEucalyptus_Bookshelf");
		registerBlock(Blocks.EBXL_AutumnBookshelf, "EBXL:Autumn_Bookshelf");
		registerBlock(Blocks.EBXL_BaldCypressBookshelf, "EBXL:BaldCypress_Bookshelf");
		registerBlock(Blocks.EBXL_SakuraBookshelf, "EBXL:Sakura_Bookshelf");
		
		registerBlock(Blocks.EBXL_RedwoodFence, "EBXL:Redwood_Fence");
		registerBlock(Blocks.EBXL_FirFence, "EBXL:Fir_Fence");
		registerBlock(Blocks.EBXL_AcaciaFence, "EBXL:Acacia_Fence");
		registerBlock(Blocks.EBXL_CypressFence, "EBXL:Cypress_Fence");
		registerBlock(Blocks.EBXL_JapaneseMapleFence, "EBXL:JapaneseMaple_Fence");
		registerBlock(Blocks.EBXL_RainbowEucalyptusFence, "EBXL:RainbowEucalyptus_Fence");
		registerBlock(Blocks.EBXL_AutumnFence, "EBXL:Autumn_Fence");
		registerBlock(Blocks.EBXL_BaldCypressFence, "EBXL:BaldCypress_Fence");
		registerBlock(Blocks.EBXL_SakuraFence, "EBXL:Sakura_Fence");

	}

	private static void bop()
	{
		// TODO
	}
	*/
}
