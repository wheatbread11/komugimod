package net.wheatbread11.komugimod.block;

import net.minecraft.world.level.block.HayBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wheatbread11.komugimod.KomugiMod;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(KomugiMod.MODID);

    public static final DeferredBlock<HayBlock> KOMUGI_HAY_BLOCK = BLOCKS.register("komugi_hay_block",
        () -> new HayBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .instrument(NoteBlockInstrument.BANJO)
            .strength(0.6F)
            .sound(SoundType.GRASS)
        )
    );
    public static final DeferredBlock<StargazerPieBlock> STARGAZER_PIE = BLOCKS.register("stargazer_pie",
            () -> new StargazerPieBlock(BlockBehaviour.Properties.of()
                    .forceSolidOn().strength(0.5F)
                    .sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY)
            )
    );

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
