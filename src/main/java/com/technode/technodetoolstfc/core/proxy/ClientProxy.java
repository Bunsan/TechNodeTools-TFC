package com.technode.technodetoolstfc.core.proxy;


import com.technode.technodetoolstfc.core.compat.*;
import com.technode.technodetoolstfc.render.TESR.TESRIngotPileMod;
import com.technode.technodetoolstfc.tileentity.TEModIngotPile;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

import java.io.File;


public class ClientProxy extends CommonProxy {
    @Override
    public String getCurrentLanguage()
    {
        return Minecraft.getMinecraft().getLanguageManager().getCurrentLanguage().getLanguageCode();
    }

    @Override
    public World getCurrentWorld()
    {
        return Minecraft.getMinecraft().theWorld;
    }

    @Override
    public boolean getGraphicsLevel()
    {
        Minecraft.getMinecraft();
        return Minecraft.isFancyGraphicsEnabled();
    }

    @Override
    public File getMinecraftDirectory()
    {
        return Minecraft.getMinecraft().mcDataDir;
    }

    @Override
    public void hideNEIItems()
    {
        if (Loader.isModLoaded("NotEnoughItems")) NEIIntegration.hideNEIItems();
    }

    @Override
    public boolean isRemote()
    {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void loadOptions()
    {
        //Load our settings from the server
       // ModOptions.loadSettings();
    }

    @Override
    public void registerGuiHandler()
    {}

    @Override
    public void registerHandlers()
    {
    }

    @Override
    public void registerKeys()
    {
        uploadKeyBindingsToGame();
    }

    @Override
    public void registerKeyBindingHandler() {}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerRenderInformation() {}

    @Override
    public void registerTileEntities(boolean b)
    {
        super.registerTileEntities(false);
        ClientRegistry.registerTileEntity(TEModIngotPile.class, "ingotPileMod", new TESRIngotPileMod());
    }

    @Override
    public void uploadKeyBindingsToGame()
    {
    }

}
