package com.wheatbread11.komugimod;

import com.wheatbread11.komugimod.block.ModBlocks;
import com.wheatbread11.komugimod.entity.ModEntities;
import com.wheatbread11.komugimod.entity.client.StargazerRenderer;
import com.wheatbread11.komugimod.item.ModItems;

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
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);
    }

    @EventBusSubscriber(modid = MODID)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.STARGAZER.get(), StargazerRenderer::new);
        }
    }
}