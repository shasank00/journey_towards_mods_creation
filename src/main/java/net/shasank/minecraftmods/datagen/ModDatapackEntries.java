package net.shasank.minecraftmods.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.RegistryObject;
import net.shasank.minecraftmods.MinecraftMod;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;


public class ModDatapackEntries extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder();

    public ModDatapackEntries(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MinecraftMod.MOD_ID));
    }
}
