package com.technode.technodetoolstfc.tileentity;

import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.reference.Reference;

import com.bioxx.tfc.TileEntities.TEIngotPile;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class TEModIngotPile extends TEIngotPile
{
    public TEModIngotPile ()
    {
        storage = new ItemStack[1];
        type = "Electrum";
    }

    public static Item[] getIngots()
    {
        return Reference.MOD_INGOTS.clone();
    }

    @Override
    public void updateNeighbours()
    {
        if(worldObj.blockExists(xCoord, yCoord+1, zCoord) && !worldObj.isAirBlock(xCoord, yCoord+1, zCoord))
            worldObj.getBlock(xCoord, yCoord+1, zCoord).onNeighborBlockChange(worldObj, xCoord, yCoord+1, zCoord, ModBlocks.ingotPileMod);
    }
}
