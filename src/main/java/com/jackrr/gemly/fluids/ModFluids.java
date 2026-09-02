package com.jackrr.gemly.fluids;

import com.jackrr.gemly.Gemly;
import com.jackrr.gemly.block.ModBlocks;
import com.jackrr.gemly.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, Gemly.MODID);

    public static final DeferredHolder<Fluid, BaseFlowingFluid> WHITE_AURA =
            FLUIDS.register("white_aura",
                    () -> new BaseFlowingFluid.Source(createWhiteProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid> WHITE_AURA_FLOWING =
            FLUIDS.register("flowing_white_aura",
                    () -> new BaseFlowingFluid.Flowing(createWhiteProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid> YELLOW_AURA =
            FLUIDS.register("yellow_aura",
                    () -> new BaseFlowingFluid.Source(createYellowProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid> YELLOW_AURA_FLOWING =
            FLUIDS.register("flowing_yellow_aura",
                    () -> new BaseFlowingFluid.Flowing(createYellowProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid> BLUE_AURA =
            FLUIDS.register("blue_aura",
                    () -> new BaseFlowingFluid.Source(createBlueProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid> BLUE_AURA_FLOWING =
            FLUIDS.register("flowing_blue_aura",
                    () -> new BaseFlowingFluid.Flowing(createBlueProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid> PINK_AURA =
            FLUIDS.register("pink_aura",
                    () -> new BaseFlowingFluid.Source(createPinkProperties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid> PINK_AURA_FLOWING =
            FLUIDS.register("flowing_pink_aura",
                    () -> new BaseFlowingFluid.Flowing(createPinkProperties()));

    private static BaseFlowingFluid.Properties createWhiteProperties() {
        return new BaseFlowingFluid.Properties(
                ModFluidTypes.WHITE_AURA_TYPE,
                () -> WHITE_AURA.get(),
                () -> WHITE_AURA_FLOWING.get()

        )
                .bucket(ModItems.WHITE_AURA_BOTTLE::get)
                .block(ModBlocks.WHITE_AURA_BLOCK::get);
    }

    private static BaseFlowingFluid.Properties createYellowProperties() {
        return new BaseFlowingFluid.Properties(
                ModFluidTypes.YELLOW_AURA_TYPE,
                () -> YELLOW_AURA.get(),
                () -> YELLOW_AURA_FLOWING.get()

        )
                .bucket(ModItems.YELLOW_AURA_BOTTLE::get)
                .block(ModBlocks.YELLOW_AURA_BLOCK::get);
    }

    private static BaseFlowingFluid.Properties createBlueProperties() {
        return new BaseFlowingFluid.Properties(
                ModFluidTypes.BLUE_AURA_TYPE,
                () -> BLUE_AURA.get(),
                () -> BLUE_AURA_FLOWING.get()

        )
                .bucket(ModItems.BLUE_AURA_BOTTLE::get)
                .block(ModBlocks.BLUE_AURA_BLOCK::get);
    }

    private static BaseFlowingFluid.Properties createPinkProperties() {
        return new BaseFlowingFluid.Properties(
                ModFluidTypes.PINK_AURA_TYPE,
                () -> PINK_AURA.get(),
                () -> PINK_AURA_FLOWING.get()

        )
                .bucket(ModItems.PINK_AURA_BOTTLE::get)
                .block(ModBlocks.PINK_AURA_BLOCK::get);
    }




    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}