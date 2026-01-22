package com.wheatbread11.komugimod.common;

import com.wheatbread11.komugimod.ModMeta;

import net.minecraft.world.level.block.HayBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ModMeta.ID);

    public static final DeferredBlock<HayBlock> KOMUGI_HAY_BLOCK = BLOCKS.register("komugi_hay_block",
        () -> new HayBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .instrument(NoteBlockInstrument.BANJO)
            .strength(0.6F)
            .sound(SoundType.GRASS))
    );

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
