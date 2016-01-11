package com.technode.technodetoolstfc.item;


import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.tileentity.TEModIngotPile;

import com.bioxx.tfc.Core.Metal.MetalRegistry;
import com.bioxx.tfc.Items.ItemIngot;
import com.bioxx.tfc.api.Enums.EnumSize;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemIngotMod extends ItemIngot
{
    private EnumSize size = EnumSize.SMALL;
    private String metal;
    private short metalAmount;
    private boolean smeltable = true;

    public ItemIngotMod()
    {
        super();
        setCreativeTab(CreativeTab.TECHNODE_TAB);
        this.setFolder("metal/");
        metalAmount = 100;
    }
    @Override
    public void registerIcons(IIconRegister registerer)
    {
        this.itemIcon = registerer.registerIcon(ModDetails.ModID + ":" + textureFolder+this.getUnlocalizedName().replace("item.", ""));
    }

    private boolean createPile(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, int l)
    {

        boolean fullStack = true;

        TEModIngotPile te = null;

        if (world.getTileEntity(x, y, z) instanceof TEModIngotPile && world.getBlock(x,y,z) == ModBlocks.ingotPileMod)
        {
            te = (TEModIngotPile)world.getTileEntity(x, y, z);
            if (te.contentsMatch(0,itemstack) && te.getStackInSlot(0).stackSize < te.getInventoryStackLimit())
            {
                fullStack = false;
                te.injectContents(0, 1);
            }
        }
        else{fullStack = true;}

        if(fullStack && isPlaceable(itemstack))
        {
            if(side == 0 && world.isAirBlock(x, y-1, z) && isValid(world, x, y-1, z))
            {
                world.setBlock( x, y-1, z, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x, y-1, z);
                }
                te = (TEModIngotPile)world.getTileEntity(x, y-1, z);
            }
            else if(side == 1 && world.isAirBlock(x, y+1, z) && isValid(world, x, y+1, z))
            {
                world.setBlock( x, y+1, z, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x, y+1, z);
                }
                te = (TEModIngotPile)world.getTileEntity(x, y+1, z);
            }
            else if(side == 2 && world.isAirBlock(x, y, z-1) && isValid(world, x, y, z-1))
            {
                world.setBlock( x, y, z-1, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x, y, z-1);
                }
                te = (TEModIngotPile)world.getTileEntity(x, y, z-1);
            }
            else if(side == 3 && world.isAirBlock(x, y, z+1) && isValid(world, x, y, z+1))
            {
                world.setBlock( x, y, z+1, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x, y, z+1);
                }
                te = (TEModIngotPile)world.getTileEntity(x, y, z+1);
            }
            else if(side == 4 && world.isAirBlock(x-1, y, z) && isValid(world, x-1, y, z))
            {
                world.setBlock( x-1, y, z, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x-1, y, z);
                }
                te = (TEModIngotPile)world.getTileEntity(x-1, y, z);
            }
            else if(side == 5 && world.isAirBlock(x+1, y, z) && isValid(world, x+1, y, z))
            {
                world.setBlock( x+1, y, z, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x+1, y, z);
                }
                te = (TEModIngotPile)world.getTileEntity(x+1, y, z);
            }
            else
            {
                return false;
            }

            if(te != null)
            {
                te.storage[0] = new ItemStack(this,1,0);
                te.setType(MetalRegistry.instance.getMetalFromItem(this).name);

                if(entityplayer.capabilities.isCreativeMode)
                {
                    te.storage[0] = new ItemStack(this,32,0);
                }
            }
        }
        return true;
    }
}
