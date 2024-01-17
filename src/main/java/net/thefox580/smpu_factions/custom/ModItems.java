package net.thefox580.smpu_factions.custom;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu_factions.SMPUFactions;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SMPUFactions.MOD_ID);

    public static final RegistryObject<Item> LORE_BERRIES = ITEMS.register("lore_berries",
            () -> new Item(new Item.Properties().food(ModFood.LORE_BERRIES)));

    public static final RegistryObject<Item> THORNY_FRUIT = ITEMS.register("thorny_fruit",
            () -> new Item(new Item.Properties().food(ModFood.THORNY_FRUIT)));

    public static final RegistryObject<Item> BLOOMING_GRAPES = ITEMS.register("blooming_grapes",
            () -> new Item(new Item.Properties().food(ModFood.BLOOMING_GRAPES)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
