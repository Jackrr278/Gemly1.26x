package com.jackrr.gemly.item;

import com.jackrr.gemly.Gemly;
import com.jackrr.gemly.fluids.ModFluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Gemly.MODID);

    public static final DeferredItem<BucketItem> WHITE_AURA_BOTTLE = ITEMS.registerItem(
                    "white_aura_bottle",
                    props -> new BucketItem(
                            ModFluids.WHITE_AURA.get(),
                            props.stacksTo(1)
                    )
            );

    public static final DeferredItem<Item> YELLOW_AURA_BOTTLE = ITEMS.registerItem(
            "yellow_aura_bottle",
            props -> new BucketItem(
                    ModFluids.YELLOW_AURA.get(),
                    props.stacksTo(1)
            )
    );

    public static final DeferredItem<Item> BLUE_AURA_BOTTLE = ITEMS.registerItem(
            "blue_aura_bottle",
            props -> new BucketItem(
                    ModFluids.BLUE_AURA.get(),
                    props.stacksTo(1)
            )
    );

    public static final DeferredItem<Item> PINK_AURA_BOTTLE = ITEMS.registerItem(
            "pink_aura_bottle",
            props -> new BucketItem(
                    ModFluids.PINK_AURA.get(),
                    props.stacksTo(1)
            ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
