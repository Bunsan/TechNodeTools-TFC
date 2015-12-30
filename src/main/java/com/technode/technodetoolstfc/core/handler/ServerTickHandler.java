package com.technode.technodetoolstfc.core.handler;

import com.technode.technodetoolstfc.core.Recipes;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.world.World;

public class ServerTickHandler
{
    @SubscribeEvent
    public void onServerWorldTick(TickEvent.WorldTickEvent event)
    {
        World world = event.world;

        if (event.phase == Phase.START)
        {
            if (world.provider.dimensionId == 0 && !Recipes.areAnvilRecipesRegistered())
            {
                Recipes.registerAnvilRecipes(world);
            }
        }
    }
}
