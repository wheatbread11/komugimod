package com.wheatbread11.komugimod.item;

import java.util.function.Supplier;

import com.wheatbread11.komugimod.ModMeta;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KomugiModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, ModMeta.ID);
    public static final Supplier<CreativeModeTab> KOMUGIMOD_TAB = CREATIVE_MODE_TABS.register("komugimod",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + ModMeta.ID + ".komugimod"))
            .icon(() -> new ItemStack(KomugiModItems.KOMUGI_BREAD.get()))
            .displayItems((params, output) -> {
                output.accept(KomugiModItems.KOMUGI.get());
                output.accept(KomugiModItems.KOMUGI_HAY_BLOCK.get());
                output.accept(KomugiModItems.KOMUGI_BREAD.get());
                output.accept(KomugiModItems.KOMUGI_BLOOM.get());
            })
            .build()
    );

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
