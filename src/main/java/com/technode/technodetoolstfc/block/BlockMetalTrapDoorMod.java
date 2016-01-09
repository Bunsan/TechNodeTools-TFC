package com.technode.technodetoolstfc.block;

import com.technode.technodetoolstfc.core.reference.Reference;
import com.bioxx.tfc.Blocks.BlockMetalTrapDoor;
import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockMetalTrapDoorMod extends BlockMetalTrapDoor
{
    public String[] metalNames = Reference.METALS_ALLOYS_USABLE;

    public BlockMetalTrapDoorMod()
    {
        super();
        this.setCreativeTab(CreativeTab.TECHNODE_TAB);
    }

    @Override
    public void registerBlockIcons(IIconRegister registerer)
    {
        icons = new IIcon[metalNames.length];
        for(int i = 0; i < icons.length; i++)
            icons[i] = registerer.registerIcon(ModDetails.ModID + ":" + "metal/"+metalNames[i]);
    }
}