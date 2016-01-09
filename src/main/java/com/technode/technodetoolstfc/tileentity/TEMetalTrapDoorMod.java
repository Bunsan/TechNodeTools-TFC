package com.technode.technodetoolstfc.tileentity;

import com.bioxx.tfc.TileEntities.TEMetalTrapDoor;
import com.bioxx.tfc.api.TFCBlocks;
import com.technode.technodetoolstfc.core.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class TEMetalTrapDoorMod extends TEMetalTrapDoor {

    public TEMetalTrapDoorMod() {

    }

    @Override
    public void handleInitPacket(NBTTagCompound nbt) {
        data = nbt.getByte("data");
        sheetStack = new ItemStack(ModBlocks.metalTrapDoorMod, 1, nbt.getInteger("metalID"));
    }
}