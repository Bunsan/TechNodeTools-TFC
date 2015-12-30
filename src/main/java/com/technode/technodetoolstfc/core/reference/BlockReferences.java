package com.technode.technodetoolstfc.core.reference;

import com.technode.technodetoolstfc.block.BlockAlloy;
import com.technode.technodetoolstfc.block.BlockMetal;
import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.item.itemBlock.ItemAlloyBlock;
import com.technode.technodetoolstfc.item.itemBlock.ItemMetalBlock;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import com.bioxx.tfc.Items.ItemBlocks.*;

public class BlockReferences extends ModBlocks
{
    public static void blockReferences()
    {
        GameRegistry.registerBlock(metalBlock, ItemMetalBlock.class, "metalBlock");
        GameRegistry.registerBlock(alloyBlock, ItemAlloyBlock.class, "alloyBlock");

        loadBlocks();
    }

    public static void loadBlocks()
    {
        LogHelper.info("Loading Blocks");

        alloyBlock = new BlockAlloy().setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("AlloyBlock");
        metalBlock = new BlockMetal().setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("MetalBlock");

        alloyBlock.setHarvestLevel("pickaxe", 1);
        metalBlock.setHarvestLevel("pickaxe", 1);
    }
}
