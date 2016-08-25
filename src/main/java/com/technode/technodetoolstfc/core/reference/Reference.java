package com.technode.technodetoolstfc.core.reference;

import com.technode.technodetoolstfc.core.ModItems;

import com.bioxx.tfc.api.Metal;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;

import org.lwjgl.input.Keyboard;

public class Reference {

    public static String translation(String s) {
        return StatCollector.translateToLocal(s);
    }

    public static boolean showShiftInformation() {
        return FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT && Keyboard.isKeyDown(Keyboard.KEY_LSHIFT);
    }

    public static boolean showCtrlInformation() {
        return FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT && Keyboard.isKeyDown(Keyboard.KEY_LCONTROL);
    }

    // Common references for meta names, etc.

    public static final String[] METALS_ALL = {
            "Bismuth", "Copper", "Gold", "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
            "Silver", "Steel", "Tin", "Zinc", "Aluminum", "Osmium", "Tungsten", "Cobalt", "Chromium", "Titanium",
            "Lithium", "Magnesium", "Manganese", "Molybdenum", "Cadmium", "Iridium"
    };

    public static final String[] METALS = {
            "Bismuth", "Copper", "Gold", "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
            "Silver", "Steel", "Tin", "Zinc"
    };

    public static final String[] ALLOYS_ALL = {
            "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze",
            "High Carbon Black Steel", "High Carbon Blue Steel", "High Carbon Red Steel",
            "Red Steel", "Rose Gold", "Sterling Silver", "Weak Steel", "Weak Blue Steel", "Weak Red Steel",
            "Electrum", "Cupronickel", "Invar", "Aluminum Brass", "Alumite", "Manyullyn", "Stainless Steel"
    };

    public static final String[] ALLOYS_USABLE = {
            "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze",
            "Red Steel", "Rose Gold", "Sterling Silver", "Electrum", "Cupronickel", "Invar", "Aluminum Brass",
            "Alumite", "Manyullyn", "Stainless Steel"
    };

    public static final String[] INTERMEDIATE_ALLOYS = {
            "High Carbon Black Steel", "High Carbon Blue Steel", "High Carbon Red Steel", "Weak Steel",
            "Weak Blue Steel", "Weak Red Steel"
    };

    public static final String[] MOD_METALS = {
            "Aluminum", "Osmium", "Tungsten", "Cobalt", "Chromium", "Titanium", "Lithium", "Magnesium", "Manganese",
            "Molybdenum", "Cadmium", "Iridium"
            //"Vanadium", "Antimony",
    };

     public static final String[] MOD_ALLOYS = {
             "Electrum", "Cupronickel", "Invar", "Aluminum Brass", "Alumite", "Manyullyn", "Stainless Steel"
    };

    public static final String[] MOD_MINERALS = {
            "Apatite", "Scapolite", "Strontium",
    };

    public static final String[] MOD_ORE_METAL = {
            "Bauxite", "Native Osmium", "Scheelite", "Wolframite", "Cobaltite", "Chromite", "Titanite", "Lepidolite",
            "Magnesite", "Pyrolusite", "Molybdenite", "Greenockite"
    };

    public static final String[] MOD_ORE_MINERAL = {
            "Apatite", "Scapolite", "Strontium"
    };

    public static final Item[] MOD_INGOTS = {
            ModItems.aluminumIngot,ModItems.osmiumIngot,ModItems.tungstenIngot,ModItems.electrumIngot,ModItems.cupronickelIngot,ModItems.invarIngot};


    public static Metal ALUMINUM;
    public static Metal OSMIUM;
    public static Metal TUNGSTEN;
    public static Metal COBALT;
    public static Metal CHROMIUM;
    public static Metal TITANIUM;
    public static Metal LITHIUM;
    public static Metal MAGNESIUM;
    public static Metal MANGANESE;
    public static Metal MOLYBDENUM;
    public static Metal CADMIUM;
    public static Metal IRIDIUM;
    public static Metal ELECTRUM;
    public static Metal CUPRONICKEL;
    public static Metal INVAR;
    public static Metal ALUMINUMBRASS;
    public static Metal ALUMITE;
    public static Metal MANYULLYN;
    public static Metal STAINLESSSTEEL;
    public static Metal NULL;
}

