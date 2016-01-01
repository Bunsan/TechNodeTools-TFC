package com.technode.technodetoolstfc.core;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item oreChunk;
    public static Item oreMineralChunk;
    public static Item smallOreChunk;
    public static Item smallMetalChunk;
    public static Item smallAlloyChunk;
    public static Item metalDust;
    public static Item alloyDust;

    public static Item aluminumIngot;
    public static Item aluminumIngot2x;
    public static Item aluminumUnshaped;
    public static Item aluminumSheet;
    public static Item aluminumSheet2x;
    public static Item osmiumIngot;
    public static Item osmiumIngot2x;
    public static Item osmiumUnshaped;
    public static Item osmiumSheet;
    public static Item osmiumSheet2x;
    public static Item tungstenIngot;
    public static Item tungstenIngot2x;
    public static Item tungstenUnshaped;
    public static Item tungstenSheet;
    public static Item tungstenSheet2x;

    public static void registerItems()
    {
        GameRegistry.registerItem(oreChunk, oreChunk.getUnlocalizedName());
        GameRegistry.registerItem(oreMineralChunk, oreMineralChunk.getUnlocalizedName());
        GameRegistry.registerItem(smallOreChunk, smallOreChunk.getUnlocalizedName());
        GameRegistry.registerItem(smallMetalChunk, smallMetalChunk.getUnlocalizedName());
        GameRegistry.registerItem(smallAlloyChunk, smallAlloyChunk.getUnlocalizedName());
        GameRegistry.registerItem(metalDust, metalDust.getUnlocalizedName());
        GameRegistry.registerItem(alloyDust, alloyDust.getUnlocalizedName());

        GameRegistry.registerItem(aluminumIngot, aluminumIngot.getUnlocalizedName());
        GameRegistry.registerItem(aluminumIngot2x, aluminumIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(aluminumUnshaped, aluminumUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(aluminumSheet, aluminumSheet.getUnlocalizedName());
        GameRegistry.registerItem(aluminumSheet2x, aluminumSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(osmiumIngot, osmiumIngot.getUnlocalizedName());
        GameRegistry.registerItem(osmiumIngot2x, osmiumIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(osmiumUnshaped, osmiumUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(osmiumSheet, osmiumSheet.getUnlocalizedName());
        GameRegistry.registerItem(osmiumSheet2x, osmiumSheet2x.getUnlocalizedName());
        GameRegistry.registerItem(tungstenIngot, tungstenIngot.getUnlocalizedName());
        GameRegistry.registerItem(tungstenIngot2x, tungstenIngot2x.getUnlocalizedName());
        GameRegistry.registerItem(tungstenUnshaped, tungstenUnshaped.getUnlocalizedName());
        GameRegistry.registerItem(tungstenSheet, tungstenSheet.getUnlocalizedName());
        GameRegistry.registerItem(tungstenSheet2x, tungstenSheet2x.getUnlocalizedName());
    }
}
