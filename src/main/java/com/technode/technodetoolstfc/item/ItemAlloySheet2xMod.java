package com.technode.technodetoolstfc.item;

import com.bioxx.tfc.api.Enums.EnumSize;
import com.bioxx.tfc.api.Enums.EnumWeight;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAlloySheet2xMod extends ItemAlloySheetMod
{
    public ItemAlloySheet2xMod(int mID)
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

