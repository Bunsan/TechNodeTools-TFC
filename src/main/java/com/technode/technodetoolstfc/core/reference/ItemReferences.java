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

        registerItems();
        registerMetals();

        LogHelper.info("Finished Loading Items");



    }
    private static void registerMetals() {
        Reference.ALUMINUM = new Metal("Aluminum", ModItems.aluminumUnshaped, ModItems.aluminumIngot);
        Reference.OSMIUM = new Metal("Osmium", ModItems.osmiumUnshaped, ModItems.osmiumIngot);
        Reference.TUNGSTEN = new Metal("Tungsten", ModItems.tungstenUnshaped, ModItems.tungstenIngot);

        MetalRegistry.instance.addMetal(Reference.ALUMINUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.OSMIUM, Alloy.EnumTier.TierIV);
        MetalRegistry.instance.addMetal(Reference.TUNGSTEN, Alloy.EnumTier.TierIV);
    }
}
