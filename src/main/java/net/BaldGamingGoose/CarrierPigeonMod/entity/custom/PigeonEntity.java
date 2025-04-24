package net.BaldGamingGoose.CarrierPigeonMod.entity.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class PigeonEntity extends PathfinderMob {
    public PigeonEntity(EntityType<? extends PathfinderMob> type, Level world) {
        super(type, world);
    }


@Override
protected void registerGoals() {
    this.goalSelector.addGoal(1, new FloatGoal(this));
    this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.0));
    this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 6.0F));
}

@Override
protected SoundEvent getAmbientSound() {
    return SoundEvents.PARROT_AMBIENT;
}

@Override
protected SoundEvent getHurtSound(DamageSource source) {
    return SoundEvents.PARROT_HURT;
}

@Override
protected SoundEvent getDeathSound() {
    return SoundEvents.PARROT_DEATH;
}
}