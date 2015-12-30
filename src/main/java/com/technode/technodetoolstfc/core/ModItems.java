package com.technode.technodetoolstfc.core;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item smallMetalChunk;
    public static Item metalDust;

    public static void registerItems()
    {
        GameRegistry.registerItem(smallMetalChunk, smallMetalChunk.getUnlocalizedName());
        GameRegistry.registerItem(metalDust, metalDust.getUnlocalizedName());
    }
}
