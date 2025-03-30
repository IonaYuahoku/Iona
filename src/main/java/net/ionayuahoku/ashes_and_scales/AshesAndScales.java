package net.ionayuahoku.ashes_and_scales;

import com.mojang.logging.LogUtils;
import net.ionayuahoku.ashes_and_scales.events.ItemRenameEvent;
import net.ionayuahoku.ashes_and_scales.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(AshesAndScales.MOD_ID)
public class AshesAndScales {
    public static final String MOD_ID = "ashes_and_scales";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AshesAndScales() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        // Регистрируем методы для общего и клиентского сетапа
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::registerItems);

        // Регистрируем события
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
        System.out.println("Common setup for: ashesandscales");
    }

    private void registerItems(IEventBus modEventBus) {
        ModItems.register(modEventBus);

        // Регистрация события для переименования предметов
        ItemRenameEvent.register(modEventBus);  // Этот вызов теперь должен быть корректным
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM CLIENT SETUP");
        }
    }
}

