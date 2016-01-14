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
                "Bauxite", "Native Osmium", "Scheelite", "Wolframite",
                "Placeholder1", "Placeholder2", "Placeholder3", "Placeholder4", "Placeholder5", "Placeholder6",
                "Placeholder7", "Placeholder8", "Placeholder9", "Placeholder10", "Placeholder11", "Placeholder12",

                "Rich Bauxite", "Rich Native Osmium", "Rich Scheelite", "Rich Wolframite",
                "Rich Placeholder1", "Rich Placeholder2", "Rich Placeholder3", "Rich Placeholder4", "Rich Placeholder5",
                "Rich Placeholder6", "Rich Placeholder7", "Rich Placeholder8", "Rich Placeholder9", "Rich Placeholder10",
                "Rich Placeholder11", "Rich Placeholder12",

                "Poor Bauxite", "Poor Native Osmium", "Poor Scheelite", "Poor Wolframite",
                "Poor Placeholder1", "Poor Placeholder2", "Poor Placeholder3", "Poor Placeholder4", "Poor Placeholder5",
                "Poor Placeholder6", "Poor Placeholder7", "Poor Placeholder8", "Poor Placeholder9", "Poor Placeholder10",
                "Poor Placeholder11", "Poor Placeholder12"
        };
        setFolder("ores/");
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
            case 0: return Reference.ALUMINUM;
            case 1: return Reference.OSMIUM;
            case 2: return Reference.TUNGSTEN;
            case 3: return Reference.TUNGSTEN;
            case 4: return Reference.NULL;
            case 5: return Reference.NULL;
            case 6: return Reference.NULL;
            case 7: return Reference.NULL;
            case 8: return Reference.NULL;
            case 9: return Reference.NULL;
            case 10: return Reference.NULL;
            case 11: return Reference.NULL;
            case 12: return Reference.NULL;
            case 13: return Reference.NULL;
            case 14: return Reference.NULL;
            case 15: return Reference.NULL;
            case 16: return Reference.ALUMINUM;
            case 17: return Reference.OSMIUM;
            case 18: return Reference.TUNGSTEN;
            case 19: return Reference.TUNGSTEN;
            case 20: return Reference.NULL;
            case 21: return Reference.NULL;
            case 22: return Reference.NULL;
            case 23: return Reference.NULL;
            case 24: return Reference.NULL;
            case 25: return Reference.NULL;
            case 26: return Reference.NULL;
            case 27: return Reference.NULL;
            case 28: return Reference.NULL;
            case 29: return Reference.NULL;
            case 30: return Reference.NULL;
            case 31: return Reference.NULL;
            case 32: return Reference.ALUMINUM;
            case 33: return Reference.OSMIUM;
            case 34: return Reference.TUNGSTEN;
            case 35: return Reference.TUNGSTEN;
            case 36: return Reference.NULL;
            case 37: return Reference.NULL;
            case 38: return Reference.NULL;
            case 39: return Reference.NULL;
            case 40: return Reference.NULL;
            case 41: return Reference.NULL;
            case 42: return Reference.NULL;
            case 43: return Reference.NULL;
            case 44: return Reference.NULL;
            case 45: return Reference.NULL;
            case 46: return Reference.NULL;
            case 47: return Reference.NULL;

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
            case 4:     return ISmeltable.EnumTier.TierI;
            case 5:     return ISmeltable.EnumTier.TierI;
            case 6:     return ISmeltable.EnumTier.TierI;
            case 7:     return ISmeltable.EnumTier.TierI;
            case 8:     return ISmeltable.EnumTier.TierI;
            case 9:     return ISmeltable.EnumTier.TierI;
            case 10:    return ISmeltable.EnumTier.TierI;
            case 11:    return ISmeltable.EnumTier.TierI;
            case 12:    return ISmeltable.EnumTier.TierI;
            case 13:    return ISmeltable.EnumTier.TierI;
            case 14:    return ISmeltable.EnumTier.TierI;
            case 15:    return ISmeltable.EnumTier.TierI;
            case 16:    return ISmeltable.EnumTier.TierIV;
            case 17:    return ISmeltable.EnumTier.TierIII;
            case 18:    return ISmeltable.EnumTier.TierIV;
            case 19:    return ISmeltable.EnumTier.TierIV;
            case 20:    return ISmeltable.EnumTier.TierI;
            case 21:    return ISmeltable.EnumTier.TierI;
            case 22:    return ISmeltable.EnumTier.TierI;
            case 23:    return ISmeltable.EnumTier.TierI;
            case 24:    return ISmeltable.EnumTier.TierI;
            case 25:    return ISmeltable.EnumTier.TierI;
            case 26:    return ISmeltable.EnumTier.TierI;
            case 27:    return ISmeltable.EnumTier.TierI;
            case 28:    return ISmeltable.EnumTier.TierI;
            case 29:    return ISmeltable.EnumTier.TierI;
            case 30:    return ISmeltable.EnumTier.TierI;
            case 31:    return ISmeltable.EnumTier.TierI;
            case 32:    return ISmeltable.EnumTier.TierIV;
            case 33:    return ISmeltable.EnumTier.TierIII;
            case 34:    return ISmeltable.EnumTier.TierIV;
            case 35:    return ISmeltable.EnumTier.TierIV;
            case 36:    return ISmeltable.EnumTier.TierI;
            case 37:    return ISmeltable.EnumTier.TierI;
            case 38:    return ISmeltable.EnumTier.TierI;
            case 39:    return ISmeltable.EnumTier.TierI;
            case 40:    return ISmeltable.EnumTier.TierI;
            case 41:    return ISmeltable.EnumTier.TierI;
            case 42:    return ISmeltable.EnumTier.TierI;
            case 43:    return ISmeltable.EnumTier.TierI;
            case 44:    return ISmeltable.EnumTier.TierI;
            case 45:    return ISmeltable.EnumTier.TierI;
            case 46:    return ISmeltable.EnumTier.TierI;
            case 47:    return ISmeltable.EnumTier.TierI;
        }
        return ISmeltable.EnumTier.TierX;
    }

}

