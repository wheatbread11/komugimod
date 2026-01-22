package com.wheatbread11.komugimod.custom;

import java.util.Optional;
import java.util.function.Function;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.SimpleExplosionDamageCalculator;
import net.minecraft.world.phys.Vec3;

public class KomugiBloomItem extends Item {
    private static final ExplosionDamageCalculator EXPLOSION_DAMAGE_CALCULATOR = new SimpleExplosionDamageCalculator(
        true, false, Optional.of(1.22F), BuiltInRegistries.BLOCK.getTag(BlockTags.BLOCKS_WIND_CHARGE_EXPLOSIONS).map(Function.identity())
    );

    public KomugiBloomItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
        var isClient = target.level().isClientSide();

        if (!isClient) {
            stack.hurtAndBreak(1, player, LivingEntity.getSlotForHand(hand));
            
            var pos = new Vec3(
              (player.position().x + target.position().x) / 2,   
              (player.position().y + target.position().y) / 2,   
              (player.position().z + target.position().z) / 2   
            );
            player.level().explode(
                    player,
                    null,
                    EXPLOSION_DAMAGE_CALCULATOR,
                    pos.x(),
                    pos.y(),
                    pos.z(),
                    1.2F,
                    false,
                    Level.ExplosionInteraction.TRIGGER,
                    ParticleTypes.GUST_EMITTER_SMALL,
                    ParticleTypes.GUST_EMITTER_LARGE,
                    SoundEvents.WIND_CHARGE_BURST
                );
        }
        return InteractionResult.sidedSuccess(isClient);
    }
}
