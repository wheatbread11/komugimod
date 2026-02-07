package net.wheatbread11.komugimod.neoforge.entity;

import java.util.Optional;
import java.util.function.Function;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ExplosionDamageCalculator;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.SimpleExplosionDamageCalculator;

public class StargazerEntity extends Monster{
    private static final int SPAWN_PROTECTION_DURATION = 20;
    private static final float BLAST_DISTANCE = 2.4f;
    private static final float BLAST_RADIUS = 3.6f;
    private static final float BLAST_KNOCKBACK = 3.6f;
    private static final ExplosionDamageCalculator EXPLOSION_DAMAGE_CALCULATOR = new SimpleExplosionDamageCalculator(
        true,
        true,
        Optional.of(BLAST_KNOCKBACK),
        BuiltInRegistries.BLOCK.getTag(BlockTags.AIR).map(Function.identity())
    );

    public final AnimationState idleAnimationState = new AnimationState();
    
    private int spawnProtection = SPAWN_PROTECTION_DURATION;

    public StargazerEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0, false));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 0.8));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
            .add(Attributes.MAX_HEALTH, 16.0)
            .add(Attributes.MOVEMENT_SPEED, 0.4)
            .add(Attributes.FOLLOW_RANGE, 24.0)
            .add(Attributes.ATTACK_DAMAGE, 2.0);
    }

    @Override
    public void tick() {
        if (!this.level().isClientSide()) {
            if (spawnProtection > 0) {
                spawnProtection--;
            }

            if (this.isAlive() && spawnProtection <= 0) {
                if (this.isOnFire()) {
                    this.explode();
                }
                if (this.level().hasNearbyAlivePlayer(this.getX(), this.getY(), this.getZ(), BLAST_DISTANCE)) {
                    this.explode();
                }
            }
        }

        super.tick();
    }
    
    @Override
    protected InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (itemstack.is(ItemTags.CREEPER_IGNITERS)) {
            SoundEvent soundevent = itemstack.is(Items.FIRE_CHARGE) ? SoundEvents.FIRECHARGE_USE : SoundEvents.FLINTANDSTEEL_USE;
            this.level()
                .playSound(
                    player,
                    this.getX(),
                    this.getY(),
                    this.getZ(),
                    soundevent,
                    this.getSoundSource(),
                    1.0F,
                    this.random.nextFloat() * 0.4F + 0.8F
                );
            if (!this.level().isClientSide) {
                this.explode();
            }

            return InteractionResult.sidedSuccess(this.level().isClientSide);
        } else {
            return super.mobInteract(player, hand);
        }
    }

    private void explode() {
        this.dead = true;
        this.level()
            .explode(
                this,
                null,
                EXPLOSION_DAMAGE_CALCULATOR,
                this.getX(),
                this.getY(),
                this.getZ(),
                BLAST_RADIUS,
                true,
                Level.ExplosionInteraction.NONE,
                ParticleTypes.EXPLOSION,
                ParticleTypes.EXPLOSION_EMITTER,
                SoundEvents.GENERIC_EXPLODE
            );
        this.triggerOnDeathMobEffects(Entity.RemovalReason.KILLED);
        this.discard();
    }
}
