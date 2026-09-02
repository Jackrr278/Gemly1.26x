package com.jackrr.gemly.item;

import com.jackrr.gemly.Gemly;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Gemly.MODID);

    public static final DeferredItem<Item> WHITE_AURA_BOTTLE = ITEMS.registerSimpleItem("white_aura_bottle");
    public static final DeferredItem<Item> YELLOW_AURA_BOTTLE = ITEMS.registerSimpleItem("yellow_aura_bottle");
    public static final DeferredItem<Item> BLUE_AURA_BOTTLE = ITEMS.registerSimpleItem("blue_aura_bottle");
    public static final DeferredItem<Item> PINK_AURA_BOTTLE = ITEMS.registerSimpleItem("pink_aura_bottle");


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
