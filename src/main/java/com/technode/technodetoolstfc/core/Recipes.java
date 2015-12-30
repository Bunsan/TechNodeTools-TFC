package com.technode.technodetoolstfc.core;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Crafting.AnvilManager;
import com.bioxx.tfc.api.Crafting.AnvilRecipe;
import com.bioxx.tfc.api.Crafting.AnvilReq;
import com.bioxx.tfc.api.Crafting.PlanRecipe;
import com.bioxx.tfc.api.Enums.RuleEnum;
import com.bioxx.tfc.api.TFCItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.Map;
import java.util.Random;

public class Recipes
{
    public static final int WILD = OreDictionary.WILDCARD_VALUE;
    private static final String BlockPlan = "block";

    private Recipes() { }

    public static void add()
    {
        registerItemRecipes();
        registerTileRecipes();
    }
    public static void registerItemRecipes()
    {
        //Ingot -> Nugget
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 0), new ItemStack(TFCItems.bismuthIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 1), new ItemStack(TFCItems.bismuthBronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 2), new ItemStack(TFCItems.blackBronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 3), new ItemStack(TFCItems.blackSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 4), new ItemStack(TFCItems.blueSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 5), new ItemStack(TFCItems.brassIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 6), new ItemStack(TFCItems.bronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 7), new ItemStack(TFCItems.copperIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 8), new ItemStack(TFCItems.goldIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 9), new ItemStack(TFCItems.wroughtIronIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 10), new ItemStack(TFCItems.leadIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 11), new ItemStack(TFCItems.nickelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 12), new ItemStack(TFCItems.pigIronIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 13), new ItemStack(TFCItems.platinumIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 14), new ItemStack(TFCItems.redSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 15), new ItemStack(TFCItems.roseGoldIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 16), new ItemStack(TFCItems.silverIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 17), new ItemStack(TFCItems.steelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 18), new ItemStack(TFCItems.sterlingSilverIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 19), new ItemStack(TFCItems.tinIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 20), new ItemStack(TFCItems.zincIngot), "itemChisel"));
    }

    public static boolean areAnvilRecipesRegistered()
    {
        Map map = AnvilManager.getInstance().getPlans();

        return map.containsKey(BlockPlan);
    }

    public static void registerTileRecipes() {}

    public static void registerAnvilRecipes(World world)
    {
        AnvilManager manager = AnvilManager.getInstance();
        //We need to set the world ref so that all anvil recipes can generate correctly
        AnvilManager.world = world;

        manager.addPlan(BlockPlan, new PlanRecipe(
                new RuleEnum[]{RuleEnum.BENDLAST, RuleEnum.BENDSECONDFROMLAST, RuleEnum.BENDTHIRDFROMLAST}));

        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.bismuthSheet2x), new ItemStack(TFCItems.bismuthSheet2x),"block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 0)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.copperSheet2x), new ItemStack(TFCItems.copperSheet2x),"block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 1)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.goldSheet2x), new ItemStack(TFCItems.goldSheet2x),"block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 2)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.wroughtIronSheet2x), new ItemStack(TFCItems.wroughtIronSheet2x),"block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock, 1, 3)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.leadSheet2x), new ItemStack(TFCItems.leadSheet2x),"block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 4)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.nickelSheet2x), new ItemStack(TFCItems.nickelSheet2x),"block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock, 1, 5)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.pigIronSheet2x), new ItemStack(TFCItems.pigIronSheet2x),"block", AnvilReq.STEEL, new ItemStack(ModBlocks.metalBlock, 1, 6)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.platinumSheet2x), new ItemStack(TFCItems.platinumSheet2x),"block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock, 1, 7)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.silverSheet2x), new ItemStack(TFCItems.silverSheet2x),"block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 8)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.steelSheet2x), new ItemStack(TFCItems.steelSheet2x),"block", AnvilReq.STEEL, new ItemStack(ModBlocks.metalBlock, 1, 9)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.tinSheet2x), new ItemStack(TFCItems.tinSheet2x),"block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 10)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.zincSheet2x), new ItemStack(TFCItems.zincSheet2x),"block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 11)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));

        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.bismuthBronzeSheet2x), new ItemStack(TFCItems.bismuthBronzeSheet2x),"block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 0)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blackBronzeSheet2x), new ItemStack(TFCItems.blackBronzeSheet2x),"block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 1)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blackSteelSheet2x), new ItemStack(TFCItems.blackSteelSheet2x),"block", AnvilReq.BLACKSTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 2)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blueSteelSheet2x), new ItemStack(TFCItems.blueSteelSheet2x),"block", AnvilReq.BLUESTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 3)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.brassSheet2x), new ItemStack(TFCItems.brassSheet2x),"block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 4)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.bronzeSheet2x), new ItemStack(TFCItems.bronzeSheet2x),"block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 5)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.redSteelSheet2x), new ItemStack(TFCItems.redSteelSheet2x),"block", AnvilReq.BLUESTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 9)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.roseGoldSheet2x), new ItemStack(TFCItems.roseGoldSheet2x),"block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 10)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.sterlingSilverSheet2x), new ItemStack(TFCItems.sterlingSilverSheet2x),"block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 11)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
    }
}
