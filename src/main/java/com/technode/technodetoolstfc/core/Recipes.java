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

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 0), new ItemStack(TFCItems.bismuthBronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 1), new ItemStack(TFCItems.blackBronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 2), new ItemStack(TFCItems.blackSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 3), new ItemStack(TFCItems.blueSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 4), new ItemStack(TFCItems.brassIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 5), new ItemStack(TFCItems.bronzeIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 6), new ItemStack(TFCItems.highCarbonBlackSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 7), new ItemStack(TFCItems.highCarbonBlueSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 8), new ItemStack(TFCItems.highCarbonRedSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 9), new ItemStack(TFCItems.redSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 10), new ItemStack(TFCItems.roseGoldIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 11), new ItemStack(TFCItems.sterlingSilverIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 12), new ItemStack(TFCItems.weakSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 13), new ItemStack(TFCItems.weakBlueSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 14), new ItemStack(TFCItems.weakRedSteelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 15), new ItemStack(ModItems.electrumIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 16), new ItemStack(ModItems.cupronickelIngot), "itemChisel"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.smallMetalChunk, 10, 17), new ItemStack(ModItems.invarIngot), "itemChisel"));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.aluminumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.osmiumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.osmiumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tungstenUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.tungstenIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.electrumUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.electrumIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cupronickelUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.cupronickelIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.invarUnshaped, 1, 0), getStackNoTemp(new ItemStack(ModItems.invarIngot, 1)), new ItemStack(TFCItems.ceramicMold, 1, 1));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.aluminumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.osmiumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.osmiumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tungstenIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.tungstenUnshaped, 1)));

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.electrumIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.electrumUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cupronickelIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.cupronickelUnshaped, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cupronickelIngot, 1, 0), getStackNoTemp(new ItemStack(ModItems.cupronickelUnshaped, 1)));

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

        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.bismuthBronzeSheet2x), new ItemStack(TFCItems.bismuthBronzeSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 0)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blackBronzeSheet2x), new ItemStack(TFCItems.blackBronzeSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 1)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blackSteelSheet2x), new ItemStack(TFCItems.blackSteelSheet2x), "block", AnvilReq.BLACKSTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 2)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.blueSteelSheet2x), new ItemStack(TFCItems.blueSteelSheet2x), "block", AnvilReq.BLUESTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 3)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.brassSheet2x), new ItemStack(TFCItems.brassSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 4)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.bronzeSheet2x), new ItemStack(TFCItems.bronzeSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 5)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.redSteelSheet2x), new ItemStack(TFCItems.redSteelSheet2x), "block", AnvilReq.BLUESTEEL, new ItemStack(ModBlocks.alloyBlock, 1, 6)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.roseGoldSheet2x), new ItemStack(TFCItems.roseGoldSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 7)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(TFCItems.sterlingSilverSheet2x), new ItemStack(TFCItems.sterlingSilverSheet2x), "block", AnvilReq.BRONZE, new ItemStack(ModBlocks.alloyBlock, 1, 8)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.electrumSheet2x), new ItemStack(ModItems.electrumSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.metalBlock, 1, 9)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.cupronickelSheet2x), new ItemStack(ModItems.cupronickelSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.metalBlock, 1, 10)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));
        manager.addRecipe(new AnvilRecipe(new ItemStack(ModItems.invarSheet2x), new ItemStack(ModItems.invarSheet2x), "block", AnvilReq.STONE, new ItemStack(ModBlocks.metalBlock, 1, 11)).addRecipeSkill(Global.SKILL_GENERAL_SMITHING).setCraftingXP(1));

        addTrapDoor(TFCItems.bismuthSheet, 0);addTrapDoor(TFCItems.bismuthBronzeSheet, 1);addTrapDoor(TFCItems.blackBronzeSheet, 2);addTrapDoor(TFCItems.blackSteelSheet, 3);
        addTrapDoor(TFCItems.blueSteelSheet, 4);addTrapDoor(TFCItems.brassSheet, 5);addTrapDoor(TFCItems.bronzeSheet, 6);addTrapDoor(TFCItems.copperSheet, 7);
        addTrapDoor(TFCItems.goldSheet, 8);addTrapDoor(TFCItems.wroughtIronSheet, 9);addTrapDoor(TFCItems.leadSheet, 10);addTrapDoor(TFCItems.nickelSheet, 11);
        addTrapDoor(TFCItems.nickelSheet, 12);addTrapDoor(TFCItems.platinumSheet, 13);addTrapDoor(TFCItems.redSteelSheet, 14);addTrapDoor(TFCItems.roseGoldSheet, 15);
        addTrapDoor(TFCItems.silverSheet, 16);addTrapDoor(TFCItems.steelSheet, 17);addTrapDoor(TFCItems.sterlingSilverSheet, 18);addTrapDoor(TFCItems.tinSheet, 19);
        addTrapDoor(TFCItems.zincSheet, 20);

        addModTrapDoor(ModItems.aluminumSheet, 0);addModTrapDoor(ModItems.osmiumSheet, 1);addModTrapDoor(ModItems.tungstenSheet, 2);addModTrapDoor(ModItems.electrumSheet, 0);
        addModTrapDoor(ModItems.cupronickelSheet, 1);addModTrapDoor(ModItems.invarSheet, 2);
    }

    private static void addModTrapDoor(Item sheet, int index) {
        AnvilManager manager = AnvilManager.getInstance();
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.bismuthIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index)));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.bismuthBronzeIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (1 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.blackBronzeIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (2 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.blackSteelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (3 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.blueSteelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (4 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.brassIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (5 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.bronzeIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (6 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.copperIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (7 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.goldIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (8 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.wroughtIronIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (9 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.leadIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (10 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.nickelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (11 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.platinumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (13 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.redSteelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (14 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.roseGoldIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (15 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.silverIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (16 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.steelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (17 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.sterlingSilverIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (18 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.tinIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (19 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.zincIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (20 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.aluminumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (21 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.osmiumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (22 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.tungstenIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (23 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.electrumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (24 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.cupronickelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (25 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.invarIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.metalTrapDoorMod, 1, index + (26 << 5))));

        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.bismuthIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index)));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.bismuthBronzeIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (1 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.blackBronzeIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (2 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.blackSteelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (3 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.blueSteelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (4 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.brassIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (5 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.bronzeIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (6 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.copperIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (7 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.goldIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (8 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.wroughtIronIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (9 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.leadIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (10 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.nickelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (11 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.platinumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (13 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.redSteelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (14 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.roseGoldIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (15 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.silverIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (16 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.steelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (17 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.sterlingSilverIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (18 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.tinIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (19 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(TFCItems.zincIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (20 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.aluminumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (21 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.osmiumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (22 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.tungstenIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (23 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.electrumIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (24 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.cupronickelIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (25 << 5))));
        manager.addRecipe(new AnvilRecipe(new ItemStack(sheet), new ItemStack(ModItems.invarIngot), "trapdoor", AnvilReq.COPPER, new ItemStack(ModBlocks.alloyTrapDoorMod, 1, index + (26 << 5))));
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