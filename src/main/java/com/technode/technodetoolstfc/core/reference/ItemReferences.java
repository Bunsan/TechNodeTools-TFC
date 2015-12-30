package com.technode.technodetoolstfc.core.reference;

import com.technode.technodetoolstfc.core.ModItems;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.item.ItemMetalDust;
import com.technode.technodetoolstfc.item.ItemMetalNugget;
import com.technode.technodetoolstfc.item.itemBlock.ItemMetalBlock;

public class ItemReferences extends ModItems
{
    public static void itemReferences()
    {
        smallMetalChunk = new ItemMetalNugget().setUnlocalizedName("MetalNugget");
        metalDust = new ItemMetalDust().setUnlocalizedName("MetalDust");

        registerItems();

        LogHelper.info("Finished Loading Items");



    }
}
