/**
 * Better Wood Mod
 * Copyright © 2013-2014 SackCastellon
 * This modification and its resources are licensed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License.
 * 
 * 		http://creativecommons.org/licenses/by-nc-sa/3.0/
 */
package com.sackcastellon.betterwood.block;

import com.sackcastellon.betterwood.api.Tabs;
import com.sackcastellon.betterwood.item.ItemPartMaterial;
import com.sackcastellon.betterwood.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockTrapdoor extends Block
{
    public static boolean disableValidation = false;
    
	private ItemPartMaterial material;

	public BlockTrapdoor(ItemPartMaterial material)
	{
    	super(Material.wood);
    	
    	this.material = material;
    	
    	this.setBlockName("Trapdoor");
    	this.setHardness(3.0F);
    	this.setStepSound(soundTypeWood);
    	this.setCreativeTab(Tabs.tabBW);
    	this.disableStats();
    	
        float f = 0.5F;
        float f1 = 1.0F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }
	
	@Override
	public String getUnlocalizedName()
	{
		return super.getUnlocalizedName() + "." + this.material.getMaterial();
	}
	
	public String getTexturePath()
	{
		return Reference.TexturePath + "trapdoor" + this.material.getPath();
	}
	
	@Override
	@SideOnly(Side.CLIENT)		
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(this.getTexturePath());
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
    public boolean getBlocksMovement(IBlockAccess block, int x, int y, int z)
    {
        return !func_150118_d(block.getBlockMetadata(x, y, z));
    }
	
	@Override
    public int getRenderType()
    {
        return 0;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z)
    {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        return super.getSelectedBoundingBoxFromPool(world, x, y, z);
    }

	@Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        return super.getCollisionBoundingBoxFromPool(world, x, y, z);
    }

	@Override
    public void setBlockBoundsBasedOnState(IBlockAccess block, int x, int y, int z)
    {
        this.func_150117_b(block.getBlockMetadata(x, y, z));
    }

	@Override
    public void setBlockBoundsForItemRender()
    {
        float f = 0.1875F;
        this.setBlockBounds(0.0F, 0.5F - f / 2.0F, 0.0F, 1.0F, 0.5F + f / 2.0F, 1.0F);
    }

    public void func_150117_b(int p_150117_1_)
    {
        float f = 0.1875F;

        if ((p_150117_1_ & 8) != 0)
        {
            this.setBlockBounds(0.0F, 1.0F - f, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
        }

        if (func_150118_d(p_150117_1_))
        {
            if ((p_150117_1_ & 3) == 0)
            {
                this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            }

            if ((p_150117_1_ & 3) == 1)
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            }

            if ((p_150117_1_ & 3) == 2)
            {
                this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }

            if ((p_150117_1_ & 3) == 3)
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            }
        }
    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {}

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (this.blockMaterial == Material.iron)
        {
            return true;
        }
        else
        {
            int i1 = world.getBlockMetadata(x, y, z);
            world.setBlockMetadataWithNotify(x, y, z, i1 ^ 4, 2);
            world.playAuxSFXAtEntity(player, 1003, x, y, z, 0);
            return true;
        }
    }

    public void func_150120_a(World world, int x, int y, int z, boolean flag)
    {
        int l = world.getBlockMetadata(x, y, z);
        boolean flag1 = (l & 4) > 0;

        if (flag1 != flag)
        {
            world.setBlockMetadataWithNotify(x, y, z, l ^ 4, 2);
            world.playAuxSFXAtEntity((EntityPlayer)null, 1003, x, y, z, 0);
        }
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock)
    {
        if (!world.isRemote)
        {
            int l = world.getBlockMetadata(x, y, z);
            int i1 = x;
            int j1 = z;

            if ((l & 3) == 0)
            {
                j1 = z + 1;
            }

            if ((l & 3) == 1)
            {
                --j1;
            }

            if ((l & 3) == 2)
            {
                i1 = x + 1;
            }

            if ((l & 3) == 3)
            {
                --i1;
            }

            if (!(func_150119_a(world.getBlock(i1, y, j1)) || world.isSideSolid(i1, y, j1, ForgeDirection.getOrientation((l & 3) + 2))))
            {
                world.setBlockToAir(x, y, z);
                this.dropBlockAsItem(world, x, y, z, l, 0);
            }

            boolean flag = world.isBlockIndirectlyGettingPowered(x, y, z);

            if (flag || neighborBlock.canProvidePower())
            {
                this.func_150120_a(world, x, y, z, flag);
            }
        }
    }

    @Override
    public MovingObjectPosition collisionRayTrace(World world, int x, int y, int z, Vec3 startVec, Vec3 endVec)
    {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        return super.collisionRayTrace(world, x, y, z, startVec, endVec);
    }

    @Override
    public int onBlockPlaced(World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int blockMetadata)
    {
        int j1 = 0;

        if (side == 2)
        {
            j1 = 0;
        }

        if (side == 3)
        {
            j1 = 1;
        }

        if (side == 4)
        {
            j1 = 2;
        }

        if (side == 5)
        {
            j1 = 3;
        }

        if (side != 1 && side != 0 && hitY > 0.5F)
        {
            j1 |= 8;
        }

        return j1;
    }

    @Override
    public boolean canPlaceBlockOnSide(World world, int x, int y, int z, int side)
    {
        if (disableValidation) return true;
        if (side == 0)
        {
            return false;
        }
        else if (side == 1)
        {
            return false;
        }
        else
        {
            if (side == 2)
            {
                ++z;
            }

            if (side == 3)
            {
                --z;
            }

            if (side == 4)
            {
                ++x;
            }

            if (side == 5)
            {
                --x;
            }

            return func_150119_a(world.getBlock(x, y, z)) || world.isSideSolid(x, y, z, ForgeDirection.UP);
        }
    }

    public static boolean func_150118_d(int p_150118_0_)
    {
        return (p_150118_0_ & 4) != 0;
    }

    private static boolean func_150119_a(Block block)
    {
        if (disableValidation) return true;
        return block.getMaterial().isOpaque() && block.renderAsNormalBlock() || block == Blocks.glowstone || block instanceof BlockSlab || block instanceof BlockStairs;
    }
}