package com.technode.technodetoolstfc.item;

import com.technode.technodetoolstfc.core.ModDetails;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;
import com.bioxx.tfc.api.TFCOptions;

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
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list) {
        for (int i = 0; i < (metaNames.length / 3); i++)
            list.add(new ItemStack(this, 1, i));
    }

    @Override
    public void registerIcons(IIconRegister registerer)
    {
        metaIcons = new IIcon[(metaNames.length / 3)];
        for(int i = 0; i < (metaNames.length / 3); i++)
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
    public short getMetalReturnAmount(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Small;
            case 1: return 15;
            case 2: return 5;
            case 3: return Small;
            case 4: return 15;
            case 5: return 5;
            case 6: return Small;
            case 7: return 15;
            case 8: return 5;
            case 9: return Small;
            case 10: return 15;
            case 11: return 5;
        }
        return 0;
    }
}
