package net.wheatbread11.komugimod.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.wheatbread11.komugimod.KomugiMod;
import net.wheatbread11.komugimod.entity.ModEntities;
import net.wheatbread11.komugimod.entity.client.StargazerModel;
import net.wheatbread11.komugimod.entity.StargazerEntity;


@EventBusSubscriber(modid = KomugiMod.MODID)
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
