package com.technode.technodetoolstfc.core;

import com.technode.technodetoolstfc.item.itemBlock.ItemAlloyBlock1;
import com.technode.technodetoolstfc.item.itemBlock.ItemAlloyTrapDoorMod;
import com.technode.technodetoolstfc.item.itemBlock.ItemMetalBlock1;

import com.technode.technodetoolstfc.item.itemBlock.ItemMetalTrapDoorMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
    public static Block metalBlock;
    public static Block alloyBlock;
    public static Block oreMod;
    public static Block oreMineralMod;
    public static Block metalSheetMod;
    public static Block alloySheetMod;
    public static Block ingotPileMod;
    public static Block metalTrapDoorMod;
    public static Block alloyTrapDoorMod;

    public static int modMetalsheetRenderId;

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(metalBlock, ItemMetalBlock1.class, "metalBlock");
        GameRegistry.registerBlock(alloyBlock, ItemAlloyBlock1.class, "alloyBlock");
        GameRegistry.registerBlock(oreMod, "ore");
        GameRegistry.registerBlock(oreMineralMod, "mineral");
        GameRegistry.registerBlock(metalSheetMod, "metalSheet");
        GameRegistry.registerBlock(alloySheetMod, "alloySheet");
        GameRegistry.registerBlock(ingotPileMod, "ingotPile");
        GameRegistry.registerBlock(metalTrapDoorMod, ItemMetalTrapDoorMod.class, "metalTrapDoor");
        GameRegistry.registerBlock(alloyTrapDoorMod, ItemAlloyTrapDoorMod.class, "alloyTrapDoor");
    }
}
