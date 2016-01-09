package com.technode.technodetoolstfc.render.TESR;

import com.bioxx.tfc.Blocks.BlockIngotPile;
import com.bioxx.tfc.Core.TFC_Core;
import com.bioxx.tfc.Render.Models.ModelIngotPile;
import com.bioxx.tfc.Render.TESR.TESRIngotPile;
import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.tileentity.TEModIngotPile;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TESRIngotPileMod extends TESRIngotPile
{
    /** The normal small chest model. */
    private final ModelIngotPile ingotModelMod = new ModelIngotPile();

    public void renderTileEntityIngotPileAt(TEModIngotPile tep, double d, double d1, double d2, float f)
    {
        Block block = tep.getBlockType();
        if (tep.getWorldObj() != null && tep.getStackInSlot(0) != null && block == ModBlocks.ingotPileMod)
        {
            int i = ((BlockIngotPile) block).getStack(tep.getWorldObj(), tep);
            TFC_Core.bindTexture(new ResourceLocation(ModDetails.ModID, "textures/blocks/metal/" + tep.type + ".png")); //texture

            GL11.glPushMatrix(); //start
            GL11.glTranslatef((float)d + 0.0F, (float)d1 + 0F, (float)d2 + 0.0F); //size
            ingotModelMod.renderIngots(i);
            GL11.glPopMatrix(); //end
        }
    }

    @Override
    public void renderTileEntityAt(TileEntity te, double par2, double par4, double par6, float par8)
    {
        this.renderTileEntityIngotPileAt((TEModIngotPile) te, par2, par4, par6, par8);
    }
}
