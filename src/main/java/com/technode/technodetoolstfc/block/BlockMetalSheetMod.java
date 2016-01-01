package com.technode.technodetoolstfc.block;

import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.ModTextures;
import com.technode.technodetoolstfc.core.reference.Reference;

import com.bioxx.tfc.Blocks.BlockMetalSheet;
import com.bioxx.tfc.api.TFCBlocks;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;


public class BlockMetalSheetMod extends BlockMetalSheet
{
    public IIcon[] icons;
    public String[] metalNames = Reference.MOD_METALS;

    public BlockMetalSheetMod()
    {
        super();
        icons = new IIcon[metalNames.length];
        this.setBlockBounds(0, 0, 0, 1, 1, 1);
    }

    @Override
    public int getRenderType()
    {
        return TFCBlocks.metalsheetRenderId;
    }

    @Override
    public void registerBlockIcons(IIconRegister registerer)
    {
        for(int i = 0; i < icons.length; i++)
            icons[i] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/"+metalNames[i]);

        ModTextures.sheetOsmium = icons[0];
        ModTextures.sheetAluminum = icons[1];
        ModTextures.sheetTungsten = icons[2];
    }
}
