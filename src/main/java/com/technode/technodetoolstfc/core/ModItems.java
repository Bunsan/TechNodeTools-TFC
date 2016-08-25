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

        aluminumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Aluminum Double Ingot")).setSize(EnumSize.LARGE).setMetal("Aluminum", 200);
        osmiumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Osmium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Osmium", 200);;
        tungstenIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Tungsten Double Ingot")).setSize(EnumSize.LARGE).setMetal("Tungsten", 200);;

        aluminumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Aluminum Unshaped");
        osmiumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Osmium Unshaped");
        tungstenUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Tungsten Unshaped");

        aluminumSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(0).setUnlocalizedName("Aluminum Sheet")).setMetal("Aluminum", 200);
        osmiumSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(1).setUnlocalizedName("Osmium Sheet")).setMetal("Osmium", 200);
        tungstenSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(2).setUnlocalizedName("Tungsten Sheet")).setMetal("Tungsten", 200);

        aluminumSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(0).setUnlocalizedName("Aluminum Double Sheet")).setMetal("Aluminum", 400);
        osmiumSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(1).setUnlocalizedName("Osmium Double Sheet")).setMetal("Osmium", 400);
        tungstenSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(2).setUnlocalizedName("Tungsten Double Sheet")).setMetal("Tungsten", 400);

        //ALLOYS

        electrumIngot = new ItemIngotMod().setUnlocalizedName("Electrum Ingot");
        cupronickelIngot = new ItemIngotMod().setUnlocalizedName("Cupronickel Ingot");
        invarIngot = new ItemIngotMod().setUnlocalizedName("Invar Ingot");

        electrumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Electrum Double Ingot")).setSize(EnumSize.LARGE).setMetal("Electrum", 200);
        cupronickelIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Cupronickel Double Ingot")).setSize(EnumSize.LARGE).setMetal("Cupronickel", 200);;
        invarIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Invar Double Ingot")).setSize(EnumSize.LARGE).setMetal("Invar", 200);;

        electrumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Electrum Unshaped");
        cupronickelUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Cupronickel Unshaped");
        invarUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Invar Unshaped");

        electrumSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(0).setUnlocalizedName("Electrum Sheet")).setMetal("Electrum", 200);
        cupronickelSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(1).setUnlocalizedName("Cupronickel Sheet")).setMetal("Cupronickel", 200);
        invarSheet = ((ItemAlloySheetMod) new ItemAlloySheetMod(2).setUnlocalizedName("Invar Sheet")).setMetal("Invar", 200);

        electrumSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(0).setUnlocalizedName("Electrum Double Sheet")).setMetal("Electrum", 400);
        cupronickelSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(1).setUnlocalizedName("Cupronickel Double Sheet")).setMetal("Cupronickel", 400);
        invarSheet2x = ((ItemAlloySheet2xMod) new ItemAlloySheet2xMod(2).setUnlocalizedName("Invar Double Sheet")).setMetal("Invar", 400);

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
    }

    private static void registerMetals() {
        Reference.ALUMINUM = new Metal("Aluminum", ModItems.aluminumUnshaped, ModItems.aluminumIngot);
        Reference.OSMIUM = new Metal("Osmium", ModItems.osmiumUnshaped, ModItems.osmiumIngot);
        Reference.TUNGSTEN = new Metal("Tungsten", ModItems.tungstenUnshaped, ModItems.tungstenIngot);

        Reference.ELECTRUM = new Metal("Electrum", ModItems.electrumUnshaped, ModItems.electrumIngot);
        Reference.CUPRONICKEL = new Metal("Cupronickel", ModItems.cupronickelUnshaped, ModItems.cupronickelIngot);
        Reference.INVAR = new Metal("Invar", ModItems.invarUnshaped, ModItems.invarIngot);

        MetalRegistry.instance.addMetal(Reference.ALUMINUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.OSMIUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.TUNGSTEN, Alloy.EnumTier.TierIV);

        MetalRegistry.instance.addMetal(Reference.ELECTRUM, Alloy.EnumTier.TierI);
        MetalRegistry.instance.addMetal(Reference.CUPRONICKEL, Alloy.EnumTier.TierI);
        MetalRegistry.instance.addMetal(Reference.INVAR, Alloy.EnumTier.TierIV);

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
    }
}
