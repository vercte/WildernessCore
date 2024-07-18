package net.vercte.wilderness;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import net.vercte.wilderness.content.registry.WildernessItems;
import org.slf4j.Logger;

@Mod(Wilderness.MODID)
public class Wilderness {
    public static final String MODID = "wilderness";
    public static final NonNullSupplier<CreateRegistrate> REGISTRATE = NonNullSupplier.lazy(() -> CreateRegistrate.create(MODID));

    public static final Logger LOGGER = LogUtils.getLogger();


    public Wilderness() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRATE.get().registerEventListeners(modEventBus);

        WildernessItems.register();
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }
}
