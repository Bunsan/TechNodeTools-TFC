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
            "Silver", "Steel", "Tin", "Zinc", "Aluminum", "Osmium", "Tungsten"
    };

    public static final String[] METALS = {
            "Bismuth", "Copper", "Gold", "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
            "Silver", "Steel", "Tin", "Zinc"
    };

    public static final String[] ALLOYS_ALL = {
            "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze",
            "High Carbon Black Steel", "High Carbon Blue Steel", "High Carbon Red Steel",
            "Red Steel", "Rose Gold", "Sterling Silver", "Weak Steel", "Weak Blue Steel", "Weak Red Steel",
            "Electrum", "Cupronickel", "Invar"
    };

    public static final String[] ALLOYS_USABLE = {
            "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze",
            "Red Steel", "Rose Gold", "Sterling Silver", "Electrum", "Cupronickel", "Invar"
    };

    public static final String[] INTERMEDIATE_ALLOYS = {
            "High Carbon Black Steel", "High Carbon Blue Steel", "High Carbon Red Steel", "Weak Steel",
            "Weak Blue Steel", "Weak Red Steel"
    };

    public static final String[] MOD_METALS = {
            "Aluminum", "Osmium", "Tungsten"
            //"Cobalt", "Titanium", "Chromium", "Lithium", "Manganese", "Molybdenum",
            //"Iridium", "Cadmium", "Vanadium", "Antimony",
    };

     public static final String[] MOD_ALLOYS = {
             "Electrum", "Cupronickel", "Invar",
             //"Aluminum Brass", "Alumite",
    };

    public static final String[] MOD_MINERALS = {
            "Apatite", "Scapolite", "Strontium",
    };

    public static final String[] MOD_ORE_METAL = {
            "Bauxite", "Native Osmium", "Scheelite", "Wolframite"
    };
    public static final String[] MOD_ORE_METAL_ALL = {
            "Native Copper", "Native Gold", "Native Platinum", "Hematite", "Native Silver", "Cassiterite", "Galena", "Bismuthinite", "Garnierite",
            "Malachite", "Magnetite", "Limonite", "Sphalerite", "Tetrahedrite", "Bauxite", "Native Osmium", "Scheelite", "Wolframite"
    };

    public static final String[] MOD_ORE_MINERAL = {
            "Apatite", "Scapolite", "Strontium"
    };

    public static final Item[] MOD_INGOTS = {
            ModItems.aluminumIngot,ModItems.osmiumIngot,ModItems.tungstenIngot,ModItems.electrumIngot,ModItems.cupronickelIngot,ModItems.invarIngot};

    public static final String[] METALS_ALLOYS_USABLE = {
            "Bismuth", "Copper", "Gold", "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
            "Silver", "Steel", "Tin", "Zinc", "Aluminum", "Osmium", "Tungsten", "Bismuth Bronze",
            "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze", "Red Steel", "Rose Gold",
            "Sterling Silver", "Electrum", "Cupronickel", "Invar"
    };

    public static final String[] NATIVE_COPPER = {};




    public static Metal ALUMINUM;
    public static Metal OSMIUM;
    public static Metal TUNGSTEN;
    public static Metal ELECTRUM;
    public static Metal CUPRONICKEL;
    public static Metal INVAR;
    public static Metal NULL;
}

