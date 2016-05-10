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
                "Bauxite", "Native Osmium", "Scheelite", "Wolframite", "PlaceHolder1", "PlaceHolder2", "PlaceHolder3",
                "PlaceHolder4", "PlaceHolder5", "PlaceHolder6", "PlaceHolder7", "PlaceHolder8", "PlaceHolder9",
                "PlaceHolder10", "PlaceHolder11", "PlaceHolder12"
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
            case 4: return null;
            case 5: return null;
            case 6: return null;
            case 7: return null;
            case 8: return null;
            case 9: return null;
            case 10: return null;
            case 11: return null;
            case 12: return null;
            case 13: return null;
            case 14: return null;
            case 15: return null;

        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is)
    {
        return Small;
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
            case 4: return ISmeltable.EnumTier.TierX;
            case 5: return ISmeltable.EnumTier.TierX;
            case 6: return ISmeltable.EnumTier.TierX;
            case 7: return ISmeltable.EnumTier.TierX;
            case 8: return ISmeltable.EnumTier.TierX;
            case 9: return ISmeltable.EnumTier.TierX;
            case 10: return ISmeltable.EnumTier.TierX;
            case 11: return ISmeltable.EnumTier.TierX;
            case 12: return ISmeltable.EnumTier.TierX;
            case 13: return ISmeltable.EnumTier.TierX;
            case 14: return ISmeltable.EnumTier.TierX;
            case 15: return ISmeltable.EnumTier.TierX;
        }
        return ISmeltable.EnumTier.TierX;
    }
}