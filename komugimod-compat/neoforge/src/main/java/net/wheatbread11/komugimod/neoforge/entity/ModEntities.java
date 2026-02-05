package net.wheatbread11.komugimod.neoforge.entity;

import java.util.function.Supplier;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wheatbread11.komugimod.common.ModMeta;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, ModMeta.ID);

    public static final Supplier<EntityType<StargazerEntity>> STARGAZER = ENTITY_TYPES.register("stargazer",
        () -> EntityType.Builder.of(StargazerEntity::new, MobCategory.MONSTER)
            .sized(1.0f, 1.0f)
            .build("stargazer")
    );

    public static void register(IEventBus modEventBus) {
        ENTITY_TYPES.register(modEventBus);
    }
}
