package com.technode.technodetoolstfc.item.itemBlock;

import com.technode.technodetoolstfc.core.reference.Reference;

import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemMetalBlock1 extends ItemMetalBlock
{
    public ItemMetalBlock1(Block b)
    {
        super(b);
        metaNames = new String[Reference.METALS_ALL.length];
        System.arraycopy(Reference.METALS_ALL, 0, metaNames, 0, 16);
        setFolder("metal/");
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
        }
        return null;
    }
}
