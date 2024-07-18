package net.vercte.wilderness.content.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.vercte.wilderness.Wilderness;

public class WildernessItems {
    private static final CreateRegistrate REGISTRATE = Wilderness.registrate();

    public static final ItemEntry<Item> ICE_CREAM = REGISTRATE.item("wilderness:ice_cream", Item::new)
            .properties(p -> p.food(
                    new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(0.2F)
                            .build()
            ))
            .register();

    public static void register() {
        Wilderness.LOGGER.info("erm.......... items !");
    }
}
