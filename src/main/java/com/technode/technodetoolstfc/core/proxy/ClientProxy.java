package com.technode.technodetoolstfc.core.proxy;


import com.technode.technodetoolstfc.render.TESR.TESRIngotPileMod;
import com.technode.technodetoolstfc.tileentity.TEModIngotPile;
import cpw.mods.fml.client.registry.ClientRegistry;



public class ClientProxy extends CommonProxy {

    @Override
    public void registerTileEntities(boolean b) {
        super.registerTileEntities(false);
        ClientRegistry.registerTileEntity(TEModIngotPile.class, "ingotPileMod", new TESRIngotPileMod());
    }
}
