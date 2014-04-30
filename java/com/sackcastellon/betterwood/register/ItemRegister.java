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


//import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegister
{
	public static void init()
	{
    	vanilla.load();
//    	if (Loader.isModLoaded("ExtrabiomesXL")) {ebxl.load();}
//    	if (Loader.isModLoaded("BiomesOPlenty")) {bop.load();}
	}

	private static class vanilla
	{
		private static void load()
		{
			misc();
			sword();
			shovel();
			pickaxe();
			axe();
			hoe();
			bow();
		}
		
		@SuppressWarnings("deprecation")
		private static void misc()
		{
			GameRegistry.registerItem(Items.Stick, "Stick");
			GameRegistry.registerItem(Items.Bowl, "Bowl");
			GameRegistry.registerItem(Items.Soup, "Soup");
			GameRegistry.registerItem(Items.Arrow, "Arrow");
			GameRegistry.registerItem(Items.Sign, "Sign");
			GameRegistry.registerItem(Items.Door, "Door");
			GameRegistry.registerItem(Items.Boat, "Boat");
			GameRegistry.registerItem(Items.Painting, "Painting");
			GameRegistry.registerItem(Items.ItemFrame, "ItemFrame");
		}
		
		private static void sword() 
		{
			GameRegistry.registerItem(Items.OakOakSword, "Oak_Oak_Sword");
			GameRegistry.registerItem(Items.OakSpruceSword, "Oak_Spruce_Sword");
			GameRegistry.registerItem(Items.OakBirchSword, "Oak_Birch_Sword");
			GameRegistry.registerItem(Items.OakJungleSword, "Oak_Jungle_Sword");
			GameRegistry.registerItem(Items.OakAcaciaSword, "Oak_Acacia_Sword");
			GameRegistry.registerItem(Items.OakDarkOakSword, "Oak_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.SpruceOakSword, "Spruce_Oak_Sword");
			GameRegistry.registerItem(Items.SpruceSpruceSword, "Spruce_Spruce_Sword");
			GameRegistry.registerItem(Items.SpruceBirchSword, "Spruce_Birch_Sword");
			GameRegistry.registerItem(Items.SpruceJungleSword, "Spruce_Jungle_Sword");
			GameRegistry.registerItem(Items.SpruceAcaciaSword, "Spruce_Acacia_Sword");
			GameRegistry.registerItem(Items.SpruceDarkOakSword, "Spruce_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.BirchOakSword, "Birch_Oak_Sword");
			GameRegistry.registerItem(Items.BirchSpruceSword, "Birch_Spruce_Sword");
			GameRegistry.registerItem(Items.BirchBirchSword, "Birch_Birch_Sword");
			GameRegistry.registerItem(Items.BirchJungleSword, "Birch_Jungle_Sword");
			GameRegistry.registerItem(Items.BirchAcaciaSword, "Birch_Acacia_Sword");
			GameRegistry.registerItem(Items.BirchDarkOakSword, "Birch_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.JungleOakSword, "Jungle_Oak_Sword");
			GameRegistry.registerItem(Items.JungleSpruceSword, "Jungle_Spruce_Sword");
			GameRegistry.registerItem(Items.JungleBirchSword, "Jungle_Birch_Sword");
			GameRegistry.registerItem(Items.JungleJungleSword, "Jungle_Jungle_Sword");
			GameRegistry.registerItem(Items.JungleAcaciaSword, "Jungle_Acacia_Sword");
			GameRegistry.registerItem(Items.JungleDarkOakSword, "Jungle_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.AcaciaOakSword, "Acacia_Oak_Sword");
			GameRegistry.registerItem(Items.AcaciaSpruceSword, "Acacia_Spruce_Sword");
			GameRegistry.registerItem(Items.AcaciaBirchSword, "Acacia_Birch_Sword");
			GameRegistry.registerItem(Items.AcaciaJungleSword, "Acacia_Jungle_Sword");
			GameRegistry.registerItem(Items.AcaciaAcaciaSword, "Acacia_Acacia_Sword");
			GameRegistry.registerItem(Items.AcaciaDarkOakSword, "Acacia_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.DarkOakOakSword, "DarkOak_Oak_Sword");
			GameRegistry.registerItem(Items.DarkOakSpruceSword, "DarkOak_Spruce_Sword");
			GameRegistry.registerItem(Items.DarkOakBirchSword, "DarkOak_Birch_Sword");
			GameRegistry.registerItem(Items.DarkOakJungleSword, "DarkOak_Jungle_Sword");
			GameRegistry.registerItem(Items.DarkOakAcaciaSword, "DarkOak_Acacia_Sword");
			GameRegistry.registerItem(Items.DarkOakDarkOakSword, "DarkOak_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.StoneOakSword, "Stone_Oak_Sword");
			GameRegistry.registerItem(Items.StoneSpruceSword, "Stone_Spruce_Sword");
			GameRegistry.registerItem(Items.StoneBirchSword, "Stone_Birch_Sword");
			GameRegistry.registerItem(Items.StoneJungleSword, "Stone_Jungle_Sword");
			GameRegistry.registerItem(Items.StoneAcaciaSword, "Stone_Acacia_Sword");
			GameRegistry.registerItem(Items.StoneDarkOakSword, "Stone_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.IronOakSword, "Iron_Oak_Sword");
			GameRegistry.registerItem(Items.IronSpruceSword, "Iron_Spruce_Sword");
			GameRegistry.registerItem(Items.IronBirchSword, "Iron_Birch_Sword");
			GameRegistry.registerItem(Items.IronJungleSword, "Iron_Jungle_Sword");
			GameRegistry.registerItem(Items.IronAcaciaSword, "Iron_Acacia_Sword");
			GameRegistry.registerItem(Items.IronDarkOakSword, "Iron_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.GoldOakSword, "Gold_Oak_Sword");
			GameRegistry.registerItem(Items.GoldSpruceSword, "Gold_Spruce_Sword");
			GameRegistry.registerItem(Items.GoldBirchSword, "Gold_Birch_Sword");
			GameRegistry.registerItem(Items.GoldJungleSword, "Gold_Jungle_Sword");
			GameRegistry.registerItem(Items.GoldAcaciaSword, "Gold_Acacia_Sword");
			GameRegistry.registerItem(Items.GoldDarkOakSword, "Gold_DarkOak_Sword");
			
			GameRegistry.registerItem(Items.DiamondOakSword, "Diamond_Oak_Sword");
			GameRegistry.registerItem(Items.DiamondSpruceSword, "Diamond_Spruce_Sword");
			GameRegistry.registerItem(Items.DiamondBirchSword, "Diamond_Birch_Sword");
			GameRegistry.registerItem(Items.DiamondJungleSword, "Diamond_Jungle_Sword");
			GameRegistry.registerItem(Items.DiamondAcaciaSword, "Diamond_Acacia_Sword");
			GameRegistry.registerItem(Items.DiamondDarkOakSword, "Diamond_DarkOak_Sword");
		}

		private static void shovel() 
		{
			GameRegistry.registerItem(Items.OakOakShovel, "Oak_Oak_Shovel");
			GameRegistry.registerItem(Items.OakSpruceShovel, "Oak_Spruce_Shovel");
			GameRegistry.registerItem(Items.OakBirchShovel, "Oak_Birch_Shovel");
			GameRegistry.registerItem(Items.OakJungleShovel, "Oak_Jungle_Shovel");
			GameRegistry.registerItem(Items.OakAcaciaShovel, "Oak_Acacia_Shovel");
			GameRegistry.registerItem(Items.OakDarkOakShovel, "Oak_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.SpruceOakShovel, "Spruce_Oak_Shovel");
			GameRegistry.registerItem(Items.SpruceSpruceShovel, "Spruce_Spruce_Shovel");
			GameRegistry.registerItem(Items.SpruceBirchShovel, "Spruce_Birch_Shovel");
			GameRegistry.registerItem(Items.SpruceJungleShovel, "Spruce_Jungle_Shovel");
			GameRegistry.registerItem(Items.SpruceAcaciaShovel, "Spruce_Acacia_Shovel");
			GameRegistry.registerItem(Items.SpruceDarkOakShovel, "Spruce_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.BirchOakShovel, "Birch_Oak_Shovel");
			GameRegistry.registerItem(Items.BirchSpruceShovel, "Birch_Spruce_Shovel");
			GameRegistry.registerItem(Items.BirchBirchShovel, "Birch_Birch_Shovel");
			GameRegistry.registerItem(Items.BirchJungleShovel, "Birch_Jungle_Shovel");
			GameRegistry.registerItem(Items.BirchAcaciaShovel, "Birch_Acacia_Shovel");
			GameRegistry.registerItem(Items.BirchDarkOakShovel, "Birch_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.JungleOakShovel, "Jungle_Oak_Shovel");
			GameRegistry.registerItem(Items.JungleSpruceShovel, "Jungle_Spruce_Shovel");
			GameRegistry.registerItem(Items.JungleBirchShovel, "Jungle_Birch_Shovel");
			GameRegistry.registerItem(Items.JungleJungleShovel, "Jungle_Jungle_Shovel");
			GameRegistry.registerItem(Items.JungleAcaciaShovel, "Jungle_Acacia_Shovel");
			GameRegistry.registerItem(Items.JungleDarkOakShovel, "Jungle_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.AcaciaOakShovel, "Acacia_Oak_Shovel");
			GameRegistry.registerItem(Items.AcaciaSpruceShovel, "Acacia_Spruce_Shovel");
			GameRegistry.registerItem(Items.AcaciaBirchShovel, "Acacia_Birch_Shovel");
			GameRegistry.registerItem(Items.AcaciaJungleShovel, "Acacia_Jungle_Shovel");
			GameRegistry.registerItem(Items.AcaciaAcaciaShovel, "Acacia_Acacia_Shovel");
			GameRegistry.registerItem(Items.AcaciaDarkOakShovel, "Acacia_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.DarkOakOakShovel, "DarkOak_Oak_Shovel");
			GameRegistry.registerItem(Items.DarkOakSpruceShovel, "DarkOak_Spruce_Shovel");
			GameRegistry.registerItem(Items.DarkOakBirchShovel, "DarkOak_Birch_Shovel");
			GameRegistry.registerItem(Items.DarkOakJungleShovel, "DarkOak_Jungle_Shovel");
			GameRegistry.registerItem(Items.DarkOakAcaciaShovel, "DarkOak_Acacia_Shovel");
			GameRegistry.registerItem(Items.DarkOakDarkOakShovel, "DarkOak_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.StoneOakShovel, "Stone_Oak_Shovel");
			GameRegistry.registerItem(Items.StoneSpruceShovel, "Stone_Spruce_Shovel");
			GameRegistry.registerItem(Items.StoneBirchShovel, "Stone_Birch_Shovel");
			GameRegistry.registerItem(Items.StoneJungleShovel, "Stone_Jungle_Shovel");
			GameRegistry.registerItem(Items.StoneAcaciaShovel, "Stone_Acacia_Shovel");
			GameRegistry.registerItem(Items.StoneDarkOakShovel, "Stone_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.IronOakShovel, "Iron_Oak_Shovel");
			GameRegistry.registerItem(Items.IronSpruceShovel, "Iron_Spruce_Shovel");
			GameRegistry.registerItem(Items.IronBirchShovel, "Iron_Birch_Shovel");
			GameRegistry.registerItem(Items.IronJungleShovel, "Iron_Jungle_Shovel");
			GameRegistry.registerItem(Items.IronAcaciaShovel, "Iron_Acacia_Shovel");
			GameRegistry.registerItem(Items.IronDarkOakShovel, "Iron_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.GoldOakShovel, "Gold_Oak_Shovel");
			GameRegistry.registerItem(Items.GoldSpruceShovel, "Gold_Spruce_Shovel");
			GameRegistry.registerItem(Items.GoldBirchShovel, "Gold_Birch_Shovel");
			GameRegistry.registerItem(Items.GoldJungleShovel, "Gold_Jungle_Shovel");
			GameRegistry.registerItem(Items.GoldAcaciaShovel, "Gold_Acacia_Shovel");
			GameRegistry.registerItem(Items.GoldDarkOakShovel, "Gold_DarkOak_Shovel");
			
			GameRegistry.registerItem(Items.DiamondOakShovel, "Diamond_Oak_Shovel");
			GameRegistry.registerItem(Items.DiamondSpruceShovel, "Diamond_Spruce_Shovel");
			GameRegistry.registerItem(Items.DiamondBirchShovel, "Diamond_Birch_Shovel");
			GameRegistry.registerItem(Items.DiamondJungleShovel, "Diamond_Jungle_Shovel");
			GameRegistry.registerItem(Items.DiamondAcaciaShovel, "Diamond_Acacia_Shovel");
			GameRegistry.registerItem(Items.DiamondDarkOakShovel, "Diamond_DarkOak_Shovel");
		}
		
		private static void pickaxe() 
		{
			GameRegistry.registerItem(Items.OakOakPickaxe, "Oak_Oak_Pickaxe");
			GameRegistry.registerItem(Items.OakSprucePickaxe, "Oak_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.OakBirchPickaxe, "Oak_Birch_Pickaxe");
			GameRegistry.registerItem(Items.OakJunglePickaxe, "Oak_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.OakAcaciaPickaxe, "Oak_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.OakDarkOakPickaxe, "Oak_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.SpruceOakPickaxe, "Spruce_Oak_Pickaxe");
			GameRegistry.registerItem(Items.SpruceSprucePickaxe, "Spruce_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.SpruceBirchPickaxe, "Spruce_Birch_Pickaxe");
			GameRegistry.registerItem(Items.SpruceJunglePickaxe, "Spruce_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.SpruceAcaciaPickaxe, "Spruce_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.SpruceDarkOakPickaxe, "Spruce_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.BirchOakPickaxe, "Birch_Oak_Pickaxe");
			GameRegistry.registerItem(Items.BirchSprucePickaxe, "Birch_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.BirchBirchPickaxe, "Birch_Birch_Pickaxe");
			GameRegistry.registerItem(Items.BirchJunglePickaxe, "Birch_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.BirchAcaciaPickaxe, "Birch_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.BirchDarkOakPickaxe, "Birch_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.JungleOakPickaxe, "Jungle_Oak_Pickaxe");
			GameRegistry.registerItem(Items.JungleSprucePickaxe, "Jungle_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.JungleBirchPickaxe, "Jungle_Birch_Pickaxe");
			GameRegistry.registerItem(Items.JungleJunglePickaxe, "Jungle_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.JungleAcaciaPickaxe, "Jungle_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.JungleDarkOakPickaxe, "Jungle_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.AcaciaOakPickaxe, "Acacia_Oak_Pickaxe");
			GameRegistry.registerItem(Items.AcaciaSprucePickaxe, "Acacia_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.AcaciaBirchPickaxe, "Acacia_Birch_Pickaxe");
			GameRegistry.registerItem(Items.AcaciaJunglePickaxe, "Acacia_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.AcaciaAcaciaPickaxe, "Acacia_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.AcaciaDarkOakPickaxe, "Acacia_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.DarkOakOakPickaxe, "DarkOak_Oak_Pickaxe");
			GameRegistry.registerItem(Items.DarkOakSprucePickaxe, "DarkOak_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.DarkOakBirchPickaxe, "DarkOak_Birch_Pickaxe");
			GameRegistry.registerItem(Items.DarkOakJunglePickaxe, "DarkOak_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.DarkOakAcaciaPickaxe, "DarkOak_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.DarkOakDarkOakPickaxe, "DarkOak_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.StoneOakPickaxe, "Stone_Oak_Pickaxe");
			GameRegistry.registerItem(Items.StoneSprucePickaxe, "Stone_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.StoneBirchPickaxe, "Stone_Birch_Pickaxe");
			GameRegistry.registerItem(Items.StoneJunglePickaxe, "Stone_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.StoneAcaciaPickaxe, "Stone_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.StoneDarkOakPickaxe, "Stone_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.IronOakPickaxe, "Iron_Oak_Pickaxe");
			GameRegistry.registerItem(Items.IronSprucePickaxe, "Iron_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.IronBirchPickaxe, "Iron_Birch_Pickaxe");
			GameRegistry.registerItem(Items.IronJunglePickaxe, "Iron_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.IronAcaciaPickaxe, "Iron_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.IronDarkOakPickaxe, "Iron_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.GoldOakPickaxe, "Gold_Oak_Pickaxe");
			GameRegistry.registerItem(Items.GoldSprucePickaxe, "Gold_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.GoldBirchPickaxe, "Gold_Birch_Pickaxe");
			GameRegistry.registerItem(Items.GoldJunglePickaxe, "Gold_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.GoldAcaciaPickaxe, "Gold_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.GoldDarkOakPickaxe, "Gold_DarkOak_Pickaxe");
			
			GameRegistry.registerItem(Items.DiamondOakPickaxe, "Diamond_Oak_Pickaxe");
			GameRegistry.registerItem(Items.DiamondSprucePickaxe, "Diamond_Spruce_Pickaxe");
			GameRegistry.registerItem(Items.DiamondBirchPickaxe, "Diamond_Birch_Pickaxe");
			GameRegistry.registerItem(Items.DiamondJunglePickaxe, "Diamond_Jungle_Pickaxe");
			GameRegistry.registerItem(Items.DiamondAcaciaPickaxe, "Diamond_Acacia_Pickaxe");
			GameRegistry.registerItem(Items.DiamondDarkOakPickaxe, "Diamond_DarkOak_Pickaxe");
		}
		
		private static void axe() 
		{
			GameRegistry.registerItem(Items.OakOakAxe, "Oak_Oak_Axe");
			GameRegistry.registerItem(Items.OakSpruceAxe, "Oak_Spruce_Axe");
			GameRegistry.registerItem(Items.OakBirchAxe, "Oak_Birch_Axe");
			GameRegistry.registerItem(Items.OakJungleAxe, "Oak_Jungle_Axe");
			GameRegistry.registerItem(Items.OakAcaciaAxe, "Oak_Acacia_Axe");
			GameRegistry.registerItem(Items.OakDarkOakAxe, "Oak_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.SpruceOakAxe, "Spruce_Oak_Axe");
			GameRegistry.registerItem(Items.SpruceSpruceAxe, "Spruce_Spruce_Axe");
			GameRegistry.registerItem(Items.SpruceBirchAxe, "Spruce_Birch_Axe");
			GameRegistry.registerItem(Items.SpruceJungleAxe, "Spruce_Jungle_Axe");
			GameRegistry.registerItem(Items.SpruceAcaciaAxe, "Spruce_Acacia_Axe");
			GameRegistry.registerItem(Items.SpruceDarkOakAxe, "Spruce_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.BirchOakAxe, "Birch_Oak_Axe");
			GameRegistry.registerItem(Items.BirchSpruceAxe, "Birch_Spruce_Axe");
			GameRegistry.registerItem(Items.BirchBirchAxe, "Birch_Birch_Axe");
			GameRegistry.registerItem(Items.BirchJungleAxe, "Birch_Jungle_Axe");
			GameRegistry.registerItem(Items.BirchAcaciaAxe, "Birch_Acacia_Axe");
			GameRegistry.registerItem(Items.BirchDarkOakAxe, "Birch_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.JungleOakAxe, "Jungle_Oak_Axe");
			GameRegistry.registerItem(Items.JungleSpruceAxe, "Jungle_Spruce_Axe");
			GameRegistry.registerItem(Items.JungleBirchAxe, "Jungle_Birch_Axe");
			GameRegistry.registerItem(Items.JungleJungleAxe, "Jungle_Jungle_Axe");
			GameRegistry.registerItem(Items.JungleAcaciaAxe, "Jungle_Acacia_Axe");
			GameRegistry.registerItem(Items.JungleDarkOakAxe, "Jungle_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.AcaciaOakAxe, "Acacia_Oak_Axe");
			GameRegistry.registerItem(Items.AcaciaSpruceAxe, "Acacia_Spruce_Axe");
			GameRegistry.registerItem(Items.AcaciaBirchAxe, "Acacia_Birch_Axe");
			GameRegistry.registerItem(Items.AcaciaJungleAxe, "Acacia_Jungle_Axe");
			GameRegistry.registerItem(Items.AcaciaAcaciaAxe, "Acacia_Acacia_Axe");
			GameRegistry.registerItem(Items.AcaciaDarkOakAxe, "Acacia_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.DarkOakOakAxe, "DarkOak_Oak_Axe");
			GameRegistry.registerItem(Items.DarkOakSpruceAxe, "DarkOak_Spruce_Axe");
			GameRegistry.registerItem(Items.DarkOakBirchAxe, "DarkOak_Birch_Axe");
			GameRegistry.registerItem(Items.DarkOakJungleAxe, "DarkOak_Jungle_Axe");
			GameRegistry.registerItem(Items.DarkOakAcaciaAxe, "DarkOak_Acacia_Axe");
			GameRegistry.registerItem(Items.DarkOakDarkOakAxe, "DarkOak_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.StoneOakAxe, "Stone_Oak_Axe");
			GameRegistry.registerItem(Items.StoneSpruceAxe, "Stone_Spruce_Axe");
			GameRegistry.registerItem(Items.StoneBirchAxe, "Stone_Birch_Axe");
			GameRegistry.registerItem(Items.StoneJungleAxe, "Stone_Jungle_Axe");
			GameRegistry.registerItem(Items.StoneAcaciaAxe, "Stone_Acacia_Axe");
			GameRegistry.registerItem(Items.StoneDarkOakAxe, "Stone_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.IronOakAxe, "Iron_Oak_Axe");
			GameRegistry.registerItem(Items.IronSpruceAxe, "Iron_Spruce_Axe");
			GameRegistry.registerItem(Items.IronBirchAxe, "Iron_Birch_Axe");
			GameRegistry.registerItem(Items.IronJungleAxe, "Iron_Jungle_Axe");
			GameRegistry.registerItem(Items.IronAcaciaAxe, "Iron_Acacia_Axe");
			GameRegistry.registerItem(Items.IronDarkOakAxe, "Iron_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.GoldOakAxe, "Gold_Oak_Axe");
			GameRegistry.registerItem(Items.GoldSpruceAxe, "Gold_Spruce_Axe");
			GameRegistry.registerItem(Items.GoldBirchAxe, "Gold_Birch_Axe");
			GameRegistry.registerItem(Items.GoldJungleAxe, "Gold_Jungle_Axe");
			GameRegistry.registerItem(Items.GoldAcaciaAxe, "Gold_Acacia_Axe");
			GameRegistry.registerItem(Items.GoldDarkOakAxe, "Gold_DarkOak_Axe");
			
			GameRegistry.registerItem(Items.DiamondOakAxe, "Diamond_Oak_Axe");
			GameRegistry.registerItem(Items.DiamondSpruceAxe, "Diamond_Spruce_Axe");
			GameRegistry.registerItem(Items.DiamondBirchAxe, "Diamond_Birch_Axe");
			GameRegistry.registerItem(Items.DiamondJungleAxe, "Diamond_Jungle_Axe");
			GameRegistry.registerItem(Items.DiamondAcaciaAxe, "Diamond_Acacia_Axe");
			GameRegistry.registerItem(Items.DiamondDarkOakAxe, "Diamond_DarkOak_Axe");
		}
		
		private static void hoe() 
		{
			GameRegistry.registerItem(Items.OakOakHoe, "Oak_Oak_Hoe");
			GameRegistry.registerItem(Items.OakSpruceHoe, "Oak_Spruce_Hoe");
			GameRegistry.registerItem(Items.OakBirchHoe, "Oak_Birch_Hoe");
			GameRegistry.registerItem(Items.OakJungleHoe, "Oak_Jungle_Hoe");
			GameRegistry.registerItem(Items.OakAcaciaHoe, "Oak_Acacia_Hoe");
			GameRegistry.registerItem(Items.OakDarkOakHoe, "Oak_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.SpruceOakHoe, "Spruce_Oak_Hoe");
			GameRegistry.registerItem(Items.SpruceSpruceHoe, "Spruce_Spruce_Hoe");
			GameRegistry.registerItem(Items.SpruceBirchHoe, "Spruce_Birch_Hoe");
			GameRegistry.registerItem(Items.SpruceJungleHoe, "Spruce_Jungle_Hoe");
			GameRegistry.registerItem(Items.SpruceAcaciaHoe, "Spruce_Acacia_Hoe");
			GameRegistry.registerItem(Items.SpruceDarkOakHoe, "Spruce_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.BirchOakHoe, "Birch_Oak_Hoe");
			GameRegistry.registerItem(Items.BirchSpruceHoe, "Birch_Spruce_Hoe");
			GameRegistry.registerItem(Items.BirchBirchHoe, "Birch_Birch_Hoe");
			GameRegistry.registerItem(Items.BirchJungleHoe, "Birch_Jungle_Hoe");
			GameRegistry.registerItem(Items.BirchAcaciaHoe, "Birch_Acacia_Hoe");
			GameRegistry.registerItem(Items.BirchDarkOakHoe, "Birch_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.JungleOakHoe, "Jungle_Oak_Hoe");
			GameRegistry.registerItem(Items.JungleSpruceHoe, "Jungle_Spruce_Hoe");
			GameRegistry.registerItem(Items.JungleBirchHoe, "Jungle_Birch_Hoe");
			GameRegistry.registerItem(Items.JungleJungleHoe, "Jungle_Jungle_Hoe");
			GameRegistry.registerItem(Items.JungleAcaciaHoe, "Jungle_Acacia_Hoe");
			GameRegistry.registerItem(Items.JungleDarkOakHoe, "Jungle_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.AcaciaOakHoe, "Acacia_Oak_Hoe");
			GameRegistry.registerItem(Items.AcaciaSpruceHoe, "Acacia_Spruce_Hoe");
			GameRegistry.registerItem(Items.AcaciaBirchHoe, "Acacia_Birch_Hoe");
			GameRegistry.registerItem(Items.AcaciaJungleHoe, "Acacia_Jungle_Hoe");
			GameRegistry.registerItem(Items.AcaciaAcaciaHoe, "Acacia_Acacia_Hoe");
			GameRegistry.registerItem(Items.AcaciaDarkOakHoe, "Acacia_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.DarkOakOakHoe, "DarkOak_Oak_Hoe");
			GameRegistry.registerItem(Items.DarkOakSpruceHoe, "DarkOak_Spruce_Hoe");
			GameRegistry.registerItem(Items.DarkOakBirchHoe, "DarkOak_Birch_Hoe");
			GameRegistry.registerItem(Items.DarkOakJungleHoe, "DarkOak_Jungle_Hoe");
			GameRegistry.registerItem(Items.DarkOakAcaciaHoe, "DarkOak_Acacia_Hoe");
			GameRegistry.registerItem(Items.DarkOakDarkOakHoe, "DarkOak_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.StoneOakHoe, "Stone_Oak_Hoe");
			GameRegistry.registerItem(Items.StoneSpruceHoe, "Stone_Spruce_Hoe");
			GameRegistry.registerItem(Items.StoneBirchHoe, "Stone_Birch_Hoe");
			GameRegistry.registerItem(Items.StoneJungleHoe, "Stone_Jungle_Hoe");
			GameRegistry.registerItem(Items.StoneAcaciaHoe, "Stone_Acacia_Hoe");
			GameRegistry.registerItem(Items.StoneDarkOakHoe, "Stone_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.IronOakHoe, "Iron_Oak_Hoe");
			GameRegistry.registerItem(Items.IronSpruceHoe, "Iron_Spruce_Hoe");
			GameRegistry.registerItem(Items.IronBirchHoe, "Iron_Birch_Hoe");
			GameRegistry.registerItem(Items.IronJungleHoe, "Iron_Jungle_Hoe");
			GameRegistry.registerItem(Items.IronAcaciaHoe, "Iron_Acacia_Hoe");
			GameRegistry.registerItem(Items.IronDarkOakHoe, "Iron_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.GoldOakHoe, "Gold_Oak_Hoe");
			GameRegistry.registerItem(Items.GoldSpruceHoe, "Gold_Spruce_Hoe");
			GameRegistry.registerItem(Items.GoldBirchHoe, "Gold_Birch_Hoe");
			GameRegistry.registerItem(Items.GoldJungleHoe, "Gold_Jungle_Hoe");
			GameRegistry.registerItem(Items.GoldAcaciaHoe, "Gold_Acacia_Hoe");
			GameRegistry.registerItem(Items.GoldDarkOakHoe, "Gold_DarkOak_Hoe");
			
			GameRegistry.registerItem(Items.DiamondOakHoe, "Diamond_Oak_Hoe");
			GameRegistry.registerItem(Items.DiamondSpruceHoe, "Diamond_Spruce_Hoe");
			GameRegistry.registerItem(Items.DiamondBirchHoe, "Diamond_Birch_Hoe");
			GameRegistry.registerItem(Items.DiamondJungleHoe, "Diamond_Jungle_Hoe");
			GameRegistry.registerItem(Items.DiamondAcaciaHoe, "Diamond_Acacia_Hoe");
			GameRegistry.registerItem(Items.DiamondDarkOakHoe, "Diamond_DarkOak_Hoe");
		}
		
		private static void bow()
		{
			GameRegistry.registerItem(Items.OakBow, "Oak_Bow");
			GameRegistry.registerItem(Items.SpruceBow, "Spruce_Bow");
			GameRegistry.registerItem(Items.BirchBow, "Birch_Bow");
			GameRegistry.registerItem(Items.JungleBow, "Jungle_Bow");
			GameRegistry.registerItem(Items.AcaciaBow, "Acacia_Bow");
			GameRegistry.registerItem(Items.DarkOakBow, "DarkOak_Bow");
		}
	}
/*
	private static class ebxl
	{
		public static void load()
		{
			//TODO
		}
	}

	private static class bop
	{
		public static void load()
		{
			//TODO
		}
	}
	*/
}