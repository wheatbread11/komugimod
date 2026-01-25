package com.wheatbread11.komugimod;

import com.google.common.eventbus.Subscribe;
import com.wheatbread11.komugimod.block.KomugiModBlocks;
import com.wheatbread11.komugimod.entity.KomugiModEntities;
import com.wheatbread11.komugimod.entity.client.StargazerRenderer;
import com.wheatbread11.komugimod.item.KomugiModItems;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(ModMeta.ID)
public class KomugiMod {
    public static final String MODID = ModMeta.ID;

    public KomugiMod(IEventBus modEventBus) {
        registerAll(modEventBus);
    }

    private void registerAll(IEventBus modEventBus){
        KomugiModBlocks.register(modEventBus);
        KomugiModItems.register(modEventBus);
        KomugiModEntities.register(modEventBus);
    }

    @EventBusSubscriber(modid = MODID)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(KomugiModEntities.STARGAZER.get(), StargazerRenderer::new);
        }
    }
}