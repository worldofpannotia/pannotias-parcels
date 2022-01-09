package com.worldofpannotia.minecraft;

import com.worldofpannotia.minecraft.blocks.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PannotiasParcelsMod implements ModInitializer {
	public static final String MOD_ID = "pannotiasparcels";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public static final Block BAMBOO_BUNDLE_BLOCK = new BambooBundleBlock();
	public static final Block CANE_BUNDLE_BLOCK = new CaneBundleBlock();
	public static final Block STICK_BUNDLE_BLOCK = new StickBundleBlock();

	public static final Block COMPRESSED_COBBLE_1X = new CompressedCobbleBlock(1);
	public static final Block COMPRESSED_COBBLE_2X = new CompressedCobbleBlock(2);
	public static final Block COMPRESSED_COBBLE_3X = new CompressedCobbleBlock(3);
	public static final Block COMPRESSED_COBBLE_4X = new CompressedCobbleBlock(4);

	public static final Block COMPRESSED_DIRT_1X = new CompressedDirtBlock(1);
	public static final Block COMPRESSED_DIRT_2X = new CompressedDirtBlock(2);
	public static final Block COMPRESSED_DIRT_3X = new CompressedDirtBlock(3);
	public static final Block COMPRESSED_DIRT_4X = new CompressedDirtBlock(4);

	public static final Block COMPRESSED_GRAVEL_1X = new CompressedGravelBlock(1);
	public static final Block COMPRESSED_GRAVEL_2X = new CompressedGravelBlock(2);
	public static final Block COMPRESSED_GRAVEL_3X = new CompressedGravelBlock(3);
	public static final Block COMPRESSED_GRAVEL_4X = new CompressedGravelBlock(4);

	public static final Block COMPRESSED_SAND_1X = new CompressedSandBlock(1);
	public static final Block COMPRESSED_SAND_2X = new CompressedSandBlock(2);
	public static final Block COMPRESSED_SAND_3X = new CompressedSandBlock(3);
	public static final Block COMPRESSED_SAND_4X = new CompressedSandBlock(4);

	@Override
	public void onInitialize() {
		LOGGER.info("Registering blocks for Pannotia's Parcels");

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bamboo_bundle"), BAMBOO_BUNDLE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cane_bundle"), CANE_BUNDLE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stick_bundle"), STICK_BUNDLE_BLOCK);

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_cobblestone_1x"), COMPRESSED_COBBLE_1X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_cobblestone_2x"), COMPRESSED_COBBLE_2X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_cobblestone_3x"), COMPRESSED_COBBLE_3X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_cobblestone_4x"), COMPRESSED_COBBLE_4X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_dirt_1x"), COMPRESSED_DIRT_1X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_dirt_2x"), COMPRESSED_DIRT_2X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_dirt_3x"), COMPRESSED_DIRT_3X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_dirt_4x"), COMPRESSED_DIRT_4X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_gravel_1x"), COMPRESSED_GRAVEL_1X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_gravel_2x"), COMPRESSED_GRAVEL_2X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_gravel_3x"), COMPRESSED_GRAVEL_3X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_gravel_4x"), COMPRESSED_GRAVEL_4X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_sand_1x"), COMPRESSED_SAND_1X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_sand_2x"), COMPRESSED_SAND_2X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_sand_3x"), COMPRESSED_SAND_3X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_sand_4x"), COMPRESSED_SAND_4X);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bamboo_bundle"), new BlockItem(BAMBOO_BUNDLE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cane_bundle"), new BlockItem(CANE_BUNDLE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stick_bundle"), new BlockItem(STICK_BUNDLE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_cobblestone_1x"), new BlockItem(COMPRESSED_COBBLE_1X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_cobblestone_2x"), new BlockItem(COMPRESSED_COBBLE_2X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_cobblestone_3x"), new BlockItem(COMPRESSED_COBBLE_3X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_cobblestone_4x"), new BlockItem(COMPRESSED_COBBLE_4X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_dirt_1x"), new BlockItem(COMPRESSED_DIRT_1X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_dirt_2x"), new BlockItem(COMPRESSED_DIRT_2X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_dirt_3x"), new BlockItem(COMPRESSED_DIRT_3X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_dirt_4x"), new BlockItem(COMPRESSED_DIRT_4X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_gravel_1x"), new BlockItem(COMPRESSED_GRAVEL_1X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_gravel_2x"), new BlockItem(COMPRESSED_GRAVEL_2X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_gravel_3x"), new BlockItem(COMPRESSED_GRAVEL_3X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_gravel_4x"), new BlockItem(COMPRESSED_GRAVEL_4X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_sand_1x"), new BlockItem(COMPRESSED_SAND_1X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_sand_2x"), new BlockItem(COMPRESSED_SAND_2X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_sand_3x"), new BlockItem(COMPRESSED_SAND_3X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_sand_4x"), new BlockItem(COMPRESSED_SAND_4X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
