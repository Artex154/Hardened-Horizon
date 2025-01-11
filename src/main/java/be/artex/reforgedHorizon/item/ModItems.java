package be.artex.reforgedHorizon.item;

import be.artex.reforgedHorizon.HardenedHorizon;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HardenedHorizon.MODID);

    public static final DeferredItem<Item> SILENCE_TRIMMED_BOOK = ITEMS.register("silence_trimmed_book",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
