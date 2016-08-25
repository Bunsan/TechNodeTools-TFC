package com.technode.technodetoolstfc;

import com.technode.technodetoolstfc.core.*;
import com.technode.technodetoolstfc.core.handler.ChunkEventHandler;
import com.technode.technodetoolstfc.core.handler.network.InitClientWorldPacket;
import com.technode.technodetoolstfc.core.proxy.CommonProxy;
import com.technode.technodetoolstfc.core.reference.ItemHeatReferences;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import com.technode.technodetoolstfc.core.handler.CraftingHandler;

import com.bioxx.tfc.TerraFirmaCraft;

import com.technode.technodetoolstfc.worldGen.WorldGenOreNuggets;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;

@Mod(modid = ModDetails.ModID, name = ModDetails.ModName, version = ModDetails.ModVersion)
public class TechNodeToolsTFC
{
    @Instance(ModDetails.ModID)
    public static TechNodeToolsTFC instance;
  //  public static final String AssetPath = "/assets/" + ModDetails.ModID + "/";
    //public static final String AssetPathGui = "textures/gui";

    @SidedProxy(clientSide = ModDetails.CLIENT_PROXY_CLASS, serverSide = ModDetails.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public File getMinecraftDirectory()
    {
        return proxy.getMinecraftDirectory();
    }

    @EventHandler
    public void preInitialize(FMLPreInitializationEvent e)
    {
        instance = this;
        //Load Configs
        proxy.loadOptions();

        proxy.registerTickHandler();

        // Register Key Bindings(Client only)
        proxy.registerKeys();
        // Register KeyBinding Handler (Client only)
        proxy.registerKeyBindingHandler();
        // Register Handler (Client only)
        proxy.registerHandlers();
        //Register Tile Entites
        proxy.registerTileEntities(true);
        //Register Items
        ModItems.ModItemsInit();
        //Register Blocks
        ModBlocks.ModBlocksInit();

        //Register Gui Handler
        proxy.registerGuiHandler();

        GameRegistry.registerWorldGenerator(new WorldGenOreNuggets(), 5);

        LogHelper.info("Pre Initialization Complete");
    }

    @EventHandler
    public void initialize(FMLInitializationEvent e) {

        TerraFirmaCraft.PACKET_PIPELINE.registerPacket(InitClientWorldPacket.class);

        // Register Crafting Handler
        FMLCommonHandler.instance().bus().register(new CraftingHandler());

        // Register Recipes
        Recipes.registerItemRecipes();
        Recipes.registerTileRecipes();
        ItemHeatReferences.ItemHeatReferences();
        ModOreDictionary.register();

        // Register all the render stuff for the client
        proxy.registerRenderInformation();

        // Register the Chunk Load/Save Handler
        MinecraftForge.EVENT_BUS.register(new ChunkEventHandler());

        //NEI + Walia Registration
        proxy.registerWailaClasses();
        proxy.hideNEIItems();

        LogHelper.info("Initialization Complete");
    }

    @EventHandler
    public void postInitialize(FMLPostInitializationEvent e)
    {
        ModOptions.reloadOres();
        LogHelper.info("Post Initialization Complete");
    }
}
