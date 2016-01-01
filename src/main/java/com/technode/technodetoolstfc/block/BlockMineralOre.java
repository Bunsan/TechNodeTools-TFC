package com.technode.technodetoolstfc.block;

import com.technode.technodetoolstfc.core.ModItems;
import com.technode.technodetoolstfc.core.reference.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class BlockMineralOre extends BlockMetalOre
{
    public BlockMineralOre(Material mat)
    {
        super(mat);
        blockNames = Reference.MOD_ORE_MINERAL;
    }

    @Override
    public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z)
    {
        if(!world.isRemote)
        {
            boolean dropOres = false;
            if(player != null)
            {
                player.addStat(StatList.mineBlockStatArray[getIdFromBlock(this)], 1);
                player.addExhaustion(0.075F);
                dropOres = player.canHarvestBlock(this);
            }
            if (player == null || dropOres)
            {
                int meta = world.getBlockMetadata(x, y, z);
                Random random = new Random();

                ItemStack itemstack = new ItemStack(ModItems.oreMineralChunk, 1 , damageDropped(meta));

                if (itemstack != null)
                    dropBlockAsItem(world, x, y, z, itemstack);
            }
        }
        return world.setBlockToAir(x, y, z);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

        int count = quantityDropped(metadata, fortune, world.rand);
        for (int i = 0; i < count; i++)
        {
            ItemStack itemstack = new ItemStack(ModItems.oreMineralChunk, 1, damageDropped(metadata));

            if (itemstack != null)
            {
                ret.add(itemstack);
            }
        }
        return ret;
    }
    @Override
    public void onBlockExploded(World world, int x, int y, int z, Explosion exp)
    {
        Random random = new Random();
        ItemStack itemstack;
        int meta = world.getBlockMetadata(x, y, z);
        itemstack  = new ItemStack(ModItems.oreMineralChunk, 1, meta + 16);

        if (itemstack != null)
            dropBlockAsItem(world, x, y, z, itemstack);

        onBlockDestroyedByExplosion(world, x, y, z, exp);
    }
}
