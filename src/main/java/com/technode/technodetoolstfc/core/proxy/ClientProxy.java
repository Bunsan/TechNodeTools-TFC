package com.technode.technodetoolstfc.core.proxy;

import com.technode.technodetoolstfc.tileentity.TEModIngotPile;
import com.bioxx.tfc.Render.TESR.*;
import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends CommonProxy {

    @Override
    public void registerTileEntities(boolean b) {
        super.registerTileEntities(false);
        ClientRegistry.registerTileEntity(TEModIngotPile.class, "ingotPile", new TESRIngotPile());
    }
}
