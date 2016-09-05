package com.technode.technodetoolstfc.core;

import com.technode.technodetoolstfc.block.*;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.item.itemBlock.*;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static Block metalBlock;
    public static Block metalBlock2;
    public static Block alloyBlock;
    public static Block oreMod;
    public static Block oreMineralMod;
    public static Block metalSheetMod;
    public static Block alloySheetMod;
    public static Block ingotPileMod;

    public static void ModBlocksInit() {
        LogHelper.info("Loading Blocks.");

        loadBlocks();
        registerBlocks();
    }
    public static void loadBlocks()
    {
        alloyBlock = new BlockAlloy(Material.iron) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("AlloyBlock");
        metalBlock = new BlockMetal(Material.iron) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("MetalBlock");
        metalBlock2 = new BlockMetal2(Material.iron) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("MetalBlock");
        oreMod = new BlockMetalOre(Material.iron) {}.setHardness(10F).setResistance(10F).setBlockName("Ore");
        oreMineralMod = new BlockMineralOre(Material.iron) {}.setHardness(10F).setResistance(10F).setBlockName("Ore");
        metalSheetMod = new BlockMetalSheetMod().setBlockName("MetalSheet").setHardness(1);
        alloySheetMod = new BlockAlloySheetMod().setBlockName("MetalSheet").setHardness(1);
        ingotPileMod = new BlockIngotPileMod().setBlockName("ingotPileMod").setHardness(3);


        alloyBlock.setHarvestLevel("pickaxe", 1);
        metalBlock.setHarvestLevel("pickaxe", 1);
        oreMod.setHarvestLevel("pickaxe", 1);
        oreMineralMod.setHarvestLevel("pickaxe", 1);

        LogHelper.info("Finished Loading Blocks");
    }

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(metalBlock, ItemMetalBlock1.class, "metalBlock");
        GameRegistry.registerBlock(metalBlock2, ItemMetalBlock2.class, "metalBlock2");
        GameRegistry.registerBlock(alloyBlock, ItemAlloyBlock1.class, "alloyBlock");
        GameRegistry.registerBlock(oreMod, ItemMetalOreBlock.class, "metalOre");
        GameRegistry.registerBlock(oreMineralMod, ItemMineralOreBlock.class, "mineralOre");
        GameRegistry.registerBlock(metalSheetMod, "metalSheet");
        GameRegistry.registerBlock(alloySheetMod, "alloySheet");
        GameRegistry.registerBlock(ingotPileMod, "ingotPileMod");
    }
}
