/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.api;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class Blocks {
	
	// BetterWood
	
	public static Block OakBookshelf;
	public static Block SpruceBookshelf;
	public static Block BirchBookshelf;
	public static Block JungleBookshelf;
	public static Block AcaciaBookshelf;
	public static Block DarkOakBookshelf;
	
	public static Block OakFence;
	public static Block SpruceFence;
	public static Block BirchFence;
	public static Block JungleFence;
	public static Block AcaciaFence;
	public static Block DarkOakFence;

	public static Block OakFenceGate;
	public static Block SpruceFenceGate;
	public static Block BirchFenceGate;
	public static Block JungleFenceGate;
	public static Block AcaciaFenceGate;
	public static Block DarkOakFenceGate;
	
	public static Block OakButton;
	public static Block SpruceButton;
	public static Block BirchButton;
	public static Block JungleButton;
	public static Block AcaciaButton;
	public static Block DarkOakButton;
	
	public static Block OakPressurePlate;
	public static Block SprucePressurePlate;
	public static Block BirchPressurePlate;
	public static Block JunglePressurePlate;
	public static Block AcaciaPressurePlate;
	public static Block DarkOakPressurePlate;
	
	public static Block OakLever;
	public static Block SpruceLever;
	public static Block BirchLever;
	public static Block JungleLever;
	public static Block AcaciaLever;
	public static Block DarkOakLever;
	
	public static Block OakLadder;
	public static Block SpruceLadder;
	public static Block BirchLadder;
	public static Block JungleLadder;
	public static Block AcaciaLadder;
	public static Block DarkOakLadder;
	
	public static Block OakTorchOn;
	public static Block SpruceTorchOn;
	public static Block BirchTorchOn;
	public static Block JungleTorchOn;
	public static Block AcaciaTorchOn;
	public static Block DarkOakTorchOn;
	
	public static Block OakDoor;
	public static Block SpruceDoor;
	public static Block BirchDoor;
	public static Block JungleDoor;
	public static Block AcaciaDoor;
	public static Block DarkOakDoor;
	
	public static Block OakTrapdoor;
	public static Block SpruceTrapdoor;
	public static Block BirchTrapdoor;
	public static Block JungleTrapdoor;
	public static Block AcaciaTrapdoor;
	public static Block DarkOakTrapdoor;
	
	
	// Extrabiomes XL
/*
	public static Block EBXL_RedwoodBookshelf;
	public static Block EBXL_FirBookshelf;
	public static Block EBXL_AcaciaBookshelf;
	public static Block EBXL_CypressBookshelf;
	public static Block EBXL_JapaneseMapleBookshelf;
	public static Block EBXL_RainbowEucalyptusBookshelf;
	public static Block EBXL_AutumnBookshelf;
	public static Block EBXL_BaldCypressBookshelf;
	public static Block EBXL_SakuraBookshelf;
	
	public static Block EBXL_RedwoodFence;
	public static Block EBXL_FirFence;
	public static Block EBXL_AcaciaFence;
	public static Block EBXL_CypressFence;
	public static Block EBXL_JapaneseMapleFence;
	public static Block EBXL_RainbowEucalyptusFence;
	public static Block EBXL_AutumnFence;
	public static Block EBXL_BaldCypressFence;
	public static Block EBXL_SakuraFence;
	
	public static Block EBXL_RedwoodFenceGate;
	public static Block EBXL_FirFenceGate;
	public static Block EBXL_AcaciaFenceGate;
	public static Block EBXL_CypressFenceGate;
	public static Block EBXL_JapaneseMapleFenceGate;
	public static Block EBXL_RainbowEucalyptusFenceGate;
	public static Block EBXL_AutumnFenceGate;
	public static Block EBXL_BaldCypressFenceGate;
	public static Block EBXL_SakuraFenceGate;
	
	public static Block EBXL_RedwoodPressurePlate;
	public static Block EBXL_FirPressurePlate;
	public static Block EBXL_AcaciaPressurePlate;
	public static Block EBXL_CypressPressurePlate;
	public static Block EBXL_JapaneseMaplePressurePlate;
	public static Block EBXL_RainbowEucalyptusPressurePlate;
	public static Block EBXL_AutumnPressurePlate;
	public static Block EBXL_BaldCypressPressurePlate;
	public static Block EBXL_SakuraPressurePlate;
	
	public static Block EBXL_RedwoodLever;
	public static Block EBXL_FirLever;
	public static Block EBXL_AcaciaLever;
	public static Block EBXL_CypressLever;
	public static Block EBXL_JapaneseMapleLever;
	public static Block EBXL_RainbowEucalyptusLever;
	public static Block EBXL_AutumnLever;
	public static Block EBXL_BaldCypressLever;
	public static Block EBXL_SakuraLever;
	
	public static Block EBXL_RedwoodButton;
	public static Block EBXL_FirButton;
	public static Block EBXL_AcaciaButton;
	public static Block EBXL_CypressButton;
	public static Block EBXL_JapaneseMapleButton;
	public static Block EBXL_RainbowEucalyptusButton;
	public static Block EBXL_AutumnButton;
	public static Block EBXL_BaldCypressButton;
	public static Block EBXL_SakuraButton;
	
	public static Block EBXL_RedwoodTorchOn;
	public static Block EBXL_FirTorchOn;
	public static Block EBXL_AcaciaTorchOn;
	public static Block EBXL_CypressTorchOn;
	public static Block EBXL_JapaneseMapleTorchOn;
	public static Block EBXL_RainbowEucalyptusTorchOn;
	public static Block EBXL_AutumnTorchOn;
	public static Block EBXL_BaldCypressTorchOn;
	public static Block EBXL_SakuraTorchOn;
	
	public static Block EBXL_RedwoodLadder;
	public static Block EBXL_FirLadder;
	public static Block EBXL_AcaciaLadder;
	public static Block EBXL_CypressLadder;
	public static Block EBXL_JapaneseMapleLadder;
	public static Block EBXL_RainbowEucalyptusLadder;
	public static Block EBXL_AutumnLadder;
	public static Block EBXL_BaldCypressLadder;
	public static Block EBXL_SakuraLadder;
	
	public static Block EBXL_RedwoodDoor;
	public static Block EBXL_FirDoor	;
	public static Block EBXL_AcaciaDoor;
	public static Block EBXL_CypressDoor;
	public static Block EBXL_JapaneseMapleDoor;
	public static Block EBXL_RainbowEucalyptusDoor;
	public static Block EBXL_AutumnDoor;
	public static Block EBXL_BaldCypressDoor;
	public static Block EBXL_SakuraDoor;
	*/
	public static boolean isBookshelf(Block block)
	{
		if (
				block == OakBookshelf ||
				block == SpruceBookshelf ||
				block == BirchBookshelf ||
				block == JungleBookshelf ||
				block == AcaciaBookshelf ||
				block == DarkOakBookshelf)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

	public static boolean isWoodenBlock(Item item)
	{
		if(
				item == Item.getItemFromBlock(OakBookshelf) ||
				item == Item.getItemFromBlock(SpruceBookshelf) ||
				item == Item.getItemFromBlock(BirchBookshelf) ||
				item == Item.getItemFromBlock(JungleBookshelf) ||
				item == Item.getItemFromBlock(AcaciaBookshelf) ||
				item == Item.getItemFromBlock(DarkOakBookshelf) ||
								
				item == Item.getItemFromBlock(OakFence) ||
				item == Item.getItemFromBlock(SpruceFence) ||
				item == Item.getItemFromBlock(BirchFence) ||
				item == Item.getItemFromBlock(JungleFence) ||
				item == Item.getItemFromBlock(AcaciaFence) ||
				item == Item.getItemFromBlock(DarkOakFence) ||

				item == Item.getItemFromBlock(OakFenceGate) ||
				item == Item.getItemFromBlock(SpruceFenceGate) ||
				item == Item.getItemFromBlock(BirchFenceGate) ||
				item == Item.getItemFromBlock(JungleFenceGate) ||
				item == Item.getItemFromBlock(AcaciaFenceGate) ||
				item == Item.getItemFromBlock(DarkOakFenceGate) ||
								
				item == Item.getItemFromBlock(OakButton) ||
				item == Item.getItemFromBlock(SpruceButton) ||
				item == Item.getItemFromBlock(BirchButton) ||
				item == Item.getItemFromBlock(JungleButton) ||
				item == Item.getItemFromBlock(AcaciaButton) ||
				item == Item.getItemFromBlock(DarkOakButton) ||
								
				item == Item.getItemFromBlock(OakPressurePlate) ||
				item == Item.getItemFromBlock(SprucePressurePlate) ||
				item == Item.getItemFromBlock(BirchPressurePlate) ||
				item == Item.getItemFromBlock(JunglePressurePlate) ||
				item == Item.getItemFromBlock(AcaciaPressurePlate) ||
				item == Item.getItemFromBlock(DarkOakPressurePlate) ||
								
				item == Item.getItemFromBlock(OakLadder) ||
				item == Item.getItemFromBlock(SpruceLadder) ||
				item == Item.getItemFromBlock(BirchLadder) ||
				item == Item.getItemFromBlock(JungleLadder) ||
				item == Item.getItemFromBlock(AcaciaLadder) ||
				item == Item.getItemFromBlock(DarkOakLadder))
		{
			return true;
		}
		
		else
		{
			
		}
		return false;
	}
}