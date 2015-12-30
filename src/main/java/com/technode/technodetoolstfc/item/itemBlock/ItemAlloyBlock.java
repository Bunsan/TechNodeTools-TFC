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
            case 6: return Global.HCBLACKSTEEL;
            case 7: return Global.HCBLUESTEEL;
            case 8: return Global.HCREDSTEEL;
            case 9: return Global.REDSTEEL;
            case 10: return Global.ROSEGOLD;
            case 11: return Global.STERLINGSILVER;
            case 12: return Global.WEAKBLUESTEEL;
            case 13: return Global.WEAKREDSTEEL;
            case 14: return Global.WEAKSTEEL;
        }
        return null;
    }

    @Override
    public short getMetalReturnAmount(ItemStack is) {

        return metalAmount;
    }

    @Override
    public boolean isSmeltable(ItemStack is)
    {
        return smeltable;
    }

    @Override
    public ISmeltable.EnumTier getSmeltTier(ItemStack is) {
        return ISmeltable.EnumTier.TierI;
    }

    public boolean placeBlockAt(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ, int metadata)
    {
        if (stack.hasTagCompound() && (TFC_ItemHeat.hasTemp(stack) ||
                stack.getTagCompound().hasKey("itemCraftingValue") && stack.getTagCompound().getShort("itemCraftingValue") != 0))
        {
            return false;
        }
        else { return true; }
    }
}
