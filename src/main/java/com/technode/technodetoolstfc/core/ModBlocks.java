package com.technode.technodetoolstfc.core;

import com.technode.technodetoolstfc.item.itemBlock.ItemAlloyBlock;
import com.technode.technodetoolstfc.item.itemBlock.ItemMetalBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
    public static Block metalBlock;
    public static Block alloyBlock;
    public static Block oreMod;
    public static Block oreMineralMod;
    public static Block metalSheetMod;
    public static Block ingotPileMod;

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(metalBlock, ItemMetalBlock.class, "metalBlock");
        GameRegistry.registerBlock(alloyBlock, ItemAlloyBlock.class, "alloyBlock");
        GameRegistry.registerBlock(oreMod, "ore");
        GameRegistry.registerBlock(oreMineralMod, "mineral");
        GameRegistry.registerBlock(metalSheetMod, "metalSheet");
        GameRegistry.registerBlock(ingotPileMod, "ingotPile");
    }
}
