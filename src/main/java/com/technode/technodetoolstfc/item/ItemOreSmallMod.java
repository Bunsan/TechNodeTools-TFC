package com.technode.technodetoolstfc.item;

import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;
import com.technode.technodetoolstfc.core.ModDetails;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;
import com.bioxx.tfc.api.TFCOptions;

import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemOreSmallMod extends ItemOreMod
{
    private short Small = (short) TFCOptions.smallOreUnits;

    public ItemOreSmallMod()
    {
        super();
        this.setWeight(EnumWeight.HEAVY);
        this.setSize(EnumSize.TINY);
        metaNames = new String[]{
                "Bauxite", "Native Osmium", "Scheelite", "Wolframite"
        };
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list) {
        for (int i = 0; i < (metaNames.length); i++)
            list.add(new ItemStack(this, 1, i));
    }

    @Override
    public void registerIcons(IIconRegister registerer)
    {
        metaIcons = new IIcon[(metaNames.length)];
        for(int i = 0; i < (metaNames.length); i++)
        {
            metaIcons[i] = registerer.registerIcon(ModDetails.ModID + ":" + textureFolder + metaNames[i] + " Small Ore");
        }
    }

    @Override
    public void addExtraInformation(ItemStack is, EntityPlayer player, List<String> arraylist)
    {
        if(getMetalType(is) != null)
        {
            if (TFC_Core.showShiftInformation())
            {
                arraylist.add(TFC_Core.translate("gui.units") + ": " + getMetalReturnAmount(is));
            }
            else
            {
                arraylist.add(TFC_Core.translate("gui.ShowHelp"));
            }
        }
    }


    @Override
    public Metal getMetalType(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Reference.ALUMINUM;
            case 1: return Reference.OSMIUM;
            case 2: return Reference.TUNGSTEN;
            case 3: return Reference.TUNGSTEN;
        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Small;
            case 1: return Small;
            case 2: return Small;
            case 3: return Small;
        }
        return 0;
    }

    @Override
    public boolean isSmeltable(ItemStack is)
    { return true; }

    @Override
    public ISmeltable.EnumTier getSmeltTier(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return ISmeltable.EnumTier.TierIV;
            case 1: return ISmeltable.EnumTier.TierIII;
            case 2: return ISmeltable.EnumTier.TierIV;
            case 3: return ISmeltable.EnumTier.TierIV;
        }
        return ISmeltable.EnumTier.TierX;
    }
}