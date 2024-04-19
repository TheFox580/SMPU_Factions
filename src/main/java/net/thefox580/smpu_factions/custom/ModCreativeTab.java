package net.thefox580.smpu_factions.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu_factions.SMPUFactions;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SMPUFactions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SMPU_FACTIONS_TAB = CREATIVE_TAB.register("smpu_factions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AVA_APPLE.get()))
                    .title(Component.translatable("creativetab.smpu_factions_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AVA_APPLE.get());
                        output.accept(ModItems.THORNY_FRUIT.get());
                        output.accept(ModItems.BLOOMING_BERRIES.get());

                        output.accept(ModItems.AVALORE_SIGN.get());
                        output.accept(ModItems.EVERBLOOM_SIGN.get());
                        output.accept(ModItems.HAWTHORN_SIGN.get());

                        output.accept(ModItems.AVALORE_ADOPTION_CERTIFICATE.get());
                        output.accept(ModItems.EVERBLOOM_ADOPTION_CERTIFICATE.get());
                        output.accept(ModItems.HAWTHORN_ADOPTION_CERTIFICATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_TAB.register(eventBus);
    }
}
