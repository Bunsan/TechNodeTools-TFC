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
        OreDictionary.registerOre("nuggetCobalt", new ItemStack(ModItems.smallMetalChunk, 1, 15));
        OreDictionary.registerOre("nuggetChromium", new ItemStack(ModItems.smallMetalChunk, 1, 16));
        OreDictionary.registerOre("nuggetTitanium", new ItemStack(ModItems.smallMetalChunk, 1, 17));
        OreDictionary.registerOre("nuggetLithium", new ItemStack(ModItems.smallMetalChunk, 1, 18));
        OreDictionary.registerOre("nuggetMagnesium", new ItemStack(ModItems.smallMetalChunk, 1, 19));
        OreDictionary.registerOre("nuggetManganese", new ItemStack(ModItems.smallMetalChunk, 1, 20));
        OreDictionary.registerOre("nuggetMolybdenum", new ItemStack(ModItems.smallMetalChunk, 1, 21));
        OreDictionary.registerOre("nuggetCadmium", new ItemStack(ModItems.smallMetalChunk, 1, 22));
        OreDictionary.registerOre("nuggetIridium", new ItemStack(ModItems.smallMetalChunk, 1, 23));

          //Alloy
        OreDictionary.registerOre("nuggetBismuthBronze", new ItemStack(ModItems.smallAlloyChunk, 1, 0));
        OreDictionary.registerOre("nuggetBlackBronze", new ItemStack(ModItems.smallAlloyChunk, 1, 1));
        OreDictionary.registerOre("nuggetBlackSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 2));
        OreDictionary.registerOre("nuggetBlueSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 3));
        OreDictionary.registerOre("nuggetBrass", new ItemStack(ModItems.smallAlloyChunk, 1, 4));
        OreDictionary.registerOre("nuggetBronze", new ItemStack(ModItems.smallAlloyChunk, 1, 5));
        OreDictionary.registerOre("nuggetHighCarbonBlackSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 6));
        OreDictionary.registerOre("nuggetHighCarbonBlueSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 7));
        OreDictionary.registerOre("nuggetHighCarbonRedSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 8));
        OreDictionary.registerOre("nuggetRedSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 9));
        OreDictionary.registerOre("nuggetRoseGold", new ItemStack(ModItems.smallAlloyChunk, 1, 10));
        OreDictionary.registerOre("nuggetSterlingSilver", new ItemStack(ModItems.smallAlloyChunk, 1, 11));
        OreDictionary.registerOre("nuggetWeakSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 12));
        OreDictionary.registerOre("nuggetWeakBlueSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 13));
        OreDictionary.registerOre("nuggetWeakRedSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 14));
        OreDictionary.registerOre("nuggetElectrum", new ItemStack(ModItems.smallAlloyChunk, 1, 15));
        OreDictionary.registerOre("nuggetCupronickel", new ItemStack(ModItems.smallAlloyChunk, 1, 16));
        OreDictionary.registerOre("nuggetInvar", new ItemStack(ModItems.smallAlloyChunk, 1, 17));
        OreDictionary.registerOre("nuggetAluminumBrass", new ItemStack(ModItems.smallAlloyChunk, 1, 18));
        OreDictionary.registerOre("nuggetAlumite", new ItemStack(ModItems.smallAlloyChunk, 1, 19));
        OreDictionary.registerOre("nuggetManyullyn", new ItemStack(ModItems.smallAlloyChunk, 1, 20));
        OreDictionary.registerOre("nuggetStainlessSteel", new ItemStack(ModItems.smallAlloyChunk, 1, 21));
        OreDictionary.registerOre("nuggetAnyBronze", new ItemStack(ModItems.smallAlloyChunk, 1, 0));
        OreDictionary.registerOre("nuggetAnyBronze", new ItemStack(ModItems.smallAlloyChunk, 1, 1));
        OreDictionary.registerOre("nuggetAnyBronze", new ItemStack(ModItems.smallAlloyChunk, 1, 5));

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
        OreDictionary.registerOre("dustCobalt", new ItemStack(ModItems.metalDust, 1, 15));
        OreDictionary.registerOre("dustChromium", new ItemStack(ModItems.metalDust, 1, 16));
        OreDictionary.registerOre("dustTitanium", new ItemStack(ModItems.metalDust, 1, 17));
        OreDictionary.registerOre("dustLithium", new ItemStack(ModItems.metalDust, 1, 18));
        OreDictionary.registerOre("dustMagnesium", new ItemStack(ModItems.metalDust, 1, 19));
        OreDictionary.registerOre("dustManganese", new ItemStack(ModItems.metalDust, 1, 20));
        OreDictionary.registerOre("dustMolybdenum", new ItemStack(ModItems.metalDust, 1, 21));
        OreDictionary.registerOre("dustCadmium", new ItemStack(ModItems.metalDust, 1, 22));
        OreDictionary.registerOre("dustIridium", new ItemStack(ModItems.metalDust, 1, 23));

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
        OreDictionary.registerOre("dustAluminumBrass", new ItemStack(ModItems.alloyDust, 1, 18));
        OreDictionary.registerOre("dustAlumite", new ItemStack(ModItems.alloyDust, 1, 19));
        OreDictionary.registerOre("dustManyullyn", new ItemStack(ModItems.alloyDust, 1, 20));
        OreDictionary.registerOre("dustStainlessSteel", new ItemStack(ModItems.alloyDust, 1, 21));
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
        OreDictionary.registerOre("blockCobalt", new ItemStack(ModBlocks.metalBlock, 1, 15));
        OreDictionary.registerOre("blockChromium", new ItemStack(ModBlocks.metalBlock, 1, 16));
        OreDictionary.registerOre("blockTitanium", new ItemStack(ModBlocks.metalBlock, 1, 17));
        OreDictionary.registerOre("blockLithium", new ItemStack(ModBlocks.metalBlock, 1, 18));
        OreDictionary.registerOre("blockMagnesium", new ItemStack(ModBlocks.metalBlock, 1, 19));
        OreDictionary.registerOre("blockManganese", new ItemStack(ModBlocks.metalBlock, 1, 20));
        OreDictionary.registerOre("blockMolybdenum", new ItemStack(ModBlocks.metalBlock, 1, 21));
        OreDictionary.registerOre("blockCadmium", new ItemStack(ModBlocks.metalBlock, 1, 22));
        OreDictionary.registerOre("blockIridium", new ItemStack(ModBlocks.metalBlock, 1, 23));
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
        OreDictionary.registerOre("blockAluminumBrass", new ItemStack(ModBlocks.alloyBlock, 1, 18));
        OreDictionary.registerOre("blockAlumite", new ItemStack(ModBlocks.alloyBlock, 1, 19));
        OreDictionary.registerOre("blockManyullyn", new ItemStack(ModBlocks.alloyBlock, 1, 20));
        OreDictionary.registerOre("blockStainlessSteel", new ItemStack(ModBlocks.alloyBlock, 1, 21));
        OreDictionary.registerOre("blockAnyBronze", new ItemStack(ModBlocks.alloyBlock, 1, 0));
        OreDictionary.registerOre("blockAnyBronze", new ItemStack(ModBlocks.alloyBlock, 1, 1));
        OreDictionary.registerOre("blockAnyBronze", new ItemStack(ModBlocks.alloyBlock, 1, 5));
        //Ingot
        OreDictionary.registerOre("ingotAluminum", new ItemStack(ModItems.aluminumIngot));
        OreDictionary.registerOre("ingotOsmium", new ItemStack(ModItems.osmiumIngot));
        OreDictionary.registerOre("ingotTungsten", new ItemStack(ModItems.tungstenIngot));
        OreDictionary.registerOre("ingotCobalt", new ItemStack(ModItems.cobaltIngot));
        OreDictionary.registerOre("ingotChromium", new ItemStack(ModItems.chromiumIngot));
        OreDictionary.registerOre("ingotTitanium", new ItemStack(ModItems.titaniumIngot));
        OreDictionary.registerOre("ingotLithium", new ItemStack(ModItems.lithiumIngot));
        OreDictionary.registerOre("ingotMagnesium", new ItemStack(ModItems.magnesiumIngot));
        OreDictionary.registerOre("ingotManganese", new ItemStack(ModItems.manganeseIngot));
        OreDictionary.registerOre("ingotMolybdenum", new ItemStack(ModItems.molybdenumIngot));
        OreDictionary.registerOre("ingotCadmium", new ItemStack(ModItems.cadmiumIngot));
        OreDictionary.registerOre("ingotIridium", new ItemStack(ModItems.iridiumIngot));

        OreDictionary.registerOre("ingotElectrum", new ItemStack(ModItems.electrumIngot));
        OreDictionary.registerOre("ingotCupronickel", new ItemStack(ModItems.cupronickelIngot));
        OreDictionary.registerOre("ingotInvar", new ItemStack(ModItems.invarIngot));
        OreDictionary.registerOre("ingotAluminumBrass", new ItemStack(ModItems.aluminumBrassIngot));
        OreDictionary.registerOre("ingotAlumite", new ItemStack(ModItems.alumiteIngot));
        OreDictionary.registerOre("ingotManyullyn", new ItemStack(ModItems.manyullynIngot));
        OreDictionary.registerOre("ingotStainlessSteel", new ItemStack(ModItems.stainlessSteelIngot));

        //Double Ingot
        OreDictionary.registerOre("ingotDoubleAluminum", new ItemStack(ModItems.aluminumIngot2x));
        OreDictionary.registerOre("ingotDoubleOsmium", new ItemStack(ModItems.osmiumIngot2x));
        OreDictionary.registerOre("ingotDoubleTungsten", new ItemStack(ModItems.tungstenIngot2x));
        OreDictionary.registerOre("ingotDoubleCobalt", new ItemStack(ModItems.cobaltIngot2x));
        OreDictionary.registerOre("ingotDoubleChromium", new ItemStack(ModItems.chromiumIngot2x));
        OreDictionary.registerOre("ingotDoubleTitanium", new ItemStack(ModItems.titaniumIngot2x));
        OreDictionary.registerOre("ingotDoubleLithium", new ItemStack(ModItems.lithiumIngot2x));
        OreDictionary.registerOre("ingotDoubleMagnesium", new ItemStack(ModItems.magnesiumIngot2x));
        OreDictionary.registerOre("ingotDoubleManganese", new ItemStack(ModItems.manganeseIngot2x));
        OreDictionary.registerOre("ingotDoubleMolybdenum", new ItemStack(ModItems.molybdenumIngot2x));
        OreDictionary.registerOre("ingotDoubleCadmium", new ItemStack(ModItems.cadmiumIngot2x));
        OreDictionary.registerOre("ingotDoubleIridium", new ItemStack(ModItems.iridiumIngot2x));

        OreDictionary.registerOre("ingotDoubleElectrum", new ItemStack(ModItems.electrumIngot2x));
        OreDictionary.registerOre("ingotDoubleCupronickel", new ItemStack(ModItems.cupronickelIngot2x));
        OreDictionary.registerOre("ingotDoubleInvar", new ItemStack(ModItems.invarIngot2x));
        OreDictionary.registerOre("ingotDoubleAluminumBrass", new ItemStack(ModItems.aluminumBrassIngot2x));
        OreDictionary.registerOre("ingotDoubleAlumite", new ItemStack(ModItems.alumiteIngot2x));
        OreDictionary.registerOre("ingotDoubleManyullyn", new ItemStack(ModItems.manyullynIngot2x));
        OreDictionary.registerOre("ingotDoubleStainlessSteel", new ItemStack(ModItems.stainlessSteelIngot2x));
        //Sheet
        OreDictionary.registerOre("plateAluminum", new ItemStack(ModItems.aluminumSheet));
        OreDictionary.registerOre("plateOsmium", new ItemStack(ModItems.osmiumSheet));
        OreDictionary.registerOre("plateTungsten", new ItemStack(ModItems.tungstenSheet));
        OreDictionary.registerOre("plateCobalt", new ItemStack(ModItems.cobaltSheet));
        OreDictionary.registerOre("plateChromium", new ItemStack(ModItems.chromiumSheet));
        OreDictionary.registerOre("plateTitanium", new ItemStack(ModItems.titaniumSheet));
        OreDictionary.registerOre("plateLithium", new ItemStack(ModItems.lithiumSheet));
        OreDictionary.registerOre("plateMagnesium", new ItemStack(ModItems.magnesiumSheet));
        OreDictionary.registerOre("plateManganese", new ItemStack(ModItems.manganeseSheet));
        OreDictionary.registerOre("plateMolybdenum", new ItemStack(ModItems.molybdenumSheet));
        OreDictionary.registerOre("plateCadmium", new ItemStack(ModItems.cadmiumSheet));
        OreDictionary.registerOre("plateIridium", new ItemStack(ModItems.iridiumSheet));

        OreDictionary.registerOre("plateElectrum", new ItemStack(ModItems.electrumSheet));
        OreDictionary.registerOre("plateCupronickel", new ItemStack(ModItems.cupronickelSheet));
        OreDictionary.registerOre("plateInvar", new ItemStack(ModItems.invarSheet));
        OreDictionary.registerOre("plateAluminumBrass", new ItemStack(ModItems.aluminumBrassSheet));
        OreDictionary.registerOre("plateAlumite", new ItemStack(ModItems.alumiteSheet));
        OreDictionary.registerOre("plateManyullyn", new ItemStack(ModItems.manyullynSheet));
        OreDictionary.registerOre("plateStainlessSteel", new ItemStack(ModItems.stainlessSteelSheet));

        //Double Sheet
        OreDictionary.registerOre("plateDoubleAluminum", new ItemStack(ModItems.aluminumSheet2x));
        OreDictionary.registerOre("plateDoubleOsmium", new ItemStack(ModItems.osmiumSheet2x));
        OreDictionary.registerOre("plateDoubleTungsten", new ItemStack(ModItems.tungstenSheet2x));
        OreDictionary.registerOre("plateDoubleCobalt", new ItemStack(ModItems.cobaltSheet2x));
        OreDictionary.registerOre("plateDoubleChromium", new ItemStack(ModItems.chromiumSheet2x));
        OreDictionary.registerOre("plateDoubleTitanium", new ItemStack(ModItems.titaniumSheet2x));
        OreDictionary.registerOre("plateDoubleLithium", new ItemStack(ModItems.lithiumSheet2x));
        OreDictionary.registerOre("plateDoubleMagnesium", new ItemStack(ModItems.magnesiumSheet2x));
        OreDictionary.registerOre("plateDoubleManganese", new ItemStack(ModItems.manganeseSheet2x));
        OreDictionary.registerOre("plateDoubleMolybdenum", new ItemStack(ModItems.molybdenumSheet2x));
        OreDictionary.registerOre("plateDoubleCadmium", new ItemStack(ModItems.cadmiumSheet2x));
        OreDictionary.registerOre("plateDoubleIridium", new ItemStack(ModItems.iridiumSheet2x));

        OreDictionary.registerOre("plateDoubleElectrum", new ItemStack(ModItems.electrumSheet2x));
        OreDictionary.registerOre("plateDoubleCupronickel", new ItemStack(ModItems.cupronickelSheet2x));
        OreDictionary.registerOre("plateDoubleInvar", new ItemStack(ModItems.invarSheet2x));
        OreDictionary.registerOre("plateDoubleAluminumBrass", new ItemStack(ModItems.aluminumBrassSheet2x));
        OreDictionary.registerOre("plateDoubleAlumite", new ItemStack(ModItems.alumiteSheet2x));
        OreDictionary.registerOre("plateDoubleManyullyn", new ItemStack(ModItems.manyullynSheet2x));
        OreDictionary.registerOre("plateDoubleStainlessSteel", new ItemStack(ModItems.stainlessSteelSheet2x));
    }
}
