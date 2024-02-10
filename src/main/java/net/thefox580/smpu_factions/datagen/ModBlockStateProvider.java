package net.thefox580.smpu_factions.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thefox580.smpu_factions.SMPUFactions;
import net.thefox580.smpu_factions.custom.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SMPUFactions.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

        signBlock((StandingSignBlock) ModBlocks.AVALORE_SIGN.get(), (WallSignBlock) ModBlocks.AVALORE_WALL_SIGN.get(), blockTexture(ModBlocks.AVALORE_SIGN.get()));
        signBlock((StandingSignBlock) ModBlocks.EVERBLOOM_SIGN.get(), (WallSignBlock) ModBlocks.EVERBLOOM_WALL_SIGN.get(), blockTexture(ModBlocks.EVERBLOOM_SIGN.get()));
        signBlock((StandingSignBlock) ModBlocks.HAWTHORN_SIGN.get(), (WallSignBlock) ModBlocks.HAWTHORN_WALL_SIGN.get(), blockTexture(ModBlocks.HAWTHORN_SIGN.get()));

    }
}
