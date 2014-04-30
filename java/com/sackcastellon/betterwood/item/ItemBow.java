/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.item;

import java.util.List;

import com.sackcastellon.betterwood.api.Tabs;
import com.sackcastellon.betterwood.lib.Reference;
import com.sackcastellon.betterwood.loader.LoreLoader;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBow extends net.minecraft.item.ItemBow {
	
	private final IIcon[] iconArray = new IIcon[3];
	
    private final String material;
    
	private final String materialLore;
	
	private final String lore = LoreLoader.Material;

	public ItemBow(ItemPartMaterial material)
    {
		this.setCreativeTab(Tabs.tabBW);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Bow");
		this.setMaxDamage(384);
		
		this.material = material.getMaterial();
		this.materialLore = material.getLore();
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4)
	{
		list.add(this.lore + ": " + this.materialLore);
		
		if (itemStack.isItemEnchanted())
		{
			list.add("");
		}
	}
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return super.getUnlocalizedName() + "." + this.material;
    }
    
    private String getPathForPull(int pull)
    {
    	return Reference.TexturePath + "bow/" + pull + "/" + this.material;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(this.getPathForPull(0));

        for (int i = 0; i < 3; ++i)
        {
            this.iconArray[i] = iconRegister.registerIcon(this.getPathForPull(i + 1));
        }
    }

    @Override
    public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {

    	if(player.getItemInUse() == null)
    	{
    		return this.itemIcon;
    	}
    	
    	int Pulling = stack.getMaxItemUseDuration() - useRemaining;
    		
    	if (Pulling >= 18)
    	{
    		return iconArray[2];
    	}

    	else if (Pulling > 13)
    	{
    		return iconArray[1];
    	}

    	else if (Pulling > 0)
    	{
    		return iconArray[0];
    	}       
    	
    	return this.itemIcon;
    }
}