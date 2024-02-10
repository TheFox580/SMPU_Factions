package net.thefox580.smpu_factions.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu_factions.SMPUFactions;
import net.thefox580.smpu_factions.custom.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SMPUFactions.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.AVALORE_SIGN.get(), ModBlocks.AVALORE_WALL_SIGN.get(),
                            ModBlocks.EVERBLOOM_SIGN.get(), ModBlocks.EVERBLOOM_WALL_SIGN.get(),
                            ModBlocks.HAWTHORN_SIGN.get(), ModBlocks.HAWTHORN_WALL_SIGN.get()).build(null));

    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }

}
