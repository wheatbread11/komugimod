package net.wheatbread11.komugimod.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.wheatbread11.komugimod.entity.ModEntities;

public class StargazerPieBlock extends Block {
    public static final VoxelShape SHAPE = Block.box((double)1.0F, (double)0.0F, (double)1.0F, (double)15.0F, (double)8.0F, (double)15.0F);
    public static final MapCodec<StargazerPieBlock> CODEC = simpleCodec(StargazerPieBlock::new);

    protected StargazerPieBlock(Properties properties) {
        super(properties);
    }

    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            if (eatEndless(player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (player.getItemInHand(InteractionHand.MAIN_HAND).isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }

        return eatEndless(player);
    }

    protected static InteractionResult eatEndless(Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.getFoodData().eat(2, 0.0F);

            return InteractionResult.SUCCESS;
        }
    }

    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!oldState.is(state.getBlock())) {
            this.trySpawnStargazer(level, pos);
        }
    }

    protected void trySpawnStargazer(Level level, BlockPos pos) {
        var onBlock = level.getBlockState(pos.below());
        if (onBlock == Blocks.TNT.defaultBlockState()) {
            level.destroyBlock(pos, false);
            level.destroyBlock(pos.below(), false);
            createStargazer(level, pos.below());
        }
    }

    protected void createStargazer(Level level, BlockPos pos) {
        var stargazer = ModEntities.STARGAZER.get().create(level);
        stargazer.moveTo(new Vec3(pos.getX() + 0.5F, pos.getY(), pos.getZ() + 0.5F));
        level.addFreshEntity(stargazer);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected MapCodec<StargazerPieBlock> codec() {
        return CODEC;
    }
}
