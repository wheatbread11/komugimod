package net.wheatbread11.komugimod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOMUGI_BREAD = new FoodProperties.Builder()
        .nutrition(5)
        .saturationModifier(0.8f)
        .build();
}