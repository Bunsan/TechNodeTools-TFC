package com.technode.technodetoolstfc.item;

import com.bioxx.tfc.Items.ItemOreSmall;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;
import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.item.ItemStack;

public class ItemAlloy extends ItemOreSmall implements ISmeltable
{
    private short metalAmount;

    public ItemAlloy()
    {
        super();
        setFolder("metal/");
        setCreativeTab(CreativeTab.TECHNODE_TAB);
        this.setWeight(EnumWeight.MEDIUM);
        this.setSize(EnumSize.TINY);
        metaNames = Reference.ALLOYS_ALL;
        metalAmount = 10;
    }

    public ItemAlloy setMetaNames(String[] itemNames)
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
            case 0: return Global.BISMUTHBRONZE;
            case 1: return Global.BLACKBRONZE;
            case 2: return Global.BLACKSTEEL;
            case 3: return Global.BLUESTEEL;
            case 4: return Global.BRASS;
            case 5: return Global.BRONZE;
            case 6: return Global.HCBLACKSTEEL;
            case 7: return Global.HCBLUESTEEL;
            case 8: return Global.HCREDSTEEL;
            case 9: return Global.REDSTEEL;
            case 10: return Global.ROSEGOLD;
            case 11: return Global.STERLINGSILVER;
            case 12: return Global.WEAKSTEEL;
            case 13: return Global.WEAKBLUESTEEL;
            case 14: return Global.WEAKREDSTEEL;
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
