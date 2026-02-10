package net.wheatbread11.komugimod.neoforge.item;

import java.util.function.Supplier;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wheatbread11.komugimod.common.ModMeta;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB, ModMeta.ID);
    public static final Supplier<CreativeModeTab> KOMUGIMOD_TAB = CREATIVE_MODE_TABS.register("komugimod",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + ModMeta.ID + ".komugimod"))
            .icon(() -> new ItemStack(ModItems.KOMUGI_BREAD.get()))
            .displayItems((params, output) -> {
                output.accept(ModItems.KOMUGI.get());
                output.accept(ModItems.KOMUGI_HAY_BLOCK.get());
                output.accept(ModItems.KOMUGI_BREAD.get());
                output.accept(ModItems.KOMUGI_BLOOM.get());
                output.accept(ModItems.STARGAZER_SPAWN_EGG.get());
            })
            .build()
    );

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
