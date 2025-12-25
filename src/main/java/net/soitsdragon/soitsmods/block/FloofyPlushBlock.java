package net.soitsdragon.soitsmods.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.util.FastColor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class FloofyPlushBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	private static final VoxelShape SHAPE_NORTH = Shapes.or(box(3, 9.5, 6, 12, 18.5, 15), box(2.8, 9.3, 5.7, 12.2, 18.7, 15.1), box(5, 2.5, 9.2, 9.9, 9.5, 11.7), box(4.8, 2.3, 9, 10.1, 9.7, 11.9), box(10.5, 2.3, 9, 13.5, 9.7, 11.8),
			box(10.55, 2.8, 9.3, 13, 9.8, 11.6), box(1.61722, 2.71617, 9, 4.61722, 10.11617, 11.8), box(2.06722, 2.91617, 9.3, 4.51722, 9.91617, 11.6), box(7.2, -0.325, 3.85, 9.9, 2.5, 11.25), box(7.35, 0, 4.05, 9.8, 2.5, 11.05),
			box(4.75, -0.275, 3.85, 7.4, 2.5, 11.25), box(4.85, 0, 4.05, 7.3, 2.5, 11.05));
	private static final VoxelShape SHAPE_SOUTH = Shapes.or(box(4, 9.5, 1, 13, 18.5, 10), box(3.8, 9.3, 0.9, 13.2, 18.7, 10.3), box(6.1, 2.5, 4.3, 11, 9.5, 6.8), box(5.9, 2.3, 4.1, 11.2, 9.7, 7), box(2.5, 2.3, 4.2, 5.5, 9.7, 7),
			box(3, 2.8, 4.4, 5.45, 9.8, 6.7), box(11.38278, 2.71617, 4.2, 14.38278, 10.11617, 7), box(11.48278, 2.91617, 4.4, 13.93278, 9.91617, 6.7), box(6.1, -0.325, 4.75, 8.8, 2.5, 12.15), box(6.2, 0, 4.95, 8.65, 2.5, 11.95),
			box(8.6, -0.275, 4.75, 11.25, 2.5, 12.15), box(8.7, 0, 4.95, 11.15, 2.5, 11.95));
	private static final VoxelShape SHAPE_EAST = Shapes.or(box(1, 9.5, 3, 10, 18.5, 12), box(0.9, 9.3, 2.8, 10.3, 18.7, 12.2), box(4.3, 2.5, 5, 6.8, 9.5, 9.9), box(4.1, 2.3, 4.8, 7, 9.7, 10.1), box(4.2, 2.3, 10.5, 7, 9.7, 13.5),
			box(4.4, 2.8, 10.55, 6.7, 9.8, 13), box(4.2, 2.71617, 1.61722, 7, 10.11617, 4.61722), box(4.4, 2.91617, 2.06722, 6.7, 9.91617, 4.51722), box(4.75, -0.325, 7.2, 12.15, 2.5, 9.9), box(4.95, 0, 7.35, 11.95, 2.5, 9.8),
			box(4.75, -0.275, 4.75, 12.15, 2.5, 7.4), box(4.95, 0, 4.85, 11.95, 2.5, 7.3));
	private static final VoxelShape SHAPE_WEST = Shapes.or(box(6, 9.5, 4, 15, 18.5, 13), box(5.7, 9.3, 3.8, 15.1, 18.7, 13.2), box(9.2, 2.5, 6.1, 11.7, 9.5, 11), box(9, 2.3, 5.9, 11.9, 9.7, 11.2), box(9, 2.3, 2.5, 11.8, 9.7, 5.5),
			box(9.3, 2.8, 3, 11.6, 9.8, 5.45), box(9, 2.71617, 11.38278, 11.8, 10.11617, 14.38278), box(9.3, 2.91617, 11.48278, 11.6, 9.91617, 13.93278), box(3.85, -0.325, 6.1, 11.25, 2.5, 8.8), box(4.05, 0, 6.2, 11.05, 2.5, 8.65),
			box(3.85, -0.275, 8.6, 11.25, 2.5, 11.25), box(4.05, 0, 8.7, 11.05, 2.5, 11.15));

	public FloofyPlushBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public Integer getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
		return FastColor.ARGB32.opaque(-16737793);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return (switch (state.getValue(FACING)) {
			case NORTH -> SHAPE_NORTH;
			case SOUTH -> SHAPE_SOUTH;
			case EAST -> SHAPE_EAST;
			case WEST -> SHAPE_WEST;
			default -> SHAPE_NORTH;
		});
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 25;
	}
}