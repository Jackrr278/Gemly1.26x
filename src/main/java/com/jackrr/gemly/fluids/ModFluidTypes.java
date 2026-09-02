package com.jackrr.gemly.fluids;

import com.jackrr.gemly.Gemly;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluidTypes {

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, Gemly.MODID);

    public static final DeferredHolder<FluidType, FluidType> WHITE_AURA_TYPE =
            FLUID_TYPES.register("white_aura", () ->
                    new WhiteAuraFluid(
                            FluidType.Properties.create()
                                    .canExtinguish(true)
                                    .canConvertToSource(true)
                                    .supportsBoating(true)
                                    .canHydrate(true)
                                    .canSwim(true)
                                    .canDrown(true)
                                    .isWaterLike(true)
                    ));

    public static final DeferredHolder<FluidType, FluidType> YELLOW_AURA_TYPE =
            FLUID_TYPES.register("yellow_aura", () ->
                    new WhiteAuraFluid(
                            FluidType.Properties.create()
                                    .canExtinguish(true)
                                    .canConvertToSource(true)
                                    .supportsBoating(true)
                                    .canHydrate(true)
                                    .canSwim(true)
                                    .canDrown(true)
                                    .isWaterLike(true)
                    ));

    public static final DeferredHolder<FluidType, FluidType> BLUE_AURA_TYPE =
            FLUID_TYPES.register("blue_aura", () ->
                    new WhiteAuraFluid(
                            FluidType.Properties.create()
                                    .canExtinguish(true)
                                    .canConvertToSource(true)
                                    .supportsBoating(true)
                                    .canHydrate(true)
                                    .canSwim(true)
                                    .canDrown(true)
                                    .isWaterLike(true)
                    ));

    public static final DeferredHolder<FluidType, FluidType> PINK_AURA_TYPE =
            FLUID_TYPES.register("pink_aura", () ->
                    new WhiteAuraFluid(
                            FluidType.Properties.create()
                                    .canExtinguish(true)
                                    .canConvertToSource(true)
                                    .supportsBoating(true)
                                    .canHydrate(true)
                                    .canSwim(true)
                                    .canDrown(true)
                                    .isWaterLike(true)
                    ));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}