package com.example.examplemod;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class DecoBlockEntity extends BlockEntity {
    public DecoBlockEntity(BlockPos p_155229_, BlockState p_155230_) {
        super(Registry.TEST.get(), p_155229_, p_155230_); this.onLoad();
    }
}
