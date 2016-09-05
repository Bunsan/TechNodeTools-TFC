package com.technode.technodetoolstfc.item;

import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.core.reference.Reference;

import com.bioxx.tfc.Core.TFCTabs;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Items.ItemOre;
import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;
import com.bioxx.tfc.api.TFCOptions;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemOreMod extends ItemOre
{
    private short Normal = (short) TFCOptions.normalOreUnits;
    private short Rich = (short) TFCOptions.richOreUnits;
    private short Poor = (short) TFCOptions.poorOreUnits;

    public ItemOreMod()
    {
        super();
        setMaxDamage(0);
        setHasSubtypes(true);
        metaNames = new String[]{
                "Bauxite", "Native Osmium", "Scheelite", "Wolframite", "Cobaltite", "Chromite", "Titanite", "Lepidolite",
                "Magnesite", "Pyrolusite", "Molybdenite", "Greenockite", "Native Iridium",
                "Placeholder1", "Placeholder2", "Placeholder3",

                "Rich Bauxite", "Rich Native Osmium", "Rich Scheelite", "Rich Wolframite", "Rich Cobaltite",
                "Rich Chromite", "Rich Titanite", "Rich Lepidolite", "Rich Magnesite", "Rich Pyrolusite",
                "Rich Molybdenite", "Rich Greenockite", "Rich Native Iridium",
                "Rich Placeholder1", "Rich Placeholder2", "Rich Placeholder3",

                "Poor Bauxite", "Poor Native Osmium", "Poor Scheelite", "Poor Wolframite", "Poor Cobaltite",
                "Poor Chromite", "Poor Titanite", "Poor Lepidolite", "Poor Magnesite", "Poor Pyrolusite",
                "Poor Molybdenite", "Poor Greenockite", "Poor Native Iridium",
                "Poor Placeholder1", "Poor Placeholder2", "Poor Placeholder3"
        };
        setFolder("ore/");
        setCreativeTab(CreativeTab.TECHNODE_TAB);
    }

    @Override
    public void registerIcons(IIconRegister registerer)
    {
        metaIcons = new IIcon[metaNames.length];
        for(int i = 0; i < metaNames.length; i++)
        {
            metaIcons[i] = registerer.registerIcon(ModDetails.ModID + ":" + textureFolder + metaNames[i] + " Ore");
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
            case 0:     return Reference.ALUMINUM;
            case 1:     return Reference.OSMIUM;
            case 2:     return Reference.TUNGSTEN;
            case 3:     return Reference.TUNGSTEN;
            case 4:     return Reference.COBALT;
            case 5:     return Reference.CHROMIUM;
            case 6:     return Reference.TITANIUM;
            case 7:     return Reference.LITHIUM;
            case 8:     return Reference.MAGNESIUM;
            case 9:     return Reference.MANGANESE;
            case 10:    return Reference.MOLYBDENUM;
            case 11:    return Reference.CADMIUM;
            case 12:    return Reference.IRIDIUM;
            case 13:    return Reference.NULL;
            case 14:    return Reference.NULL;
            case 15:    return Reference.NULL;
            case 16:    return Reference.ALUMINUM;
            case 17:    return Reference.OSMIUM;
            case 18:    return Reference.TUNGSTEN;
            case 19:    return Reference.TUNGSTEN;
            case 20:    return Reference.COBALT;
            case 21:    return Reference.CHROMIUM;
            case 22:    return Reference.TITANIUM;
            case 23:    return Reference.LITHIUM;
            case 24:    return Reference.MAGNESIUM;
            case 25:    return Reference.MANGANESE;
            case 26:    return Reference.MOLYBDENUM;
            case 27:    return Reference.CADMIUM;
            case 28:    return Reference.IRIDIUM;
            case 29:    return Reference.NULL;
            case 30:    return Reference.NULL;
            case 31:    return Reference.NULL;
            case 32:    return Reference.ALUMINUM;
            case 33:    return Reference.OSMIUM;
            case 34:    return Reference.TUNGSTEN;
            case 35:    return Reference.TUNGSTEN;
            case 36:    return Reference.COBALT;
            case 37:    return Reference.CHROMIUM;
            case 38:    return Reference.TITANIUM;
            case 39:    return Reference.LITHIUM;
            case 40:    return Reference.MAGNESIUM;
            case 41:    return Reference.MANGANESE;
            case 42:    return Reference.MOLYBDENUM;
            case 43:    return Reference.CADMIUM;
            case 44:    return Reference.IRIDIUM;
            case 45:    return Reference.NULL;
            case 46:    return Reference.NULL;
            case 47:    return Reference.NULL;

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
            case 15:    return Normal;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:    return Rich;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:    return Poor;
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
            case 0:     return ISmeltable.EnumTier.TierIV;
            case 1:     return ISmeltable.EnumTier.TierIII;
            case 2:     return ISmeltable.EnumTier.TierIV;
            case 3:     return ISmeltable.EnumTier.TierIV;
            case 4:     return ISmeltable.EnumTier.TierIII;
            case 5:     return ISmeltable.EnumTier.TierIV;
            case 6:     return ISmeltable.EnumTier.TierIV;
            case 7:     return ISmeltable.EnumTier.TierIII;
            case 8:     return ISmeltable.EnumTier.TierIII;
            case 9:     return ISmeltable.EnumTier.TierIII;
            case 10:    return ISmeltable.EnumTier.TierIV;
            case 11:    return ISmeltable.EnumTier.TierIV;
            case 12:    return ISmeltable.EnumTier.TierIV;
            case 13:    return ISmeltable.EnumTier.TierX;
            case 14:    return ISmeltable.EnumTier.TierX;
            case 15:    return ISmeltable.EnumTier.TierX;
            case 16:    return ISmeltable.EnumTier.TierIV;
            case 17:    return ISmeltable.EnumTier.TierIII;
            case 18:    return ISmeltable.EnumTier.TierIV;
            case 19:    return ISmeltable.EnumTier.TierIV;
            case 20:    return ISmeltable.EnumTier.TierIII;
            case 21:    return ISmeltable.EnumTier.TierIV;
            case 22:    return ISmeltable.EnumTier.TierIV;
            case 23:    return ISmeltable.EnumTier.TierIII;
            case 24:    return ISmeltable.EnumTier.TierIII;
            case 25:    return ISmeltable.EnumTier.TierIII;
            case 26:    return ISmeltable.EnumTier.TierIV;
            case 27:    return ISmeltable.EnumTier.TierIV;
            case 28:    return ISmeltable.EnumTier.TierIV;
            case 29:    return ISmeltable.EnumTier.TierX;
            case 30:    return ISmeltable.EnumTier.TierX;
            case 31:    return ISmeltable.EnumTier.TierX;
            case 32:    return ISmeltable.EnumTier.TierIV;
            case 33:    return ISmeltable.EnumTier.TierIII;
            case 34:    return ISmeltable.EnumTier.TierIV;
            case 35:    return ISmeltable.EnumTier.TierIV;
            case 36:    return ISmeltable.EnumTier.TierIII;
            case 37:    return ISmeltable.EnumTier.TierIV;
            case 38:    return ISmeltable.EnumTier.TierIV;
            case 39:    return ISmeltable.EnumTier.TierIII;
            case 40:    return ISmeltable.EnumTier.TierIII;
            case 41:    return ISmeltable.EnumTier.TierIII;
            case 42:    return ISmeltable.EnumTier.TierIV;
            case 43:    return ISmeltable.EnumTier.TierIV;
            case 44:    return ISmeltable.EnumTier.TierIV;
            case 45:    return ISmeltable.EnumTier.TierX;
            case 46:    return ISmeltable.EnumTier.TierX;
            case 47:    return ISmeltable.EnumTier.TierX;
        }
        return ISmeltable.EnumTier.TierX;
    }

}

