package com.worldofpannotia.minecraft.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class CaneBundleBlock extends PillarBlock {
    public CaneBundleBlock() {
        super(FabricBlockSettings.of(Material.SOLID_ORGANIC).strength(0.5f, 0.5f).sounds(BlockSoundGroup.GRASS));

        this.setDefaultState(this.stateManager.getDefaultState().with(AXIS, Direction.Axis.Y));
    }
}
