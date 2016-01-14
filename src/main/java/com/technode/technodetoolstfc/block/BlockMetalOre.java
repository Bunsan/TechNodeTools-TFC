package com.technode.technodetoolstfc.block;

import com.bioxx.tfc.api.TFCItems;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.ModItems;
import com.technode.technodetoolstfc.core.reference.Reference;
import com.technode.technodetoolstfc.core.utility.LogHelper;

import com.bioxx.tfc.Blocks.Terrain.BlockOre;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.TileEntities.TEOre;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCOptions;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.Random;

public class BlockMetalOre extends BlockOre {

    public BlockMetalOre(Material mat)
    {
        super(mat);
        blockNames = new String[Reference.MOD_ORE_METAL.length];
        System.arraycopy(Reference.MOD_ORE_METAL, 0, blockNames, 0, Reference.MOD_ORE_METAL.length);

    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
    {
        if(TFCOptions.enableDebugMode && world.isRemote)
        {
            int metadata = world.getBlockMetadata(x, y, z);
            LogHelper.info("Meta = " + (new StringBuilder()).append(getUnlocalizedName()).append(":").append(metadata).toString());
            TEOre te = (TEOre)world.getTileEntity(x, y, z);
            if(te != null)
                LogHelper.info("Ore  BaseID = " + te.baseBlockID + "| BaseMeta =" + te.baseBlockMeta);
        }
        return false;
    }

    @Override
    public int damageDropped(int dmg) { return dmg; }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) { return 1; }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
        for(int i = 0; i < blockNames.length; i++)
            icons[i] = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "ores/"+ blockNames[i] + " Ore");
    }

    @Override
    public int getRenderType()
    {
        return TFCBlocks.oreRenderId;
    }

    @Override
    public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z)
    {
        if(!world.isRemote)
        {
            boolean dropOres = false;
            boolean hasHammer = false;
            int meta = world.getBlockMetadata(x, y, z);
            ItemStack itemstack = null;
            if(player != null)
            {
                TFC_Core.addPlayerExhaustion(player, 0.001f);
                player.addStat(StatList.mineBlockStatArray[getIdFromBlock(this)], 1);
                dropOres = player.canHarvestBlock(this);
                ItemStack heldItem = player.getCurrentEquippedItem();
                if (heldItem != null)
                {
                    int[] itemIDs = OreDictionary.getOreIDs(heldItem);
                    for (int id : itemIDs)
                    {
                        String name = OreDictionary.getOreName(id);
                        if (name.startsWith("itemHammer"))
                        {
                            hasHammer = true;
                            break;
                        }
                    }
                }
            }

            if (player == null || dropOres)
            {
                    TEOre te = (TEOre) world.getTileEntity(x, y, z);
                    int ore = getOreGrade(te, meta);
                    itemstack = new ItemStack(ModItems.oreChunk, 1, damageDropped(ore));
            }
            else if (hasHammer)
                itemstack = new ItemStack(ModItems.smallOreChunk, 1, meta);

            if (itemstack != null)
                dropBlockAsItem(world, x, y, z, itemstack);
        }
        return world.setBlockToAir(x, y, z);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        TEOre te = (TEOre) world.getTileEntity(x, y, z);
        int ore = getOreGrade(te, metadata);

        int count = quantityDropped(metadata, fortune, world.rand);
        for (int i = 0; i < count; i++)
        {
            ItemStack itemstack;
            itemstack = new ItemStack(ModItems.oreChunk, 1, damageDropped(ore));

            ret.add(itemstack);
        }
        return ret;
    }
    public static Item getDroppedItemMod(int meta)
    {
       if (meta < (Reference.MOD_ORE_METAL.length + 1))
           return ModItems.smallOreChunk;
       else
           return null;
    }

    @Override
    public void onBlockExploded(World world, int x, int y, int z, Explosion exp)
    {
        if(!world.isRemote)
        {
            TEOre te = (TEOre)world.getTileEntity(x, y, z);
            Random random = new Random();
            ItemStack itemstack;
            int meta = world.getBlockMetadata(x, y, z);
            int ore = getOreGrade(te, meta);

            itemstack = new ItemStack(ModItems.oreChunk, 1, ore);

            dropBlockAsItem(world, x, y, z, itemstack);
            onBlockDestroyedByExplosion(world, x, y, z, exp);
        }
    }

    public int getOreGrade(TEOre te, int ore)
    {
        if(te != null)
        {
            int grade = te.extraData & 7;
            if(grade == 1)
                ore += 16;
            else if(grade == 2)
                ore += 32;
        }
        return ore;
    }
}

