package com.wheatbread11.komugimod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModMeta.ID)
public class KomugiMod {
    public static final String MODID = ModMeta.ID;

    public KomugiMod(IEventBus modEventBus) {
        KomugiModBlocks.register(modEventBus);
        KomugiModItems.register(modEventBus);
    }
}