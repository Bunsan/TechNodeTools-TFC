package com.technode.technodetoolstfc.tileentity;

import com.bioxx.tfc.Core.Metal.*;
import com.bioxx.tfc.Core.TFC_Climate;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Items.ItemMeltedMetal;
import com.bioxx.tfc.TileEntities.NetworkTileEntity;
import com.bioxx.tfc.TileEntities.TEForge;
import com.bioxx.tfc.api.*;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.technode.technodetoolstfc.item.ItemOreMod;
import com.technode.technodetoolstfc.item.ItemOreSmallMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import java.util.*;

public class TEOrePiler extends NetworkTileEntity implements IInventory
{
    public Map<String, MetalPair> metals = new HashMap<String, MetalPair>();
    public String currentMetal;
    public int temperature;
    public ItemStack[] storage;
    public byte inputTick;
    public byte outputTick;
    public byte tempTick;
    private int cookDelay;
    public static final int MAX_UNITS = 3000;

    public TEOrePiler()
    {
        storage = new ItemStack[2];
        this.broadcastRange = 5;
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);

        NBTTagList nbttaglist = new NBTTagList();
        Iterator<MetalPair> iter = metals.values().iterator();
        while(iter.hasNext())
        {
            MetalPair m = iter.next();
            if(m != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                //nbttagcompound1.setInteger("ID", Item.getIdFromItem(m.type.ingot));
                nbttagcompound1.setFloat("AmountF", m.amount);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbt.setTag("Units", nbttaglist);

        nbttaglist = new NBTTagList();
        for(int i = 0; i < storage.length; i++)
        {
            if(storage[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                storage[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbt.setTag("Items", nbttaglist);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        readFromItemNBT(nbt);
    }

    public void readFromItemNBT(NBTTagCompound nbt)
    {
        NBTTagList nbttaglist = nbt.getTagList("Metals", 10);

        for(int i = 0; i < nbttaglist.tagCount(); i++)
        {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int id = nbttagcompound1.getInteger("ID");
            float amount = nbttagcompound1.getShort("Amount");
            //Added so that hopefully old worlds that stored metal as shorts wont break
            float amountF = amount + nbttagcompound1.getFloat("AmountF");
            addMetal(MetalRegistry.instance.getMetalFromItem(Item.getItemById(id)), amountF);
        }

        nbttaglist = nbt.getTagList("Items", 10);
        storage = new ItemStack[getSizeInventory()];
        for(int i = 0; i < nbttaglist.tagCount(); i++)
        {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte byte0 = nbttagcompound1.getByte("Slot");
            if(byte0 >= 0 && byte0 < storage.length)
                storage[byte0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
        }
    }

    @Override
    public void updateEntity()
    {
        if(!worldObj.isRemote)
        {
            inputTick++;
            outputTick++;

            if (cookDelay > 0)
                cookDelay--;

            ItemStack stackToPile = storage[0];
            if(stackToPile != null)
            {
                Item itemToPile = stackToPile.getItem();

                if((itemToPile instanceof ISmeltable) && (itemToPile instanceof ItemOreMod || itemToPile instanceof ItemOreSmallMod) && (
                        (ISmeltable)itemToPile).isSmeltable(stackToPile))
                {
                    Metal mType =((ISmeltable)itemToPile).getMetalType(stackToPile);
                    if(addMetal(mType, ((ISmeltable)itemToPile).getMetalReturnAmount(stackToPile)))
                    {
                        cookDelay = 40;
                        if(stackToPile.stackSize <= 1)
                            storage[0] = null;
                        else
                            storage[0].stackSize--;
                        updateGui((byte) 0);
                    }
                }
            }
            //Metal Output handling
            if(currentMetal != null &&
                    storage[1] != null && (getTotalMetal() > 100))
            {
                if(storage[1] != null && storage[1].getItem() != Item.getItemById()
                {
                    storage[1] = new ItemStack(currentMetal.outputType.ingot, 1, 99);
                    TFC_ItemHeat.setTemp(storage[1], temperature);
                    //currentAlloy.outputAmount--;
                    drainOutput(1.0f);
                    updateGui((byte) 1);
                }
                if (storage[1] == null)
                {
                    storage[1] =
                }
            }

            if(currentAlloy != null && this.getTotalMetal() < 1)
            {
                metals = new HashMap<String, MetalPair>();
                updateCurrentAlloy();
                this.updateGui((byte) 2);
                currentAlloy = null;
            }

            if(storage[1] != null && storage[1].stackSize <= 0)
                storage[1].stackSize = 1;
            if (inputTick > 10)
                inputTick = 0;
            if (outputTick >= 2)
                outputTick = 0;
        }
    }

    public boolean drainOutput(float amount)
    {
        if(metals != null && metals.values().size() > 0)
        {
            for(Object am : metals.values())
            {
                ((MetalPair)am).amount -= amount;
            }
        }
        return true;
    }

    public boolean addMetal(Metal m, float amt)
    {
        if (getTotalMetal() + amt <= MAX_UNITS && m.name != null)
        {
            if(metals.containsKey(m.name))
                metals.get(m.name).amount += amt;
         //   else
     //           metals.put(m.name, new MetalPair(m, amt));

            updateCurrentMetal(m);
            return true;
        }
        return false;
    }

    public float getTotalMetal()
    {
        Iterator<MetalPair> iter = metals.values().iterator();
        float totalAmount = 0;
        while(iter.hasNext())
        {
            MetalPair m = iter.next();
            if(m != null)
                totalAmount += m.amount;
        }
        return totalAmount;
    }

    private void updateCurrentMetal(Metal m)
    {
        if(metals != null && metals.values().size() > 0)
        {
            currentMetal = m.name;
        }
    }

    @Override
    public int getSizeInventory()
    {
        return 2;
    }

    @Override
    public ItemStack getStackInSlot(int i)
    {
        return storage[i];
    }

    @Override
    public ItemStack decrStackSize(int i, int j)
    {
        if(storage[i] != null)
        {
            if(storage[i].stackSize <= j)
            {
                ItemStack itemstack = storage[i];
                storage[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = storage[i].splitStack(j);
            if(storage[i].stackSize == 0)
                storage[i] = null;
            return itemstack1;
        }
        else
        {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i)
    {
        return storage[i];
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack)
    {
        storage[i] = itemstack;
    }

    @Override
    public String getInventoryName()
    {
        return "Crucible";
    }

    @Override
    public boolean hasCustomInventoryName()
    {
        return false;
    }

    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityplayer)
    {
        return true;
    }

    @Override
    public void openInventory()
    {
    }

    @Override
    public void closeInventory()
    {
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack)
    {
        return true;
    }

    public int getOutCountScaled(int length)
    {
        if(currentAlloy != null)
            return ((int) this.currentAlloy.outputAmount * length) / MAX_UNITS;
        else
            return 0;
    }

    public int getTemperatureScaled(int s)
    {
        return (temperature * s) / 2500;
    }

    public void updateGui(byte action)
    {
        if(!worldObj.isRemote)
        {
            NBTTagCompound nbt = new NBTTagCompound();
            nbt.setByte("action", action);
            if (currentAlloy != null) {
                if (action == 0) {
                    currentAlloy.toNBT(nbt);
                }
                else if (action == 1 && currentAlloy != null) {
                    nbt.setFloat("outputAmount", currentAlloy.outputAmount);
                }
            }
            this.broadcastPacketInRange(this.createDataPacket(nbt));
        }
    }

    @Override
    public void handleInitPacket(NBTTagCompound nbt)
    {
    }

    @Override
    public void handleDataPacket(NBTTagCompound nbt) {
        byte action = nbt.getByte("action");
        if(action == 0)
            this.currentAlloy = new Alloy().fromNBT(nbt);
        else if(action == 1 && currentAlloy != null)
        {
            currentAlloy.outputAmount = nbt.getFloat("outputAmount");
        }
        else if(action == 2)
            currentAlloy = null;

    }

    @Override
    public void createInitNBT(NBTTagCompound nbt)
    {

    }

}
