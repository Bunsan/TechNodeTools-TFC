package com.technode.technodetoolstfc.core.handler;

import com.technode.technodetoolstfc.core.Recipes;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.WorldEvent;

public class ChunkEventHandler
{
    @SubscribeEvent
    public void onLoadWorld(WorldEvent.Load event) {
        if (!event.world.isRemote && event.world.provider.dimensionId == 0 && !Recipes.areAnvilRecipesRegistered())
        {
            Recipes.registerAnvilRecipes(event.world);
        }
    }
}
