package net.wheatbread11.komugimod.neoforge.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.wheatbread11.komugimod.common.ModMeta;
import net.wheatbread11.komugimod.neoforge.entity.ModEntities;
import net.wheatbread11.komugimod.neoforge.entity.client.StargazerModel;
import net.wheatbread11.komugimod.neoforge.entity.StargazerEntity;


@EventBusSubscriber(modid = ModMeta.ID)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(StargazerModel.LAYER_LOCATION, StargazerModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.STARGAZER.get(), StargazerEntity.createAttributes().build());
    }
}
