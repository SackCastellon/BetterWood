/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood;

import java.io.File;

import com.sackcastellon.betterwood.handler.ConfigHandler;
import com.sackcastellon.betterwood.handler.FuelHandler;
import com.sackcastellon.betterwood.lib.Reference;
import com.sackcastellon.betterwood.loader.BlockLoader;
import com.sackcastellon.betterwood.loader.ItemLoader;
import com.sackcastellon.betterwood.loader.RecipeLoader;
import com.sackcastellon.betterwood.loader.TabLoader;
import com.sackcastellon.betterwood.proxy.CommonProxy;
import com.sackcastellon.betterwood.register.BlockRegister;
import com.sackcastellon.betterwood.register.ItemRegister;
import com.sackcastellon.betterwood.register.OreDictionaryRegister;
import com.sackcastellon.core.helper.LogHelper;
import com.sackcastellon.core.helper.VersionHelper;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid=Reference.ID, name=Reference.NAME, version=Reference.VERSION, dependencies=Reference.DEPENDENCIES)
public class BetterWood {
	
		@Instance(Reference.ID)
		public static BetterWood instance;

		@SidedProxy(clientSide=Reference.CLPROXY, serverSide=Reference.CMPROXY)
		public static CommonProxy proxy;
		
		@EventHandler
		public void preInit(FMLPreInitializationEvent event)
		{
			ConfigHandler.loadConfig(new File(event.getModConfigurationDirectory(), Reference.ConfigPath));
			
			if (ConfigHandler.CheckVersion)
			{
				VersionHelper.check(Reference.ID, Reference.NAME, Reference.VERSION, Reference.URL);
			}
			
			// Creative Tabs
			
			try
			{
		    	LogHelper.info(Reference.ID, "Loading creative tabs.");
		    	
		    	TabLoader.init();
			}
			
			catch(Exception e)
			{
				LogHelper.error(Reference.ID, "Could not load creative tabs");
			}
			
			finally
			{
				LogHelper.info(Reference.ID, "Creative tabs succesfully loaded");
			}
			
			// Items
			
			try
			{
		    	LogHelper.info(Reference.ID, "Loading items.");
		    	
		    	ItemLoader.init();
		    	ItemRegister.init();
			}
			
			catch(Exception e)
			{
				LogHelper.error(Reference.ID, "Could not load items");
			}
			
			finally
			{
				LogHelper.info(Reference.ID, "Items succesfully loaded");
			}
			
			// Blocks
			
			try
			{
		    	LogHelper.info(Reference.ID, "Loading blocks.");
		    	
		    	BlockLoader.init();
		    	BlockRegister.init();
			}
			
			catch(Exception e)
			{
				LogHelper.error(Reference.ID, "Could not load blocks");
			}
			
			finally
			{
				LogHelper.info(Reference.ID, "Blocks succesfully loaded");
			}	
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event)
		{
			OreDictionaryRegister.init();
			
			// Recipes
			
			try
			{
		    	LogHelper.info(Reference.ID, "Loading recipes.");
		    	
		    	RecipeLoader.init();
		    	GameRegistry.registerFuelHandler(new FuelHandler()); // TODO
			}
			
			catch(Exception e)
			{
				LogHelper.error(Reference.ID, "Could not load recipes");
			}
			
			finally
			{
				LogHelper.info(Reference.ID, "Recipes succesfully loaded");
			}
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)  {}

}