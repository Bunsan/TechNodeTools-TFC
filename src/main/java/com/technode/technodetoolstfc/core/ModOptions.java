package com.technode.technodetoolstfc.core;


import com.bioxx.tfc.Core.Config.TFC_ConfigFiles;
import com.bioxx.tfc.WorldGen.Generators.OreSpawnData;
import com.bioxx.tfc.api.Constant.Global;
import com.google.common.collect.ObjectArrays;
import com.technode.technodetoolstfc.TechNodeToolsTFC;
import com.technode.technodetoolstfc.core.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.io.File;

import static com.bioxx.tfc.WorldGen.Generators.WorldGenOre.oreList;
import static com.technode.technodetoolstfc.core.ModDetails.ModID;

public class ModOptions {
    private static Configuration config;

    private static final String GENERAL = "general";
    private static final String WORLD_GEN = "world generation";
    private static final String CRAFTING = "crafting";

    //General
    public static boolean enableNEIHiding = true;

    //OreGen
    //Metal
    public static boolean enableBauxiteSpawn = true;
    public static boolean enableOsmiumSpawn = true;
    public static boolean enableScheeliteSpawn = true;
    public static boolean enableWolframiteSpawn = true;

    //Mineral
    public static boolean enableApatiteSpawn = true;
    public static boolean enableScapoliteSpawn = true;
    public static boolean enableStrontiumSpawn = true;

    //Crafting
    public static boolean enableNuggetCrafting = true;
    //Alloys
    public static boolean enableElectrum = true;
    public static boolean enableCuproNickel = true;
    public static boolean enableInvar = true;

    private static final String[] ALLOWED_TYPES = new String[]{"default", "veins"};
    private static final String[] ALLOWED_SIZES = new String[]{"small", "medium", "large"};
    private static final String[] ALLOWED_BASE_ROCKS = ObjectArrays.concat(Global.STONE_ALL, new String[]{"igneous intrusive", "igneous extrusive", "sedimentary", "metamorphic"}, String.class);

    private static Configuration oreGenConfig;


    public static void loadSettings() {
        LogHelper.info("Loading Options.");

        try {
            config = new Configuration(new File(TechNodeToolsTFC.instance.getMinecraftDirectory(), ModDetails.ConfigFilePath + ModDetails.ConfigFileName));
            config.load();
        } catch (Exception ex) {
            LogHelper.error("Error while trying to access setting configuration!");
            config = null;
        }

        //General Options
        enableNEIHiding = getBooleanFor(config, GENERAL, "EnableNEIHiding", enableNEIHiding, "Set to false to show all the hidden items in NEI.");

        //WorldGen Options
        //Ores Metal
        enableBauxiteSpawn = getBooleanFor(config, WORLD_GEN, "EnableBauxiteSpawn", enableBauxiteSpawn, "Set to true to have bauxite ore spawn in world. See TFCOres.cfg for spawn parameters.");
        enableOsmiumSpawn = getBooleanFor(config, WORLD_GEN, "EnableOsmiumSpawn", enableOsmiumSpawn, "Set to true to have osmium ore spawn in world. See TFCOres.cfg for spawn parameters.");
        enableScheeliteSpawn = getBooleanFor(config, WORLD_GEN, "EnableScheeliteSpawn", enableScheeliteSpawn, "Set to true to have scheelite (tungsten) ore spawn in world. See TFCOres.cfg for spawn parameters.");
        enableWolframiteSpawn = getBooleanFor(config, WORLD_GEN, "EnableWolframiteSpawn", enableWolframiteSpawn, "Set to true to have Wolframite (tungsten) ore spawn in world. See TFCOres.cfg for spawn parameters.");
        //Ores Mineral
        enableApatiteSpawn = getBooleanFor(config, WORLD_GEN, "EnableApatiteSpawn", enableApatiteSpawn, "Set to true to have apatite ore spawn in world. See TFCOres.cfg for spawn parameters.");
        enableScapoliteSpawn = getBooleanFor(config, WORLD_GEN, "EnableScapoliteSpawn", enableScapoliteSpawn, "Set to true to have scapolite (glowstone) ore spawn in world. See TFCOres.cfg for spawn parameters.");
        enableStrontiumSpawn = getBooleanFor(config, WORLD_GEN, "EnableStrontiumSpawn", enableStrontiumSpawn, "Set to true to have strontium (blaze rods) ore spawn in world. See TFCOres.cfg for spawn parameters.");

        //Crafting
        enableNuggetCrafting = getBooleanFor(config, CRAFTING, "EnableNuggetCrafting", enableNuggetCrafting, "Set to true to allow metal nuggets (10 units) to be crafted with chisel.");
        //Alloys
        enableElectrum = getBooleanFor(config, CRAFTING, "EnableElectrum", enableElectrum, "Set to true to allow electrum alloy crafting.");
        enableCuproNickel = getBooleanFor(config, CRAFTING, "EnableCuproNickel", enableCuproNickel, "Set to true to allow cupronikel (constantan) alloy crafting.");
        enableInvar = getBooleanFor(config, CRAFTING, "EnableInvar", enableInvar, "Set to true to allow invar alloy crafting.");

        if (config != null)
            config.save();

        LogHelper.info("Done loading options.");
    }

    public static boolean getBooleanFor(Configuration config, String heading, String item, boolean value) {
        if (config == null)
            return value;
        try {
            Property prop = config.get(heading, item, value);
            return prop.getBoolean(value);
        } catch (Exception e) {
            System.out.println("[" + ModDetails.ModName + "] Error while trying to add Integer, config wasn't loaded properly!");
        }
        return value;
    }

    public static boolean getBooleanFor(Configuration config, String heading, String item, boolean value, String comment) {
        if (config == null)
            return value;
        try {
            Property prop = config.get(heading, item, value);
            prop.comment = comment;
            return prop.getBoolean(value);
        } catch (Exception e) {
            System.out.println("[" + ModDetails.ModName + "] Error while trying to add Integer, config wasn't loaded properly!");
        }
        return value;
    }

    public static int getIntFor(Configuration config, String heading, String item, int value) {
        if (config == null)
            return value;
        try {
            Property prop = config.get(heading, item, value);
            return prop.getInt(value);
        } catch (Exception e) {
            System.out.println("[" + ModDetails.ModName + "] Error while trying to add Integer, config wasn't loaded properly!");
        }
        return value;
    }

    public static int getIntFor(Configuration config, String heading, String item, int value, String comment) {
        if (config == null)
            return value;
        try {
            Property prop = config.get(heading, item, value);
            prop.comment = comment;
            return prop.getInt(value);
        } catch (Exception e) {
            System.out.println("[" + ModDetails.ModName + "] Error while trying to add Integer, config wasn't loaded properly!");
        }
        return value;
    }

    public static double getDoubleFor(Configuration config, String heading, String item, double value) {
        if (config == null)
            return value;
        try {
            Property prop = config.get(heading, item, value);
            return prop.getDouble(value);
        } catch (Exception e) {
            System.out.println("[" + ModDetails.ModName + "] Error while trying to add Double, config wasn't loaded properly!");
        }
        return value;
    }

    public static double getDoubleFor(Configuration config, String heading, String item, double value, String comment) {
        if (config == null)
            return value;
        try {
            Property prop = config.get(heading, item, value);
            prop.comment = comment;
            return prop.getDouble(value);
        } catch (Exception e) {
            System.out.println("[" + ModDetails.ModName + "] Error while trying to add Double, config wasn't loaded properly!");
        }
        return value;
    }

    public static String getStringFor(Configuration config, String heading, String item, String value) {
        if (config == null)
            return value;
        try {
            Property prop = config.get(heading, item, value);
            return prop.getString();
        } catch (Exception e) {
            System.out.println("[" + ModDetails.ModName + "] Error while trying to add String, config wasn't loaded properly!");
        }
        return value;
    }

    public static String getStringFor(Configuration config, String heading, String item, String value, String comment) {
        if (config == null)
            return value;
        try {
            Property prop = config.get(heading, item, value);
            prop.comment = comment;
            return prop.getString();
        } catch (Exception e) {
            System.out.println("[" + ModDetails.ModName + "] Error while trying to add String, config wasn't loaded properly!");
        }
        return value;
    }

    public static void reloadOres() {
        //Metal Ores
        if (enableBauxiteSpawn) {
            oreList.put("Bauxite", getOreData("Bauxite", "veins", "medium", ModID + ":metalOre", 0, 120, new String[]{"granite", "gneiss", "basalt", "shale"}, 5, 128, 80, 60));
        }
        if (ModOptions.enableOsmiumSpawn) {
            oreList.put("Native Osmium", getOreData("Native Osmium", "veins", "medium", ModID + ":metalOre", 1, 100, new String[]{"sedimentary"}, 5, 128, 80, 40));
        }
        if (ModOptions.enableScheeliteSpawn) {
            oreList.put("Scheelite", getOreData("Scheelite", "veins", "medium", ModID + ":metalOre", 2, 150, new String[]{"igneous intrusive"}, 5, 128, 80, 60));
            //Surface veins
            oreList.put("Scheelite Surface", getOreData("Scheelite Surface", "veins", "medium", ModID + ":metalOre", 2, 120, new String[]{"granite"}, 128, 240, 40, 40));
        }
        if (ModOptions.enableWolframiteSpawn) {
            oreList.put("Wolframite", getOreData("Wolframite", "veins", "medium", ModID + ":metalOre", 3, 150, new String[]{"igneous intrusive"}, 5, 128, 80, 60));
        }

        //Minerals
        if (ModOptions.enableApatiteSpawn) {
            oreList.put("Apatite", getOreData("Apatite", "default", "large", ModID + ":mineralOre", 0, 150, new String[]{"chalk", "conglomerate", "limestone", "shale"}, 5, 128, 90, 40));
        }
        if (ModOptions.enableScapoliteSpawn) {
            oreList.put("Scapolite", getOreData("Scapolite", "veins", "medium", ModID + ":mineralOre", 1, 120, new String[]{"gabbro", "diorite", "gneiss", "limestone"}, 5, 128, 80, 60));
        }
        if (ModOptions.enableStrontiumSpawn) {
            oreList.put("Strontium", getOreData("Strontium", "veins", "medium", ModID + ":mineralOre", 2, 150, new String[]{"sedimentary"}, 5, 128, 80, 60));
        }

        // getCategoryNames returns an ImmutableSet
        for (String s : oreGenConfig.getCategoryNames()) {
            // If this is a new entry, otherwise it has already been added by the previous bit of code.
            if (!oreList.containsKey(s))
                oreList.put(s, getOreData(s, "default", "small", "Ore", 0, 100, new String[]{"granite", "basalt", "sedimentary"}, 5, 128, 50, 50));
        }

        if (oreGenConfig.hasChanged()) oreGenConfig.save();
    }

    private static OreSpawnData getOreData(String category, String type, String size, String blockName, int meta, int rarity, String[] rocks, int min, int max,
                                           int v, int h) {
        oreGenConfig = TFC_ConfigFiles.getOresConfig();
        return new OreSpawnData(
                oreGenConfig.get(category, "type", type).setValidValues(ALLOWED_TYPES).getString(),
                oreGenConfig.get(category, "size", size).setValidValues(ALLOWED_SIZES).getString(),
                oreGenConfig.get(category, "oreName", blockName).getString(),
                oreGenConfig.get(category, "oreMeta", meta).getInt(),
                oreGenConfig.get(category, "rarity", rarity).getInt(),
                oreGenConfig.get(category, "baseRocks", rocks).setValidValues(ALLOWED_BASE_ROCKS).getStringList(),
                oreGenConfig.get(category, "Minimum Height", min).getInt(),
                oreGenConfig.get(category, "Maximum Height", max).getInt(),
                oreGenConfig.get(category, "Vertical Density", v).getInt(),
                oreGenConfig.get(category, "Horizontal Density", h).getInt()
        );
    }
}
