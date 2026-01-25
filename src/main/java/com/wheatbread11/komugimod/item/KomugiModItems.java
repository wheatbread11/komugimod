package com.wheatbread11.komugimod.item;

import com.wheatbread11.komugimod.ModMeta;
import com.wheatbread11.komugimod.block.KomugiModBlocks;
import com.wheatbread11.komugimod.entity.KomugiModEntities;
import com.wheatbread11.komugimod.item.custom.KomugiBloomItem;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KomugiModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModMeta.ID);

    public static final DeferredItem<BlockItem> KOMUGI_HAY_BLOCK = ITEMS.registerSimpleBlockItem(KomugiModBlocks.KOMUGI_HAY_BLOCK);

    public static final DeferredItem<Item> KOMUGI = ITEMS.registerSimpleItem("komugi");
    public static final DeferredItem<Item> KOMUGI_BREAD = ITEMS.register("komugi_bread",
        () -> new Item(new Item.Properties()
            .food(KomugiModFoodProperties.KOMUGI_BREAD))
    );
    public static final DeferredItem<Item> KOMUGI_BLOOM = ITEMS.register("komugi_bloom",
        () -> new KomugiBloomItem(new Item.Properties()
            .durability(512))
    );

    public static final DeferredItem<Item> STARGAZER_SPAWN_EGG = ITEMS.register("stargazer_spawn_egg",
        () -> new DeferredSpawnEggItem(
            KomugiModEntities.STARGAZER,
            0xf89520,
            0xb8bdbe,
            new Item.Properties())
    );

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
        KomugiModCreativeModeTab.register(modEventBus);
    }
}
