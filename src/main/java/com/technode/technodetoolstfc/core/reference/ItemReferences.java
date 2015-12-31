package com.technode.technodetoolstfc.core.reference;

import com.technode.technodetoolstfc.core.ModItems;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.item.ItemAlloyDust;
import com.technode.technodetoolstfc.item.ItemAlloyNugget;
import com.technode.technodetoolstfc.item.ItemMetalDust;
import com.technode.technodetoolstfc.item.ItemMetalNugget;

public class ItemReferences extends ModItems
{
    public static void itemReferences()
    {
        smallMetalChunk = new ItemMetalNugget().setUnlocalizedName("MetalNugget");
        smallAlloyChunk = new ItemAlloyNugget().setUnlocalizedName("AlloyNugget");
        metalDust = new ItemMetalDust().setUnlocalizedName("MetalDust");
        alloyDust = new ItemAlloyDust().setUnlocalizedName("AlloyDust");

        registerItems();

        LogHelper.info("Finished Loading Items");



    }
}
