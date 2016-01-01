package com.technode.technodetoolstfc.core.handler.network;

import com.technode.technodetoolstfc.core.Recipes;

import com.bioxx.tfc.Handlers.Network.AbstractPacket;

import net.minecraft.entity.player.EntityPlayer;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class InitClientWorldPacket extends AbstractPacket
{
    public InitClientWorldPacket()
    {
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
    {
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
    {
    }

    @Override
    public void handleClientSide(EntityPlayer player)
    {
        if (!Recipes.areAnvilRecipesRegistered())
            Recipes.registerAnvilRecipes(player.worldObj);
    }

    @Override
    public void handleServerSide(EntityPlayer player)
    {
    }

}
