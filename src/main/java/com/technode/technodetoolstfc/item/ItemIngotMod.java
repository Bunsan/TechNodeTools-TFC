package com.technode.technodetoolstfc.item;


import com.bioxx.tfc.api.TFCBlocks;
import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.tileentity.TEIngotPileMod;

import com.bioxx.tfc.Core.Metal.MetalRegistry;
import com.bioxx.tfc.Items.ItemIngot;
import com.bioxx.tfc.api.Enums.EnumSize;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

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

    /*
    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses()
    {
        return true;
    }

    @Override
    public EnumSize getSize(ItemStack is)
    {
        return size;
    }

    @Override
    public EnumWeight getWeight(ItemStack is)
    {
        return EnumWeight.MEDIUM;
    }

    @Override
    public ItemIngotMod setSize(EnumSize s)
    {
        size = s;
        return this;
    }
    */
    private boolean createPile(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, int l)
    {

        boolean fullStack = true;

        TEIngotPileMod te = null;

        if (world.getTileEntity(x, y, z) instanceof TEIngotPileMod && world.getBlock(x,y,z) == ModBlocks.ingotPileMod)
        {
            te = (TEIngotPileMod)world.getTileEntity(x, y, z);
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
                te = (TEIngotPileMod)world.getTileEntity(x, y-1, z);
            }
            else if(side == 1 && world.isAirBlock(x, y+1, z) && isValid(world, x, y+1, z))
            {
                world.setBlock( x, y+1, z, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x, y+1, z);
                }
                te = (TEIngotPileMod)world.getTileEntity(x, y+1, z);
            }
            else if(side == 2 && world.isAirBlock(x, y, z-1) && isValid(world, x, y, z-1))
            {
                world.setBlock( x, y, z-1, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x, y, z-1);
                }
                te = (TEIngotPileMod)world.getTileEntity(x, y, z-1);
            }
            else if(side == 3 && world.isAirBlock(x, y, z+1) && isValid(world, x, y, z+1))
            {
                world.setBlock( x, y, z+1, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x, y, z+1);
                }
                te = (TEIngotPileMod)world.getTileEntity(x, y, z+1);
            }
            else if(side == 4 && world.isAirBlock(x-1, y, z) && isValid(world, x-1, y, z))
            {
                world.setBlock( x-1, y, z, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x-1, y, z);
                }
                te = (TEIngotPileMod)world.getTileEntity(x-1, y, z);
            }
            else if(side == 5 && world.isAirBlock(x+1, y, z) && isValid(world, x+1, y, z))
            {
                world.setBlock( x+1, y, z, ModBlocks.ingotPileMod, l, 0x2);
                if(world.isRemote) {
                    world.markBlockForUpdate(x+1, y, z);
                }
                te = (TEIngotPileMod)world.getTileEntity(x+1, y, z);
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

    @Override
    public boolean onItemUse(ItemStack itemstack, EntityPlayer entityplayer, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        NBTTagCompound stackTagCompound = itemstack.getTagCompound();

        if (entityplayer.isSneaking() &&stackTagCompound == null && itemstack.getItem().getUnlocalizedName().indexOf("Double") == -1 &&
                this.isPlaceable(itemstack))
        {
            int dir = MathHelper.floor_double(entityplayer.rotationYaw * 4F / 360F + 0.5D) & 3;
            if (!world.isRemote && entityplayer.isSneaking() && (world.getBlock(x, y, z) != TFCBlocks.ingotPile || world.getBlock(x, y, z) != ModBlocks.ingotPileMod || side != 1 && side != 0))
            {

                if(createPile(itemstack, entityplayer, world, x, y, z, side, dir))
                {

                    itemstack.stackSize = itemstack.stackSize-1;
                    world.addBlockEvent(x,y,z,ModBlocks.ingotPileMod,0,0);
                    return true;

                }
            }
            else if(world.getBlock(x, y, z) == ModBlocks.ingotPileMod)
            {
                TEIngotPileMod te = (TEIngotPileMod)world.getTileEntity(x, y, z);
                if(te != null)
                {
                    te.getBlockType().onBlockActivated(world, x, y, z, entityplayer, side, hitX, hitY, hitZ);
                    if(te.storage[0] != null && te.contentsMatch(0,itemstack) && te.storage[0].stackSize < 64)
                    {
                        te.injectContents(0,1);
                        te.validate();
                    }
                    else if(te.storage[0] != null && !te.contentsMatch(0,itemstack) && te.storage[0].stackSize < 64)
                    {
                        return false;
                    }
                    else if(te.storage[0] == null)
                    {
                        te.addContents(0, new ItemStack(this,1));
                    }
                    else
                    {
                        if(createPile(itemstack, entityplayer, world, x, y, z, side, dir))
                        {
                            itemstack.stackSize = itemstack.stackSize-1;
                            world.addBlockEvent(x,y,z,ModBlocks.ingotPileMod,0,0);
                            te.getBlockType().onBlockActivated(world, x, y, z, entityplayer, side, hitX, hitY, hitZ);
                        }
                        return true;

                    }
                    itemstack.stackSize = itemstack.stackSize-1;
                    world.addBlockEvent(x,y,z,ModBlocks.ingotPileMod,0,0);
                    return true;
                }

            }
            else
            {
                int m = itemstack.getItemDamage();
                if(side == 1)
                {
                    if (m>=16){
                        world.setBlock(x, y+1, z, ModBlocks.ingotPileMod, m, 0x2);
                        itemstack.stackSize = itemstack.stackSize-1;
                    }
                    else{
                        world.setBlock(x, y+1, z, ModBlocks.ingotPileMod, m, 0x2);
                        itemstack.stackSize = itemstack.stackSize-1;
                    }
                }
                else if(side == 0 && world.isAirBlock(x, y-1, z))
                {
                    if(m >=16){
                        world.setBlock(x, y-1, z, ModBlocks.ingotPileMod, m, 0x2);
                        itemstack.stackSize = itemstack.stackSize-1;
                    }
                    else{
                        world.setBlock(x, y-1, z, ModBlocks.ingotPileMod, m, 0x2);
                        itemstack.stackSize = itemstack.stackSize-1;
                    }
                }
                else if(side == 2 && world.isAirBlock(x, y, z-1))
                {
                    setSide(world, itemstack, m, dir, x, y, z, 0, 0, -1);
                }
                else if(side == 3 && world.isAirBlock(x, y, z+1))
                {
                    setSide(world, itemstack, m, dir, x, y, z, 0, 0, 1);
                }
                else if(side == 4 && world.isAirBlock(x-1, y, z))
                {
                    setSide(world, itemstack, m, dir, x, y, z, -1, 0, 0);
                }
                else if(side == 5 && world.isAirBlock(x+1, y, z))
                {
                    setSide(world, itemstack, m, dir, x, y, z, 1, 0, 0);
                }
                world.addBlockEvent(x,y,z,ModBlocks.ingotPileMod,0,0);
                return true;
            }

        }
        return false;
    }

    public boolean isValid(World world, int i, int j, int k)
    {
        if(world.isSideSolid(i, j-1, k, ForgeDirection.UP) || world.getBlock(i, j-1, k)==ModBlocks.ingotPileMod)
        {
            TileEntity te = world.getTileEntity(i, j-1, k);

            if (te instanceof TEIngotPileMod)
            {
                TEIngotPileMod ip = (TEIngotPileMod)te;

                if (ip.storage[0] == null || ip.storage[0].stackSize < 64)
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void setSide(World world, ItemStack itemstack, int m, int dir, int x, int y, int z, int i, int j, int k)
    {
        if(m < 8)
        {
            if(dir == 0 || dir == 2) {
                world.setBlock(x+i, y+j, z+k, ModBlocks.ingotPileMod, m, 0x2);
            } else {
                world.setBlock(x+i, y+j, z+k, ModBlocks.ingotPileMod, m | 8, 0x2);
            }
            itemstack.stackSize = itemstack.stackSize-1;
        }
        else if(m >= 16)
        {
            if(dir == 0 || dir == 2) {
                world.setBlock(x+i, y+j, z+k, ModBlocks.ingotPileMod, m-8, 0x2);
            } else {
                world.setBlock(x+i, y+j, z+k, ModBlocks.ingotPileMod, m-8 | 8, 0x2);
            }
            itemstack.stackSize = itemstack.stackSize-1;
        }

    }
}

