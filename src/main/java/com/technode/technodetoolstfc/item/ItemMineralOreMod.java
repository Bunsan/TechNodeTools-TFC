package com.technode.technodetoolstfc.item;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Metal;
import com.bioxx.tfc.api.TFCOptions;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.item.ItemStack;

public class ItemMineralOreMod extends ItemOreMod
{
    public ItemMineralOreMod()
    {
        super();
        setMaxDamage(0);
        setHasSubtypes(true);
        metaNames = Reference.MOD_MINERALS;
        setFolder("ore/");
        setCreativeTab(CreativeTab.TECHNODE_TAB);
    }
    @Override
    public Metal getMetalType(ItemStack is)
    {
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is)
    {
        return 0;
    }

    @Override
    public boolean isSmeltable(ItemStack is)
    {
        return false;
    }

    @Override
    public EnumTier getSmeltTier(ItemStack is)
    {
        return EnumTier.TierX;
    }
}
