package com.example.examplemod;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class DecoBlockEntity extends BlockEntity {
    public final String model;
    private MultiBlockDataHolder holder;
    public DecoBlockEntity(BlockPos p_155229_, BlockState p_155230_) {
        this(p_155229_, p_155230_, "");
    }

    public DecoBlockEntity(BlockPos p_155229_, BlockState p_155230_, String model) {
        this(p_155229_, p_155230_, model, null);
    }

    public DecoBlockEntity(BlockPos p_155229_, BlockState p_155230_, String model, MultiBlockDataHolder holder) {
        super(Registry.TEST.get(), p_155229_, p_155230_); this.onLoad();
        this.model = model;
        this.holder = holder;
    }

    public void load(CompoundTag pTag) {
        super.load(pTag);
    }

    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);
    }

    @Override
    public AABB getRenderBoundingBox()
    {
        return new AABB(this.getBlockPos()).inflate(10.0);
    }
}
