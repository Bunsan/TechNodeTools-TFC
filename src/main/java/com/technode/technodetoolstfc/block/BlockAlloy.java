package com.technode.technodetoolstfc.block;

import com.bioxx.tfc.Blocks.Terrain.BlockSmooth;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockAlloy extends BlockSmooth
{
    public BlockAlloy()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTab.TECHNODE_TAB);
        names = Reference.ALLOYS;
        icons = new IIcon[names.length];
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {
        for(int i = 0; i < names.length; i++)
            icons[i] = iconRegisterer.registerIcon(ModDetails.ModID + ":" + "metal/"+names[i]+" Block");
    }
}
