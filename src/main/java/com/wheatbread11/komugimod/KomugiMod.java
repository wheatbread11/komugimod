package com.wheatbread11.komugimod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(KomugiMod.MODID)
public class KomugiMod {
    public static final String MODID = "komugimod";

    public KomugiMod(IEventBus modEventBus) {
        KomugiModItems.register(modEventBus);
    }
}