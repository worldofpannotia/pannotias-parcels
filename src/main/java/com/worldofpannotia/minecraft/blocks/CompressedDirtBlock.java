package com.worldofpannotia.minecraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedDirtBlock extends Block {
    private static float getHardness(int level) {
        return (float) (0.5 * Math.pow(3, level));
    }
    private static float getResistance(int level) {
        return (float) (0.5 * Math.pow(3, level));
    }

    public CompressedDirtBlock(int level) {
        super(FabricBlockSettings.of(Material.SOIL).strength(getHardness(level), getResistance(level)).sounds(BlockSoundGroup.ROOTED_DIRT).requiresTool());
    }
}
