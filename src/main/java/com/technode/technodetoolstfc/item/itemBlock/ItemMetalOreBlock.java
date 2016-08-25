package com.technode.technodetoolstfc.item.itemBlock;

import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemMetalOreBlock extends ItemTerraBlock {

    public ItemMetalOreBlock(Block b) {
        super(b);
        metaNames = new String[Reference.MOD_ORE_METAL.length];
        System.arraycopy(Reference.MOD_ORE_METAL, 0, metaNames, 0, Reference.MOD_ORE_METAL.length);
    }
}