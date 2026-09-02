package com.jackrr.gemly.client;

import com.jackrr.gemly.fluids.ModFluids;
import net.minecraft.client.renderer.block.FluidModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.resources.Identifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;

@Mod(value = "gemly", dist = Dist.CLIENT)
public class GemlyClient {

    public GemlyClient(IEventBus modEventBus) {
        modEventBus.addListener(GemlyClient::registerFluidModels);
    }

    private static void registerFluidModels(RegisterFluidModelsEvent event) {

        // White Aura
        event.register(
                new FluidModel.Unbaked(
                        new Material(Identifier.withDefaultNamespace("block/water_still")),
                        new Material(Identifier.withDefaultNamespace("block/water_flow")),
                        null,
                        state -> 0xFFFFFFFF
                ),
                ModFluids.WHITE_AURA.get(),
                ModFluids.WHITE_AURA_FLOWING.get()
        );

        // Yellow Aura
        event.register(
                new FluidModel.Unbaked(
                        new Material(Identifier.withDefaultNamespace("block/water_still")),
                        new Material(Identifier.withDefaultNamespace("block/water_flow")),
                        null,
                        state -> 0xFFFFFF00
                ),
                ModFluids.YELLOW_AURA.get(),
                ModFluids.YELLOW_AURA_FLOWING.get()
        );

        // Blue Aura
        event.register(
                new FluidModel.Unbaked(
                        new Material(Identifier.withDefaultNamespace("block/water_still")),
                        new Material(Identifier.withDefaultNamespace("block/water_flow")),
                        null,
                        state -> 0xFF0080FF
                ),
                ModFluids.BLUE_AURA.get(),
                ModFluids.BLUE_AURA_FLOWING.get()
        );

        // Pink Aura
        event.register(
                new FluidModel.Unbaked(
                        new Material(Identifier.withDefaultNamespace("block/water_still")),
                        new Material(Identifier.withDefaultNamespace("block/water_flow")),
                        null,
                        state -> 0xFFFF69B4
                ),
                ModFluids.PINK_AURA.get(),
                ModFluids.PINK_AURA_FLOWING.get()
        );
    }
}