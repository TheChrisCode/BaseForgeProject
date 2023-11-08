package com.pushingpolygons.mymod.item;

import com.pushingpolygons.mymod.MyMod;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    // Add a new Gem called ALEXANDRITE.
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUCKY = ITEMS.register("ducky", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DUCKY_SWORD = ITEMS.register("ducky_sword", () -> new SwordItem(Tiers.EXAMPLE, 100,100, new Item.Properties()));

    // This Method has to be called in the Class MyMod.
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

    public static class Tiers
    {
        public static final Tier EXAMPLE = new ForgeTier(4, 100000, 10f, 50, 10000, null, () -> Ingredient.of(DUCKY.get()));
    }
}
