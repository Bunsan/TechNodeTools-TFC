package com.technode.technodetoolstfc.worldGen;

import com.bioxx.tfc.TileEntities.TEWorldItem;
import com.bioxx.tfc.WorldGen.TFCBiome;
import com.bioxx.tfc.api.TFCBlocks;
import com.technode.technodetoolstfc.block.BlockMetalOre;
import com.technode.technodetoolstfc.core.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.ArrayList;
import java.util.Random;

public class WorldGenOreNuggets implements IWorldGenerator {
    public WorldGenOreNuggets() {
    }

    private boolean generateOreNuggets(World world, Random random, int i, int j, int k) {
        if ((world.isAirBlock(i, j + 1, k) || world.getBlock(i, j + 1, k) == Blocks.snow || world.getBlock(i, j + 1, k) == TFCBlocks.tallGrass)
                && (world.getBlock(i, j, k).getMaterial() == Material.grass || world.getBlock(i, j, k).getMaterial() == Material.rock)
                && world.getBlock(i, j, k).isOpaqueCube())
        {
            if (world.rand.nextInt(3) == 0) {
                ItemStack is = getOreCoreSample(world, i, j, k);
                if (is != null) {
                    if (world.setBlock(i, j + 1, k, TFCBlocks.worldItem, 0, 2)) {
                        TEWorldItem te = (TEWorldItem) world.getTileEntity(i, j + 1, k);
                        te.storage[0] = is;
                    }
                }
            }
        }
        return true;
    }

    private ItemStack getOreCoreSample(World world, int xCoord, int yCoord, int zCoord) {
        ArrayList<Item> coreSample = new ArrayList<Item>();
        ArrayList<ItemStack> coreSampleStacks = new ArrayList<ItemStack>();
        for (int x = -15; x < 16; x++) {
            for (int z = -15; z < 16; z++) {
                for (int y = yCoord; y > yCoord - 35; y--) {
                    if (world.blockExists(xCoord + x, y, zCoord + z) && world.getBlock(xCoord + x, y, zCoord + z) == ModBlocks.oreMod) {
                        int m = world.getBlockMetadata(xCoord + x, y, zCoord + z);
                        if (!coreSample.contains(BlockMetalOre.getDroppedItemMod(m))) {
                            coreSample.add(BlockMetalOre.getDroppedItemMod(m));
                            coreSampleStacks.add(new ItemStack(BlockMetalOre.getDroppedItemMod(m), 1, m));
                        }
                    }
                }
            }
        }
        if (!coreSampleStacks.isEmpty())
            return coreSampleStacks.get(world.rand.nextInt(coreSampleStacks.size()));
        return null;
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
                         IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        chunkX *= 16;
        chunkZ *= 16;

        if (world.getBiomeGenForCoords(chunkX, chunkZ) instanceof TFCBiome) // Fixes ClassCastException
        {
            TFCBiome biome = (TFCBiome) world.getBiomeGenForCoords(chunkX, chunkZ);
            if (biome == TFCBiome.OCEAN || biome == TFCBiome.DEEP_OCEAN)
                return;
        }

        //ModOres
        for (int itemCount = 0; itemCount < 8; itemCount++) {
            int xDir = chunkX + random.nextInt(16) + 7;
            int zDir = chunkZ + random.nextInt(16) + 7;
            generateOreNuggets(world, random, xDir, world.getTopSolidOrLiquidBlock(xDir, zDir) - 1, zDir);
        }

    }
}
