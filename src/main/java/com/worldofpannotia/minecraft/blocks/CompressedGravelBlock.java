package com.worldofpannotia.minecraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedGravelBlock extends Block {
    private static float getHardness(int level) {
        return (float) (0.6 * Math.pow(3, level));
    }
    private static float getResistance(int level) {
        return (float) (0.6 * Math.pow(3, level));
    }

    public CompressedGravelBlock(int level) {
        super(FabricBlockSettings.of(Material.AGGREGATE).strength(getHardness(level), getResistance(level)).sounds(BlockSoundGroup.SAND).requiresTool());
    }
}
