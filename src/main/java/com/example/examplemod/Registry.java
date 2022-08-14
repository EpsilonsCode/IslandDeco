package com.example.examplemod;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;

public class Registry {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ExampleMod.MODID);

    public static ArrayList<RegistryObject<Item>> items = new ArrayList<>();

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("Island decorations") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.VINE);
        }
    };

    public static void setup(IEventBus bus)
    {
        ITEMS.register(bus);
        BLOCKS.register(bus);
        BLOCK_ENTITIES.register(bus);
        fromBlock(BLOCKS.register("bomb", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "bomb")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                /*shape = Shapes.join(shape, Shapes.box(0.525, -0.12500000000000003, 0.33124999999999993, 0.65, -0.062499999999999986, 0.45625), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.49375, -0.08125000000000002, 0.30000000000000004, 0.6812500000000001, -0.018749999999999996, 0.48750000000000004), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.45625000000000004, -0.050000000000000024, 0.26249999999999996, 0.70625, 0.07499999999999993, 0.5125000000000001), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.42500000000000004, 0.05624999999999994, 0.2250000000000001, 0.7375, 0.24375000000000013, 0.5375000000000001), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.45625000000000004, 0.24375000000000024, 0.26249999999999996, 0.70625, 0.36875000000000013, 0.5125000000000001), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.48750000000000004, 0.33750000000000013, 0.290625, 0.675, 0.5250000000000004, 0.478125), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.51875, 0.5250000000000002, 0.32187499999999997, 0.64375, 0.6500000000000002, 0.446875), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.55, 0.5812500000000003, 0.353125, 0.6125, 0.7062500000000003, 0.415625), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.5941499796482359, 0.6687499731779105, 0.3088866319999175, 0.719149979648236, 0.8562499731779105, 0.3088866319999175), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.5500441941759233, 0.7812499731779106, 0.4156066941729547, 0.6125441941759233, 0.8437499731779106, 0.4156066941729547), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.5500441941759233, 0.7812499731779106, 0.35301830582110816, 0.6125441941759233, 0.8437499731779106, 0.35301830582110816), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.5500441941759233, 0.7812499731779106, 0.35301830582110816, 0.6125441941759233, 0.8437499731779106, 0.35301830582110816), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.5500441941759233, 0.7812499731779106, 0.4156066941729547, 0.6125441941759233, 0.8437499731779106, 0.4156066941729547), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.5941941738241592, 0.6687499731779105, 0.4598191738241592, 0.7191941738241593, 0.8562499731779105, 0.4598191738241592), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.4433058261758407, 0.6687499731779105, 0.4598191738241592, 0.5683058261758408, 0.8562499731779105, 0.4598191738241592), BooleanOp.OR);
                shape = Shapes.join(shape, Shapes.box(0.44335002035176396, 0.6687499731779105, 0.3088866319999175, 0.5683500203517641, 0.8562499731779105, 0.3088866319999175), BooleanOp.OR);


                 */
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction, 0.4375, 0, 0.0625, 0.9375, 0.5, 0.5625), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("barrel", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "barrel", new MultiBlockDataHolder(2, new int[]{0, 0}, new int[]{0, 0}, new int[]{1, -1}))
        {
            @Override
            public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
            {
                Direction direction = state.getValue(DecoBlockSlave.FACING);
                if(index == 0)
                    return DecoBlock.cuboidWithRotation(direction, 0.5625, 0, 0.1875, 1, 1, 1);
                return Shapes.empty();
            }
        }));
        fromBlock(BLOCKS.register("wilson", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "wilson")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0, 0, 0, 1, 0.25, 1), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.375, 0.1875, 0.1875, 0.9375, 0.5625, 0.8125), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("moai", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "moai", new MultiBlockDataHolder(2, new int[]{0, 0}, new int[]{1, 2}, new int[]{0, 0}))
        {
            @Override
            public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
            {
                Direction direction = state.getValue(DecoBlockSlave.FACING);
                if(index == 0)
                {
                    VoxelShape shape = Shapes.empty();
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.125, 0, 0.0625, 0.875, 0.3125, 0.875), BooleanOp.OR);
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0, 0.3125, 0, 1, 1, 0.875), BooleanOp.OR);


                    return shape;
                }
                if(index == 1)
                {
                    VoxelShape shape = Shapes.empty();
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0, 0, 0, 0.9375, 0.875, 0.875), BooleanOp.OR);


                    return shape;
                }
                //    Shapes.empty();
                return Shapes.empty();
            }

            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.3125, 0, 0.0625, 1.3125, 1, 0.875), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("plane", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "plane")));
        fromBlock(BLOCKS.register("sandcastle", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "sandcastle")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.4375, 0, 0, 1.4375, 1.25, 1.6875), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("skull_pile", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "skull_pile")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.5, 0, -0.3125, 1.25, 0.9375, 1.4375), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("skull_stand", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "skull_stand")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);

                return shape;
            }
        }));

        fromBlock(BLOCKS.register("aztec_ruins_gold", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "aztec_ruins")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.671875, 0, 0.671875, 0.984375, 1.75, 0.984375), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.078125, 0.18125000000000002, 0.6875, 0.328125, 0.93125, 0.9375), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.0625, -0.006250000000000002, 0.125, 1.0625, 0.30625, 1.0625), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("aztec_ruins_stone", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "aztec_ruins")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.671875, 0, 0.671875, 0.984375, 1.75, 0.984375), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.078125, 0.18125000000000002, 0.6875, 0.328125, 0.93125, 0.9375), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.0625, -0.006250000000000002, 0.125, 1.0625, 0.30625, 1.0625), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("buoy_blue", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "buoy")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.25, 0, -0.25, 1.25, 0.375, 1.25), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("buoy_orange", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "buoy")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.25, 0, -0.25, 1.25, 0.375, 1.25), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("cell_tower", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "cell_tower")));
        fromBlock(BLOCKS.register("pirate_chest", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "pirate_chest")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.75, 0, 0, 1.75, 1, 1), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("pirate_chest_gold", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "pirate_chest")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.75, 0, 0, 1.75, 1, 1), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("eth_silver", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "coin")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.125, 0, 0.375, 1.25, 0.125, 1), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.125, 0, 0.625, 1.125, 1.0625, 1.125), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("eth_gold", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "coin")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.125, 0, 0.375, 1.25, 0.125, 1), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.125, 0, 0.625, 1.125, 1.0625, 1.125), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("btc_silver", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "coin")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.125, 0, 0.375, 1.25, 0.125, 1), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.125, 0, 0.625, 1.125, 1.0625, 1.125), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("btc_gold", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "coin")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.125, 0, 0.375, 1.25, 0.125, 1), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,-0.125, 0, 0.625, 1.125, 1.0625, 1.125), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("gold_column", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "column", new MultiBlockDataHolder(1, new int[]{0}, new int[]{1}, new int[]{0}))
        {
            @Override
            public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
            {
                Direction direction = state.getValue(DecoBlockSlave.FACING);
                if(index == 0)
                {
                    VoxelShape shape = Shapes.empty();
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.6875, 0, 0.5625, 1.1875, 1.5, 1.0625), BooleanOp.OR);
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.1875, 0, 0.625, 0.5625, 0.25, 1.0625), BooleanOp.OR);


                    return shape;
                }
                //if(index == 1)
                //    Shapes.empty();
                return Shapes.empty();
            }

            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.0625, 0, 0.5625, 1.75, 1, 1.125), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("stone_column", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "column", new MultiBlockDataHolder(1, new int[]{0}, new int[]{1}, new int[]{0}))
        {
            @Override
            public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
            {
                Direction direction = state.getValue(DecoBlockSlave.FACING);
                if(index == 0)
                {
                    VoxelShape shape = Shapes.empty();
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.6875, 0, 0.5625, 1.1875, 1.5, 1.0625), BooleanOp.OR);
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.1875, 0, 0.625, 0.5625, 0.25, 1.0625), BooleanOp.OR);


                    return shape;
                }
                //if(index == 1)
                //    Shapes.empty();
                return Shapes.empty();
            }

            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.0625, 0, 0.5625, 1.75, 1, 1.125), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("blue_surf_board", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "surf_board", new MultiBlockDataHolder(1, new int[]{0}, new int[]{1}, new int[]{0}))
        {
            @Override
            public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
            {
                Direction direction = state.getValue(DecoBlockSlave.FACING);
                if(index == 0)
                {
                    VoxelShape shape = Shapes.empty();
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.1875, 0, 0.6875, 0.8125, 1.1875, 1), BooleanOp.OR);


                    return shape;
                }
                //if(index == 1)
                //    Shapes.empty();
                return Shapes.empty();
            }

            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.0625, 0, 0.4375, 0.9375, 1, 0.9375), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("orange_surf_board", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "surf_board", new MultiBlockDataHolder(1, new int[]{0}, new int[]{1}, new int[]{0}))
        {
            @Override
            public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
            {
                Direction direction = state.getValue(DecoBlockSlave.FACING);
                if(index == 0)
                {
                    VoxelShape shape = Shapes.empty();
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.1875, 0, 0.6875, 0.8125, 1.1875, 1), BooleanOp.OR);


                    return shape;
                }
                //if(index == 1)
                //    Shapes.empty();
                return Shapes.empty();
            }

            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.0625, 0, 0.4375, 0.9375, 1, 0.9375), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("wooden_tiki", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "tiki")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.0625, 0, 0.0625, 1, 1.5625, 1), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("golden_tiki", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "tiki")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.0625, 0, 0.0625, 1, 1.5625, 1), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("wooden_totenkoh", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "toten_koh_lanta")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.125, 0, 0.375, 0.875, 0.9375, 0.75), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("golden_totenkoh", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "toten_koh_lanta")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.125, 0, 0.375, 0.875, 0.9375, 0.75), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("deck_chair_blue", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "deck_chair")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0, 0, 0, 1, 0.75, 1), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("deck_chair_orange", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "deck_chair")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0, 0, 0, 1, 0.75, 1), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("blue_towel", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "towel")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.03125, -0.03125, -0.46875, 0.96875, 0.03125, 1.46875), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("orange_towel", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "towel")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.03125, -0.03125, -0.46875, 0.96875, 0.03125, 1.46875), BooleanOp.OR);

                return shape;
            }
        }));
        fromBlock(BLOCKS.register("water_tower", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "water_tower")
        {
            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);


                return shape;
            }
        }));

        fromBlock(BLOCKS.register("silver_trident", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "trident", new MultiBlockDataHolder(2, new int[]{0, 0}, new int[]{1, 2}, new int[]{0, 0}))
        {
            @Override
            public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
            {
                Direction direction = state.getValue(DecoBlockSlave.FACING);
                if(index == 0)
                {
                    VoxelShape shape = Shapes.empty();
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.4375, 0, 0.4375, 0.5625, 0.75, 0.5625), BooleanOp.OR);
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.125, 0.75, 0.4375, 0.875, 1.2, 0.5625), BooleanOp.OR);


                    return shape;
                }
                //if(index == 1)
                //    Shapes.empty();
                return Shapes.empty();
            }

            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.1875, 0, 0.125, 0.875, 0.1875, 0.9375), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.4375, 0.1875, 0.4375, 0.5625, 1, 0.5625), BooleanOp.OR);

                return shape;
            }
        }));

        fromBlock(BLOCKS.register("golden_trident", () -> new DecoBlock(BlockBehaviour.Properties.of(Material.WOOD), "trident", new MultiBlockDataHolder(2, new int[]{0, 0}, new int[]{1, 2}, new int[]{0, 0}))
        {
            @Override
            public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
            {
                Direction direction = state.getValue(DecoBlockSlave.FACING);
                if(index == 0)
                {
                    VoxelShape shape = Shapes.empty();
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.4375, 0, 0.4375, 0.5625, 0.75, 0.5625), BooleanOp.OR);
                    shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.125, 0.75, 0.4375, 0.875, 1.2, 0.5625), BooleanOp.OR);

                    return shape;
                }
                if(index == 1)
                    Shapes.empty();
                return Shapes.empty();
            }

            @Override
            public VoxelShape getShape(BlockState p_54561_, BlockGetter p_54562_, BlockPos p_54563_, CollisionContext p_54564_) {
                VoxelShape shape = Shapes.empty();
                Direction direction =  p_54561_.getValue(DecoBlock.FACING);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.1875, 0, 0.125, 0.875, 0.1875, 0.9375), BooleanOp.OR);
                shape = Shapes.join(shape, DecoBlock.cuboidWithRotation(direction,0.4375, 0.1875, 0.4375, 0.5625, 1, 0.5625), BooleanOp.OR);

                return shape;
            }
        }));
    }


    //public static final RegistryObject<DecoBlock> BLOCK =

    public static final RegistryObject<DecoBlockSlave> SLAVE = BLOCKS.register("slave", () -> new DecoBlockSlave(BlockBehaviour.Properties.of(Material.BARRIER)));

    public static final RegistryObject<BlockEntityType<DecoBlockEntity>> TEST = BLOCK_ENTITIES.register("mybe", () -> BlockEntityType.Builder.of(DecoBlockEntity::new, ExampleMod.list.toArray(new DecoBlock[0])).build(null));

    public static <B extends Block> void fromBlock(RegistryObject<B> block) {
        items.add(ITEMS.register(block.getId().getPath(), () -> new DecoBlockItem(block.get(), new Item.Properties().tab(ITEM_GROUP))));
    }
}
