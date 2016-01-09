package com.technode.technodetoolstfc.core.proxy;

import com.bioxx.tfc.Render.Blocks.RenderMetalSheet;
import com.bioxx.tfc.Render.Blocks.RenderMetalTrapDoor;
import com.bioxx.tfc.api.TFCBlocks;
import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.render.TESR.TESRIngotPileMod;
//import com.technode.technodetoolstfc.render.blocks.RenderModMetalSheet;
import com.technode.technodetoolstfc.render.blocks.RenderAlloyTrapDoorMod;
import com.technode.technodetoolstfc.render.blocks.RenderMetalTrapDoorMod;
import com.technode.technodetoolstfc.tileentity.TEMetalTrapDoorMod;
import com.technode.technodetoolstfc.tileentity.TEModIngotPile;
import com.bioxx.tfc.Render.TESR.*;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ClientProxy extends CommonProxy {

    @Override
    public void registerTileEntities(boolean b) {
        super.registerTileEntities(false);
        ClientRegistry.registerTileEntity(TEModIngotPile.class, "ingotPileMod", new TESRIngotPileMod());
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerRenderInformation()
    {
        RenderingRegistry.registerBlockHandler(TFCBlocks.metalTrapDoorRenderId = RenderingRegistry.getNextAvailableRenderId(), new RenderMetalTrapDoorMod());
        RenderingRegistry.registerBlockHandler(TFCBlocks.metalTrapDoorRenderId = RenderingRegistry.getNextAvailableRenderId(), new RenderAlloyTrapDoorMod());
    }
}
