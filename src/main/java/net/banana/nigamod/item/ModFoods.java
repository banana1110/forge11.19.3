package net.banana.nigamod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods{
public static final FoodProperties NIGABERRY = new FoodProperties.Builder().nutrition(3).fast().
        saturationMod(0.4f).effect(()-> new MobEffectInstance(MobEffects.JUMP,450), 1f).effect(()->new MobEffectInstance(MobEffects.MOVEMENT_SPEED,450), 1f).build();
}
