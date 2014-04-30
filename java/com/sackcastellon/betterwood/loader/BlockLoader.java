/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.loader;

//import cpw.mods.fml.common.Loader;
import com.sackcastellon.betterwood.api.Blocks;
import com.sackcastellon.betterwood.block.BlockBookshelf;
import com.sackcastellon.betterwood.block.BlockButton;
import com.sackcastellon.betterwood.block.BlockDoor;
import com.sackcastellon.betterwood.block.BlockFence;
import com.sackcastellon.betterwood.block.BlockFenceGate;
import com.sackcastellon.betterwood.block.BlockLadder;
import com.sackcastellon.betterwood.block.BlockLever;
import com.sackcastellon.betterwood.block.BlockPressurePlate;
import com.sackcastellon.betterwood.block.BlockTorch;
import com.sackcastellon.betterwood.block.BlockTrapdoor;

import com.sackcastellon.betterwood.item.ItemPartMaterial;

public class BlockLoader {
	
	public static void init()
	{
    	vanilla.load();
//    	if (Loader.isModLoaded("ExtrabiomesXL")) { ebxl.init(); }
//    	if (Loader.isModLoaded("BiomesOPlenty")) { bop.init(); }
	}

	private static class vanilla
	{
		private static void load()
		{
			Bookshelf();
			Fence();
			FenceGate();
			Button();
			PressurePlate();
			Lever();
			Ladder();
			TorchOn();
			Door();
			Trapdoor();
		}
		
		private static void Bookshelf()
		{
			Blocks.OakBookshelf = new BlockBookshelf(ItemPartMaterial.oak);
			Blocks.SpruceBookshelf = new BlockBookshelf(ItemPartMaterial.spruce);
			Blocks.BirchBookshelf = new BlockBookshelf(ItemPartMaterial.birch);
			Blocks.JungleBookshelf = new BlockBookshelf(ItemPartMaterial.jungle);
			Blocks.AcaciaBookshelf = new BlockBookshelf(ItemPartMaterial.acacia);
			Blocks.DarkOakBookshelf = new BlockBookshelf(ItemPartMaterial.darkOak);	
		}
		
		private static void Fence()
		{
			Blocks.OakFence = new BlockFence(ItemPartMaterial.oak);
			Blocks.SpruceFence = new BlockFence(ItemPartMaterial.spruce);
			Blocks.BirchFence = new BlockFence(ItemPartMaterial.birch);
			Blocks.JungleFence = new BlockFence(ItemPartMaterial.jungle);
			Blocks.AcaciaFence = new BlockFence(ItemPartMaterial.acacia);
			Blocks.DarkOakFence = new BlockFence(ItemPartMaterial.darkOak);
		}
		
		private static void FenceGate()
		{
			Blocks.OakFenceGate = new BlockFenceGate(ItemPartMaterial.oak);
			Blocks.SpruceFenceGate = new BlockFenceGate(ItemPartMaterial.spruce);
			Blocks.BirchFenceGate = new BlockFenceGate(ItemPartMaterial.birch);
			Blocks.JungleFenceGate = new BlockFenceGate(ItemPartMaterial.jungle);
			Blocks.AcaciaFenceGate = new BlockFenceGate(ItemPartMaterial.acacia);
			Blocks.DarkOakFenceGate = new BlockFenceGate(ItemPartMaterial.darkOak);
		}
		
		private static void Button()
		{
			Blocks.OakButton = new BlockButton(ItemPartMaterial.oak);
			Blocks.SpruceButton = new BlockButton(ItemPartMaterial.spruce);
			Blocks.BirchButton = new BlockButton(ItemPartMaterial.birch);
			Blocks.JungleButton = new BlockButton(ItemPartMaterial.jungle);
			Blocks.AcaciaButton = new BlockButton(ItemPartMaterial.acacia);
			Blocks.DarkOakButton = new BlockButton(ItemPartMaterial.darkOak);
		}
		
		private static void PressurePlate()
		{
			Blocks.OakPressurePlate = new BlockPressurePlate(ItemPartMaterial.oak);
			Blocks.SprucePressurePlate = new BlockPressurePlate(ItemPartMaterial.spruce);
			Blocks.BirchPressurePlate = new BlockPressurePlate(ItemPartMaterial.birch);
			Blocks.JunglePressurePlate = new BlockPressurePlate(ItemPartMaterial.jungle);
			Blocks.AcaciaPressurePlate = new BlockPressurePlate(ItemPartMaterial.acacia);
			Blocks.DarkOakPressurePlate = new BlockPressurePlate(ItemPartMaterial.darkOak);
		}
		
		private static void Lever()
		{
			Blocks.OakLever = new BlockLever(ItemPartMaterial.oak);
			Blocks.SpruceLever = new BlockLever(ItemPartMaterial.spruce);
			Blocks.BirchLever = new BlockLever(ItemPartMaterial.birch);
			Blocks.JungleLever = new BlockLever(ItemPartMaterial.jungle);
			Blocks.AcaciaLever = new BlockLever(ItemPartMaterial.acacia);
			Blocks.DarkOakLever = new BlockLever(ItemPartMaterial.darkOak);
		}
		
		private static void Ladder()
		{
			Blocks.OakLadder = new BlockLadder(ItemPartMaterial.oak);
			Blocks.SpruceLadder = new BlockLadder(ItemPartMaterial.spruce);
			Blocks.BirchLadder = new BlockLadder(ItemPartMaterial.birch);
			Blocks.JungleLadder = new BlockLadder(ItemPartMaterial.jungle);
			Blocks.AcaciaLadder = new BlockLadder(ItemPartMaterial.acacia);
			Blocks.DarkOakLadder = new BlockLadder(ItemPartMaterial.darkOak);
		}
		
		private static void TorchOn()
		{
			Blocks.OakTorchOn = new BlockTorch(ItemPartMaterial.oak);
			Blocks.SpruceTorchOn = new BlockTorch(ItemPartMaterial.spruce);
			Blocks.BirchTorchOn = new BlockTorch(ItemPartMaterial.birch);
			Blocks.JungleTorchOn = new BlockTorch(ItemPartMaterial.jungle);
			Blocks.AcaciaTorchOn = new BlockTorch(ItemPartMaterial.acacia);
			Blocks.DarkOakTorchOn = new BlockTorch(ItemPartMaterial.darkOak);
		}
		
		private static void Door()
		{
			Blocks.OakDoor = new BlockDoor(ItemPartMaterial.oak);
			Blocks.SpruceDoor = new BlockDoor(ItemPartMaterial.spruce);
			Blocks.BirchDoor = new BlockDoor(ItemPartMaterial.birch);
			Blocks.JungleDoor = new BlockDoor(ItemPartMaterial.jungle);
			Blocks.AcaciaDoor = new BlockDoor(ItemPartMaterial.acacia);
			Blocks.DarkOakDoor = new BlockDoor(ItemPartMaterial.darkOak);
		}
		
		private static void Trapdoor()
		{
			Blocks.OakTrapdoor = new BlockTrapdoor(ItemPartMaterial.oak);
			Blocks.SpruceTrapdoor = new BlockTrapdoor(ItemPartMaterial.spruce);
			Blocks.BirchTrapdoor = new BlockTrapdoor(ItemPartMaterial.birch);
			Blocks.JungleTrapdoor = new BlockTrapdoor(ItemPartMaterial.jungle);
			Blocks.AcaciaTrapdoor = new BlockTrapdoor(ItemPartMaterial.acacia);
			Blocks.DarkOakTrapdoor = new BlockTrapdoor(ItemPartMaterial.darkOak);
		}
	}
/*	
	private static class ebxl
	{
		private static void init()
		{
			Bookshelf();
			Fence();
			FenceGate();
			Button();
			PressurePlate();
			Lever();
			Ladder();
			TorchOn();
			Door();		
		}
		
		private static void Bookshelf()
		{
			Blocks.EBXL_RedwoodBookshelf			= new BlockBookshelf(ItemPartMaterial.ebxl_redwood).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_FirBookshelf 				= new BlockBookshelf(ItemPartMaterial.ebxl_fir).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_AcaciaBookshelf 			= new BlockBookshelf(ItemPartMaterial.ebxl_acacia).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_CypressBookshelf 			= new BlockBookshelf(ItemPartMaterial.ebxl_cypress).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_JapaneseMapleBookshelf 		= new BlockBookshelf(ItemPartMaterial.ebxl_japaneseMaple).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_RainbowEucalyptusBookshelf	= new BlockBookshelf(ItemPartMaterial.ebxl_rainbowEucalyptus).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_AutumnBookshelf				= new BlockBookshelf(ItemPartMaterial.ebxl_autumn).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_BaldCypressBookshelf		= new BlockBookshelf(ItemPartMaterial.ebxl_baldCypress).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_SakuraBookshelf				= new BlockBookshelf(ItemPartMaterial.ebxl_sakura).setCreativeTab(Tabs.tabEBXL);
		}
		
		private static void Fence()
		{
			Blocks.EBXL_RedwoodFence			= new BlockFence(ItemPartMaterial.ebxl_redwood).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_FirFence 				= new BlockFence(ItemPartMaterial.ebxl_fir).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_AcaciaFence 			= new BlockFence(ItemPartMaterial.ebxl_acacia).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_CypressFence 			= new BlockFence(ItemPartMaterial.ebxl_cypress).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_JapaneseMapleFence 		= new BlockFence(ItemPartMaterial.ebxl_japaneseMaple).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_RainbowEucalyptusFence	= new BlockFence(ItemPartMaterial.ebxl_rainbowEucalyptus).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_AutumnFence				= new BlockFence(ItemPartMaterial.ebxl_autumn).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_BaldCypressFence		= new BlockFence(ItemPartMaterial.ebxl_baldCypress).setCreativeTab(Tabs.tabEBXL);
			Blocks.EBXL_SakuraFence				= new BlockFence(ItemPartMaterial.ebxl_sakura).setCreativeTab(Tabs.tabEBXL);
		}
		
		private static void FenceGate()
		{
			
		}
		
		private static void Button()
		{
			
		}
		
		private static void PressurePlate()
		{
			
		}
		
		private static void Lever()
		{
			
		}
		
		private static void Ladder()
		{
			
		}
		
		private static void TorchOn()
		{
			
		}
		
		private static void Door()
		{
			
		}
	}

	private static class bop
	{
		
		private static void init()
		{
			Bookshelf();
			Fence();
			FenceGate();
			Button();
			PressurePlate();
			Lever();
			Ladder();
			TorchOn();
			Door();		
		}
		
		private static void Bookshelf()
		{
			// TODO
		}
		
		private static void Fence()
		{
			// TODO
		}
		
		private static void FenceGate()
		{
			// TODO
		}
		
		private static void Button()
		{
			// TODO
		}
		
		private static void PressurePlate()
		{
			// TODO
		}
		
		private static void Lever()
		{
			// TODO
		}
		
		private static void Ladder()
		{
			// TODO
		}
		
		private static void TorchOn()
		{
			// TODO
		}
		
		private static void Door()
		{
			// TODO
		}
	}
	*/
}