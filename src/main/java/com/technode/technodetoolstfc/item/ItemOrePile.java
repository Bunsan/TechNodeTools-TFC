package com.technode.technodetoolstfc.item;

import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Items.ItemTerra;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;
import com.bioxx.tfc.api.Metal;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;


public class ItemOrePile extends ItemTerra
{
    private short Pile = (short) 1000;

    public ItemOrePile()
    {
        super();
        setMaxDamage(0);
        setHasSubtypes(true);
        metaNames = Reference.MOD_ORE_METAL_ALL;
        setFolder("ore/");
        setCreativeTab(CreativeTab.TECHNODE_TAB);
    }

    @Override
    public EnumSize getSize(ItemStack is)
    {
        return EnumSize.SMALL;
    }

    @Override
    public EnumWeight getWeight(ItemStack is)
    {
        return EnumWeight.HEAVY;
    }

    @Override
    public void registerIcons(IIconRegister registerer) {
        metaIcons = new IIcon[metaNames.length];
        for (int i = 0; i < metaNames.length; i++) {
            metaIcons[i] = registerer.registerIcon(ModDetails.ModID + ":" + textureFolder + metaNames[i] + "Pile");
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

    public Metal getMetalType(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Global.COPPER;
            case 1: return Global.GOLD;
            case 2: return Global.PLATINUM;
            case 3: return Global.WROUGHTIRON;
            case 4: return Global.SILVER;
            case 5: return Global.TIN;
            case 6: return Global.LEAD;
            case 7: return Global.BISMUTH;
            case 8: return Global.NICKEL;
            case 9: return Global.COPPER;
            case 10: return Global.WROUGHTIRON;
            case 11: return Global.WROUGHTIRON;
            case 12: return Global.ZINC;
            case 13: return Global.COPPER;
            case 14: return Reference.ALUMINUM;
            case 15: return Reference.OSMIUM;
            case 16: return Reference.TUNGSTEN;
            case 17: return Reference.TUNGSTEN;
        }
        return null;
    }

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
            case 15:
            case 16:
            case 17:    return Pile;
        }
        return 0;
    }
}
