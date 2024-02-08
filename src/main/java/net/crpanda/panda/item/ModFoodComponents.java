package net.crpanda.panda.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PEANUT = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent ROASTED_PEANUT = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
}
