package com.technode.technodetoolstfc.item.itemBlock;

import com.bioxx.tfc.api.Metal;
import com.technode.technodetoolstfc.core.reference.Reference;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemMetalBlock2 extends ItemMetalBlock
{
    public ItemMetalBlock2(Block b)
    {
        super(b);
        metaNames = new String[Reference.METALS_ALL.length - 16];
        System.arraycopy(Reference.METALS_ALL, 16, metaNames, 0, Reference.METALS_ALL.length - 16);
        setFolder("metal/");
    }

    @Override
    public String getUnlocalizedName(ItemStack is)
    {
        try
        {
            int meta = is.getItemDamage();
            if(meta > 15) meta -= 16;
            if(metaNames != null && meta < metaNames.length)
                return getUnlocalizedName().concat("." + metaNames[meta]);
        }
        catch(Exception ex)
        {
            LogHelper.error(ex.getLocalizedMessage());
        }
        return "Unknown";
    }

    @Override
    public Metal getMetalType(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Reference.CHROMIUM;
            case 1: return Reference.TITANIUM;
            case 2: return Reference.LITHIUM;
            case 3: return Reference.MAGNESIUM;
            case 4: return Reference.MANGANESE;
            case 5: return Reference.MOLYBDENUM;
            case 6: return Reference.CADMIUM;
            case 7: return Reference.IRIDIUM;

        }
        return null;
    }
}
