package com.technode.technodetoolstfc.core;

import com.technode.technodetoolstfc.enchant.EnchantmentPiercing;
import net.minecraft.enchantment.Enchantment;

public class ModEnchantments {

    public static Enchantment piercing;

    public static void init()
    {
        piercing = new EnchantmentPiercing(100, 100);
    }
}
