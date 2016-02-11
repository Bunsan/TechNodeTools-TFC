package com.technode.technodetoolstfc.core;

import com.technode.technodetoolstfc.core.utility.LogHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary {

    public static void register() {
        LogHelper.info("[" + ModDetails.ModName + "] Registering OreDictionary entries");

        final int WILD = OreDictionary.WILDCARD_VALUE;
        //Nugget
          //Metal
        OreDictionary.registerOre("nuggetBismuth", new ItemStack(ModItems.smallMetalChunk, 1, 0));
        OreDictionary.registerOre("nuggetCopper", new ItemStack(ModItems.smallMetalChunk, 1, 1));
        OreDictionary.registerOre("nuggetGold", new ItemStack(ModItems.smallMetalChunk, 1, 2));
        OreDictionary.registerOre("nuggetWroughtIron", new ItemStack(ModItems.smallMetalChunk, 1, 3));
        OreDictionary.registerOre("nuggetIron", new ItemStack(ModItems.smallMetalChunk, 1, 3));
        OreDictionary.registerOre("nuggetLead", new ItemStack(ModItems.smallMetalChunk, 1, 4));
        OreDictionary.registerOre("nuggetNickel", new ItemStack(ModItems.smallMetalChunk, 1, 5));
        OreDictionary.registerOre("nuggetPigIron", new ItemStack(ModItems.smallMetalChunk, 1, 6));
        OreDictionary.registerOre("nuggetPlatinum", new ItemStack(ModItems.smallMetalChunk, 1, 7));
        OreDictionary.registerOre("nuggetSilver", new ItemStack(ModItems.smallMetalChunk, 1, 8));
        OreDictionary.registerOre("nuggetSteel", new ItemStack(ModItems.smallMetalChunk, 1, 9));
        OreDictionary.registerOre("nuggetTin", new ItemStack(ModItems.smallMetalChunk, 1, 10));
        OreDictionary.registerOre("nuggetZinc", new ItemStack(ModItems.smallMetalChunk, 1, 11));
        OreDictionary.registerOre("nuggetAluminum", new ItemStack(ModItems.smallMetalChunk, 1, 12));
        OreDictionary.registerOre("nuggetOsmium", new ItemStack(ModItems.smallMetalChunk, 1, 13));
        OreDictionary.registerOre("nuggetTungsten", new ItemStack(ModItems.smallMetalChunk, 1, 14));
          //Alloy
        OreDictionary.registerOre("nuggetBismuthBronze", new ItemStack(ModItems.smallMetalChunk, 1, 0));
        OreDictionary.registerOre("nuggetBlackBronze", new ItemStack(ModItems.smallMetalChunk, 1, 1));
        OreDictionary.registerOre("nuggetBlackSteel", new ItemStack(ModItems.smallMetalChunk, 1, 2));
        OreDictionary.registerOre("nuggetBlueSteel", new ItemStack(ModItems.smallMetalChunk, 1, 3));
        OreDictionary.registerOre("nuggetBrass", new ItemStack(ModItems.smallMetalChunk, 1, 4));
        OreDictionary.registerOre("nuggetBronze", new ItemStack(ModItems.smallMetalChunk, 1, 5));
        OreDictionary.registerOre("nuggetHighCarbonBlackSteel", new ItemStack(ModItems.smallMetalChunk, 1, 6));
        OreDictionary.registerOre("nuggetHighCarbonBlueSteel", new ItemStack(ModItems.smallMetalChunk, 1, 7));
        OreDictionary.registerOre("nuggetHighCarbonRedSteel", new ItemStack(ModItems.smallMetalChunk, 1, 8));
        OreDictionary.registerOre("nuggetRedSteel", new ItemStack(ModItems.smallMetalChunk, 1, 9));
        OreDictionary.registerOre("nuggetRoseGold", new ItemStack(ModItems.smallMetalChunk, 1, 10));
        OreDictionary.registerOre("nuggetSterlingSilver", new ItemStack(ModItems.smallMetalChunk, 1, 11));
        OreDictionary.registerOre("nuggetWeakSteel", new ItemStack(ModItems.smallMetalChunk, 1, 12));
        OreDictionary.registerOre("nuggetWeakBlueSteel", new ItemStack(ModItems.smallMetalChunk, 1, 13));
        OreDictionary.registerOre("nuggetWeakRedSteel", new ItemStack(ModItems.smallMetalChunk, 1, 14));
        OreDictionary.registerOre("nuggetElectrum", new ItemStack(ModItems.smallMetalChunk, 1, 15));
        OreDictionary.registerOre("nuggetCupronickel", new ItemStack(ModItems.smallMetalChunk, 1, 16));
        OreDictionary.registerOre("nuggetInvar", new ItemStack(ModItems.smallMetalChunk, 1, 17));
        OreDictionary.registerOre("nuggetAnyBronze", new ItemStack(ModItems.smallMetalChunk, 1, 0));
        OreDictionary.registerOre("nuggetAnyBronze", new ItemStack(ModItems.smallMetalChunk, 1, 1));
        OreDictionary.registerOre("nuggetAnyBronze", new ItemStack(ModItems.smallMetalChunk, 1, 5));
        //Dust
          //Metal
        OreDictionary.registerOre("dustBismuth", new ItemStack(ModItems.metalDust, 1, 0));
        OreDictionary.registerOre("dustCopper", new ItemStack(ModItems.metalDust, 1, 1));
        OreDictionary.registerOre("dustGold", new ItemStack(ModItems.metalDust, 1, 2));
        OreDictionary.registerOre("dustWroughtIron", new ItemStack(ModItems.metalDust, 1, 3));
        OreDictionary.registerOre("dustIron", new ItemStack(ModItems.metalDust, 1, 3));
        OreDictionary.registerOre("dustLead", new ItemStack(ModItems.metalDust, 1, 4));
        OreDictionary.registerOre("dustNickel", new ItemStack(ModItems.metalDust, 1, 5));
        OreDictionary.registerOre("dustPigIron", new ItemStack(ModItems.metalDust, 1, 6));
        OreDictionary.registerOre("dustPlatinum", new ItemStack(ModItems.metalDust, 1, 7));
        OreDictionary.registerOre("dustSilver", new ItemStack(ModItems.metalDust, 1, 8));
        OreDictionary.registerOre("dustSteel", new ItemStack(ModItems.metalDust, 1, 9));
        OreDictionary.registerOre("dustTin", new ItemStack(ModItems.metalDust, 1, 10));
        OreDictionary.registerOre("dustZinc", new ItemStack(ModItems.metalDust, 1, 11));
        OreDictionary.registerOre("dustAluminum", new ItemStack(ModItems.metalDust, 1, 12));
        OreDictionary.registerOre("dustOsmium", new ItemStack(ModItems.metalDust, 1, 13));
        OreDictionary.registerOre("dustTungsten", new ItemStack(ModItems.metalDust, 1, 14));
          //Alloy
        OreDictionary.registerOre("dustBismuthBronze", new ItemStack(ModItems.alloyDust, 1, 0));
        OreDictionary.registerOre("dustBlackBronze", new ItemStack(ModItems.alloyDust, 1, 1));
        OreDictionary.registerOre("dustBlackSteel", new ItemStack(ModItems.alloyDust, 1, 2));
        OreDictionary.registerOre("dustBlueSteel", new ItemStack(ModItems.alloyDust, 1, 3));
        OreDictionary.registerOre("dustBrass", new ItemStack(ModItems.alloyDust, 1, 4));
        OreDictionary.registerOre("dustBronze", new ItemStack(ModItems.alloyDust, 1, 5));
        OreDictionary.registerOre("dustHighCarbonBlackSteel", new ItemStack(ModItems.alloyDust, 1, 6));
        OreDictionary.registerOre("dustHighCarbonBlueSteel", new ItemStack(ModItems.alloyDust, 1, 7));
        OreDictionary.registerOre("dustHighCarbonRedSteel", new ItemStack(ModItems.alloyDust, 1, 8));
        OreDictionary.registerOre("dustRedSteel", new ItemStack(ModItems.alloyDust, 1, 9));
        OreDictionary.registerOre("dustRoseGold", new ItemStack(ModItems.alloyDust, 1, 10));
        OreDictionary.registerOre("dustSterlingSilver", new ItemStack(ModItems.alloyDust, 1, 11));
        OreDictionary.registerOre("dustWeakSteel", new ItemStack(ModItems.alloyDust, 1, 12));
        OreDictionary.registerOre("dustWeakBlueSteel", new ItemStack(ModItems.alloyDust, 1, 13));
        OreDictionary.registerOre("dustWeakRedSteel", new ItemStack(ModItems.alloyDust, 1, 14));
        OreDictionary.registerOre("dustElectrum", new ItemStack(ModItems.alloyDust, 1, 15));
        OreDictionary.registerOre("dustCupronickel", new ItemStack(ModItems.alloyDust, 1, 16));
        OreDictionary.registerOre("dustInvar", new ItemStack(ModItems.alloyDust, 1, 17));
        OreDictionary.registerOre("dustAnyBronze", new ItemStack(ModItems.alloyDust, 1, 0));
        OreDictionary.registerOre("dustAnyBronze", new ItemStack(ModItems.alloyDust, 1, 1));
        OreDictionary.registerOre("dustAnyBronze", new ItemStack(ModItems.alloyDust, 1, 5));
        //Block
        //Metal
        OreDictionary.registerOre("blockBismuth", new ItemStack(ModBlocks.metalBlock, 1, 0));
        OreDictionary.registerOre("blockCopper", new ItemStack(ModBlocks.metalBlock, 1, 1));
        OreDictionary.registerOre("blockGold", new ItemStack(ModBlocks.metalBlock, 1, 2));
        OreDictionary.registerOre("blockWroughtIron", new ItemStack(ModBlocks.metalBlock, 1, 3));
        OreDictionary.registerOre("blockIron", new ItemStack(ModBlocks.metalBlock, 1, 3));
        OreDictionary.registerOre("blockLead", new ItemStack(ModBlocks.metalBlock, 1, 4));
        OreDictionary.registerOre("blockNickel", new ItemStack(ModBlocks.metalBlock, 1, 5));
        OreDictionary.registerOre("blockPigIron", new ItemStack(ModBlocks.metalBlock, 1, 6));
        OreDictionary.registerOre("blockPlatinum", new ItemStack(ModBlocks.metalBlock, 1, 7));
        OreDictionary.registerOre("blockSilver", new ItemStack(ModBlocks.metalBlock, 1, 8));
        OreDictionary.registerOre("blockSteel", new ItemStack(ModBlocks.metalBlock, 1, 9));
        OreDictionary.registerOre("blockTin", new ItemStack(ModBlocks.metalBlock, 1, 10));
        OreDictionary.registerOre("blockZinc", new ItemStack(ModBlocks.metalBlock, 1, 11));
        OreDictionary.registerOre("blockAluminum", new ItemStack(ModBlocks.metalBlock, 1, 12));
        OreDictionary.registerOre("blockOsmium", new ItemStack(ModBlocks.metalBlock, 1, 13));
        OreDictionary.registerOre("blockTungsten", new ItemStack(ModBlocks.metalBlock, 1, 14));
        //Alloy
        OreDictionary.registerOre("blockBismuthBronze", new ItemStack(ModBlocks.alloyBlock, 1, 0));
        OreDictionary.registerOre("blockBlackBronze", new ItemStack(ModBlocks.alloyBlock, 1, 1));
        OreDictionary.registerOre("blockBlackSteel", new ItemStack(ModBlocks.alloyBlock, 1, 2));
        OreDictionary.registerOre("blockBlueSteel", new ItemStack(ModBlocks.alloyBlock, 1, 3));
        OreDictionary.registerOre("blockBrass", new ItemStack(ModBlocks.alloyBlock, 1, 4));
        OreDictionary.registerOre("blockBronze", new ItemStack(ModBlocks.alloyBlock, 1, 5));
        OreDictionary.registerOre("blockHighCarbonBlackSteel", new ItemStack(ModBlocks.alloyBlock, 1, 6));
        OreDictionary.registerOre("blockHighCarbonBlueSteel", new ItemStack(ModBlocks.alloyBlock, 1, 7));
        OreDictionary.registerOre("blockHighCarbonRedSteel", new ItemStack(ModBlocks.alloyBlock, 1, 8));
        OreDictionary.registerOre("blockRedSteel", new ItemStack(ModBlocks.alloyBlock, 1, 9));
        OreDictionary.registerOre("blockRoseGold", new ItemStack(ModBlocks.alloyBlock, 1, 10));
        OreDictionary.registerOre("blockSterlingSilver", new ItemStack(ModBlocks.alloyBlock, 1, 11));
        OreDictionary.registerOre("blockWeakSteel", new ItemStack(ModBlocks.alloyBlock, 1, 12));
        OreDictionary.registerOre("blockWeakBlueSteel", new ItemStack(ModBlocks.alloyBlock, 1, 13));
        OreDictionary.registerOre("blockWeakRedSteel", new ItemStack(ModBlocks.alloyBlock, 1, 14));
        OreDictionary.registerOre("blockElectrum", new ItemStack(ModBlocks.alloyBlock, 1, 15));
        OreDictionary.registerOre("blockCupronickel", new ItemStack(ModBlocks.alloyBlock, 1, 16));
        OreDictionary.registerOre("blockInvar", new ItemStack(ModBlocks.alloyBlock, 1, 17));
        OreDictionary.registerOre("blockAnyBronze", new ItemStack(ModBlocks.alloyBlock, 1, 0));
        OreDictionary.registerOre("blockAnyBronze", new ItemStack(ModBlocks.alloyBlock, 1, 1));
        OreDictionary.registerOre("blockAnyBronze", new ItemStack(ModBlocks.alloyBlock, 1, 5));
        //Ingot
        OreDictionary.registerOre("ingotAluminum", new ItemStack(ModItems.aluminumIngot));
        OreDictionary.registerOre("ingotOsmium", new ItemStack(ModItems.osmiumIngot));
        OreDictionary.registerOre("ingotTungsten", new ItemStack(ModItems.tungstenIngot));
        OreDictionary.registerOre("ingotElectrum", new ItemStack(ModItems.electrumIngot));
        OreDictionary.registerOre("ingotCupronickel", new ItemStack(ModItems.cupronickelIngot));
        OreDictionary.registerOre("ingotInvar", new ItemStack(ModItems.invarIngot));
        //Double Ingot
        OreDictionary.registerOre("ingotDoubleAluminum", new ItemStack(ModItems.aluminumIngot2x));
        OreDictionary.registerOre("ingotDoubleOsmium", new ItemStack(ModItems.osmiumIngot2x));
        OreDictionary.registerOre("ingotDoubleTungsten", new ItemStack(ModItems.tungstenIngot2x));
        OreDictionary.registerOre("ingotDoubleElectrum", new ItemStack(ModItems.electrumIngot2x));
        OreDictionary.registerOre("ingotDoubleCupronickel", new ItemStack(ModItems.cupronickelIngot2x));
        OreDictionary.registerOre("ingotDoubleInvar", new ItemStack(ModItems.invarIngot2x));
        //Sheet
        OreDictionary.registerOre("plateAluminum", new ItemStack(ModItems.aluminumSheet));
        OreDictionary.registerOre("plateOsmium", new ItemStack(ModItems.osmiumSheet));
        OreDictionary.registerOre("plateTungsten", new ItemStack(ModItems.tungstenSheet));
        OreDictionary.registerOre("plateElectrum", new ItemStack(ModItems.electrumSheet));
        OreDictionary.registerOre("plateCupronickel", new ItemStack(ModItems.cupronickelSheet));
        OreDictionary.registerOre("plateInvar", new ItemStack(ModItems.invarSheet));
        //Double Sheet
        OreDictionary.registerOre("plateDoubleAluminum", new ItemStack(ModItems.aluminumSheet2x));
        OreDictionary.registerOre("plateDoubleOsmium", new ItemStack(ModItems.osmiumSheet2x));
        OreDictionary.registerOre("plateDoubleTungsten", new ItemStack(ModItems.tungstenSheet2x));
        OreDictionary.registerOre("plateDoubleElectrum", new ItemStack(ModItems.electrumSheet2x));
        OreDictionary.registerOre("plateDoubleCupronickel", new ItemStack(ModItems.cupronickelSheet2x));
        OreDictionary.registerOre("plateDoubleInvar", new ItemStack(ModItems.invarSheet2x));
    }
}
