package com.wheatbread11.komugimod.common;

import com.wheatbread11.komugimod.ModMeta;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModMeta.ID);

    public static final DeferredItem<BlockItem> KOMUGI_HAY_BLOCK = ITEMS.registerSimpleBlockItem(Blocks.KOMUGI_HAY_BLOCK);

    public static final DeferredItem<Item> KOMUGI = ITEMS.registerSimpleItem("komugi");
    public static final DeferredItem<Item> KOMUGI_BREAD = ITEMS.register("komugi_bread",
        () -> new Item(new Item.Properties()
            .food(Foods.KOMUGI_BREAD))
    );

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
