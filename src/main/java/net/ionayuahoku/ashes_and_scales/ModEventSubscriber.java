package net.ionayuahoku.ashes_and_scales;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "ashesandscales", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onAnvilUpdate(AnvilUpdateEvent event) {
        // Ваш код для обработки события
        System.out.println("Anvil Update event triggered!");
    }
}