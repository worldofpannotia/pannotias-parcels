package com.worldofpannotia.minecraft;

import com.worldofpannotia.minecraft.blocks.CaneBundleBlock;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
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

	public static final Block CANE_BUNDLE_BLOCK = new CaneBundleBlock();

	public static final Block COMPRESSED_COBBLE_1X = new Block(FabricBlockSettings.of(Material.STONE).strength(6f, 18f).sounds(BlockSoundGroup.STONE));
	public static final Block COMPRESSED_COBBLE_2X = new Block(FabricBlockSettings.of(Material.STONE).strength(18f, 54f).sounds(BlockSoundGroup.STONE));
	public static final Block COMPRESSED_COBBLE_3X = new Block(FabricBlockSettings.of(Material.STONE).strength(54f, 162f).sounds(BlockSoundGroup.STONE));
	public static final Block COMPRESSED_COBBLE_4X = new Block(FabricBlockSettings.of(Material.STONE).strength(162f, 486f).sounds(BlockSoundGroup.STONE));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cane_bundle"), CANE_BUNDLE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_cobblestone_1x"), COMPRESSED_COBBLE_1X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_cobblestone_2x"), COMPRESSED_COBBLE_2X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_cobblestone_3x"), COMPRESSED_COBBLE_3X);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "compressed_cobblestone_4x"), COMPRESSED_COBBLE_4X);

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cane_bundle"), new BlockItem(CANE_BUNDLE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_cobblestone_1x"), new BlockItem(COMPRESSED_COBBLE_1X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_cobblestone_2x"), new BlockItem(COMPRESSED_COBBLE_2X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_cobblestone_3x"), new BlockItem(COMPRESSED_COBBLE_3X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "compressed_cobblestone_4x"), new BlockItem(COMPRESSED_COBBLE_4X, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
