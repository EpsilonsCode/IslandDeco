package com.omicron.island_deco;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class DecoBlock extends Block implements EntityBlock {

    public final String model;
    private MultiBlockDataHolder holder;

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public DecoBlock(Properties properties, String model) {
        this(properties, model, null);
    }

    public DecoBlock(Properties properties, String model, MultiBlockDataHolder holder) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
        this.model = model;
        IslandDeco.list.add(this);
        this.holder = holder;
    }

    public MultiBlockDataHolder getHolder()
    {
        return holder;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_48725_) {
        p_48725_.add(FACING);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_) {
        return new DecoBlockEntity(p_153215_, p_153216_, model);
    }

    @Override
    public RenderShape getRenderShape(BlockState p_51567_) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        Level level = context.getLevel();
        if(holder != null)
        for(BlockPos pos : getRelPositions(blockpos, this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite())))
        {
            if(!(level.getBlockState(pos).canBeReplaced(context) && level.getWorldBorder().isWithinBounds(pos)))
                return null;
        }
        //BlockPos blockpos1 = getRelPos(blockpos, this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()), i - 1);


        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
        //return null;
    }

    private ArrayList<BlockPos> getRelPositions(BlockPos pos, BlockState state)
    {
        ArrayList<BlockPos> poses = new ArrayList<>();
        for(int i = holder.amount; i > 0; i -= 1)
            poses.add(getRelPos(pos, state, i - 1));
        return poses;
    }

    @Override
    public BlockState updateShape(BlockState pState, Direction pFacing, BlockState pFacingState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pFacingPos) {
        //BlockEntity blockEntity = pLevel.getBlockEntity(pCurrentPos);
        //int b = holder.multiBlockX[1];
        //System.out.println("update master");
        if(holder != null)
        for(BlockPos pos : getRelPositions(pCurrentPos, pState))
        {
            if(pLevel instanceof Level level)
            {
                //Level level = (Level) pLevel;
                level.sendBlockUpdated(pos, level.getBlockState(pos), level.getBlockState(pos), 26);
            }
            //System.out.println(pLevel.getBlockState(pos).getBlock());
            if(pLevel.getBlockState(pos).getBlock() != Registry.SLAVE.get())
                return Blocks.AIR.defaultBlockState();
        }
        return pState;
    }

    private void onUpdateAndRemove(BlockState state, BlockPos pos)
    {

    }

    @Override
    @Deprecated
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        //System.out.println("remove master");
        if(holder != null)
        for(BlockPos pos : getRelPositions(pPos, pState))
        {
            //System.out.println(pLevel.getBlockState(pos).getBlock());
            if(pLevel.getBlockState(pos).getBlock() == Registry.SLAVE.get())
                pLevel.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    public void setPlacedBy(Level pLevel, BlockPos pPos, BlockState pState, LivingEntity pPlacer, ItemStack pStack) {
        if(holder != null)
            for(int i = holder.amount; i > 0; i -= 1)
                pLevel.setBlock(getRelPos(pPos, pState, i - 1), Registry.SLAVE.get().getState(getNumber(-holder.multiBlockX[i - 1]), getNumber(-holder.multiBlockY[i - 1]), getNumber(-holder.multiBlockZ[i - 1]), pState.getValue(FACING)), 3);
    }

    private int getNumber(int number)
    {
        if(number < 0)
            number = 10 - number;
        return number;
    }

    private BlockPos getRelPos(BlockPos pos, BlockState state, int block)
    {
        switch (state.getValue(FACING)) {
            case EAST:
                return pos.offset(holder.multiBlockX[block], holder.multiBlockY[block], holder.multiBlockZ[block]);
            case SOUTH:
                return pos.offset(-holder.multiBlockZ[block], holder.multiBlockY[block], holder.multiBlockX[block]);
            case WEST:
                return pos.offset(-holder.multiBlockX[block], holder.multiBlockY[block], -holder.multiBlockZ[block]);
            case NORTH:
                return pos.offset(holder.multiBlockZ[block], holder.multiBlockY[block], -holder.multiBlockX[block]);
            default:
                return pos;
        }
    }

    public VoxelShape getSlaveShape(BlockPos pos, BlockState state, int index)
    {
        return Shapes.empty();
    }

    public static VoxelShape cuboidWithRotation(Direction facing, double x1, double y1, double z1, double x2, double y2, double z2)
    {
        x1 *= 16;
        y1 *= 16;
        z1 *= 16;
        x2 *= 16;
        y2 *= 16;
        z2 *= 16;
        switch (facing)
        {
            case SOUTH:
                return box(x1, y1, z1, x2, y2, z2);
            case WEST:
                return box(16 - z2, y1, x1, 16 - z1, y2, x2);
            case NORTH:
                return box(16 - x2, y1, 16 - z2, 16 - x1, y2, 16 - z1);
            case EAST:
                return box(z1, y1, 16 - x2, z2, y2, 16 - x1);
        }
        //LOGGER.warn("Sewing Table voxel shape requested for an invalid rotation " + facing + ". This can't happen. The selection/collision shape will be wrong.");
        return box(x1, y1, z1, x2, y2, z2);
    }
}
