/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.block;

import java.util.List;

import com.sackcastellon.betterwood.api.Blocks;
import com.sackcastellon.betterwood.api.Tabs;
import com.sackcastellon.betterwood.item.ItemPartMaterial;
import com.sackcastellon.betterwood.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemLead;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFence extends net.minecraft.block.BlockFence
{
    private ItemPartMaterial material;

	public BlockFence(ItemPartMaterial material)
	{
        super(null, Material.wood);
        
        this.material = material;
        
        this.setBlockName("Fence");
        this.setCreativeTab(Tabs.tabBW);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeWood);
    }
	
	@Override
	public String getUnlocalizedName()
	{
		return super.getUnlocalizedName() + "." + this.material.getMaterial();
	}
    
	@Override
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
    {
        if (World.doesBlockHaveSolidTopSurface(world, x, y - 1, z))
        {
            return true;
        }
        else
        {
            return world.getBlock(x, y, z) == this;
        }
    }

	@Override
	@SuppressWarnings("rawtypes")
	public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB par5, List list, Entity entity)
    {
        boolean flag = this.canConnectFenceTo(world, x, y, z - 1);
        boolean flag1 = this.canConnectFenceTo(world, x, y, z + 1);
        boolean flag2 = this.canConnectFenceTo(world, x - 1, y, z);
        boolean flag3 = this.canConnectFenceTo(world, x + 1, y, z);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        if (flag || flag1)
        {
            this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
            super.addCollisionBoxesToList(world, x, y, z, par5, list, entity);
        }

        f2 = 0.375F;
        f3 = 0.625F;

        if (flag2)
        {
            f = 0.0F;
        }

        if (flag3)
        {
            f1 = 1.0F;
        }

        if (flag2 || flag3 || !flag && !flag1)
        {
            this.setBlockBounds(f, 0.0F, f2, f1, 1.5F, f3);
            super.addCollisionBoxesToList(world, x, y, z, par5, list, entity);
        }

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }
        this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
    }

	@Override
    public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z)
    {
        boolean flag = this.canConnectFenceTo(blockAccess, x, y, z - 1);
        boolean flag1 = this.canConnectFenceTo(blockAccess, x, y, z + 1);
        boolean flag2 = this.canConnectFenceTo(blockAccess, x - 1, y, z);
        boolean flag3 = this.canConnectFenceTo(blockAccess, x + 1, y, z);
        float f = 0.375F;
        float f1 = 0.625F;
        float f2 = 0.375F;
        float f3 = 0.625F;

        if (flag)
        {
            f2 = 0.0F;
        }

        if (flag1)
        {
            f3 = 1.0F;
        }

        if (flag2)
        {
            f = 0.0F;
        }

        if (flag3)
        {
            f1 = 1.0F;
        }
        this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
    }
	
	@Override
    public boolean isOpaqueCube()
    {
        return false;
    }

	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

	@Override
    public boolean getBlocksMovement(IBlockAccess blockAccess, int x, int y, int z)
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return 11;
    }

	@Override
    public boolean canConnectFenceTo(IBlockAccess blockAccess, int x, int y, int z)
    {
    	Block block = blockAccess.getBlock(x, y, z);
    	
    	if (block == Blocks.OakFence ||
    		block == Blocks.SpruceFence ||
    		block == Blocks.BirchFence ||
    		block == Blocks.JungleFence ||
    		block == Blocks.AcaciaFence ||
    		block == Blocks.DarkOakFence) 
    	{
    		return true;
    	}
    	
    	if (block == Blocks.OakFenceGate ||
        	block == Blocks.SpruceFenceGate ||
        	block == Blocks.BirchFenceGate ||
        	block == Blocks.JungleFenceGate ||
        	block == Blocks.AcaciaFenceGate ||
        	block == Blocks.DarkOakFenceGate) 
        {
        	return true;
        }
		return super.canConnectFenceTo(blockAccess, x, y, z);
    }

    public static boolean isIdAFence(Block block)
    {
    	if (block == Blocks.OakFence ||
        	block == Blocks.SpruceFence ||
        	block == Blocks.BirchFence ||
        	block == Blocks.JungleFence ||
        	block == Blocks.AcaciaFence ||
        	block == Blocks.DarkOakFence) 
        {
        	return true;
        }
    	
        return net.minecraft.block.BlockFence.func_149825_a(block);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side)
    {
        return true;
    }
	
	public String getTexturePath()
	{
		return Reference.TexturePath + "planks" + this.material.getPath();
	}
	
	@Override
	@SideOnly(Side.CLIENT)		
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(this.getTexturePath());
	}

	@Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        return world.isRemote ? true : ItemLead.func_150909_a(player, world, x, y, z);
    }
    
}