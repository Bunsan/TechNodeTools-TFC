package com.technode.technodetoolstfc.item.itemBlock;

import com.technode.technodetoolstfc.core.reference.Reference;

import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemMetalBlock extends ItemTerraBlock implements ISmeltable
{
    private boolean smeltable = true;
    protected short metalAmount;

    public ItemMetalBlock(Block b)
    {
        super(b);
        metaNames = new String[12];
        System.arraycopy(Reference.METALS, 0, metaNames, 0, 12);
        setFolder("metal/");
        metalAmount = 800;

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
        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is) {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return metalAmount;
        }
        return 0;
    }

    @Override
    public boolean isSmeltable(ItemStack is) {
        switch (is.getItemDamage()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return smeltable;
            default:
                return false;
        }
    }

    @Override
    public ISmeltable.EnumTier getSmeltTier(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumTier.TierI;
        }
        return EnumTier.TierX;
    }
}
