package net.joe.usv_game_dev_mod.item;

import net.joe.usv_game_dev_mod.USVMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, USVMod.MOD_ID);

    public static final RegistryObject<Item> FAIRY_DUST = ITEMS.register( "fairy_dust",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> FIRE_FAIRY_BOTTLE = ITEMS.register( "fire_fairy_bottle",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> ICE_FAIRY_BOTTLE = ITEMS.register( "ice_fairy_bottle",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> POISON_FAIRY_BOTTLE = ITEMS.register( "poison_fairy_bottle",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BOMB_FAIRY_BOTTLE = ITEMS.register( "bomb_fairy_bottle",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> BUTTER = ITEMS.register( "butter",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> LIGHT_BLUE_COTTON_CANDY = ITEMS.register( "light_blue_cotton_candy",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(2.4f).build())));

    public static final RegistryObject<Item> PINK_COTTON_CANDY = ITEMS.register( "pink_cotton_candy",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(2.4f).build())));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
