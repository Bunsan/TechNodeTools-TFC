package com.technode.technodetoolstfc.core.reference;

import com.bioxx.tfc.api.TFCItems;
import com.technode.technodetoolstfc.core.ModItems;

import com.bioxx.tfc.api.HeatIndex;
import com.bioxx.tfc.api.HeatRaw;
import com.bioxx.tfc.api.HeatRegistry;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemHeatReferences
{
    public static void ItemHeatReferences()
    {
        HeatRegistry manager = HeatRegistry.getInstance();

        final int WILDCARD_VALUE = OreDictionary.WILDCARD_VALUE;

        HeatRaw osmiumRaw = new HeatRaw(0.35, 3027);
        HeatRaw aluminumRaw = new HeatRaw(0.35, 980);
        HeatRaw tungstenRaw = new HeatRaw(0.35, 3422);

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

        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumIngot,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumIngot2x,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumSheet,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.osmiumSheet2x,1), osmiumRaw,new ItemStack(ModItems.osmiumUnshaped,4,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumIngot,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumIngot2x,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumSheet,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.aluminumSheet2x,1), aluminumRaw,new ItemStack(ModItems.aluminumUnshaped,4,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenIngot,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,1)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenIngot2x,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenSheet,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,2,0)));
        manager.addIndex(new HeatIndex(new ItemStack(ModItems.tungstenSheet2x,1), tungstenRaw,new ItemStack(ModItems.tungstenUnshaped,4,0)));
    }
}
