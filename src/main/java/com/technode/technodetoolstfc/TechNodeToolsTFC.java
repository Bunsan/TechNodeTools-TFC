package com.technode.technodetoolstfc;

import com.technode.technodetoolstfc.core.Recipes;
import com.technode.technodetoolstfc.core.handler.ChunkEventHandler;
import com.technode.technodetoolstfc.core.handler.network.InitClientWorldPacket;
import com.technode.technodetoolstfc.core.proxy.IProxy;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.handler.ConfigurationHandler;
import com.technode.technodetoolstfc.core.reference.BlockReferences;
import com.technode.technodetoolstfc.core.reference.ItemReferences;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.core.handler.CraftingHandler;

import com.bioxx.tfc.TerraFirmaCraft;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = ModDetails.ModID, name = ModDetails.ModName, version = ModDetails.ModVersion, guiFactory = ModDetails.GUI_FACTORY_CLASS)
public class TechNodeToolsTFC
{
    @Instance(ModDetails.ModID)
    public static TechNodeToolsTFC instance;
  //  public static final String AssetPath = "/assets/" + ModDetails.ModID + "/";
    //public static final String AssetPathGui = "textures/gui";

    @SidedProxy(clientSide = ModDetails.CLIENT_PROXY_CLASS, serverSide = ModDetails.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInitialize(FMLPreInitializationEvent e)
    {
        instance = this;
        ConfigurationHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete");

        ItemReferences.itemReferences();
        BlockReferences.blockReferences();
    }

    @EventHandler
    public void initialize(FMLInitializationEvent e) {
        LogHelper.info("Initialization Complete");

        TerraFirmaCraft.PACKET_PIPELINE.registerPacket(InitClientWorldPacket.class);

        // Register Crafting Handler
        FMLCommonHandler.instance().bus().register(new CraftingHandler());

        // Register Recipes
        Recipes.registerItemRecipes();
        Recipes.registerTileRecipes();

        // Register the Chunk Load/Save Handler
        MinecraftForge.EVENT_BUS.register(new ChunkEventHandler());
    }

    @EventHandler
    public void postInitialize(FMLPostInitializationEvent e)
    {
        LogHelper.info("Post Initialization Complete");
    }
}
