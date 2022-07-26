package com.example.examplemod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registry {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ExampleMod.MODID);

    public static void setup(IEventBus bus)
    {
        BLOCKS.register(bus);
        BLOCK_ENTITIES.register(bus);
    }


    public static final RegistryObject<DecoBlock> BLOCK = BLOCKS.register("test", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD)));



    public static final RegistryObject<BlockEntityType<DecoBlockEntity>> TEST = BLOCK_ENTITIES.register("mybe", () -> BlockEntityType.Builder.of(DecoBlockEntity::new, Blocks.ACACIA_BUTTON).build(null));

}
