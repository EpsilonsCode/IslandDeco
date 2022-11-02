package com.omicron.island_deco;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DecoBlockSlave extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final IntegerProperty MASTER_X = IntegerProperty.create("master_x", 0, 20);
    public static final IntegerProperty MASTER_Y = IntegerProperty.create("master_y", 0, 20);
    public static final IntegerProperty MASTER_Z = IntegerProperty.create("master_z", 0, 20);
    public DecoBlockSlave(Properties pProperties) {
        super(pProperties.noOcclusion());
        this.registerDefaultState(this.stateDefinition.any().setValue(MASTER_X, Integer.valueOf(0)).setValue(MASTER_Y, Integer.valueOf(0)).setValue(MASTER_Z, Integer.valueOf(0)).setValue(FACING, Direction.NORTH));
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        //BlockEntity blockEntity = pLevel.getBlockEntity(pCurrentPos);
        //int b = holder.multiBlockX[1];
        System.out.println(pLevel.getBlockState(getMasterPos(pCurrentPos, pState)).getBlock());
        if(pLevel instanceof Level level)
        {
            BlockPos pos = getMasterPos(pCurrentPos, pState);
            level.setBlockAndUpdate(pos, level.getBlockState(pos));
            if(!(level.getBlockState(pos).getBlock() instanceof DecoBlock))
                return Blocks.AIR.defaultBlockState();
            //super.updateShape();
        }
        return pState;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        if(getter.getBlockState(getMasterPos(pos, state)).getBlock() instanceof DecoBlock block)
        {
            MultiBlockDataHolder holder = block.getHolder();
            for(int i = holder.amount; i > 0; i -= 1)
            {
                if(holder.multiBlockX[i - 1] == getNumber(state.getValue(MASTER_X)) * -1 && holder.multiBlockY[i - 1] == getNumber(state.getValue(MASTER_Y)) * -1 && holder.multiBlockZ[i - 1] == getNumber(state.getValue(MASTER_Z)) * -1)
                    return block.getSlaveShape(pos, state, i - 1);
            }
        }
        return Shapes.empty();
    }

    @Override
    @Deprecated
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        //System.out.println("remove slave");
        BlockPos pos = getMasterPos(pPos, pState);
        if(pLevel.getBlockState(pos).getBlock() instanceof DecoBlock)
            pLevel.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        //System.out.println(pLevel.getBlockState(pos).getBlock());
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    public BlockState getState(int x, int y, int z, Direction facing)
    {
        return this.defaultBlockState().setValue(MASTER_X, x).setValue(MASTER_Y, y).setValue(MASTER_Z, z).setValue(FACING, facing);
    }

    private int getNumber(int number)
    {
        if(number > 10)
            number = (number - 10) * -1;
        return number;
    }

    private BlockPos getMasterPos(BlockPos pos, BlockState state)
    {
        int x = getNumber(state.getValue(MASTER_X).intValue());
        int y = getNumber(state.getValue(MASTER_Y).intValue());
        int z = getNumber(state.getValue(MASTER_Z).intValue());
        switch (state.getValue(FACING)) {
            case EAST:
                return pos.offset(x, y, z);
            case SOUTH:
                return pos.offset(-z, y, x);
            case WEST:
                return pos.offset(-x, y, -z);
            case NORTH:
                return pos.offset(z, y, -x);
            default:
                return pos;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, MASTER_X, MASTER_Y, MASTER_Z);
    }

    @Override
    public RenderShape getRenderShape(BlockState p_51567_) {
        return RenderShape.INVISIBLE;
    }
}
