package com.wheatbread11.komugimod;

import com.wheatbread11.komugimod.common.Blocks;
import com.wheatbread11.komugimod.common.Items;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModMeta.ID)
public class KomugiMod {
    public static final String MODID = ModMeta.ID;

    public KomugiMod(IEventBus modEventBus) {
        Blocks.register(modEventBus);
        Items.register(modEventBus);
    }
}