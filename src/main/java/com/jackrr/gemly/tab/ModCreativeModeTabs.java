package com.jackrr.gemly.tab;

import com.jackrr.gemly.Gemly;
import com.jackrr.gemly.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gemly.MODID);

    public static final Supplier<CreativeModeTab> GEMLY_TAB = CREATIVE_MODE_TABS.register("gemify_tab",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WHITE_AURA_BOTTLE.get()))
            .title(Component.translatable("creativetab.gemify.gemify_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.WHITE_AURA_BOTTLE);
                output.accept(ModItems.YELLOW_AURA_BOTTLE);
                output.accept(ModItems.BLUE_AURA_BOTTLE);
                output.accept(ModItems.PINK_AURA_BOTTLE);
            })



            .build());





    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
