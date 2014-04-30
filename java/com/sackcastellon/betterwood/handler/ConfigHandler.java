/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.handler;

import java.io.File;

import com.sackcastellon.betterwood.lib.Reference;
import com.sackcastellon.core.helper.LogHelper;
import com.sackcastellon.core.lib.Config;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	public static boolean CheckVersion;
	public static boolean ManyTools;
	public static boolean FullItemName;
	public static boolean FullBlockName;
	
	public static void loadConfig(File par1)
	{
		
		config = new Configuration(par1);
		
		try
		{			
			config.load();
			
			ManyTools = config.get(Config.GENERAL, "ManyTools", true).getBoolean(true);
			
			FullItemName = config.get(Config.GENERAL, "FullItemName", false, "If true shows the type and the material of the item on the item's name.\n"
																			+ "If false will only show the type on the item's name, and the material will be shown on the item's lore").getBoolean(false);
			
			FullBlockName = config.get(Config.GENERAL, "FullBlockName", false, "If true shows the type and the material of the block on the block's name.\n"
																			+ "If false will only show the type on the block's name, and the material will be shown on the block's lore").getBoolean(false);
			
			CheckVersion = config.get(Config.GENERAL, "CheckVersion", true, Config.VersionCheckDesc).getBoolean(true);

		}
		
		catch (Exception e)
		{
			LogHelper.info(Reference.ID, "Could not load the config file.");
		}
		
		finally
		{
			if (config.hasChanged())
			{
				config.save();
			}
			
			LogHelper.info(Reference.ID, "Config file succesfully loaded.");
		}
		
	}
}