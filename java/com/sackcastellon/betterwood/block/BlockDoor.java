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

import com.sackcastellon.betterwood.api.Items;
import com.sackcastellon.betterwood.item.ItemPartMaterial;
import com.sackcastellon.betterwood.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockDoor extends Block {
	
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArrayUp;
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArrayDown;
    
	private ItemPartMaterial material;

    public BlockDoor(ItemPartMaterial material)
    {
    	super(Material.wood);
    	
    	this.material = material;
    	
    	this.setBlockName("Door");
    	this.setHardness(3.0F);
    	this.setStepSound(soundTypeWood);
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

	@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        return this.iconArrayDown[0];
    }

	@Override
    @SideOnly(Side.CLIENT)
    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public IIcon getIcon(IBlockAccess blockAccess, int x, int y, int z, int side)
    {
        if (side != 1 && side != 0)
        {
            int i1 = this.getFullMetadata(blockAccess, x, y, z);
            int j1 = i1 & 3;
            boolean flag = (i1 & 4) != 0;
            boolean flag1 = false;
            boolean flag2 = (i1 & 8) != 0;

            if (flag)
            {
                if (j1 == 0 && side == 2)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && side == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && side == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && side == 4)
                {
                    flag1 = !flag1;
                }
            }
            else
            {
                if (j1 == 0 && side == 5)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 1 && side == 3)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 2 && side == 4)
                {
                    flag1 = !flag1;
                }
                else if (j1 == 3 && side == 2)
                {
                    flag1 = !flag1;
                }

                if ((i1 & 16) != 0)
                {
                    flag1 = !flag1;
                }
            }

            return flag2 ? this.iconArrayUp[flag1 ? 1 : 0] : this.iconArrayDown[flag1 ? 1 : 0];
        }
        else
        {
            return this.iconArrayDown[0];
        }
    }

	@Override
    public boolean isOpaqueCube()
    {
        return false;
    }

	@Override
    public boolean getBlocksMovement(IBlockAccess blockAccess, int x, int y, int z)
    {
        int l = this.getFullMetadata(blockAccess, x, y, z);
        return (l & 4) != 0;
    }

	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

	@Override
    public int getRenderType()
    {
        return 7;
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
    public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int par2, int par3, int par4)
    {
        this.setDoorRotation(this.getFullMetadata(blockAccess, par2, par3, par4));
    }

    public int getDoorOrientation(IBlockAccess blockAccess, int x, int y, int z)
    {
        return this.getFullMetadata(blockAccess, x, y, z) & 3;
    }

    public boolean isDoorOpen(IBlockAccess blockAccess, int x, int y, int z)
    {
        return (this.getFullMetadata(blockAccess, x, y, z) & 4) != 0;
    }

    private void setDoorRotation(int par1)
    {
        float f = 0.1875F;
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        int j = par1 & 3;
        boolean flag = (par1 & 4) != 0;
        boolean flag1 = (par1 & 16) != 0;

        if (j == 0)
        {
            if (flag)
            {
                if (!flag1)
                {
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
                }
                else
                {
                    this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
                }
            }
            else
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
            }
        }
        else if (j == 1)
        {
            if (flag)
            {
                if (!flag1)
                {
                    this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                }
                else
                {
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
                }
            }
            else
            {
                this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
            }
        }
        else if (j == 2)
        {
            if (flag)
            {
                if (!flag1)
                {
                    this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
                }
                else
                {
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
                }
            }
            else
            {
                this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            }
        }
        else if (j == 3)
        {
            if (flag)
            {
                if (!flag1)
                {
                    this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
                }
                else
                {
                    this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                }
            }
            else
            {
                this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {}

    @Override
    public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        int i1 = this.getFullMetadata(world, par2, par3, par4);
        int j1 = i1 & 7;
        j1 ^= 4;

        if ((i1 & 8) == 0)
        {
            world.setBlockMetadataWithNotify(par2, par3, par4, j1, 2);
        //	world.markBlockRangeForRenderUpdate
            world.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
        }
        else
        {
            world.setBlockMetadataWithNotify(par2, par3 - 1, par4, j1, 2);
        //	world.markBlockRangeForRenderUpdate
            world.markBlockRangeForRenderUpdate(par2, par3 - 1, par4, par2, par3, par4);
        }

        world.playAuxSFXAtEntity(player, 1003, par2, par3, par4, 0);
        return true;
    }

    /**
     * A function to open a door.
     */
    public void onPoweredBlockChange(World world, int par2, int par3, int par4, boolean par5)
    {
        int l = this.getFullMetadata(world, par2, par3, par4);
        boolean flag1 = (l & 4) != 0;

        if (flag1 != par5)
        {
            int i1 = l & 7;
            i1 ^= 4;

            if ((l & 8) == 0)
            {
                world.setBlockMetadataWithNotify(par2, par3, par4, i1, 2);
                world.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
            }
            else
            {
                world.setBlockMetadataWithNotify(par2, par3 - 1, par4, i1, 2);
                world.markBlockRangeForRenderUpdate(par2, par3 - 1, par4, par2, par3, par4);
            }
            world.playAuxSFXAtEntity((EntityPlayer)null, 1003, par2, par3, par4, 0);
        }
    }

    @Override
    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
//	onNeighborBlockChange
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock)
    {
        int i1 = world.getBlockMetadata(x, y, z);

        if ((i1 & 8) == 0)
        {
            boolean flag = false;
            
            if (world.getBlock(x, y + 1, z) != this)
            {
                world.setBlockToAir(x, y, z);
                flag = true;
            }
            
            if (!World.doesBlockHaveSolidTopSurface(world, x, y - 1, z))
            {
                world.setBlockToAir(x, y, z);
                flag = true;
                
                if (world.getBlock(x, y + 1, z) == this)
                {
                    world.setBlockToAir(x, y + 1, z);
                }
            }

            if (flag)
            {
                if (!world.isRemote)
                {
                    this.dropBlockAsItem(world, x, y, z, i1, 0);
                }
            }
            else
            {
                boolean flag1 = world.isBlockIndirectlyGettingPowered(x, y, z) || world.isBlockIndirectlyGettingPowered(x, y + 1, z);

                if ((flag1 || neighborBlock.canProvidePower()) && neighborBlock != this)
                {
                    this.onPoweredBlockChange(world, x, y, z, flag1);
                }
            }
        }
        else
        {
            if (world.getBlock(x, y - 1, z) != this)
            {
                world.setBlockToAir(x, y, z);
            }

            if (neighborBlock != this)
            {
                this.onNeighborBlockChange(world, x, y - 1, z, neighborBlock);
            }
        }
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par3)
    {
    	return Items.Door;
    }
    
    @Override
    public int damageDropped(int i)
    {
    	if (material.getMaterial() == "Oak")
    	{
    		return 0;
    	} 
    	
    	else if (material.getMaterial() == "Spruce")
    	{
    		return 1;
    	} 
    	
    	else if (material.getMaterial() == "Birch")
    	{
    		return 2;
    	} 
    	
    	else if (material.getMaterial() == "Jungle")
    	{
    		return 3;
    	} 
    	
    	else if (material.getMaterial() == "Acacia")
    	{
    		return 4;
    	} 
    	
    	else if (material.getMaterial() == "DarkOak")
    	{
    		return 5;
    	} 
    	
    	else 
    	{
    		return 0;
    	}
    }
   
    @Override
    public MovingObjectPosition collisionRayTrace(World world, int x, int y, int z, Vec3 startVec, Vec3 endVec)
    {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        return super.collisionRayTrace(world, x, y, z, startVec, endVec);
    }

    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {
        return y >= 255 ? false : World.doesBlockHaveSolidTopSurface(world, x, y - 1, z) && super.canPlaceBlockAt(world, x, y, z) && super.canPlaceBlockAt(world, x, y + 1, z);
    }

    @Override
    public int getMobilityFlag()
    {
        return 1;
    }

    public int getFullMetadata(IBlockAccess blockAccess, int x, int y, int z)
    {
        int l = blockAccess.getBlockMetadata(x, y, z);
        boolean flag = (l & 8) != 0;
        int i1;
        int j1;

        if (flag)
        {
            i1 = blockAccess.getBlockMetadata(x, y - 1, z);
            j1 = l;
        }
        else
        {
            i1 = l;
            j1 = blockAccess.getBlockMetadata(x, y + 1, z);
        }

        boolean flag1 = (j1 & 1) != 0;
        return i1 & 7 | (flag ? 8 : 0) | (flag1 ? 16 : 0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z)
    {
    	return Items.Door;
    }

    @Override
    /**
     * Called when the block is attempted to be harvested
     */
    public void onBlockHarvested(World world, int x, int y, int z, int par5, EntityPlayer player)
    {
        if (player.capabilities.isCreativeMode && (par5 & 8) != 0 && world.getBlock(x, y - 1, z) == this)
        {
            world.setBlockToAir(x, y - 1, z);
        }
    }
    
	public String getTexturePath(boolean isUpper)
	{
		if(isUpper)
		{
			return Reference.TexturePath + "door/up" + this.material.getPath();
		}
		
		else
		{
			return Reference.TexturePath + "door/down" + this.material.getPath();
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)		
	public void registerBlockIcons(IIconRegister iconRegister)
	{
        this.iconArrayUp = new IIcon[2];
        this.iconArrayDown = new IIcon[2];
        this.iconArrayUp[0] = iconRegister.registerIcon(this.getTexturePath(true));
        this.iconArrayDown[0] = iconRegister.registerIcon(this.getTexturePath(false));
        this.iconArrayUp[1] = new IconFlipped(this.iconArrayUp[0], true, false);
        this.iconArrayDown[1] = new IconFlipped(this.iconArrayDown[0], true, false);
	}
}