/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.block;

import java.util.Random;

import com.sackcastellon.betterwood.api.Tabs;
import com.sackcastellon.betterwood.item.ItemPartMaterial;
import com.sackcastellon.betterwood.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockBookshelf extends Block {
	
	private ItemPartMaterial material;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconSide;
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;

	public BlockBookshelf(ItemPartMaterial material)
	{
		super(Material.wood);

		this.material = material;
		
		this.setBlockName("Bookshelf");
		this.setCreativeTab(Tabs.tabBW);
		this.setHardness(1.5F);
		this.setStepSound(soundTypeWood);
		
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return super.getUnlocalizedName() + "." + this.material.getMaterial();
	}

	@Override
    public float getEnchantPowerBonus(World world, int x, int y, int z)
    {
        return 1;
    }

	@Override
    public int quantityDropped(Random par1)
    {
        return 3;
    }

	@Override
    public Item getItemDropped(int par1, Random random, int par3)
    {
        return Items.book;
    }
	
	public String getTexturePath(boolean side)
	{
		if(side)
		{
			return Reference.TexturePath + "bookshelf/side" + this.material.getPath();
		}
		
		else
		{
			return Reference.TexturePath + "planks" + this.material.getPath();
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)		
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.iconSide = iconRegister.registerIcon(this.getTexturePath(true));
		this.iconTop = iconRegister.registerIcon(this.getTexturePath(false));
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int pass)
    {
        return side != 1 && side != 0 ? this.iconSide : this.iconTop;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand)
	{
        super.randomDisplayTick(world, x, y, z, rand);
        
        for (int Ex = x - 2; Ex <= x + 2; ++Ex)
        {
            for (int Ey = y - 2; Ey <= y + 2; ++Ey)
            {
                for (int Ez = z - 2; Ez <= z + 2; ++Ez)
                {
                	if (world.getBlock(Ex, Ey, Ez) == Blocks.enchanting_table)
                	{
                    	for (int l = Ex - 2; l <= Ex + 2; ++l)
                        {
                            for (int i1 = Ez - 2; i1 <= Ez + 2; ++i1)
                            {
                                if (l > Ex - 2 && l < Ex + 2 && i1 == Ez - 1)
                                {
                                    i1 = Ez + 2;
                                }

                                if (rand.nextInt(64) == 0)
                                {
                                    for (int j1 = Ey; j1 <= Ey + 1; ++j1)
                                    {
                                        if (world.getBlock(l, j1, i1) == this)
                                        {
                                            if (!world.isAirBlock((l - Ex) / 2 + Ex, j1, (i1 - Ez) / 2 + Ez))
                                            {
                                                break;
                                            }

                                            world.spawnParticle("enchantmenttable", (double)Ex + 0.5D, (double)Ey + 2.0D, (double)Ez + 0.5D, (double)((float)(l - Ex) + rand.nextFloat()) - 0.5D, (double)((float)(j1 - Ey) - rand.nextFloat() - 1.0F), (double)((float)(i1 - Ez) + rand.nextFloat()) - 0.5D);
                                        }
                                    }
                                }
                            }
                        }
                	}
                }
            }
        }
	}
}