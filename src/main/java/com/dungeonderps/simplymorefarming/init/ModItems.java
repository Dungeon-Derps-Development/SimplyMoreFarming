package com.dungeonderps.simplymorefarming.init;

import com.dungeonderps.simplymorefarming.SimplyMoreFarming;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    // FRUIT

    // JUICE
    public static Item juice_apple;
    public static Item juice_apricot;
    public static Item juice_banana;
    public static Item juice_blackberry;
    public static Item juice_blueberry;
    public static Item juice_cactus_fruit;
    public static Item juice_cantaloupe;
    public static Item juice_carrot;
    public static Item juice_cherry;
    public static Item juice_grape;
    public static Item juice_honeydew;
    public static Item juice_mango;
    public static Item juice_melon;
    public static Item juice_orange;
    public static Item juice_pear;
    public static Item juice_plum;
    public static Item juice_pumpkin;
    public static Item juice_raspberry;
    public static Item juice_strawberry;
    public static Item juice_tomato;

    public static void registerAll(RegistryEvent.Register<Item> event) {
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) {
            return;
        }
        juice_apple = register("juice_apple", new Item((new Item.Properties()).group(SimplyMoreFarming.ITEM_GROUP).food(new Food.Builder().hunger(6).saturation(0.5F).effect(ModItems::getEffect, 1F).build())));
    }

    private static <T extends Item> T register(String name, T item) {
        ResourceLocation id = SimplyMoreFarming.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    private static EffectInstance getEffect() {
        return new EffectInstance(Effects.SPEED, 500, 0, false, true);
    }
}
