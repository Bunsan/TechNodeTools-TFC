package com.technode.technodetoolstfc.tileentity;

import com.technode.technodetoolstfc.core.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TEAlloyTrapDoorMod extends TEMetalTrapDoorMod
{
    public TEAlloyTrapDoorMod()
    {

    }

    @Override
    public void handleInitPacket(NBTTagCompound nbt) {
        data = nbt.getByte("data");
        sheetStack = new ItemStack(ModBlocks.alloyTrapDoorMod, 1, nbt.getInteger("metalID"));
    }
}
