package com.pushingpolygons.mymod.item;

import com.pushingpolygons.mymod.MyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    // Add a new Gem called ALEXANDRITE.
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite", () -> new Item(new Item.Properties()));

    // This Method has to be called in the Class MyMod.
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
