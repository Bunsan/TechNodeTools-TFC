package com.technode.technodetoolstfc.item.itemBlock;

import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.block.Block;

public class ItemMineralOreBlock extends ItemTerraBlock {

    public ItemMineralOreBlock(Block b) {
        super(b);
        metaNames = new String[Reference.MOD_ORE_MINERAL.length];
        System.arraycopy(Reference.MOD_ORE_MINERAL, 0, metaNames, 0, Reference.MOD_ORE_MINERAL.length);
    }
}
