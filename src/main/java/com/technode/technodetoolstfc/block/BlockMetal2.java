package com.technode.technodetoolstfc.block;

import com.technode.technodetoolstfc.core.reference.CreativeTab;
import com.technode.technodetoolstfc.core.reference.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockMetal2 extends BlockMetal
{
    public BlockMetal2(Material material)
    {
      super(Material.iron);
        this.setCreativeTab(CreativeTab.TECHNODE_TAB);
        names = new String[Reference.METALS_ALL.length - 16];
        System.arraycopy(Reference.METALS_ALL, 16, names, 0, Reference.METALS_ALL.length - 16);
        icons = new IIcon[names.length];
    }
}
