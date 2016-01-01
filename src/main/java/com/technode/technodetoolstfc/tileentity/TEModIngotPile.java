package com.technode.technodetoolstfc.tileentity;

import com.technode.technodetoolstfc.core.reference.Reference;

import com.bioxx.tfc.TileEntities.TEIngotPile;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TEModIngotPile extends TEIngotPile
{
    public TEModIngotPile ()
    {
        storage = new ItemStack[1];
        type = "Copper";
    }

    public static Item[] getIngots()
    {
        return Reference.MOD_INGOTS.clone();
    }
}
