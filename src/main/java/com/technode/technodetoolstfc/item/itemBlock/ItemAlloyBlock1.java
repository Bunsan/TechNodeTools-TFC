package com.technode.technodetoolstfc.item.itemBlock;

import com.technode.technodetoolstfc.core.reference.Reference;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Metal;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemAlloyBlock1 extends ItemAlloyBlock
{
    public ItemAlloyBlock1(Block b)
    {
        super(b);
        metaNames = new String [Reference.ALLOYS_USABLE.length];
        System.arraycopy(Reference.ALLOYS_USABLE, 0, metaNames, 0, Reference.ALLOYS_USABLE.length);
        setFolder("metal/");
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
            case 6: return Global.REDSTEEL;
            case 7: return Global.ROSEGOLD;
            case 8: return Global.STERLINGSILVER;
            case 9: return Reference.ELECTRUM;
            case 10: return Reference.CUPRONICKEL;
            case 11: return Reference.INVAR;
            case 12: return Reference.ALUMINUMBRASS;
            case 13: return Reference.ALUMITE;
            case 14: return Reference.MANYULLYN;
            case 15: return Reference.STAINLESSSTEEL;

        }
        return null;
    }
}
