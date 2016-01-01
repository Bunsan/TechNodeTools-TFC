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
                "Bauxite", "Rich Bauxite", "Poor Bauxite", "Native Osmium", "Rich Native Osmium", "Poor Native Osmium",
                "Scheelite", "Rich Scheelite", "Poor Scheelite", "Wolframite", "Rich Wolframite", "Poor Wolframite"};
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
            case 0: return Reference.ALUMINUM;
            case 1: return Reference.ALUMINUM;
            case 2: return Reference.ALUMINUM;
            case 3: return Reference.OSMIUM;
            case 4: return Reference.OSMIUM;
            case 5: return Reference.OSMIUM;
            case 6: return Reference.TUNGSTEN;
            case 7: return Reference.TUNGSTEN;
            case 8: return Reference.TUNGSTEN;
            case 9: return Reference.TUNGSTEN;
            case 10: return Reference.TUNGSTEN;
            case 11: return Reference.TUNGSTEN;
        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Normal;
            case 1: return Rich;
            case 2: return Poor;
            case 3: return Normal;
            case 4: return Rich;
            case 5: return Poor;
            case 6: return Normal;
            case 7: return Rich;
            case 8: return Poor;
            case 9: return Normal;
            case 10: return Rich;
            case 11: return Poor;
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
                return true;
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
            case 0: return ISmeltable.EnumTier.TierIV;
            case 1: return ISmeltable.EnumTier.TierIV;
            case 2: return ISmeltable.EnumTier.TierIV;
            case 3: return ISmeltable.EnumTier.TierIII;
            case 4: return ISmeltable.EnumTier.TierIII;
            case 5: return ISmeltable.EnumTier.TierIII;
            case 6: return ISmeltable.EnumTier.TierIV;
            case 7: return ISmeltable.EnumTier.TierIV;
            case 8: return ISmeltable.EnumTier.TierIV;
            case 9: return ISmeltable.EnumTier.TierIV;
            case 10: return ISmeltable.EnumTier.TierIV;
            case 11: return ISmeltable.EnumTier.TierIV;
        }
        return ISmeltable.EnumTier.TierX;
    }

}

