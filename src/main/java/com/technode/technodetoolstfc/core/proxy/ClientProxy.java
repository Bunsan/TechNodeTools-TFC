package com.technode.technodetoolstfc.core.proxy;


import com.technode.technodetoolstfc.TechNodeToolsTFC;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.ModOptions;
import com.technode.technodetoolstfc.core.compat.*;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.render.TESR.TESRIngotPileMod;
import com.technode.technodetoolstfc.tileentity.TEIngotPileMod;
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
        if (Loader.isModLoaded(ModDetails.MODID_NEI)) {
            NEICompat.hideNEIItems();
            LogHelper.info("NEI is loaded.");
        }
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
        ModOptions.loadSettings();
    }

    @Override
    public void registerGuiHandler()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(TechNodeToolsTFC.instance, new com.technode.technodetoolstfc.core.handler.client.GuiHandler());
    }

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
        ClientRegistry.registerTileEntity(TEIngotPileMod.class, "ingotPileMod", new TESRIngotPileMod());
    }

    @Override
    public void uploadKeyBindingsToGame()
    {
    }

}
