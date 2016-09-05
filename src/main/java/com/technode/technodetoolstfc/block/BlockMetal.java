package com.technode.technodetoolstfc.block;

import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.reference.Reference;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.*;

import com.bioxx.tfc.Blocks.BlockTerra;
import com.bioxx.tfc.Items.Tools.ItemHammer;
import com.bioxx.tfc.api.Tools.IToolChisel;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BlockMetal extends BlockTerra
{
    protected String[] names;
    protected IIcon[] icons;

    public BlockMetal(Material material)
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTab.TECHNODE_TAB);
        names = new String[16];
        System.arraycopy(Reference.METALS_ALL, 0, names, 0, 16);
        icons = new IIcon[names.length];
    }

    @SideOnly(Side.CLIENT)
    @Override
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < names.length; i++)
            list.add(new ItemStack(this,1,i));
    }

    @Override
    public int damageDropped(int meta)
    {
        return meta;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta)
    {
        if(meta < 0)
            return icons[0];
        if(meta<icons.length)
            return icons[meta];
        return ModBlocks.metalBlock2.getIcon(side, meta-16);
    }

    @Override
    public void registerBlockIcons(IIconRegister registerer)
    {
        for(int i = 0; i < names.length; i++)
            icons[i] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/"+names[i]);
    }

    /**
     * Called when the block is clicked by a player. Args: x, y, z, entityPlayer
     */
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityplayer, int side, float par7, float par8, float par9)
    {
        boolean hasHammer = false;
        for(int i = 0; i < 9;i++)
            if(entityplayer.inventory.mainInventory[i] != null && entityplayer.inventory.mainInventory[i].getItem() instanceof ItemHammer)
                hasHammer = true;
        if(!world.isRemote && entityplayer.getCurrentEquippedItem() != null &&
                entityplayer.getCurrentEquippedItem().getItem() instanceof IToolChisel &&
                hasHammer && ((IToolChisel)entityplayer.getCurrentEquippedItem().getItem()).canChisel(entityplayer, x, y, z))
        {
            Block block = world.getBlock(x, y, z);
            byte meta = (byte) world.getBlockMetadata(x, y, z);

            return ((IToolChisel)entityplayer.getCurrentEquippedItem().getItem()).onUsed(world, entityplayer, x, y, z, block, meta, side, par7, par8, par9);
        }
        return false;
    }
}
