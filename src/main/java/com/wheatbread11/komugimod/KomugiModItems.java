package com.wheatbread11.komugimod;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KomugiModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("komugimod");

    public static DeferredItem<Item> KOMUGI = ITEMS.registerSimpleItem("komugi");
    public static DeferredItem<Item> KOMUGI_BREAD = ITEMS.registerSimpleItem("komugi_bread");

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
