package com.technode.technodetoolstfc.core;

import com.bioxx.tfc.Core.Metal.Alloy;
import com.bioxx.tfc.Core.Metal.AlloyManager;
import com.bioxx.tfc.Core.Metal.MetalRegistry;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Metal;
import com.technode.technodetoolstfc.core.reference.Reference;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.item.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item oreChunk;
    public static Item oreMineralChunk;
    public static Item smallOreChunk;
    public static Item smallMetalChunk;
    public static Item smallAlloyChunk;
    public static Item metalDust;
    public static Item alloyDust;

    public static Item aluminumIngot;
    public static Item aluminumIngot2x;
    public static Item aluminumUnshaped;
    public static Item aluminumSheet;
    public static Item aluminumSheet2x;
    public static Item osmiumIngot;
    public static Item osmiumIngot2x;
    public static Item osmiumUnshaped;
    public static Item osmiumSheet;
    public static Item osmiumSheet2x;
    public static Item tungstenIngot;
    public static Item tungstenIngot2x;
    public static Item tungstenUnshaped;
    public static Item tungstenSheet;
    public static Item tungstenSheet2x;
    public static Item cobaltIngot;
    public static Item cobaltIngot2x;
    public static Item cobaltUnshaped;
    public static Item cobaltSheet;
    public static Item cobaltSheet2x;
    public static Item chromiumIngot;
    public static Item chromiumIngot2x;
    public static Item chromiumUnshaped;
    public static Item chromiumSheet;
    public static Item chromiumSheet2x;
    public static Item titaniumIngot;
    public static Item titaniumIngot2x;
    public static Item titaniumUnshaped;
    public static Item titaniumSheet;
    public static Item titaniumSheet2x;
    public static Item lithiumIngot;
    public static Item lithiumIngot2x;
    public static Item lithiumUnshaped;
    public static Item lithiumSheet;
    public static Item lithiumSheet2x;
    public static Item magnesiumIngot;
    public static Item magnesiumIngot2x;
    public static Item magnesiumUnshaped;
    public static Item magnesiumSheet;
    public static Item magnesiumSheet2x;
    public static Item manganeseIngot;
    public static Item manganeseIngot2x;
    public static Item manganeseUnshaped;
    public static Item manganeseSheet;
    public static Item manganeseSheet2x;
    public static Item molybdenumIngot;
    public static Item molybdenumIngot2x;
    public static Item molybdenumUnshaped;
    public static Item molybdenumSheet;
    public static Item molybdenumSheet2x;
    public static Item cadmiumIngot;
    public static Item cadmiumIngot2x;
    public static Item cadmiumUnshaped;
    public static Item cadmiumSheet;
    public static Item cadmiumSheet2x;
    public static Item iridiumIngot;
    public static Item iridiumIngot2x;
    public static Item iridiumUnshaped;
    public static Item iridiumSheet;
    public static Item iridiumSheet2x;

    public static Item electrumIngot;
    public static Item electrumIngot2x;
    public static Item electrumUnshaped;
    public static Item electrumSheet;
    public static Item electrumSheet2x;
    public static Item cupronickelIngot;
    public static Item cupronickelIngot2x;
    public static Item cupronickelUnshaped;
    public static Item cupronickelSheet;
    public static Item cupronickelSheet2x;
    public static Item invarIngot;
    public static Item invarIngot2x;
    public static Item invarUnshaped;
    public static Item invarSheet;
    public static Item invarSheet2x;
    public static Item aluminumBrassIngot;
    public static Item aluminumBrassIngot2x;
    public static Item aluminumBrassUnshaped;
    public static Item aluminumBrassSheet;
    public static Item aluminumBrassSheet2x;
    public static Item alumiteIngot;
    public static Item alumiteIngot2x;
    public static Item alumiteUnshaped;
    public static Item alumiteSheet;
    public static Item alumiteSheet2x;
    public static Item manyullynIngot;
    public static Item manyullynIngot2x;
    public static Item manyullynUnshaped;
    public static Item manyullynSheet;
    public static Item manyullynSheet2x;
    public static Item stainlessSteelIngot;
    public static Item stainlessSteelIngot2x;
    public static Item stainlessSteelUnshaped;
    public static Item stainlessSteelSheet;
    public static Item stainlessSteelSheet2x;

    public static void ModItemsInit() {
        LogHelper.info("Registering Items.");

        loadItems();
        registerItems();
        registerMetals();

        LogHelper.info("Items Registered.");
    }

    private static void loadItems()
    {
        oreChunk = new ItemOreMod().setUnlocalizedName("Ore");
        oreMineralChunk = new ItemMineralOreMod().setUnlocalizedName("Mineral");
        smallOreChunk = new ItemOreSmallMod().setUnlocalizedName("OreNugget");
        smallMetalChunk = new ItemMetalNugget().setUnlocalizedName("MetalNugget");
        smallAlloyChunk = new ItemAlloyNugget().setUnlocalizedName("AlloyNugget");
        metalDust = new ItemMetalDust().setUnlocalizedName("MetalDust");
        alloyDust = new ItemAlloyDust().setUnlocalizedName("AlloyDust");

        //METALS

        aluminumIngot = new ItemIngotMod().setUnlocalizedName("Aluminum Ingot");
        osmiumIngot = new ItemIngotMod().setUnlocalizedName("Osmium Ingot");
        tungstenIngot = new ItemIngotMod().setUnlocalizedName("Tungsten Ingot");
        cobaltIngot = new ItemIngotMod().setUnlocalizedName("Cobalt Ingot");
        chromiumIngot = new ItemIngotMod().setUnlocalizedName("Chromium Ingot");
        titaniumIngot = new ItemIngotMod().setUnlocalizedName("Titanium Ingot");
        lithiumIngot = new ItemIngotMod().setUnlocalizedName("Lithium Ingot");
        magnesiumIngot = new ItemIngotMod().setUnlocalizedName("Magnesium Ingot");
        manganeseIngot = new ItemIngotMod().setUnlocalizedName("Manganese Ingot");
        molybdenumIngot = new ItemIngotMod().setUnlocalizedName("Molybdenum Ingot");
        cadmiumIngot = new ItemIngotMod().setUnlocalizedName("Cadmium Ingot");
        iridiumIngot = new ItemIngotMod().setUnlocalizedName("Iridium Ingot");

        aluminumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Aluminum Double Ingot")).setSize(EnumSize.LARGE).setMetal("Aluminum", 200);
        osmiumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Osmium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Osmium", 200);
        tungstenIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Tungsten Double Ingot")).setSize(EnumSize.LARGE).setMetal("Tungsten", 200);
        cobaltIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Cobalt Double Ingot")).setSize(EnumSize.LARGE).setMetal("Cobalt", 200);
        chromiumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Chromium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Chromium", 200);
        titaniumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Titanium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Titanium", 200);
        lithiumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Lithium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Lithium", 200);
        magnesiumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Magnesium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Magnesium", 200);
        manganeseIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Manganese Double Ingot")).setSize(EnumSize.LARGE).setMetal("Manganese", 200);
        molybdenumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Molybdenum Double Ingot")).setSize(EnumSize.LARGE).setMetal("Molybdenum", 200);
        cadmiumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Cadmium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Cadmium", 200);
        iridiumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Iridium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Iridium", 200);

        aluminumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Aluminum Unshaped");
        osmiumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Osmium Unshaped");
        tungstenUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Tungsten Unshaped");
        cobaltUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Cobalt Unshaped");
        chromiumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Chromium Unshaped");
        titaniumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Titanium Unshaped");
        lithiumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Lithium Unshaped");
        magnesiumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Magnesium Unshaped");
        manganeseUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Manganese Unshaped");
        molybdenumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Molybdenum Unshaped");
        cadmiumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Cadmium Unshaped");
        iridiumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Iridium Unshaped");

        aluminumSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(0).setUnlocalizedName("Aluminum Sheet")).setMetal("Aluminum", 200);
        osmiumSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(1).setUnlocalizedName("Osmium Sheet")).setMetal("Osmium", 200);
        tungstenSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(2).setUnlocalizedName("Tungsten Sheet")).setMetal("Tungsten", 200);
        cobaltSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(3).setUnlocalizedName("Cobalt Sheet")).setMetal("Cobalt", 200);
        chromiumSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(4).setUnlocalizedName("Chromium Sheet")).setMetal("Chromium", 200);
        titaniumSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(5).setUnlocalizedName("Titanium Sheet")).setMetal("Titanium", 200);
        lithiumSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(6).setUnlocalizedName("Lithium Sheet")).setMetal("Lithium", 200);
        magnesiumSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(7).setUnlocalizedName("Magnesium Sheet")).setMetal("Magnesium", 200);
        manganeseSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(8).setUnlocalizedName("Manganese Sheet")).setMetal("Manganese", 200);
        molybdenumSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(9).setUnlocalizedName("Molybdenum Sheet")).setMetal("Molybdenum", 200);
        cadmiumSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(10).setUnlocalizedName("Cadmium Sheet")).setMetal("Cadmium", 200);
        iridiumSheet = ((ItemMetalSheetMod)new ItemMetalSheetMod(11).setUnlocalizedName("Iridium Sheet")).setMetal("Iridium", 200);

        aluminumSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(0).setUnlocalizedName("Aluminum Double Sheet")).setMetal("Aluminum", 400);
        osmiumSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(1).setUnlocalizedName("Osmium Double Sheet")).setMetal("Osmium", 400);
        tungstenSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(2).setUnlocalizedName("Tungsten Double Sheet")).setMetal("Tungsten", 400);
        cobaltSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(3).setUnlocalizedName("Cobalt Double Sheet")).setMetal("Cobalt", 400);
        chromiumSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(4).setUnlocalizedName("Chromium Double Sheet")).setMetal("Chromium", 400);
        titaniumSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(5).setUnlocalizedName("Titanium Double Sheet")).setMetal("Titanium", 400);
        lithiumSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(6).setUnlocalizedName("Lithium Double Sheet")).setMetal("Lithium", 400);
        magnesiumSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(7).setUnlocalizedName("Magnesium Double Sheet")).setMetal("Magnesium", 400);
        manganeseSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(8).setUnlocalizedName("Manganese Double Sheet")).setMetal("Manganese", 400);
        molybdenumSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(9).setUnlocalizedName("Molybdenum Double Sheet")).setMetal("Molybdenum", 400);
        cadmiumSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(10).setUnlocalizedName("Cadmium Double Sheet")).setMetal("Cadmium", 400);
        iridiumSheet2x = ((ItemMetalSheet2xMod)new ItemMetalSheet2xMod(11).setUnlocalizedName("Iridium Double Sheet")).setMetal("Iridium", 400);

        //ALLOYS

        electrumIngot = new ItemIngotMod().setUnlocalizedName("Electrum Ingot");
        cupronickelIngot = new ItemIngotMod().setUnlocalizedName("Cupronickel Ingot");
        invarIngot = new ItemIngotMod().setUnlocalizedName("Invar Ingot");
        aluminumBrassIngot = new ItemIngotMod().setUnlocalizedName("Aluminum Brass Ingot");
        alumiteIngot = new ItemIngotMod().setUnlocalizedName("Alumite Ingot");
        manyullynIngot = new ItemIngotMod().setUnlocalizedName("Manyullyn Ingot");
        stainlessSteelIngot = new ItemIngotMod().setUnlocalizedName("Stainless Steel Ingot");

        electrumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Electrum Double Ingot")).setSize(EnumSize.LARGE).setMetal("Electrum", 200);
        cupronickelIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Cupronickel Double Ingot")).setSize(EnumSize.LARGE).setMetal("Cupronickel", 200);
        invarIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Invar Double Ingot")).setSize(EnumSize.LARGE).setMetal("Invar", 200);
        aluminumBrassIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Aluminum Brass Double Ingot")).setSize(EnumSize.LARGE).setMetal("Aluminum Brass", 200);
        alumiteIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Alumite Double Ingot")).setSize(EnumSize.LARGE).setMetal("Alumite", 200);
        manyullynIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Manyullyn Double Ingot")).setSize(EnumSize.LARGE).setMetal("Manyullyn", 200);
        stainlessSteelIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Stainless Steel Double Ingot")).setSize(EnumSize.LARGE).setMetal("Stainless Steel", 200);

        electrumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Electrum Unshaped");
        cupronickelUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Cupronickel Unshaped");
        invarUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Invar Unshaped");
        aluminumBrassUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Aluminum Brass Unshaped");
        alumiteUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Alumite Unshaped");
        manyullynUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Manyullyn Unshaped");
        stainlessSteelUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Stainless Steel Unshaped");

        electrumSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(0).setUnlocalizedName("Electrum Sheet")).setMetal("Electrum", 200);
        cupronickelSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(1).setUnlocalizedName("Cupronickel Sheet")).setMetal("Cupronickel", 200);
        invarSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(2).setUnlocalizedName("Invar Sheet")).setMetal("Invar", 200);
        aluminumBrassSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(0).setUnlocalizedName("Aluminum Brass Sheet")).setMetal("Aluminum Brass", 200);
        alumiteSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(1).setUnlocalizedName("Alumite Sheet")).setMetal("Alumite", 200);
        manyullynSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(2).setUnlocalizedName("Manyullyn Sheet")).setMetal("Manyullyn", 200);
        stainlessSteelSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(2).setUnlocalizedName("Stainless Steel Sheet")).setMetal("Stainless Steel", 200);

        electrumSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(0).setUnlocalizedName("Electrum Double Sheet")).setMetal("Electrum", 400);
        cupronickelSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(1).setUnlocalizedName("Cupronickel Double Sheet")).setMetal("Cupronickel", 400);
        invarSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(2).setUnlocalizedName("Invar Double Sheet")).setMetal("Invar", 400);
        aluminumBrassSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(0).setUnlocalizedName("Aluminum Brass Double Sheet")).setMetal("Aluminum Brass", 400);
        alumiteSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(1).setUnlocalizedName("Alumite Double Sheet")).setMetal("Alumite", 400);
        manyullynSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(2).setUnlocalizedName("Manyullyn Double Sheet")).setMetal("Manyullyn", 400);
        stainlessSteelSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(2).setUnlocalizedName("Stainless Steel Double Sheet")).setMetal("Stainless Steel", 400);

    }

    private static void registerItems()
    {
        GameRegistry.registerItem(oreChunk, oreChunk.getUnlocalizedName());
        GameRegistry.registerItem(oreMineralChunk, oreMineralChunk.getUnlocalizedName());
        GameRegistry.registerItem(smallOreChunk, smallOreChunk.getUnlocalizedName());
        GameRegistry.registerItem(smallMetalChunk, smallMetalChunk.getUnlocalizedName());
        GameRegistry.registerItem(smallAlloyChunk, smallAlloyChunk.getUnlocalizedName());
        GameRegistry.registerItem(metalDust, metalDust.getUnlocalizedName());
        GameRegistry.registerItem(alloyDust, alloyDust.getUnlocalizedName());

        GameRegistry.registerItem(aluminumIngot, aluminumIngot.getUnlocalizedName());
        GameRegistry.registerItem(aluminumIngot2x, aluminumIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(aluminumUnshaped, aluminumUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(aluminumSheet, aluminumSheet.getUnlocalizedName());
        GameRegistry.registerItem(aluminumSheet2x, aluminumSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(osmiumIngot, osmiumIngot.getUnlocalizedName());
        GameRegistry.registerItem(osmiumIngot2x, osmiumIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(osmiumUnshaped, osmiumUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(osmiumSheet, osmiumSheet.getUnlocalizedName());
        GameRegistry.registerItem(osmiumSheet2x, osmiumSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(tungstenIngot, tungstenIngot.getUnlocalizedName());
        GameRegistry.registerItem(tungstenIngot2x, tungstenIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(tungstenUnshaped, tungstenUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(tungstenSheet, tungstenSheet.getUnlocalizedName());
        GameRegistry.registerItem(tungstenSheet2x, tungstenSheet2x.getUnlocalizedName());

        GameRegistry.registerItem(electrumIngot, electrumIngot.getUnlocalizedName());
        GameRegistry.registerItem(electrumIngot2x, electrumIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(electrumUnshaped, electrumUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(electrumSheet, electrumSheet.getUnlocalizedName());
        GameRegistry.registerItem(electrumSheet2x, electrumSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(cupronickelIngot, cupronickelIngot.getUnlocalizedName());
        GameRegistry.registerItem(cupronickelIngot2x, cupronickelIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(cupronickelUnshaped, cupronickelUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(cupronickelSheet, cupronickelSheet.getUnlocalizedName());
        GameRegistry.registerItem(cupronickelSheet2x, cupronickelSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(invarIngot, invarIngot.getUnlocalizedName());
        GameRegistry.registerItem(invarIngot2x, invarIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(invarUnshaped, invarUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(invarSheet, invarSheet.getUnlocalizedName());
        GameRegistry.registerItem(invarSheet2x, invarSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(aluminumBrassIngot, aluminumBrassIngot.getUnlocalizedName());
        GameRegistry.registerItem(aluminumBrassIngot2x, aluminumBrassIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(aluminumBrassUnshaped, aluminumBrassUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(aluminumBrassSheet, aluminumBrassSheet.getUnlocalizedName());
        GameRegistry.registerItem(aluminumBrassSheet2x, aluminumBrassSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(alumiteIngot, alumiteIngot.getUnlocalizedName());
        GameRegistry.registerItem(alumiteIngot2x, alumiteIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(alumiteUnshaped, alumiteUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(alumiteSheet, alumiteSheet.getUnlocalizedName());
        GameRegistry.registerItem(alumiteSheet2x, alumiteSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(manyullynIngot, manyullynIngot.getUnlocalizedName());
        GameRegistry.registerItem(manyullynIngot2x, manyullynIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(manyullynUnshaped, manyullynUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(manyullynSheet, manyullynSheet.getUnlocalizedName());
        GameRegistry.registerItem(manyullynSheet2x, manyullynSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(stainlessSteelIngot, stainlessSteelIngot.getUnlocalizedName());
        GameRegistry.registerItem(stainlessSteelIngot2x, stainlessSteelIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(stainlessSteelUnshaped, stainlessSteelUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(stainlessSteelSheet, stainlessSteelSheet.getUnlocalizedName());
        GameRegistry.registerItem(stainlessSteelSheet2x, stainlessSteelSheet2x.getUnlocalizedName());
    }

    private static void registerMetals() {
        Reference.ALUMINUM = new Metal("Aluminum", ModItems.aluminumUnshaped, ModItems.aluminumIngot);
        Reference.OSMIUM = new Metal("Osmium", ModItems.osmiumUnshaped, ModItems.osmiumIngot);
        Reference.TUNGSTEN = new Metal("Tungsten", ModItems.tungstenUnshaped, ModItems.tungstenIngot);
        Reference.COBALT = new Metal("Cobalt", ModItems.cobaltUnshaped, ModItems.cobaltIngot);
        Reference.CHROMIUM = new Metal("Chromium", ModItems.chromiumUnshaped, ModItems.chromiumIngot);
        Reference.TITANIUM = new Metal("Titanium", ModItems.titaniumUnshaped, ModItems.titaniumIngot);
        Reference.LITHIUM = new Metal("Lithium", ModItems.lithiumUnshaped, ModItems.lithiumIngot);
        Reference.MAGNESIUM = new Metal("Magnesium", ModItems.magnesiumUnshaped, ModItems.magnesiumIngot);
        Reference.MANGANESE = new Metal("Manganese", ModItems.manganeseUnshaped, ModItems.manganeseIngot);
        Reference.MOLYBDENUM = new Metal("Molybdenum", ModItems.molybdenumUnshaped, ModItems.molybdenumIngot);
        Reference.CADMIUM = new Metal("Cadmium", ModItems.cadmiumUnshaped, ModItems.cadmiumIngot);
        Reference.IRIDIUM = new Metal("Iridium", ModItems.iridiumUnshaped, ModItems.iridiumIngot);

        Reference.ELECTRUM = new Metal("Electrum", ModItems.electrumUnshaped, ModItems.electrumIngot);
        Reference.CUPRONICKEL = new Metal("Cupronickel", ModItems.cupronickelUnshaped, ModItems.cupronickelIngot);
        Reference.INVAR = new Metal("Invar", ModItems.invarUnshaped, ModItems.invarIngot);

        MetalRegistry.instance.addMetal(Reference.ALUMINUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.OSMIUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.TUNGSTEN, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.COBALT, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.CHROMIUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.TITANIUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.LITHIUM, Alloy.EnumTier.TierI);
        MetalRegistry.instance.addMetal(Reference.MAGNESIUM, Alloy.EnumTier.TierI);
        MetalRegistry.instance.addMetal(Reference.MANGANESE, Alloy.EnumTier.TierI);
        MetalRegistry.instance.addMetal(Reference.MOLYBDENUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.CADMIUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.IRIDIUM, Alloy.EnumTier.TierIV);

        MetalRegistry.instance.addMetal(Reference.ELECTRUM, Alloy.EnumTier.TierI);
        MetalRegistry.instance.addMetal(Reference.CUPRONICKEL, Alloy.EnumTier.TierI);
        MetalRegistry.instance.addMetal(Reference.INVAR, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.ALUMINUMBRASS, Alloy.EnumTier.TierI);
        MetalRegistry.instance.addMetal(Reference.ALUMITE, Alloy.EnumTier.TierIII);
        MetalRegistry.instance.addMetal(Reference.MANYULLYN, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.STAINLESSSTEEL, Alloy.EnumTier.TierIV);

        if (ModOptions.enableElectrum) {
            Alloy electrum = new Alloy(Reference.ELECTRUM, Alloy.EnumTier.TierI);
            electrum.addIngred(Global.GOLD, 44.99f, 55.01f);
            electrum.addIngred(Global.SILVER, 44.99f, 55.01f);
            AlloyManager.INSTANCE.addAlloy(electrum);
        }

        if (ModOptions.enableCuproNickel) {
            Alloy cupronickel = new Alloy(Reference.CUPRONICKEL, Alloy.EnumTier.TierI);
            cupronickel.addIngred(Global.COPPER, 44.99f, 55.01f);
            cupronickel.addIngred(Global.NICKEL, 44.99f, 55.01f);
            AlloyManager.INSTANCE.addAlloy(cupronickel);
        }

        if (ModOptions.enableInvar) {
            Alloy invar = new Alloy(Reference.INVAR, Alloy.EnumTier.TierI);
            invar.addIngred(Global.WROUGHTIRON, 57.99f, 70.01f);
            invar.addIngred(Global.NICKEL, 29.99f, 42.01f);
            AlloyManager.INSTANCE.addAlloy(invar);
        }
        if (ModOptions.enableAluminumBrass) {
            Alloy aluminumBrass = new Alloy(Reference.ALUMINUMBRASS, Alloy.EnumTier.TierI);
            aluminumBrass.addIngred(Reference.ALUMINUM, 69.99f, 80.01f);
            aluminumBrass.addIngred(Global.COPPER, 19.99f, 30.01f);
            AlloyManager.INSTANCE.addAlloy(aluminumBrass);
        }

        if (ModOptions.enableAlumite) {
            Alloy alumite = new Alloy(Reference.ALUMITE, Alloy.EnumTier.TierI);
            alumite.addIngred(Reference.ALUMINUM, 39.99f, 45.01f);
            alumite.addIngred(Global.WROUGHTIRON, 54.99f, 60.01f);
            AlloyManager.INSTANCE.addAlloy(alumite);
        }

        if (ModOptions.enableManyullyn) {
            Alloy manyullyn = new Alloy(Reference.MANYULLYN, Alloy.EnumTier.TierI);
            manyullyn.addIngred(Reference.COBALT, 64.99f, 70.01f);
            manyullyn.addIngred(Reference.CHROMIUM, 29.99f, 35.01f);
            AlloyManager.INSTANCE.addAlloy(manyullyn);
        }
        if (ModOptions.enableStainlessSteel) {
            Alloy stainlessSteel = new Alloy(Reference.STAINLESSSTEEL, Alloy.EnumTier.TierI);
            stainlessSteel.addIngred(Global.STEEL, 77.99f, 86.01f);
            stainlessSteel.addIngred(Global.NICKEL, 1.99f, 5.01f);
            stainlessSteel.addIngred(Reference.CHROMIUM, 9.99f, 20.01f);
                AlloyManager.INSTANCE.addAlloy(stainlessSteel);
        }
    }
}
