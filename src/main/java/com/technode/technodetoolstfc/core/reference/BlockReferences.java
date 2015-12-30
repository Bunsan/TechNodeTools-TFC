package com.technode.technodetoolstfc.core.reference;

import com.technode.technodetoolstfc.block.BlockAlloy;
import com.technode.technodetoolstfc.block.BlockMetal;
import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockReferences extends ModBlocks
{
    public static void blockReferences()
    {
        alloyBlock = new BlockAlloy(Material.iron) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("AlloyBlock");
        metalBlock = new BlockMetal(Material.iron) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("MetalBlock");

        alloyBlock.setHarvestLevel("pickaxe", 1);
        metalBlock.setHarvestLevel("pickaxe", 1);

        registerBlocks();

        LogHelper.info("Finished Loading Blocks");
    }
}
