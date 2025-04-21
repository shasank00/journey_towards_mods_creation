package net.shasank.minecraftmods.sound;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.block.JukeboxBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shasank.minecraftmods.MinecraftMod;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MinecraftMod.MOD_ID);

    public static final RegistryObject<SoundEvent> NEWARI_FOLK = registerSoundEvent("newari_folk");
    public static final ResourceKey<JukeboxSong> NEWARI_FOLK_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MinecraftMod.MOD_ID, "newari_folk"));

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUNDS_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(MinecraftMod.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus) {
        SOUNDS_EVENTS.register(eventBus);
    }
}
