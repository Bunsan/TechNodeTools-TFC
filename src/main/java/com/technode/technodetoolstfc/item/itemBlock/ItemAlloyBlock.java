package com.technode.technodetoolstfc.item.itemBlock;

import com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock;
import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Interfaces.ISmeltable;
import com.bioxx.tfc.api.Metal;
import com.bioxx.tfc.api.TFC_ItemHeat;
import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAlloyBlock extends ItemTerraBlock implements ISmeltable
{
    private boolean smeltable = true;
    protected short metalAmount;

    public ItemAlloyBlock(Block b)
    {
        super(b);
        metaNames = Reference.ALLOYS;
        this.setCreativeTab(CreativeTab.TECHNODE_TAB);
        setFolder("metal/");
        metalAmount = 800;

    }

    @Override
    public Metal getMetalType(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0: return Global.BISMUTHBRONZE;
            case 1: return Global.BLACKBRONZE;
            case 2: return Global.BLACKSTEEL;
            case 3: return Global.BLUESTEEL;
            case 4: return Global.BRASS;
            case 5: return Global.BRONZE;
            case 6: return Global.REDSTEEL;
            case 7: return Global.ROSEGOLD;
            case 8: return Global.STERLINGSILVER;
        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is) {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return metalAmount;
        }
        return 0;
    }

    @Override
    public boolean isSmeltable(ItemStack is) {
        switch (is.getItemDamage()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return smeltable;
            default:
                return false;
        }
    }

    @Override
    public ISmeltable.EnumTier getSmeltTier(ItemStack is)
    {
        int dam = is.getItemDamage();
        switch(dam)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return EnumTier.TierI;
        }
        return EnumTier.TierX;
    }
}
