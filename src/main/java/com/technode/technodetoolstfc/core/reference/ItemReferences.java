package com.technode.technodetoolstfc.core.reference;

import com.sun.tools.internal.xjc.reader.RawTypeSet;
import com.technode.technodetoolstfc.core.ModItems;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.item.*;

import com.bioxx.tfc.Core.Recipes;
import com.bioxx.tfc.Core.TFCTabs;
import com.bioxx.tfc.Core.Metal.Alloy;
import com.bioxx.tfc.Core.Metal.AlloyManager;
import com.bioxx.tfc.Core.Metal.MetalRegistry;
import com.bioxx.tfc.Food.*;
import com.bioxx.tfc.Handlers.TFCFuelHandler;
import com.bioxx.tfc.Items.*;
import com.bioxx.tfc.Items.ItemBlocks.ItemWoodDoor;
import com.bioxx.tfc.Items.Pottery.ItemPotteryBase;
import com.bioxx.tfc.Items.Pottery.ItemPotteryJug;
import com.bioxx.tfc.Items.Pottery.ItemPotteryMold;
import com.bioxx.tfc.Items.Pottery.ItemPotterySmallVessel;
import com.bioxx.tfc.Items.Tools.*;
import com.bioxx.tfc.api.*;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Enums.EnumDamageType;
import com.bioxx.tfc.api.Enums.EnumFoodGroup;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;


public class ItemReferences extends ModItems
{
    public static void itemReferences()
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
        tungstenIngot = new ItemIngotMod().setUnlocalizedName("tungsten Ingot");

        aluminumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Aluminum Double Ingot")).setSize(EnumSize.LARGE).setMetal("Aluminum", 200);
        osmiumIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Osmium Double Ingot")).setSize(EnumSize.LARGE).setMetal("Osmium", 200);;
        tungstenIngot2x = ((ItemIngotMod)new ItemIngotMod().setUnlocalizedName("Tungsten Double Ingot")).setSize(EnumSize.LARGE).setMetal("Tungsten", 200);;

        aluminumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Aluminum Unshaped");
        osmiumUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Osmium Unshaped");
        tungstenUnshaped = new ItemMeltedMetalMod().setUnlocalizedName("Tungsten Unshaped");

        aluminumSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(1).setUnlocalizedName("Aluminum Sheet")).setMetal("Aluminum", 200);
        osmiumSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(0).setUnlocalizedName("Osmium Sheet")).setMetal("Osmium", 200);
        tungstenSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(2).setUnlocalizedName("Tungsten Sheet")).setMetal("Tungsten", 200);

        aluminumSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(1).setUnlocalizedName("Aluminum Double Sheet")).setMetal("Aluminum", 400);
        osmiumSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(0).setUnlocalizedName("Osmium Double Sheet")).setMetal("Osmium", 400);
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

        electrumSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(1).setUnlocalizedName("Electrum Sheet")).setMetal("Electrum", 200);
        cupronickelSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(0).setUnlocalizedName("Cupronickel Sheet")).setMetal("Cupronickel", 200);
        invarSheet = ((ItemMetalSheetMod) new ItemMetalSheetMod(2).setUnlocalizedName("Invar Sheet")).setMetal("Invar", 200);

        electrumSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(1).setUnlocalizedName("Electrum Double Sheet")).setMetal("Electrum", 400);
        cupronickelSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(0).setUnlocalizedName("Cupronickel Double Sheet")).setMetal("Cupronickel", 400);
        invarSheet2x = ((ItemMetalSheet2xMod) new ItemMetalSheet2xMod(2).setUnlocalizedName("Invar Double Sheet")).setMetal("Invar", 400);

        registerItems();
        registerMetals();

        LogHelper.info("Finished Loading Items");



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

        Alloy electrum = new Alloy(Reference.ELECTRUM, Alloy.EnumTier.TierI);
        electrum.addIngred(Global.GOLD, 44.99f, 55.01f);
        electrum.addIngred(Global.SILVER, 44.99f, 55.01f);
        AlloyManager.INSTANCE.addAlloy(electrum);

        Alloy cupronickel = new Alloy(Reference.CUPRONICKEL, Alloy.EnumTier.TierI);
        cupronickel.addIngred(Global.COPPER, 44.99f, 55.01f);
        cupronickel.addIngred(Global.NICKEL, 44.99f, 55.01f);
        AlloyManager.INSTANCE.addAlloy(cupronickel);

        Alloy invar = new Alloy(Reference.INVAR, Alloy.EnumTier.TierI);
        invar.addIngred(Global.WROUGHTIRON, 57.99f, 70.01f);
        invar.addIngred(Global.NICKEL, 29.99f, 42.01f);
        AlloyManager.INSTANCE.addAlloy(invar);

    }
}
