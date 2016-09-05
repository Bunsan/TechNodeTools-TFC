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
    //public IIcon[] icons;
    public String[]  metalNames = Reference.MOD_METALS;

    public BlockMetalSheetMod()
    {
        super();

        icons = new IIcon[metalNames.length];
        this.setBlockBounds(0, 0, 0, 1, 1, 1);
    }

    @Override
    public void registerBlockIcons(IIconRegister registerer)
    {
        for(int i = 0; i < icons.length; i++)
            icons[i] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/"+metalNames[i]);

        ModTextures.sheetAluminum = icons[0];
        ModTextures.sheetOsmium = icons[1];
        ModTextures.sheetTungsten = icons[2];
        ModTextures.sheetCobalt = icons[3];
        ModTextures.sheetChromium = icons[4];
        ModTextures.sheetTitanium = icons[5];
        ModTextures.sheetLithium = icons[6];
        ModTextures.sheetMagnesium = icons[7];
        ModTextures.sheetManganese = icons[8];
        ModTextures.sheetMolybdenum = icons[9];
        ModTextures.sheetCadmium = icons[10];
        ModTextures.sheetIridium = icons[11];

    }
}
