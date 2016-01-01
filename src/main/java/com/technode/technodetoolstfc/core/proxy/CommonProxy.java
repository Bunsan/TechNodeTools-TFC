package com.technode.technodetoolstfc.core.proxy;

import com.bioxx.tfc.WorldGen.TFCProvider;
import com.technode.technodetoolstfc.core.handler.ServerTickHandler;
import com.technode.technodetoolstfc.tileentity.TEModIngotPile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class CommonProxy implements IProxy
{
    public void registerFluidIcons() {}

    public void registerRenderInformation()
    {
        // NOOP on server
    }

    public void registerBiomeEventHandler()
    {
        // NOOP on server
    }

    public void registerPlayerRenderEventHandler()
    {
        // NOOP on server
    }

    public void setupGuiIngameForge()
    {
        // NOOP on server
    }

    public String getCurrentLanguage()
    {
        return null;
    }

    public void registerTileEntities(boolean b) {
        if (b) {
            GameRegistry.registerTileEntity(TEModIngotPile.class, "ingotPile");
        }
    }

    public void registerFluids() {}

    public void setupFluids()
    {}

    public void registerToolClasses()
    {}

    public void onClientLogin()
    {}

    public void registerSkyProvider(TFCProvider p)
    {}

    public boolean isRemote()
    {
        return false;
    }

    public World getCurrentWorld()
    {
        return MinecraftServer.getServer().getEntityWorld();
    }

    public int waterColorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return 0;
    }

    public int grassColorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return 0;
    }

    public int foliageColorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return 0;
    }

    public void takenFromCrafting(EntityPlayer entityplayer, ItemStack itemstack, IInventory iinventory)
    {
        FMLCommonHandler.instance().firePlayerCraftingEvent(entityplayer, itemstack, iinventory);
    }

    public int getArmorRenderID(String name)
    {
        return 0;
    }

    public boolean getGraphicsLevel()
    {
        return false;
    }

    public void registerKeys()
    {
    }

    public void registerKeyBindingHandler()
    {
    }

    public void uploadKeyBindingsToGame()
    {
    }

    public void registerHandlers()
    {
    }

    public void registerSoundHandler()
    {
    }

    public void registerTickHandler()
    {
        FMLCommonHandler.instance().bus().register(new ServerTickHandler());
    }

    public void registerGuiHandler()
    {
 //       NetworkRegistry.INSTANCE.registerGuiHandler(TerraFirmaCraft.instance, new GuiHandler());
    }

    public void registerWailaClasses()
    {
 //       FMLInterModComms.sendMessage("Waila", "register", "com.bioxx.tfc.WAILA.WAILAData.callbackRegister"); // Blocks
 //       FMLInterModComms.sendMessage("Waila", "register", "com.bioxx.tfc.WAILA.WMobs.callbackRegister"); // Entities
 //       FMLInterModComms.sendMessage("Waila", "register", "com.bioxx.tfc.WAILA.WCrucible.callbackRegister"); // Crucible has its own file due to extra calculations.
    }

    public void registerChiselModes()
    {
//        ChiselManager.getInstance().addChiselMode(new ChiselMode_Smooth("Smooth"));
    }

    public void hideNEIItems() {}
}
