package net.ionayuahoku.ashes_and_scales.events;

import net.ionayuahoku.ashes_and_scales.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ItemRenameEvent {

    @SubscribeEvent
    public static void onItemRename(AnvilUpdateEvent event) {
        ItemStack leftItem = event.getLeft();
        String newName = event.getOutput().hasCustomHoverName() ? event.getOutput().getHoverName().getString() : null;

        // Проверяем, если предмет - "White Wings" и его переименовали в "Iona's Wings"
        if (leftItem.getItem() == ModItems.WHITE_WINGS.get() && newName != null && newName.equals("Iona's Wings")) {
            // Создаём новый предмет "Iona Wings"
            ItemStack newItem = new ItemStack(ModItems.IONA_WINGS.get());
            newItem.setHoverName(Component.literal(newName)); // Сохраняем новое имя

            // Устанавливаем новый предмет как результат
            event.setOutput(newItem);
            event.setCost(3); // Указываем стоимость в опыте
            event.setMaterialCost(1); // Указываем количество использованных предметов
        }
    }

    // Метод для регистрации события
    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(ItemRenameEvent::onItemRename);
    }
}
