package com.technode.technodetoolstfc.item;

import com.technode.technodetoolstfc.core.reference.CreativeTab;

import com.bioxx.tfc.Items.ItemOreSmall;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;
import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;

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
        metaNames = new String[] {
            "Bismuth", "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Brass", "Bronze", "Copper", "Gold",
            "Wrought Iron", "Lead", "Nickel", "Pig Iron", "Platinum",
            "Red Steel", "Rose Gold", "Silver", "Steel", "Sterling Silver", "Tin", "Zinc"
    };
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
            case 1: return Global.BISMUTHBRONZE;
            case 2: return Global.BLACKBRONZE;
            case 3: return Global.BLACKSTEEL;
            case 4: return Global.BLUESTEEL;
            case 5: return Global.BRASS;
            case 6: return Global.BRONZE;
            case 7: return Global.COPPER;
            case 8: return Global.GOLD;
            case 9: return Global.WROUGHTIRON;
            case 10: return Global.LEAD;
            case 11: return Global.NICKEL;
            case 12: return Global.PIGIRON;
            case 13: return Global.PLATINUM;
            case 14: return Global.REDSTEEL;
            case 15: return Global.ROSEGOLD;
            case 16: return Global.SILVER;
            case 17: return Global.STEEL;
            case 18: return Global.STERLINGSILVER;
            case 19: return Global.TIN;
            case 20: return Global.ZINC;
        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is)
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
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return metalAmount;
        }
        return 0;
    }

    @Override
    public boolean isSmeltable(ItemStack is)
    {
        switch(is.getItemDamage())
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
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            default:
                return false;
        }
    }

    @Override
    public EnumTier getSmeltTier(ItemStack is)
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
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return EnumTier.TierI;
        }
        return EnumTier.TierX;
    }


}
