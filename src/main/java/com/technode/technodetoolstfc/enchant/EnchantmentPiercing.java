package com.technode.technodetoolstfc.enchant;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.util.StatCollector;

public class EnchantmentPiercing extends Enchantment {

    public EnchantmentPiercing(int id, int rarity)
    {
        super(id, rarity, EnumEnchantmentType.armor);
        this.setName("piercing");
    }

    @Override
    public int getMaxLevel()
    {
        return 10;
    }

    @Override
    public int getMinEnchantability(int par1)
    {
        return 5 + (par1 - 1) * 10;
    }
    @Override
    public int getMaxEnchantability(int par1)
    {
        return this.getMinEnchantability(par1) + 20;
    }

    @Override
    public String getTranslatedName(int level)
    {
        return StatCollector.translateToLocal("enchantment.technodetoolstfc:piercing.name") + " "
                + StatCollector.translateToLocal("enchantment.level." + level);
    }
}
