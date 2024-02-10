package net.thefox580.smpu_factions.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
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

    public static final RegistryObject<Item> AVALORE_SIGN = ITEMS.register("avalore_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.AVALORE_SIGN.get(), ModBlocks.AVALORE_WALL_SIGN.get()));
    public static final RegistryObject<Item> EVERBLOOM_SIGN = ITEMS.register("everbloom_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.EVERBLOOM_SIGN.get(), ModBlocks.EVERBLOOM_WALL_SIGN.get()));
    public static final RegistryObject<Item> HAWTHORN_SIGN = ITEMS.register("hawthorn_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.HAWTHORN_SIGN.get(), ModBlocks.HAWTHORN_WALL_SIGN.get()));

    public static final RegistryObject<Item> AVALORE_ADOPTION_CERTIFICATE = ITEMS.register("avalore_adoption_certificate",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EVERBLOOM_ADOPTION_CERTIFICATE = ITEMS.register("everbloom_adoption_certificate",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HAWTHORN_ADOPTION_CERTIFICATE = ITEMS.register("hawthorn_adoption_certificate",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
