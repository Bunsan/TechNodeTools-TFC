package com.technode.technodetoolstfc.core.reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
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
            "Silver", "Steel", "Tin", "Zinc",  "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel",
            "Brass", "Bronze", "Red Steel", "Rose Gold", "Sterling Silver", "High Carbon Black Steel",
            "High Carbon Blue Steel", "High Carbon Red Steel", "Weak Steel", "Weak Blue Steel", "Weak Red Steel"
    };
    public static final String[] METALS = {
            "Bismuth", "Copper", "Gold", "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
            "Silver", "Steel", "Tin", "Zinc"
    };

    public static final String[] ALLOYS_ALL = {
            "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze",
            "High Carbon Black Steel", "High Carbon Blue Steel", "High Carbon Red Steel",
            "Red Steel", "Rose Gold", "Sterling Silver", "Weak Steel", "Weak Blue Steel", "Weak Red Steel"
    };

    public static final String[] ALLOYS = {
            "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze",
            "Red Steel", "Rose Gold", "Sterling Silver"
    };

    public static final String[] INTERMEDIATE_ALLOYS = {
            "High Carbon Black Steel", "High Carbon Blue Steel", "High Carbon Red Steel", "Weak Steel",
            "Weak Blue Steel", "Weak Red Steel"
    };

    public static final String[] MOD_METALS_ALLOYS = {
            "*Osmium", "*Aluminum", "*Tungsten", "Cobalt", "Titanium", "Chromium", "Lithium", "Manganese", "Molybdenum",
            "Iridium", "Cadmium", "Vanadium", "Antimony", "*Electrum", "*Cupronickel", "Aluminum Brass", "Alumite", "*Invar"

    };

    public static final String[] MOD_MINERALS = {
            "Apatite", "Scapolite"
    };
}

