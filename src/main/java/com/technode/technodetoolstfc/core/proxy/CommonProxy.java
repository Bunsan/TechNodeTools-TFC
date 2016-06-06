package com.technode.technodetoolstfc.core.proxy;

import com.technode.technodetoolstfc.TechNodeToolsTFC;
import com.technode.technodetoolstfc.core.handler.GuiHandler;
import com.technode.technodetoolstfc.core.handler.ServerTickHandler;
import com.technode.technodetoolstfc.tileentity.TEIngotPileMod;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import java.io.File;


public class CommonProxy {

    public String getCurrentLanguage()
    {
        return null;
    }

    public World getCurrentWorld()
    {
        return MinecraftServer.getServer().getEntityWorld();
    }

    public boolean getGraphicsLevel()
    {
        return false;
    }

    public File getMinecraftDirectory() {return FMLCommonHandler.instance().getMinecraftServerInstance().getFile("");}

    public void hideNEIItems() {}

    public boolean isRemote()
    {
        return false;
    }

    public void loadOptions()
    {
        //Load our settings from the Options file
    }

    public void onClientLogin() {}

    public void registerGuiHandler()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(TechNodeToolsTFC.instance, new GuiHandler());
    }

    public void registerHandlers() {}

    public void registerKeys() {}

    public void registerKeyBindingHandler() {}

    public void registerRenderInformation()
    {
        // NOOP on server
    }

    public void registerSoundHandler() {}

    public void registerTickHandler()
    {
        FMLCommonHandler.instance().bus().register(new ServerTickHandler());
    }

    public void registerTileEntities(boolean b) {
        if (b) {
            GameRegistry.registerTileEntity(TEIngotPileMod.class, "ingotPileMod");
        }
    }

    public void registerToolClasses() {}

    public void registerWailaClasses() {}

    public void uploadKeyBindingsToGame() {}
}
