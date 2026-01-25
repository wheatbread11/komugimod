package com.wheatbread11.komugimod.event;

import com.wheatbread11.komugimod.ModMeta;
import com.wheatbread11.komugimod.entity.KomugiModEntities;
import com.wheatbread11.komugimod.entity.client.StargazerModel;
import com.wheatbread11.komugimod.entity.custom.StargazerEntity;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = ModMeta.ID)
public class KomugiModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(StargazerModel.LAYER_LOCATION, StargazerModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(KomugiModEntities.STARGAZER.get(), StargazerEntity.createAttributes().build());
    }
}
