package net.shasank.minecraftmods.item.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

public static final FoodProperties YOMARI = new FoodProperties.Builder().nutrition(3).saturationModifier(8.25f)
        .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 400 ),0.20f).build();



}
