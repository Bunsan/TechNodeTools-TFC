package com.technode.technodetoolstfc.core.crafting;

import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class PilerManager {
    private static final PilerManager INSTANCE = new PilerManager();
    public static final PilerManager getInstance()
    {
        return INSTANCE;
    }

    private List<PilerRecipe> recipes;
    private List<ItemStack> validItems;

    private PilerManager()
    {
        recipes = new ArrayList<PilerRecipe>();
        validItems = new ArrayList<ItemStack>();
    }

    public void addRecipe(PilerRecipe recipe)
    {
        recipes.add(recipe);
        validItems.add(recipe.getInItem());
    }

    public Boolean isValidItem(ItemStack is)
    {
        for(Object vi : validItems)
        {
            ItemStack vis = (ItemStack) vi;
            if(vis.getItem() == is.getItem() && vis.getItemDamage() == is.getItemDamage())
                return true;
        }
        return false;
    }

    public PilerRecipe findMatchingRecipe(ItemStack is)
    {
        for(Object recipe : recipes)
        {
            PilerRecipe qr = (PilerRecipe) recipe;
            if(qr.isInItem(is))
                return qr;
        }
        return null;
    }

    public List<PilerRecipe> getRecipes()
    {
        return recipes;
    }

    public List<ItemStack> getValidItems()
    {
        return validItems;
    }
}