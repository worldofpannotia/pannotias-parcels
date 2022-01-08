package com.worldofpannotia.minecraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CompressedCobbleBlock extends Block {
    public CompressedCobbleBlock(int level) {
        super(FabricBlockSettings.of(Material.STONE).strength((float) (2 * 3^level), (float) (6 * 3^level)).sounds(BlockSoundGroup.STONE));
    }
}
