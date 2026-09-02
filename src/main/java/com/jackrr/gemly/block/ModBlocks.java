package com.jackrr.gemly.block;

import com.jackrr.gemly.Gemly;
import com.jackrr.gemly.fluids.ModFluids;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Gemly.MODID);

    public static final DeferredBlock<LiquidBlock> WHITE_AURA_BLOCK =
            BLOCKS.registerBlock(
                    "white_aura",
                    props -> new LiquidBlock(
                            ModFluids.WHITE_AURA.get(),
                            props
                    ),
                    props -> props.ofFullCopy(Blocks.WATER)
            );

    public static final DeferredBlock<LiquidBlock> YELLOW_AURA_BLOCK =
            BLOCKS.registerBlock(
                    "yellow_aura",
                    props -> new LiquidBlock(
                            ModFluids.YELLOW_AURA.get(),
                            props
                    ),
                    props -> props.ofFullCopy(Blocks.WATER)
            );

    public static final DeferredBlock<LiquidBlock> BLUE_AURA_BLOCK =
            BLOCKS.registerBlock(
                    "blue_aura",
                    props -> new LiquidBlock(
                            ModFluids.BLUE_AURA.get(),
                            props
                    ),
                    props -> props.ofFullCopy(Blocks.WATER)
            );

    public static final DeferredBlock<LiquidBlock> PINK_AURA_BLOCK =
            BLOCKS.registerBlock(
                    "pink_aura",
                    props -> new LiquidBlock(
                            ModFluids.PINK_AURA.get(),
                            props
                    ),
                    props -> props.ofFullCopy(Blocks.WATER)
            );

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}