package net.thefox580.smpu_factions.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.smpu_factions.custom.ModBlocks;
import net.thefox580.smpu_factions.custom.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate() {
        this.add(ModBlocks.AVALORE_SIGN.get(), block ->
                createSingleItemTable(ModItems.AVALORE_SIGN.get()));
        this.add(ModBlocks.AVALORE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.AVALORE_SIGN.get()));

        this.add(ModBlocks.EVERBLOOM_SIGN.get(), block ->
                createSingleItemTable(ModItems.EVERBLOOM_SIGN.get()));
        this.add(ModBlocks.EVERBLOOM_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.EVERBLOOM_SIGN.get()));

        this.add(ModBlocks.HAWTHORN_SIGN.get(), block ->
                createSingleItemTable(ModItems.HAWTHORN_SIGN.get()));
        this.add(ModBlocks.HAWTHORN_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.HAWTHORN_SIGN.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
