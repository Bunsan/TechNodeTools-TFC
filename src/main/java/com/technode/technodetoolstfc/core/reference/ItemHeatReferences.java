package com.technode.technodetoolstfc.core.reference;

import com.bioxx.tfc.api.TFCItems;
import com.technode.technodetoolstfc.core.ModBlocks;
import com.technode.technodetoolstfc.core.ModItems;

import com.bioxx.tfc.api.HeatIndex;
import com.bioxx.tfc.api.HeatRaw;
import com.bioxx.tfc.api.HeatRegistry;

import cpw.mods.fml.common.Mod;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemHeatReferences
{
    public static void ItemHeatReferences()
    {
        HeatRegistry manager = HeatRegistry.getInstance();

        final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;
        HeatRaw bismuthRaw = new HeatRaw(0.14, 270);
        HeatRaw copperRaw = new HeatRaw(0.35, 1080);
        HeatRaw goldRaw = new HeatRaw(0.6, 1060);
        HeatRaw ironRaw = new HeatRaw(0.35, 1535);
        HeatRaw leadRaw = new HeatRaw(0.22, 328);
        HeatRaw nickelRaw = new HeatRaw(0.48, 1453);
        HeatRaw pigIronRaw = new HeatRaw(0.35, 1500);
        HeatRaw platinumRaw = new HeatRaw(0.35, 1730);
        HeatRaw silverRaw = new HeatRaw(0.48, 961);
        HeatRaw steelRaw = new HeatRaw(0.35, 1540);//sh = 0.63F; boil = 3500; melt = 1540;
        HeatRaw tinRaw = new HeatRaw(0.14, 230);
        HeatRaw zincRaw = new HeatRaw(0.21, 420);//sh = 0.66F; boil = 907; melt = 420;
        HeatRaw osmiumRaw = new HeatRaw(0.35, 3027);
        HeatRaw aluminumRaw = new HeatRaw(0.35, 980);
        HeatRaw tungstenRaw = new HeatRaw(0.35, 3422);

        HeatRaw bismuthBronzeRaw = new HeatRaw(0.35, 985);
        HeatRaw blackBronzeRaw = new HeatRaw(0.35, 1070);
        HeatRaw blackSteelRaw = new HeatRaw(0.35, 1485);
        HeatRaw blueSteelRaw = new HeatRaw(0.35, 1540);
        HeatRaw brassRaw = new HeatRaw(0.35, 930);
        HeatRaw bronzeRaw = new HeatRaw(0.35, 950);
        HeatRaw hcBlackSteelRaw = new HeatRaw(0.35, 1485);
        HeatRaw hcBlueSteelRaw = new HeatRaw(0.35, 1540);
        HeatRaw hcRedSteelRaw = new HeatRaw(0.35, 1540);
        HeatRaw redSteelRaw = new HeatRaw(0.35, 1540);
        HeatRaw roseGoldRaw = new HeatRaw(0.35, 960);
        HeatRaw sterlingSilverRaw = new HeatRaw(0.35, 900);//sh = 0.72F; boil = 2212; melt = 893;
        HeatRaw weakSteelRaw = new HeatRaw(0.35, 1485);
        HeatRaw weakBlueSteelRaw = new HeatRaw(0.35, 1540);
        HeatRaw weakRedSteelRaw = new HeatRaw(0.35, 1540);
        HeatRaw electrumRaw = new HeatRaw(0.55, 1060);
        HeatRaw cupronickelRaw = new HeatRaw(0.48, 1453);
        HeatRaw invarRaw = new HeatRaw(0.48, 1535);


        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,0), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,2), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,3), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,4), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,5), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,6), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,7), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,8), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,9), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,10), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.oreChunk,1,11), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));

        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallOreChunk,1,0), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallOreChunk,1,3), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallOreChunk,1,6), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallOreChunk,1,9), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));

        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,0), bismuthRaw,new ItemStack(TFCItems.bismuthUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,1), copperRaw,new ItemStack(TFCItems.copperUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,2), goldRaw,new ItemStack(TFCItems.goldUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,3), ironRaw,new ItemStack(TFCItems.wroughtIronUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,4), leadRaw,new ItemStack(TFCItems.leadUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,5), nickelRaw,new ItemStack(TFCItems.nickelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,6), pigIronRaw,new ItemStack(TFCItems.pigIronUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,7), platinumRaw,new ItemStack(TFCItems.platinumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,8), silverRaw,new ItemStack(TFCItems.silverUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,9), steelRaw,new ItemStack(TFCItems.steelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,10), tinRaw,new ItemStack(TFCItems.tinUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,11), zincRaw,new ItemStack(TFCItems.zincUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,12), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,13), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallMetalChunk,1,14), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));

        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,0), bismuthBronzeRaw,new ItemStack(TFCItems.bismuthBronzeUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,1), blackBronzeRaw,new ItemStack(TFCItems.blackBronzeUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,2), blackSteelRaw,new ItemStack(TFCItems.blackSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,3), blueSteelRaw,new ItemStack(TFCItems.blueSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,4), brassRaw,new ItemStack(TFCItems.brassUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,5), bronzeRaw,new ItemStack(TFCItems.bronzeUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,6), hcBlackSteelRaw,new ItemStack(TFCItems.highCarbonBlackSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,7), hcBlueSteelRaw,new ItemStack(TFCItems.highCarbonBlueSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,8), hcRedSteelRaw,new ItemStack(TFCItems.highCarbonRedSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,9), redSteelRaw,new ItemStack(TFCItems.redSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,10), roseGoldRaw,new ItemStack(TFCItems.roseGoldUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,11), sterlingSilverRaw,new ItemStack(TFCItems.sterlingSilverUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,12), weakSteelRaw,new ItemStack(TFCItems.weakSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,13), weakBlueSteelRaw,new ItemStack(TFCItems.weakBlueSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,14), weakRedSteelRaw,new ItemStack(TFCItems.weakRedSteelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,15), electrumRaw,new ItemStack(ModItems.electrumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,16), cupronickelRaw,new ItemStack(ModItems.cupronickelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.smallAlloyChunk,1,17), invarRaw,new ItemStack(ModItems.invarUnshaped,1)));

        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,0), bismuthRaw,new ItemStack(TFCItems.bismuthUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,1), copperRaw,new ItemStack(TFCItems.copperUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,2), goldRaw,new ItemStack(TFCItems.goldUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,3), ironRaw,new ItemStack(TFCItems.wroughtIronUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,4), leadRaw,new ItemStack(TFCItems.leadUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,5), nickelRaw,new ItemStack(TFCItems.nickelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,6), pigIronRaw,new ItemStack(TFCItems.pigIronUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,7), platinumRaw,new ItemStack(TFCItems.platinumUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,8), silverRaw,new ItemStack(TFCItems.silverUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,9), steelRaw,new ItemStack(TFCItems.steelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,10), tinRaw,new ItemStack(TFCItems.tinUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,11), zincRaw,new ItemStack(TFCItems.zincUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,12), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,13), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.metalBlock,1,14), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,8,0)));

        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,0), bismuthBronzeRaw,new ItemStack(TFCItems.bismuthBronzeUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,1), blackBronzeRaw,new ItemStack(TFCItems.blackBronzeUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,2), blackBronzeRaw,new ItemStack(TFCItems.blackSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,3), blueSteelRaw,new ItemStack(TFCItems.blueSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,4), brassRaw,new ItemStack(TFCItems.brassUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,5), bronzeRaw,new ItemStack(TFCItems.bronzeUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,6), hcBlackSteelRaw,new ItemStack(TFCItems.highCarbonBlackSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,7), hcBlueSteelRaw,new ItemStack(TFCItems.highCarbonBlueSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,8), hcRedSteelRaw,new ItemStack(TFCItems.highCarbonRedSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,9), redSteelRaw,new ItemStack(TFCItems.redSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,10), roseGoldRaw,new ItemStack(TFCItems.roseGoldUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,11), sterlingSilverRaw,new ItemStack(TFCItems.sterlingSilverUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,12), weakSteelRaw,new ItemStack(TFCItems.weakSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,13), weakBlueSteelRaw,new ItemStack(TFCItems.weakBlueSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,14), weakRedSteelRaw,new ItemStack(TFCItems.weakRedSteelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,15), electrumRaw,new ItemStack(ModItems.electrumUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,16), cupronickelRaw,new ItemStack(ModItems.cupronickelUnshaped,8,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModBlocks.alloyBlock,1,17), invarRaw,new ItemStack(ModItems.invarUnshaped,8,0)));

        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumIngot,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumIngot2x,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumUnshaped,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumSheet,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumSheet2x,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,4,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumIngot,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumIngot2x,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumUnshaped,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumSheet,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumSheet2x,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,4,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenIngot,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenIngot2x,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenUnshaped,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenSheet,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenSheet2x,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,4,0)));

        manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumIngot,1), electrumRaw,new ItemStack(ModItems.electrumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumIngot2x,1), electrumRaw,new ItemStack(ModItems.electrumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumUnshaped,1), electrumRaw,new ItemStack(ModItems.electrumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumSheet,1), electrumRaw,new ItemStack(ModItems.electrumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.electrumSheet2x,1), electrumRaw,new ItemStack(ModItems.electrumUnshaped,4,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.cupronickelIngot,1), cupronickelRaw,new ItemStack(ModItems.cupronickelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.cupronickelIngot2x,1), cupronickelRaw,new ItemStack(ModItems.cupronickelUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.cupronickelUnshaped,1), cupronickelRaw,new ItemStack(ModItems.cupronickelUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.cupronickelSheet,1), cupronickelRaw,new ItemStack(ModItems.cupronickelUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.cupronickelSheet2x,1), cupronickelRaw,new ItemStack(ModItems.cupronickelUnshaped,4,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.invarIngot,1), invarRaw,new ItemStack(ModItems.invarUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.invarIngot2x,1), invarRaw,new ItemStack(ModItems.invarUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.invarUnshaped,1), invarRaw,new ItemStack(ModItems.invarUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.invarSheet,1), invarRaw,new ItemStack(ModItems.invarUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.invarSheet2x,1), invarRaw,new ItemStack(ModItems.invarUnshaped,4,0)));
    }
}
