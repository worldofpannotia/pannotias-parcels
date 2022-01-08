package com.worldofpannotia.minecraft;

import com.worldofpannotia.minecraft.blocks.CaneBundleBlock;
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

	public static final Block CANE_BUNDLE_BLOCK = new CaneBundleBlock();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cane_bundle"), CANE_BUNDLE_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cane_bundle"), new BlockItem(CANE_BUNDLE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
