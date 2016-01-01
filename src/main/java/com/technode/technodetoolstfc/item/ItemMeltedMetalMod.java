package com.technode.technodetoolstfc.item;

import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.CreativeTab;

import com.bioxx.tfc.Items.ItemMeltedMetal;
import com.bioxx.tfc.Reference;

import net.minecraft.client.renderer.texture.IIconRegister;

public class ItemMeltedMetalMod extends ItemMeltedMetal
{
    public ItemMeltedMetalMod()
    {
        super();
        setCreativeTab(CreativeTab.TECHNODE_TAB);
        this.setFolder("metal/");
    }

    @Override
    public void registerIcons(IIconRegister registerer)
    {
        this.itemIcon = registerer.registerIcon(ModDetails.ModID + ":" + textureFolder+this.getUnlocalizedName().replace("item.", ""));
    }
}
