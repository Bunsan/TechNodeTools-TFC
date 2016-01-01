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
    public void registerIcons(IIconRegister registerer)
    {
        if(this.metaNames == null)
        {
            if(this.iconString != null)
                this.itemIcon = registerer.registerIcon(ModDetails.ModID + ":" + this.textureFolder + this.getIconString());
            else
                this.itemIcon = registerer.registerIcon(ModDetails.ModID + ":" + this.textureFolder + this.getUnlocalizedName().replace("item.", ""));
        }
        else
        {
            metaIcons = new IIcon[metaNames.length];
            for(int i = 0; i < metaNames.length; i++)
            {
                metaIcons[i] = registerer.registerIcon(ModDetails.ModID + ":" + this.textureFolder + metaNames[i]);
            }

            //This will prevent NullPointerException errors with other mods like NEI
            this.itemIcon = metaIcons[0];
        }
    }

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        return false;
    }
}
