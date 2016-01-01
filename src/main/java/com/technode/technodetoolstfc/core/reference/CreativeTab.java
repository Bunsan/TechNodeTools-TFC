package com.technode.technodetoolstfc.core.reference;

import com.technode.technodetoolstfc.core.ModDetails;
import com.technode.technodetoolstfc.core.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab
{
    public static final CreativeTabs TECHNODE_TAB = new CreativeTabs(ModDetails.ModID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.smallMetalChunk;
        }
    };
}