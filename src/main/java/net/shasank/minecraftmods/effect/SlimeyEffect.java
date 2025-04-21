package net.shasank.minecraftmods.effect;

import com.ibm.icu.impl.coll.UVector32;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class SlimeyEffect extends MobEffect {

public SlimeyEffect(MobEffectCategory pcategory, int pcolor) {
    super(pcategory,pcolor);
}

@Override
public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier){
        if (pLivingEntity.horizontalCollision){
            Vec3 initialVec = pLivingEntity.getDeltaMovement();
            Vec3 climbVec = new Vec3(initialVec.x,0.20,initialVec.z);
            pLivingEntity.setDeltaMovement(climbVec.scale(0.970));
            return true;
        }

    return super.applyEffectTick(pLivingEntity,pAmplifier);
}

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return true;
    }
}
