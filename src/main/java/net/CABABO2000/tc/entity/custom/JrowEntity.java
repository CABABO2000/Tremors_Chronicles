package net.CABABO2000.tc.entity.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.FlyingAnimal;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class JrowEntity extends FlyingMob implements IAnimatable, FlyingAnimal {
    private AnimationFactory factory = new AnimationFactory(this);

        public JrowEntity(EntityType<? extends FlyingMob> p_20806_, Level p_20807_) {
            super(p_20806_, p_20807_);
        }


        public static AttributeSupplier setAttributes() {
        return FlyingMob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 7.0D)
                .add(Attributes.ATTACK_DAMAGE, 6.0f)
                .add(Attributes.ATTACK_SPEED, 2.0f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.FLYING_SPEED, 5.0D).build();
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new FollowMobGoal(this, 1D, 3, 3));
        this.goalSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, Zombie.class, true));
        this.goalSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.goalSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Villager.class, true));
        this.goalSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, ZombifiedPiglin.class, true));
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CAT_STRAY_AMBIENT;
    }
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.DOLPHIN_HURT;
    }
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.DOLPHIN_DEATH;
    }
    @Override
    protected float getSoundVolume() {
        return 0.2F;
    }

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public void registerControllers(AnimationData data) {

    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
}