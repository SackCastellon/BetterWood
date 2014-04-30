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
import com.sackcastellon.betterwood.api.Items;
import com.sackcastellon.betterwood.item.ItemAxe;
import com.sackcastellon.betterwood.item.ItemBow;
import com.sackcastellon.betterwood.item.ItemHoe;
import com.sackcastellon.betterwood.item.ItemPartMaterial;
import com.sackcastellon.betterwood.item.ItemPickaxe;
import com.sackcastellon.betterwood.item.ItemShovel;
import com.sackcastellon.betterwood.item.ItemSword;
import com.sackcastellon.betterwood.item.MetaItem;
import com.sackcastellon.betterwood.item.MetaItemBoat;
import com.sackcastellon.betterwood.item.MetaItemDoor;
import com.sackcastellon.betterwood.item.MetaItemHangingEntity;
import com.sackcastellon.betterwood.item.MetaItemSign;
import com.sackcastellon.betterwood.item.MetaItemSoup;

public class ItemLoader {

	private static ItemPartMaterial[] allWood = new ItemPartMaterial[] {ItemPartMaterial.oak, ItemPartMaterial.spruce, ItemPartMaterial.birch, ItemPartMaterial.jungle, ItemPartMaterial.acacia, ItemPartMaterial.darkOak};
	
	public static void init()
	{
    	vanilla.init();
//    	if (Loader.isModLoaded("ExtrabiomesXL")) {ebxl.load();}
//    	if (Loader.isModLoaded("BiomesOPlenty")) {bop.load();}
	}

	private static class vanilla
	{
		private static void init()
		{
			patch();
			generic();
			sword();
			shovel();
			pickaxe();
			axe();
			hoe();
			bow();
		}
		
		private static void patch()
		{
	    	net.minecraft.init.Items.stick.setTextureName("betterwood:vanilla_patch/stick");
	    	net.minecraft.init.Items.bowl.setTextureName("betterwood:vanilla_patch/bowl");
	    	net.minecraft.init.Items.mushroom_stew.setTextureName("betterwood:vanilla_patch/mushroom_stew");
	    	net.minecraft.init.Items.arrow.setTextureName("betterwood:vanilla_patch/arrow");
	    	net.minecraft.init.Items.boat.setTextureName("betterwood:vanilla_patch/boat");
	    	net.minecraft.init.Items.carrot_on_a_stick.setTextureName("betterwood:vanilla_patch/carrot_on_a_stick");
	    	net.minecraft.init.Items.bow.setTextureName("betterwood:vanilla_patch/bow");
		}
		
		@SuppressWarnings("deprecation")
		private static void generic()
		{
			Items.Stick =	new MetaItem(allWood).setUnlocalizedName("Stick").setMaxStackSize(64);
			Items.Bowl =	new MetaItem(allWood).setUnlocalizedName("Bowl").setMaxStackSize(64);
			Items.Soup =	new MetaItemSoup(allWood, Items.Bowl);
			Items.Arrow =	new MetaItem(allWood).setWip(true).setUnlocalizedName("Arrow").setMaxStackSize(64);
			Items.Sign =	new MetaItemSign(allWood).setWip(true);
			Items.Door =	new MetaItemDoor(allWood);
			Items.Boat =	new MetaItemBoat(allWood).setWip(true);
			Items.Painting = new MetaItemHangingEntity(allWood, 0).setWip(true);
			Items.ItemFrame = new MetaItemHangingEntity(allWood, 1).setWip(true);
		}
		
		private static void sword() 
		{
			Items.OakOakSword = 		new ItemSword(ItemPartMaterial.oak, ItemPartMaterial.oak);
			Items.OakSpruceSword = 		new ItemSword(ItemPartMaterial.oak, ItemPartMaterial.spruce);
			Items.OakBirchSword = 		new ItemSword(ItemPartMaterial.oak, ItemPartMaterial.birch);
			Items.OakJungleSword = 		new ItemSword(ItemPartMaterial.oak, ItemPartMaterial.jungle);
			Items.OakAcaciaSword = 		new ItemSword(ItemPartMaterial.oak, ItemPartMaterial.acacia);
			Items.OakDarkOakSword = 	new ItemSword(ItemPartMaterial.oak, ItemPartMaterial.darkOak);
			
			Items.SpruceOakSword = 		new ItemSword(ItemPartMaterial.spruce, ItemPartMaterial.oak);
			Items.SpruceSpruceSword = 	new ItemSword(ItemPartMaterial.spruce, ItemPartMaterial.spruce);
			Items.SpruceBirchSword = 	new ItemSword(ItemPartMaterial.spruce, ItemPartMaterial.birch);
			Items.SpruceJungleSword = 	new ItemSword(ItemPartMaterial.spruce, ItemPartMaterial.jungle);
			Items.SpruceAcaciaSword = 	new ItemSword(ItemPartMaterial.spruce, ItemPartMaterial.acacia);
			Items.SpruceDarkOakSword = 	new ItemSword(ItemPartMaterial.spruce, ItemPartMaterial.darkOak);
			
			Items.BirchOakSword = 		new ItemSword(ItemPartMaterial.birch, ItemPartMaterial.oak);
			Items.BirchSpruceSword = 	new ItemSword(ItemPartMaterial.birch, ItemPartMaterial.spruce);
			Items.BirchBirchSword = 	new ItemSword(ItemPartMaterial.birch, ItemPartMaterial.birch);
			Items.BirchJungleSword = 	new ItemSword(ItemPartMaterial.birch, ItemPartMaterial.jungle);
			Items.BirchAcaciaSword = 	new ItemSword(ItemPartMaterial.birch, ItemPartMaterial.acacia);
			Items.BirchDarkOakSword = 	new ItemSword(ItemPartMaterial.birch, ItemPartMaterial.darkOak);
			
			Items.JungleOakSword = 		new ItemSword(ItemPartMaterial.jungle, ItemPartMaterial.oak);
			Items.JungleSpruceSword = 	new ItemSword(ItemPartMaterial.jungle, ItemPartMaterial.spruce);
			Items.JungleBirchSword = 	new ItemSword(ItemPartMaterial.jungle, ItemPartMaterial.birch);
			Items.JungleJungleSword = 	new ItemSword(ItemPartMaterial.jungle, ItemPartMaterial.jungle);
			Items.JungleAcaciaSword = 	new ItemSword(ItemPartMaterial.jungle, ItemPartMaterial.acacia);
			Items.JungleDarkOakSword = 	new ItemSword(ItemPartMaterial.jungle, ItemPartMaterial.darkOak);
			
			Items.AcaciaOakSword = 		new ItemSword(ItemPartMaterial.acacia, ItemPartMaterial.oak);
			Items.AcaciaSpruceSword = 	new ItemSword(ItemPartMaterial.acacia, ItemPartMaterial.spruce);
			Items.AcaciaBirchSword = 	new ItemSword(ItemPartMaterial.acacia, ItemPartMaterial.birch);
			Items.AcaciaJungleSword = 	new ItemSword(ItemPartMaterial.acacia, ItemPartMaterial.jungle);
			Items.AcaciaAcaciaSword = 	new ItemSword(ItemPartMaterial.acacia, ItemPartMaterial.acacia);
			Items.AcaciaDarkOakSword = 	new ItemSword(ItemPartMaterial.acacia, ItemPartMaterial.darkOak);
			
			Items.DarkOakOakSword = 	new ItemSword(ItemPartMaterial.darkOak, ItemPartMaterial.oak);
			Items.DarkOakSpruceSword = 	new ItemSword(ItemPartMaterial.darkOak, ItemPartMaterial.spruce);
			Items.DarkOakBirchSword = 	new ItemSword(ItemPartMaterial.darkOak, ItemPartMaterial.birch);
			Items.DarkOakJungleSword = 	new ItemSword(ItemPartMaterial.darkOak, ItemPartMaterial.jungle);
			Items.DarkOakAcaciaSword = 	new ItemSword(ItemPartMaterial.darkOak, ItemPartMaterial.acacia);
			Items.DarkOakDarkOakSword = new ItemSword(ItemPartMaterial.darkOak, ItemPartMaterial.darkOak);
			
			Items.StoneOakSword = 		new ItemSword(ItemPartMaterial.stone, ItemPartMaterial.oak);
			Items.StoneSpruceSword = 	new ItemSword(ItemPartMaterial.stone, ItemPartMaterial.spruce);
			Items.StoneBirchSword = 	new ItemSword(ItemPartMaterial.stone, ItemPartMaterial.birch);
			Items.StoneJungleSword =	new ItemSword(ItemPartMaterial.stone, ItemPartMaterial.jungle);
			Items.StoneAcaciaSword = 	new ItemSword(ItemPartMaterial.stone, ItemPartMaterial.acacia);
			Items.StoneDarkOakSword = 	new ItemSword(ItemPartMaterial.stone, ItemPartMaterial.darkOak);
			
			Items.IronOakSword = 		new ItemSword(ItemPartMaterial.iron, ItemPartMaterial.oak);
			Items.IronSpruceSword = 	new ItemSword(ItemPartMaterial.iron, ItemPartMaterial.spruce);
			Items.IronBirchSword = 		new ItemSword(ItemPartMaterial.iron, ItemPartMaterial.birch);
			Items.IronJungleSword = 	new ItemSword(ItemPartMaterial.iron, ItemPartMaterial.jungle);
			Items.IronAcaciaSword = 	new ItemSword(ItemPartMaterial.iron, ItemPartMaterial.acacia);
			Items.IronDarkOakSword = 	new ItemSword(ItemPartMaterial.iron, ItemPartMaterial.darkOak);
			
			Items.GoldOakSword = 		new ItemSword(ItemPartMaterial.gold, ItemPartMaterial.oak);
			Items.GoldSpruceSword = 	new ItemSword(ItemPartMaterial.gold, ItemPartMaterial.spruce);
			Items.GoldBirchSword = 		new ItemSword(ItemPartMaterial.gold, ItemPartMaterial.birch);
			Items.GoldJungleSword = 	new ItemSword(ItemPartMaterial.gold, ItemPartMaterial.jungle);
			Items.GoldAcaciaSword = 	new ItemSword(ItemPartMaterial.gold, ItemPartMaterial.acacia);
			Items.GoldDarkOakSword = 	new ItemSword(ItemPartMaterial.gold, ItemPartMaterial.darkOak);
			
			Items.DiamondOakSword = 	new ItemSword(ItemPartMaterial.diamond, ItemPartMaterial.oak);
			Items.DiamondSpruceSword = 	new ItemSword(ItemPartMaterial.diamond, ItemPartMaterial.spruce);
			Items.DiamondBirchSword = 	new ItemSword(ItemPartMaterial.diamond, ItemPartMaterial.birch);
			Items.DiamondJungleSword = 	new ItemSword(ItemPartMaterial.diamond, ItemPartMaterial.jungle);
			Items.DiamondAcaciaSword = 	new ItemSword(ItemPartMaterial.diamond, ItemPartMaterial.acacia);
			Items.DiamondDarkOakSword = new ItemSword(ItemPartMaterial.diamond, ItemPartMaterial.darkOak);
		}

		private static void shovel() 
		{
			Items.OakOakShovel = 			new ItemShovel(ItemPartMaterial.oak, ItemPartMaterial.oak);
			Items.OakSpruceShovel = 		new ItemShovel(ItemPartMaterial.oak, ItemPartMaterial.spruce);
			Items.OakBirchShovel = 			new ItemShovel(ItemPartMaterial.oak, ItemPartMaterial.birch);
			Items.OakJungleShovel = 		new ItemShovel(ItemPartMaterial.oak, ItemPartMaterial.jungle);
			Items.OakAcaciaShovel = 		new ItemShovel(ItemPartMaterial.oak, ItemPartMaterial.acacia);
			Items.OakDarkOakShovel = 		new ItemShovel(ItemPartMaterial.oak, ItemPartMaterial.darkOak);
			
			Items.SpruceOakShovel = 		new ItemShovel(ItemPartMaterial.spruce, ItemPartMaterial.oak);
			Items.SpruceSpruceShovel = 		new ItemShovel(ItemPartMaterial.spruce, ItemPartMaterial.spruce);
			Items.SpruceBirchShovel = 		new ItemShovel(ItemPartMaterial.spruce, ItemPartMaterial.birch);
			Items.SpruceJungleShovel = 		new ItemShovel(ItemPartMaterial.spruce, ItemPartMaterial.jungle);
			Items.SpruceAcaciaShovel = 		new ItemShovel(ItemPartMaterial.spruce, ItemPartMaterial.acacia);
			Items.SpruceDarkOakShovel = 	new ItemShovel(ItemPartMaterial.spruce, ItemPartMaterial.darkOak);
			
			Items.BirchOakShovel = 			new ItemShovel(ItemPartMaterial.birch, ItemPartMaterial.oak);
			Items.BirchSpruceShovel = 		new ItemShovel(ItemPartMaterial.birch, ItemPartMaterial.spruce);
			Items.BirchBirchShovel = 		new ItemShovel(ItemPartMaterial.birch, ItemPartMaterial.birch);
			Items.BirchJungleShovel = 		new ItemShovel(ItemPartMaterial.birch, ItemPartMaterial.jungle);
			Items.BirchAcaciaShovel = 		new ItemShovel(ItemPartMaterial.birch, ItemPartMaterial.acacia);
			Items.BirchDarkOakShovel = 		new ItemShovel(ItemPartMaterial.birch, ItemPartMaterial.darkOak);
			
			Items.JungleOakShovel = 		new ItemShovel(ItemPartMaterial.jungle, ItemPartMaterial.oak);
			Items.JungleSpruceShovel = 		new ItemShovel(ItemPartMaterial.jungle, ItemPartMaterial.spruce);
			Items.JungleBirchShovel = 		new ItemShovel(ItemPartMaterial.jungle, ItemPartMaterial.birch);
			Items.JungleJungleShovel = 		new ItemShovel(ItemPartMaterial.jungle, ItemPartMaterial.jungle);
			Items.JungleAcaciaShovel = 		new ItemShovel(ItemPartMaterial.jungle, ItemPartMaterial.acacia);
			Items.JungleDarkOakShovel = 	new ItemShovel(ItemPartMaterial.jungle, ItemPartMaterial.darkOak);
			
			Items.AcaciaOakShovel = 		new ItemShovel(ItemPartMaterial.acacia, ItemPartMaterial.oak);
			Items.AcaciaSpruceShovel = 		new ItemShovel(ItemPartMaterial.acacia, ItemPartMaterial.spruce);
			Items.AcaciaBirchShovel = 		new ItemShovel(ItemPartMaterial.acacia, ItemPartMaterial.birch);
			Items.AcaciaJungleShovel = 		new ItemShovel(ItemPartMaterial.acacia, ItemPartMaterial.jungle);
			Items.AcaciaAcaciaShovel = 		new ItemShovel(ItemPartMaterial.acacia, ItemPartMaterial.acacia);
			Items.AcaciaDarkOakShovel = 	new ItemShovel(ItemPartMaterial.acacia, ItemPartMaterial.darkOak);
			
			Items.DarkOakOakShovel = 		new ItemShovel(ItemPartMaterial.darkOak, ItemPartMaterial.oak);
			Items.DarkOakSpruceShovel = 	new ItemShovel(ItemPartMaterial.darkOak, ItemPartMaterial.spruce);
			Items.DarkOakBirchShovel = 		new ItemShovel(ItemPartMaterial.darkOak, ItemPartMaterial.birch);
			Items.DarkOakJungleShovel =		new ItemShovel(ItemPartMaterial.darkOak, ItemPartMaterial.jungle);
			Items.DarkOakAcaciaShovel = 	new ItemShovel(ItemPartMaterial.darkOak, ItemPartMaterial.acacia);
			Items.DarkOakDarkOakShovel = 	new ItemShovel(ItemPartMaterial.darkOak, ItemPartMaterial.darkOak);
			
			Items.StoneOakShovel = 			new ItemShovel(ItemPartMaterial.stone, ItemPartMaterial.oak);
			Items.StoneSpruceShovel = 		new ItemShovel(ItemPartMaterial.stone, ItemPartMaterial.spruce);
			Items.StoneBirchShovel = 		new ItemShovel(ItemPartMaterial.stone, ItemPartMaterial.birch);
			Items.StoneJungleShovel =		new ItemShovel(ItemPartMaterial.stone, ItemPartMaterial.jungle);
			Items.StoneAcaciaShovel = 		new ItemShovel(ItemPartMaterial.stone, ItemPartMaterial.acacia);
			Items.StoneDarkOakShovel = 		new ItemShovel(ItemPartMaterial.stone, ItemPartMaterial.darkOak);
			
			Items.IronOakShovel = 			new ItemShovel(ItemPartMaterial.iron, ItemPartMaterial.oak);
			Items.IronSpruceShovel = 		new ItemShovel(ItemPartMaterial.iron, ItemPartMaterial.spruce);
			Items.IronBirchShovel = 		new ItemShovel(ItemPartMaterial.iron, ItemPartMaterial.birch);
			Items.IronJungleShovel = 		new ItemShovel(ItemPartMaterial.iron, ItemPartMaterial.jungle);
			Items.IronAcaciaShovel = 		new ItemShovel(ItemPartMaterial.iron, ItemPartMaterial.acacia);
			Items.IronDarkOakShovel = 		new ItemShovel(ItemPartMaterial.iron, ItemPartMaterial.darkOak);
			
			Items.GoldOakShovel = 			new ItemShovel(ItemPartMaterial.gold, ItemPartMaterial.oak);
			Items.GoldSpruceShovel = 		new ItemShovel(ItemPartMaterial.gold, ItemPartMaterial.spruce);
			Items.GoldBirchShovel = 		new ItemShovel(ItemPartMaterial.gold, ItemPartMaterial.birch);
			Items.GoldJungleShovel = 		new ItemShovel(ItemPartMaterial.gold, ItemPartMaterial.jungle);
			Items.GoldAcaciaShovel = 		new ItemShovel(ItemPartMaterial.gold, ItemPartMaterial.acacia);
			Items.GoldDarkOakShovel = 		new ItemShovel(ItemPartMaterial.gold, ItemPartMaterial.darkOak);
			
			Items.DiamondOakShovel = 		new ItemShovel(ItemPartMaterial.diamond, ItemPartMaterial.oak);
			Items.DiamondSpruceShovel = 	new ItemShovel(ItemPartMaterial.diamond, ItemPartMaterial.spruce);
			Items.DiamondBirchShovel = 		new ItemShovel(ItemPartMaterial.diamond, ItemPartMaterial.birch);
			Items.DiamondJungleShovel = 	new ItemShovel(ItemPartMaterial.diamond, ItemPartMaterial.jungle);
			Items.DiamondAcaciaShovel = 	new ItemShovel(ItemPartMaterial.diamond, ItemPartMaterial.acacia);
			Items.DiamondDarkOakShovel = 	new ItemShovel(ItemPartMaterial.diamond, ItemPartMaterial.darkOak);
		}
		
		private static void pickaxe() 
		{
			Items.OakOakPickaxe = 			new ItemPickaxe(ItemPartMaterial.oak, ItemPartMaterial.oak);
			Items.OakSprucePickaxe = 		new ItemPickaxe(ItemPartMaterial.oak, ItemPartMaterial.spruce);
			Items.OakBirchPickaxe = 		new ItemPickaxe(ItemPartMaterial.oak, ItemPartMaterial.birch);
			Items.OakJunglePickaxe = 		new ItemPickaxe(ItemPartMaterial.oak, ItemPartMaterial.jungle);
			Items.OakAcaciaPickaxe = 		new ItemPickaxe(ItemPartMaterial.oak, ItemPartMaterial.acacia);
			Items.OakDarkOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.oak, ItemPartMaterial.darkOak);
			
			Items.SpruceOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.spruce, ItemPartMaterial.oak);
			Items.SpruceSprucePickaxe = 	new ItemPickaxe(ItemPartMaterial.spruce, ItemPartMaterial.spruce);
			Items.SpruceBirchPickaxe = 		new ItemPickaxe(ItemPartMaterial.spruce, ItemPartMaterial.birch);
			Items.SpruceJunglePickaxe = 	new ItemPickaxe(ItemPartMaterial.spruce, ItemPartMaterial.jungle);
			Items.SpruceAcaciaPickaxe = 	new ItemPickaxe(ItemPartMaterial.spruce, ItemPartMaterial.acacia);
			Items.SpruceDarkOakPickaxe = 	new ItemPickaxe(ItemPartMaterial.spruce, ItemPartMaterial.darkOak);
			
			Items.BirchOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.birch, ItemPartMaterial.oak);
			Items.BirchSprucePickaxe = 		new ItemPickaxe(ItemPartMaterial.birch, ItemPartMaterial.spruce);
			Items.BirchBirchPickaxe = 		new ItemPickaxe(ItemPartMaterial.birch, ItemPartMaterial.birch);
			Items.BirchJunglePickaxe = 		new ItemPickaxe(ItemPartMaterial.birch, ItemPartMaterial.jungle);
			Items.BirchAcaciaPickaxe = 		new ItemPickaxe(ItemPartMaterial.birch, ItemPartMaterial.acacia);
			Items.BirchDarkOakPickaxe = 	new ItemPickaxe(ItemPartMaterial.birch, ItemPartMaterial.darkOak);
			
			Items.JungleOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.jungle, ItemPartMaterial.oak);
			Items.JungleSprucePickaxe = 	new ItemPickaxe(ItemPartMaterial.jungle, ItemPartMaterial.spruce);
			Items.JungleBirchPickaxe = 		new ItemPickaxe(ItemPartMaterial.jungle, ItemPartMaterial.birch);
			Items.JungleJunglePickaxe = 	new ItemPickaxe(ItemPartMaterial.jungle, ItemPartMaterial.jungle);
			Items.JungleAcaciaPickaxe = 	new ItemPickaxe(ItemPartMaterial.jungle, ItemPartMaterial.acacia);
			Items.JungleDarkOakPickaxe = 	new ItemPickaxe(ItemPartMaterial.jungle, ItemPartMaterial.darkOak);
			
			Items.AcaciaOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.acacia, ItemPartMaterial.oak);
			Items.AcaciaSprucePickaxe = 	new ItemPickaxe(ItemPartMaterial.acacia, ItemPartMaterial.spruce);
			Items.AcaciaBirchPickaxe = 		new ItemPickaxe(ItemPartMaterial.acacia, ItemPartMaterial.birch);
			Items.AcaciaJunglePickaxe = 	new ItemPickaxe(ItemPartMaterial.acacia, ItemPartMaterial.jungle);
			Items.AcaciaAcaciaPickaxe = 	new ItemPickaxe(ItemPartMaterial.acacia, ItemPartMaterial.acacia);
			Items.AcaciaDarkOakPickaxe = 	new ItemPickaxe(ItemPartMaterial.acacia, ItemPartMaterial.darkOak);
			
			Items.DarkOakOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.darkOak, ItemPartMaterial.oak);
			Items.DarkOakSprucePickaxe = 	new ItemPickaxe(ItemPartMaterial.darkOak, ItemPartMaterial.spruce);
			Items.DarkOakBirchPickaxe = 	new ItemPickaxe(ItemPartMaterial.darkOak, ItemPartMaterial.birch);
			Items.DarkOakJunglePickaxe = 	new ItemPickaxe(ItemPartMaterial.darkOak, ItemPartMaterial.jungle);
			Items.DarkOakAcaciaPickaxe = 	new ItemPickaxe(ItemPartMaterial.darkOak, ItemPartMaterial.acacia);
			Items.DarkOakDarkOakPickaxe = 	new ItemPickaxe(ItemPartMaterial.darkOak, ItemPartMaterial.darkOak);
			
			Items.StoneOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.stone, ItemPartMaterial.oak);
			Items.StoneSprucePickaxe = 		new ItemPickaxe(ItemPartMaterial.stone, ItemPartMaterial.spruce);
			Items.StoneBirchPickaxe = 		new ItemPickaxe(ItemPartMaterial.stone, ItemPartMaterial.birch);
			Items.StoneJunglePickaxe =		new ItemPickaxe(ItemPartMaterial.stone, ItemPartMaterial.jungle);
			Items.StoneAcaciaPickaxe = 		new ItemPickaxe(ItemPartMaterial.stone, ItemPartMaterial.acacia);
			Items.StoneDarkOakPickaxe = 	new ItemPickaxe(ItemPartMaterial.stone, ItemPartMaterial.darkOak);
			
			Items.IronOakPickaxe = 			new ItemPickaxe(ItemPartMaterial.iron, ItemPartMaterial.oak);
			Items.IronSprucePickaxe = 		new ItemPickaxe(ItemPartMaterial.iron, ItemPartMaterial.spruce);
			Items.IronBirchPickaxe = 		new ItemPickaxe(ItemPartMaterial.iron, ItemPartMaterial.birch);
			Items.IronJunglePickaxe = 		new ItemPickaxe(ItemPartMaterial.iron, ItemPartMaterial.jungle);
			Items.IronAcaciaPickaxe = 		new ItemPickaxe(ItemPartMaterial.iron, ItemPartMaterial.acacia);
			Items.IronDarkOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.iron, ItemPartMaterial.darkOak);
			
			Items.GoldOakPickaxe = 			new ItemPickaxe(ItemPartMaterial.gold, ItemPartMaterial.oak);
			Items.GoldSprucePickaxe = 		new ItemPickaxe(ItemPartMaterial.gold, ItemPartMaterial.spruce);
			Items.GoldBirchPickaxe = 		new ItemPickaxe(ItemPartMaterial.gold, ItemPartMaterial.birch);
			Items.GoldJunglePickaxe = 		new ItemPickaxe(ItemPartMaterial.gold, ItemPartMaterial.jungle);
			Items.GoldAcaciaPickaxe = 		new ItemPickaxe(ItemPartMaterial.gold, ItemPartMaterial.acacia);
			Items.GoldDarkOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.gold, ItemPartMaterial.darkOak);
			
			Items.DiamondOakPickaxe = 		new ItemPickaxe(ItemPartMaterial.diamond, ItemPartMaterial.oak);
			Items.DiamondSprucePickaxe = 	new ItemPickaxe(ItemPartMaterial.diamond, ItemPartMaterial.spruce);
			Items.DiamondBirchPickaxe = 	new ItemPickaxe(ItemPartMaterial.diamond, ItemPartMaterial.birch);
			Items.DiamondJunglePickaxe = 	new ItemPickaxe(ItemPartMaterial.diamond, ItemPartMaterial.jungle);
			Items.DiamondAcaciaPickaxe = 	new ItemPickaxe(ItemPartMaterial.diamond, ItemPartMaterial.acacia);
			Items.DiamondDarkOakPickaxe = 	new ItemPickaxe(ItemPartMaterial.diamond, ItemPartMaterial.darkOak);
		}
		
		private static void axe() 
		{
			Items.OakOakAxe = 			new ItemAxe(ItemPartMaterial.oak, ItemPartMaterial.oak);
			Items.OakSpruceAxe = 		new ItemAxe(ItemPartMaterial.oak, ItemPartMaterial.spruce);
			Items.OakBirchAxe = 		new ItemAxe(ItemPartMaterial.oak, ItemPartMaterial.birch);
			Items.OakJungleAxe = 		new ItemAxe(ItemPartMaterial.oak, ItemPartMaterial.jungle);
			Items.OakAcaciaAxe = 		new ItemAxe(ItemPartMaterial.oak, ItemPartMaterial.acacia);
			Items.OakDarkOakAxe = 		new ItemAxe(ItemPartMaterial.oak, ItemPartMaterial.darkOak);
			
			Items.SpruceOakAxe = 		new ItemAxe(ItemPartMaterial.spruce, ItemPartMaterial.oak);
			Items.SpruceSpruceAxe = 	new ItemAxe(ItemPartMaterial.spruce, ItemPartMaterial.spruce);
			Items.SpruceBirchAxe = 		new ItemAxe(ItemPartMaterial.spruce, ItemPartMaterial.birch);
			Items.SpruceJungleAxe = 	new ItemAxe(ItemPartMaterial.spruce, ItemPartMaterial.jungle);
			Items.SpruceAcaciaAxe = 	new ItemAxe(ItemPartMaterial.spruce, ItemPartMaterial.acacia);
			Items.SpruceDarkOakAxe = 	new ItemAxe(ItemPartMaterial.spruce, ItemPartMaterial.darkOak);
			
			Items.BirchOakAxe = 		new ItemAxe(ItemPartMaterial.birch, ItemPartMaterial.oak);
			Items.BirchSpruceAxe = 		new ItemAxe(ItemPartMaterial.birch, ItemPartMaterial.spruce);
			Items.BirchBirchAxe = 		new ItemAxe(ItemPartMaterial.birch, ItemPartMaterial.birch);
			Items.BirchJungleAxe = 		new ItemAxe(ItemPartMaterial.birch, ItemPartMaterial.jungle);
			Items.BirchAcaciaAxe = 		new ItemAxe(ItemPartMaterial.birch, ItemPartMaterial.acacia);
			Items.BirchDarkOakAxe = 	new ItemAxe(ItemPartMaterial.birch, ItemPartMaterial.darkOak);
			
			Items.JungleOakAxe = 		new ItemAxe(ItemPartMaterial.jungle, ItemPartMaterial.oak);
			Items.JungleSpruceAxe = 	new ItemAxe(ItemPartMaterial.jungle, ItemPartMaterial.spruce);
			Items.JungleBirchAxe = 		new ItemAxe(ItemPartMaterial.jungle, ItemPartMaterial.birch);
			Items.JungleJungleAxe = 	new ItemAxe(ItemPartMaterial.jungle, ItemPartMaterial.jungle);
			Items.JungleAcaciaAxe = 	new ItemAxe(ItemPartMaterial.jungle, ItemPartMaterial.acacia);
			Items.JungleDarkOakAxe = 	new ItemAxe(ItemPartMaterial.jungle, ItemPartMaterial.darkOak);
			
			Items.AcaciaOakAxe = 		new ItemAxe(ItemPartMaterial.acacia, ItemPartMaterial.oak);
			Items.AcaciaSpruceAxe = 	new ItemAxe(ItemPartMaterial.acacia, ItemPartMaterial.spruce);
			Items.AcaciaBirchAxe = 		new ItemAxe(ItemPartMaterial.acacia, ItemPartMaterial.birch);
			Items.AcaciaJungleAxe = 	new ItemAxe(ItemPartMaterial.acacia, ItemPartMaterial.jungle);
			Items.AcaciaAcaciaAxe = 	new ItemAxe(ItemPartMaterial.acacia, ItemPartMaterial.acacia);
			Items.AcaciaDarkOakAxe = 	new ItemAxe(ItemPartMaterial.acacia, ItemPartMaterial.darkOak);
			
			Items.DarkOakOakAxe = 		new ItemAxe(ItemPartMaterial.darkOak, ItemPartMaterial.oak);
			Items.DarkOakSpruceAxe = 	new ItemAxe(ItemPartMaterial.darkOak, ItemPartMaterial.spruce);
			Items.DarkOakBirchAxe = 	new ItemAxe(ItemPartMaterial.darkOak, ItemPartMaterial.birch);
			Items.DarkOakJungleAxe = 	new ItemAxe(ItemPartMaterial.darkOak, ItemPartMaterial.jungle);
			Items.DarkOakAcaciaAxe = 	new ItemAxe(ItemPartMaterial.darkOak, ItemPartMaterial.acacia);
			Items.DarkOakDarkOakAxe = 	new ItemAxe(ItemPartMaterial.darkOak, ItemPartMaterial.darkOak);
			
			Items.StoneOakAxe = 		new ItemAxe(ItemPartMaterial.stone, ItemPartMaterial.oak);
			Items.StoneSpruceAxe = 		new ItemAxe(ItemPartMaterial.stone, ItemPartMaterial.spruce);
			Items.StoneBirchAxe = 		new ItemAxe(ItemPartMaterial.stone, ItemPartMaterial.birch);
			Items.StoneJungleAxe =		new ItemAxe(ItemPartMaterial.stone, ItemPartMaterial.jungle);
			Items.StoneAcaciaAxe = 		new ItemAxe(ItemPartMaterial.stone, ItemPartMaterial.acacia);
			Items.StoneDarkOakAxe = 	new ItemAxe(ItemPartMaterial.stone, ItemPartMaterial.darkOak);
			
			Items.IronOakAxe = 			new ItemAxe(ItemPartMaterial.iron, ItemPartMaterial.oak);
			Items.IronSpruceAxe = 		new ItemAxe(ItemPartMaterial.iron, ItemPartMaterial.spruce);
			Items.IronBirchAxe = 		new ItemAxe(ItemPartMaterial.iron, ItemPartMaterial.birch);
			Items.IronJungleAxe = 		new ItemAxe(ItemPartMaterial.iron, ItemPartMaterial.jungle);
			Items.IronAcaciaAxe = 		new ItemAxe(ItemPartMaterial.iron, ItemPartMaterial.acacia);
			Items.IronDarkOakAxe = 		new ItemAxe(ItemPartMaterial.iron, ItemPartMaterial.darkOak);
			
			Items.GoldOakAxe = 			new ItemAxe(ItemPartMaterial.gold, ItemPartMaterial.oak);
			Items.GoldSpruceAxe = 		new ItemAxe(ItemPartMaterial.gold, ItemPartMaterial.spruce);
			Items.GoldBirchAxe = 		new ItemAxe(ItemPartMaterial.gold, ItemPartMaterial.birch);
			Items.GoldJungleAxe = 		new ItemAxe(ItemPartMaterial.gold, ItemPartMaterial.jungle);
			Items.GoldAcaciaAxe = 		new ItemAxe(ItemPartMaterial.gold, ItemPartMaterial.acacia);
			Items.GoldDarkOakAxe = 		new ItemAxe(ItemPartMaterial.gold, ItemPartMaterial.darkOak);
			
			Items.DiamondOakAxe = 		new ItemAxe(ItemPartMaterial.diamond, ItemPartMaterial.oak);
			Items.DiamondSpruceAxe = 	new ItemAxe(ItemPartMaterial.diamond, ItemPartMaterial.spruce);
			Items.DiamondBirchAxe = 	new ItemAxe(ItemPartMaterial.diamond, ItemPartMaterial.birch);
			Items.DiamondJungleAxe = 	new ItemAxe(ItemPartMaterial.diamond, ItemPartMaterial.jungle);
			Items.DiamondAcaciaAxe = 	new ItemAxe(ItemPartMaterial.diamond, ItemPartMaterial.acacia);
			Items.DiamondDarkOakAxe = 	new ItemAxe(ItemPartMaterial.diamond, ItemPartMaterial.darkOak);
		}
		
		private static void hoe() 
		{
			Items.OakOakHoe = 			new ItemHoe(ItemPartMaterial.oak, ItemPartMaterial.oak);
			Items.OakSpruceHoe = 		new ItemHoe(ItemPartMaterial.oak, ItemPartMaterial.spruce);
			Items.OakBirchHoe = 		new ItemHoe(ItemPartMaterial.oak, ItemPartMaterial.birch);
			Items.OakJungleHoe = 		new ItemHoe(ItemPartMaterial.oak, ItemPartMaterial.jungle);
			Items.OakAcaciaHoe = 		new ItemHoe(ItemPartMaterial.oak, ItemPartMaterial.acacia);
			Items.OakDarkOakHoe = 		new ItemHoe(ItemPartMaterial.oak, ItemPartMaterial.darkOak);
			
			Items.SpruceOakHoe = 		new ItemHoe(ItemPartMaterial.spruce, ItemPartMaterial.oak);
			Items.SpruceSpruceHoe = 	new ItemHoe(ItemPartMaterial.spruce, ItemPartMaterial.spruce);
			Items.SpruceBirchHoe = 		new ItemHoe(ItemPartMaterial.spruce, ItemPartMaterial.birch);
			Items.SpruceJungleHoe = 	new ItemHoe(ItemPartMaterial.spruce, ItemPartMaterial.jungle);
			Items.SpruceAcaciaHoe = 	new ItemHoe(ItemPartMaterial.spruce, ItemPartMaterial.acacia);
			Items.SpruceDarkOakHoe = 	new ItemHoe(ItemPartMaterial.spruce, ItemPartMaterial.darkOak);
			
			Items.BirchOakHoe = 		new ItemHoe(ItemPartMaterial.birch, ItemPartMaterial.oak);
			Items.BirchSpruceHoe = 		new ItemHoe(ItemPartMaterial.birch, ItemPartMaterial.spruce);
			Items.BirchBirchHoe = 		new ItemHoe(ItemPartMaterial.birch, ItemPartMaterial.birch);
			Items.BirchJungleHoe = 		new ItemHoe(ItemPartMaterial.birch, ItemPartMaterial.jungle);
			Items.BirchAcaciaHoe = 		new ItemHoe(ItemPartMaterial.birch, ItemPartMaterial.acacia);
			Items.BirchDarkOakHoe = 	new ItemHoe(ItemPartMaterial.birch, ItemPartMaterial.darkOak);
			
			Items.JungleOakHoe = 		new ItemHoe(ItemPartMaterial.jungle, ItemPartMaterial.oak);
			Items.JungleSpruceHoe = 	new ItemHoe(ItemPartMaterial.jungle, ItemPartMaterial.spruce);
			Items.JungleBirchHoe = 		new ItemHoe(ItemPartMaterial.jungle, ItemPartMaterial.birch);
			Items.JungleJungleHoe = 	new ItemHoe(ItemPartMaterial.jungle, ItemPartMaterial.jungle);
			Items.JungleAcaciaHoe = 	new ItemHoe(ItemPartMaterial.jungle, ItemPartMaterial.acacia);
			Items.JungleDarkOakHoe = 	new ItemHoe(ItemPartMaterial.jungle, ItemPartMaterial.darkOak);
			
			Items.AcaciaOakHoe = 		new ItemHoe(ItemPartMaterial.acacia, ItemPartMaterial.oak);
			Items.AcaciaSpruceHoe = 	new ItemHoe(ItemPartMaterial.acacia, ItemPartMaterial.spruce);
			Items.AcaciaBirchHoe = 		new ItemHoe(ItemPartMaterial.acacia, ItemPartMaterial.birch);
			Items.AcaciaJungleHoe = 	new ItemHoe(ItemPartMaterial.acacia, ItemPartMaterial.jungle);
			Items.AcaciaAcaciaHoe = 	new ItemHoe(ItemPartMaterial.acacia, ItemPartMaterial.acacia);
			Items.AcaciaDarkOakHoe = 	new ItemHoe(ItemPartMaterial.acacia, ItemPartMaterial.darkOak);
			
			Items.DarkOakOakHoe = 		new ItemHoe(ItemPartMaterial.darkOak, ItemPartMaterial.oak);
			Items.DarkOakSpruceHoe = 	new ItemHoe(ItemPartMaterial.darkOak, ItemPartMaterial.spruce);
			Items.DarkOakBirchHoe = 	new ItemHoe(ItemPartMaterial.darkOak, ItemPartMaterial.birch);
			Items.DarkOakJungleHoe = 	new ItemHoe(ItemPartMaterial.darkOak, ItemPartMaterial.jungle);
			Items.DarkOakAcaciaHoe = 	new ItemHoe(ItemPartMaterial.darkOak, ItemPartMaterial.acacia);
			Items.DarkOakDarkOakHoe = 	new ItemHoe(ItemPartMaterial.darkOak, ItemPartMaterial.darkOak);
			
			Items.StoneOakHoe = 		new ItemHoe(ItemPartMaterial.stone, ItemPartMaterial.oak);
			Items.StoneSpruceHoe = 		new ItemHoe(ItemPartMaterial.stone, ItemPartMaterial.spruce);
			Items.StoneBirchHoe = 		new ItemHoe(ItemPartMaterial.stone, ItemPartMaterial.birch);
			Items.StoneJungleHoe =		new ItemHoe(ItemPartMaterial.stone, ItemPartMaterial.jungle);
			Items.StoneAcaciaHoe = 		new ItemHoe(ItemPartMaterial.stone, ItemPartMaterial.acacia);
			Items.StoneDarkOakHoe = 	new ItemHoe(ItemPartMaterial.stone, ItemPartMaterial.darkOak);
			
			Items.IronOakHoe = 			new ItemHoe(ItemPartMaterial.iron, ItemPartMaterial.oak);
			Items.IronSpruceHoe = 		new ItemHoe(ItemPartMaterial.iron, ItemPartMaterial.spruce);
			Items.IronBirchHoe = 		new ItemHoe(ItemPartMaterial.iron, ItemPartMaterial.birch);
			Items.IronJungleHoe = 		new ItemHoe(ItemPartMaterial.iron, ItemPartMaterial.jungle);
			Items.IronAcaciaHoe = 		new ItemHoe(ItemPartMaterial.iron, ItemPartMaterial.acacia);
			Items.IronDarkOakHoe = 		new ItemHoe(ItemPartMaterial.iron, ItemPartMaterial.darkOak);
			
			Items.GoldOakHoe = 			new ItemHoe(ItemPartMaterial.gold, ItemPartMaterial.oak);
			Items.GoldSpruceHoe = 		new ItemHoe(ItemPartMaterial.gold, ItemPartMaterial.spruce);
			Items.GoldBirchHoe = 		new ItemHoe(ItemPartMaterial.gold, ItemPartMaterial.birch);
			Items.GoldJungleHoe = 		new ItemHoe(ItemPartMaterial.gold, ItemPartMaterial.jungle);
			Items.GoldAcaciaHoe = 		new ItemHoe(ItemPartMaterial.gold, ItemPartMaterial.acacia);
			Items.GoldDarkOakHoe = 		new ItemHoe(ItemPartMaterial.gold, ItemPartMaterial.darkOak);
			
			Items.DiamondOakHoe = 		new ItemHoe(ItemPartMaterial.diamond, ItemPartMaterial.oak);
			Items.DiamondSpruceHoe = 	new ItemHoe(ItemPartMaterial.diamond, ItemPartMaterial.spruce);
			Items.DiamondBirchHoe = 	new ItemHoe(ItemPartMaterial.diamond, ItemPartMaterial.birch);
			Items.DiamondJungleHoe = 	new ItemHoe(ItemPartMaterial.diamond, ItemPartMaterial.jungle);
			Items.DiamondAcaciaHoe = 	new ItemHoe(ItemPartMaterial.diamond, ItemPartMaterial.acacia);
			Items.DiamondDarkOakHoe = 	new ItemHoe(ItemPartMaterial.diamond, ItemPartMaterial.darkOak);
		}
		
		private static void bow()
		{
			Items.OakBow =	new ItemBow(ItemPartMaterial.oak);
			Items.SpruceBow =	new ItemBow(ItemPartMaterial.spruce);
			Items.BirchBow =	new ItemBow(ItemPartMaterial.birch);
			Items.JungleBow =	new ItemBow(ItemPartMaterial.jungle);
			Items.AcaciaBow =	new ItemBow(ItemPartMaterial.acacia);
			Items.DarkOakBow =	new ItemBow(ItemPartMaterial.darkOak);
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