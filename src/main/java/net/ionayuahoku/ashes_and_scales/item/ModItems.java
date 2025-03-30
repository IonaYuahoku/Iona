package net.ionayuahoku.ashes_and_scales.item;

import net.ionayuahoku.ashes_and_scales.AshesAndScales;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AshesAndScales.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> WATER_DRAGON_MEAT = ITEMS.register("waterdragonmeat",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> AIR_DRAGON_MEAT = ITEMS.register("airdragonmeat",
            ()-> new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> WATER_DRAGON_SOUL = ITEMS.register("waterdragonsoul",
            ()->new Item(new Item.Properties().stacksTo(16).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> KHAORITE_ARROW = ITEMS.register("khaoritearrow",
            ()->new Item(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> IONA_WINGS = ITEMS.register("ionawings",
            ()->new Item(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_HOTBAR)));

    public static final RegistryObject<Item> WHITE_WINGS = ITEMS.register("whitewings",
            ()->new Item(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_HOTBAR)));
}
