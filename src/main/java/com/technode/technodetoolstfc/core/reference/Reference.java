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
            "Bismuth", "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze", "Copper", "Gold",
            "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
            "Red Steel", "Rose Gold", "Silver", "Steel", "Sterling Silver", "Tin", "Zinc"
    };
    public static final String[] METALS = {
            "Bismuth", "Copper", "Gold", "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
            "Silver", "Steel", "Tin", "Zinc"
    };

    public static final String[] ALLOYS = {
            "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze",
            "Red Steel", "Rose Gold", "Sterling Silver"
    };


}

