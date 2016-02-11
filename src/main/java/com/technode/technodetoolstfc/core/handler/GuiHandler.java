package com.technode.technodetoolstfc.core.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
//	public static final int GuiIdCustom = ModDetails.GuiOffset + 1;

    @Override
    public Object getServerGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity;

        try
        {
            tileEntity = world.getTileEntity(x, y, z);
        }
        catch(Exception e)
        {
            return null;
        }

        switch (Id)
        {
//			case GuiIdCustom:
//				return new ContainerCustom(player.inventory, (TileEntityCustom)tileEntity, world, x, y, z);

            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int Id, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }
}
