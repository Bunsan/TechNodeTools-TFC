package com.technode.technodetoolstfc.item;

import com.technode.technodetoolstfc.core.reference.CreativeTab;

import com.bioxx.tfc.Items.ItemOreSmall;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;
import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;

import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.item.ItemStack;

public class ItemMetal extends ItemOreSmall implements ISmeltable
{
    private short metalAmount;

    public ItemMetal()
    {
        super();
        setFolder("metal/");
        setCreativeTab(CreativeTab.TECHNODE_TAB);
        this.setWeight(EnumWeight.MEDIUM);
        this.setSize(EnumSize.TINY);
        metaNames = Reference.METALS_ALL;
        metalAmount = 10;
    }

    public ItemMetal setMetaNames(String[] itemNames)
    {
        metaNames = itemNames.clone();
        this.hasSubtypes = true;
        return this;
    }

    @Override
    public Metal getMetalType(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Global.BISMUTH;
            case 1: return Global.COPPER;
            case 2: return Global.GOLD;
            case 3: return Global.WROUGHTIRON;
            case 4: return Global.LEAD;
            case 5: return Global.NICKEL;
            case 6: return Global.PIGIRON;
            case 7: return Global.PLATINUM;
            case 8: return Global.SILVER;
            case 9: return Global.STEEL;
            case 10: return Global.TIN;
            case 11: return Global.ZINC;
            case 12: return Reference.ALUMINUM;
            case 13: return Reference.OSMIUM;
            case 14: return Reference.TUNGSTEN;
            case 15: return Reference.COBALT;
            case 16: return Reference.CHROMIUM;
            case 17: return Reference.TITANIUM;
            case 18: return Reference.LITHIUM;
            case 19: return Reference.MAGNESIUM;
            case 20: return Reference.MANGANESE;
            case 21: return Reference.MOLYBDENUM;
            case 22: return Reference.CADMIUM;
            case 23: return Reference.IRIDIUM;
        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is) { return metalAmount; }

    @Override
    public boolean isSmeltable(ItemStack is) { return true; }

    @Override
    public EnumTier getSmeltTier(ItemStack is) { return EnumTier.TierI; }
}
