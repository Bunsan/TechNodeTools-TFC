package com.technode.technodetoolstfc.item;

import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.CreativeTab;

import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemMetalSheet2xMod extends ItemMetalSheetMod
{
    public ItemMetalSheet2xMod(int mID)
    {
        super(mID);
        setMaxDamage(0);
        this.setCreativeTab(CreativeTab.TECHNODE_TAB);
        setFolder("metal/");
        this.setWeight(EnumWeight.HEAVY);
        this.setSize(EnumSize.MEDIUM);
        metalID = mID;
        metalAmount = 400;
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        return false;
    }
}
