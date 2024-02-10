package net.thefox580.smpu_factions.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.thefox580.smpu_factions.SMPUFactions;

public class ModWoodTypes {
    public static final WoodType AVALORE = WoodType.register(new WoodType(SMPUFactions.MOD_ID + ":avalore", BlockSetType.OAK));
    public static final WoodType EVERBLOOM = WoodType.register(new WoodType(SMPUFactions.MOD_ID + ":everbloom", BlockSetType.OAK));
    public static final WoodType HAWTHORN = WoodType.register(new WoodType(SMPUFactions.MOD_ID + ":hawthorn", BlockSetType.OAK));
}
