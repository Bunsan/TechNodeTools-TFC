package com.technode.technodetoolstfc.core;

import com.bioxx.tfc.api.Constant.Global;
import com.bioxx.tfc.api.Crafting.AnvilManager;
import com.bioxx.tfc.api.Crafting.AnvilRecipe;
import com.bioxx.tfc.api.Crafting.AnvilReq;
import com.bioxx.tfc.api.Crafting.PlanRecipe;
import com.bioxx.tfc.api.Enums.RuleEnum;
import com.bioxx.tfc.api.TFCBlocks;
import com.bioxx.tfc.api.TFCItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.Map;

public class Recipes {
    public static final int WILD = OreDictionary.WILDCARD_VALUE;
    private static final String BlockPlan = "block";

    private Recipes() {
    }

    public static void add() {
        registerItemRecipes();
        registerTileRecipes();
    }

    public static void registerItemRecipes() {
        if (ModOptions.enableNuggetCrafting) {
            //Ingot -> Nugget
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 0), new ItemStack(TFCItems.bismuthIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 1), new ItemStack(TFCItems.copperIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 2), new ItemStack(TFCItems.goldIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 3), new ItemStack(TFCItems.wroughtIronIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 4), new ItemStack(TFCItems.leadIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 5), new ItemStack(TFCItems.nickelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 6), new ItemStack(TFCItems.pigIronIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 7), new ItemStack(TFCItems.platinumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 8), new ItemStack(TFCItems.silverIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 9), new ItemStack(TFCItems.steelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 10), new ItemStack(TFCItems.tinIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 11), new ItemStack(TFCItems.zincIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 12), new ItemStack(ModItems.aluminumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 13), new ItemStack(ModItems.osmiumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 14), new ItemStack(ModItems.tungstenIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 15), new ItemStack(ModItems.cobaltIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 16), new ItemStack(ModItems.chromiumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 17), new ItemStack(ModItems.titaniumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 18), new ItemStack(ModItems.lithiumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 19), new ItemStack(ModItems.magnesiumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 20), new ItemStack(ModItems.manganeseIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 21), new ItemStack(ModItems.molybdenumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 22), new ItemStack(ModItems.cadmiumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 23), new ItemStack(ModItems.iridiumIngot), "itemChisel"));

            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 0), new ItemStack(TFCItems.bismuthBronzeIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 1), new ItemStack(TFCItems.blackBronzeIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 2), new ItemStack(TFCItems.blackSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 3), new ItemStack(TFCItems.blueSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 4), new ItemStack(TFCItems.brassIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 5), new ItemStack(TFCItems.bronzeIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 6), new ItemStack(TFCItems.highCarbonBlackSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 7), new ItemStack(TFCItems.highCarbonBlueSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 8), new ItemStack(TFCItems.highCarbonRedSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 9), new ItemStack(TFCItems.redSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 10), new ItemStack(TFCItems.roseGoldIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 11), new ItemStack(TFCItems.sterlingSilverIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 12), new ItemStack(TFCItems.weakSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 13), new ItemStack(TFCItems.weakBlueSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 14), new ItemStack(TFCItems.weakRedSteelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 15), new ItemStack(ModItems.electrumIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 16), new ItemStack(ModItems.cupronickelIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 17), new ItemStack(ModItems.invarIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 18), new ItemStack(ModItems.aluminumBrassIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 19), new ItemStack(ModItems.alumiteIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 20), new ItemStack(ModItems.manyullynIngot), "itemChisel"));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallAlloyChunk, 10, 21), new ItemStack(ModItems.stainlessSteelIngot), "itemChisel"));
        }

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.aluminumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.osmiumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.osmiumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tungstenUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.tungstenIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cobaltUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.cobaltIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chromiumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.chromiumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.titaniumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.titaniumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithiumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.lithiumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.magnesiumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.magnesiumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.manganeseUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.manganeseIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.molybdenumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.molybdenumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cadmiumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.cadmiumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.iridiumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.iridiumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.electrumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.electrumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cupronickelUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.cupronickelIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.invarUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.invarIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminumBrassUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.aluminumBrassIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.alumiteUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.alumiteUnshaped, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.manyullynUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.manyullynIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stainlessSteelUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.stainlessSteelIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.aluminumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.osmiumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.osmiumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tungstenIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.tungstenUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cobaltIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.cobaltUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.chromiumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.chromiumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.titaniumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.titaniumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithiumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.lithiumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.magnesiumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.magnesiumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.manganeseIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.manganeseUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.molybdenumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.molybdenumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cadmiumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.cadmiumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.iridiumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.iridiumUnshaped, 1)));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.electrumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.electrumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cupronickelIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.cupronickelUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.invarIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.invarUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminumBrassIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.aluminumBrassUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.alumiteIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.alumiteUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.manyullynIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.manyullynUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.stainlessSteelIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.stainlessSteelUnshaped, 1)));
    }

    public static ItemStack getStackNoTemp(ItemStack is) {
        NBTTagCompound noTemp = new NBTTagCompound();
        noTemp.setBoolean("noTemp", true);
        is.setTagCompound(noTemp);
        return is;
    }

    public static boolean areAnvilRecipesRegistered() {
        Map map = AnvilManager.getInstance().getPlans();

        return map.containsKey(BlockPlan);
    }

    public static void registerTileRecipes() {
    }

    public static void registerAnvilRecipes(World world) {
        AnvilManager manager = AnvilManager.getInstance();
        //We need to set the world ref so that all anvil recipes can generate correctly
        AnvilManager.world = world;

        manager.addPlan(BlockPlan, new PlanRecipe(
                new RuleEnum[]{RuleEnum.BENDLAST, RuleEnum.BENDSECONDFROMLAST, RuleEnum.BENDTHIRDFROMLAST}));

        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.bismuthSheet2x), new ItemStack(TFCItems.bismuthSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 0)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.copperSheet2x), new ItemStack(TFCItems.copperSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 1)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.goldSheet2x), new ItemStack(TFCItems.goldSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 2)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.wroughtIronSheet2x), new ItemStack(TFCItems.wroughtIronSheet2x), "block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock, 1, 3)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.leadSheet2x), new ItemStack(TFCItems.leadSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 4)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.nickelSheet2x), new ItemStack(TFCItems.nickelSheet2x), "block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock, 1, 5)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.pigIronSheet2x), new ItemStack(TFCItems.pigIronSheet2x), "block", AnvilReq.STEEL, new ItemStack(ModBlocks.metalBlock, 1, 6)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.platinumSheet2x), new ItemStack(TFCItems.platinumSheet2x), "block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock, 1, 7)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.silverSheet2x), new ItemStack(TFCItems.silverSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 8)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.steelSheet2x), new ItemStack(TFCItems.steelSheet2x), "block", AnvilReq.STEEL, new ItemStack(ModBlocks.metalBlock, 1, 9)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.tinSheet2x), new ItemStack(TFCItems.tinSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 10)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.zincSheet2x), new ItemStack(TFCItems.zincSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 11)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.aluminumSheet2x), new ItemStack(ModItems.aluminumSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 12)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.osmiumSheet2x), new ItemStack(ModItems.osmiumSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 13)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.tungstenSheet2x), new ItemStack(ModItems.tungstenSheet2x), "block", AnvilReq.COPPER, new ItemStack(ModBlocks.metalBlock, 1, 14)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.cobaltSheet2x), new ItemStack(ModItems.cobaltSheet2x), "block", AnvilReq.BLACKSTEEL, new ItemStack(ModBlocks.metalBlock, 1, 15)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.chromiumSheet2x), new ItemStack(ModItems.chromiumSheet2x), "block", AnvilReq.BLACKSTEEL, new ItemStack(ModBlocks.metalBlock2, 1, 0)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.titaniumSheet2x), new ItemStack(ModItems.titaniumSheet2x), "block", AnvilReq.BLUESTEEL, new ItemStack(ModBlocks.metalBlock2, 1, 1)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.lithiumSheet2x), new ItemStack(ModItems.lithiumSheet2x), "block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock2, 1, 2)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.magnesiumSheet2x), new ItemStack(ModItems.magnesiumSheet2x), "block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock2, 1, 3)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.manganeseSheet2x), new ItemStack(ModItems.manganeseSheet2x), "block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock2, 1, 4)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.molybdenumSheet2x), new ItemStack(ModItems.molybdenumSheet2x), "block", AnvilReq.BLACKSTEEL, new ItemStack(ModBlocks.metalBlock2, 1, 5)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.cadmiumSheet2x), new ItemStack(ModItems.cadmiumSheet2x), "block", AnvilReq.WROUGHTIRON, new ItemStack(ModBlocks.metalBlock2, 1, 6)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.iridiumSheet2x), new ItemStack(ModItems.iridiumSheet2x), "block", AnvilReq.BLUESTEEL, new ItemStack(ModBlocks.metalBlock2, 1, 7)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));

        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.bismuthBronzeSheet2x), new ItemStack(TFCItems.bismuthBronzeSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 0)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blackBronzeSheet2x), new ItemStack(TFCItems.blackBronzeSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 1)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blackSteelSheet2x), new ItemStack(TFCItems.blackSteelSheet2x), "block", AnvilReq.BLACKSTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 2)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blueSteelSheet2x), new ItemStack(TFCItems.blueSteelSheet2x), "block", AnvilReq.BLUESTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 3)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.brassSheet2x), new ItemStack(TFCItems.brassSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 4)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.bronzeSheet2x), new ItemStack(TFCItems.bronzeSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 5)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.redSteelSheet2x), new ItemStack(TFCItems.redSteelSheet2x), "block", AnvilReq.BLUESTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 6)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.roseGoldSheet2x), new ItemStack(TFCItems.roseGoldSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 7)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.sterlingSilverSheet2x), new ItemStack(TFCItems.sterlingSilverSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 8)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.electrumSheet2x), new ItemStack(ModItems.electrumSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.alloyBlock, 1, 9)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.cupronickelSheet2x), new ItemStack(ModItems.cupronickelSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.alloyBlock, 1, 10)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.invarSheet2x), new ItemStack(ModItems.invarSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.alloyBlock, 1, 11)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.aluminumBrassSheet2x), new ItemStack(ModItems.aluminumBrassSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 12)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.alumiteSheet2x), new ItemStack(ModItems.alumiteSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.alloyBlock, 1, 13)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.manyullynSheet2x), new ItemStack(ModItems.manyullynSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.alloyBlock, 1, 14)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.stainlessSteelSheet2x), new ItemStack(ModItems.stainlessSteelSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.alloyBlock, 1, 15)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
    }
    private static void addTrapDoor(Item sheet, int index) {
        AnvilManager manager = AnvilManager.getInstance();
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.aluminumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(TFCBlocks.metalTrapDoor, 1, index + (21 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.osmiumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(TFCBlocks.metalTrapDoor, 1, index + (22 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.tungstenIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(TFCBlocks.metalTrapDoor, 1, index + (23 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.electrumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(TFCBlocks.metalTrapDoor, 1, index + (24 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.cupronickelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(TFCBlocks.metalTrapDoor, 1, index + (25 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.invarIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(TFCBlocks.metalTrapDoor, 1, index + (26 << 5))));
    }
}