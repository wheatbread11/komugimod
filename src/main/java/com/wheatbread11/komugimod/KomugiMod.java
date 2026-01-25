package com.wheatbread11.komugimod;

import com.wheatbread11.komugimod.block.KomugiModBlocks;
import com.wheatbread11.komugimod.item.KomugiModItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(ModMeta.ID)
public class KomugiMod {
    public static final String MODID = ModMeta.ID;

    public KomugiMod(IEventBus modEventBus) {
        registerAll(modEventBus);
    }

    private void registerAll(IEventBus modEventBus){
        KomugiModBlocks.register(modEventBus);
        KomugiModItems.register(modEventBus);
    }
}