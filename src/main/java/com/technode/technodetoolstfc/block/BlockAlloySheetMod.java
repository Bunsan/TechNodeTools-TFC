package com.technode.technodetoolstfc.block;

import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.ModTextures;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockAlloySheetMod extends BlockMetalSheetMod
{
    public String[] metalNames = Reference.MOD_ALLOYS;

    public BlockAlloySheetMod()
    {
        super();
        icons = new IIcon[metalNames.length];
        this.setBlockBounds(0, 0, 0, 1, 1, 1);
    }

    @Override
    public void registerBlockIcons(IIconRegister registerer)
    {
        for(int i = 0; i < metalNames.length; i++)
            icons[i] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/"+metalNames[i]);

        ModTextures.sheetElectrum = icons[0];
        ModTextures.sheetCupronickel = icons[1];
        ModTextures.sheetInvar = icons[2];
        ModTextures.sheetAluminumBrass = icons[3];
        ModTextures.sheetAlumite = icons[4];
        ModTextures.sheetManyullyn = icons[5];
        ModTextures.sheetStainlessSteel = icons[6];

    }
}
