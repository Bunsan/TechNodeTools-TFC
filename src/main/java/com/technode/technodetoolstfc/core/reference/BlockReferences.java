package com.technode.technodetoolstfc.core.reference;

import com.technode.technodetoolstfc.block.BlockIngotPileMod;
import com.technode.technodetoolstfc.block.*;
import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.utility.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockReferences extends ModBlocks
{
    public static void blockReferences()
    {
        alloyBlock = new BlockAlloy(Material.iron) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("AlloyBlock");
        metalBlock = new BlockMetal(Material.iron) {}.setHardness(16F).setResistance(10F).setStepSound(Block.soundTypeMetal).setBlockName("MetalBlock");
        oreMod = new BlockMetalOre(Material.iron) {}.setHardness(10F).setResistance(10F).setBlockName("Ore");
        oreMineralMod = new BlockMineralOre(Material.iron) {}.setHardness(10F).setResistance(10F).setBlockName("Ore");
        metalSheetMod = new BlockMetalSheetMod().setBlockName("MetalSheet").setHardness(1);
        alloySheetMod = new BlockAlloySheetMod().setBlockName("MetalSheet").setHardness(1);
        ingotPileMod = new BlockIngotPileMod().setBlockName("ingotpile").setHardness(3);


        alloyBlock.setHarvestLevel("pickaxe", 1);
        metalBlock.setHarvestLevel("pickaxe", 1);
        oreMod.setHarvestLevel("pickaxe", 1);
        oreMineralMod.setHarvestLevel("pickaxe", 1);

        registerBlocks();

        LogHelper.info("Finished Loading Blocks");
    }
}
