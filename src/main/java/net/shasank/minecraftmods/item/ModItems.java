package net.shasank.minecraftmods.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shasank.minecraftmods.MinecraftMod;
import net.shasank.minecraftmods.item.custom.ModFoodProperties;
import net.shasank.minecraftmods.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftMod.MOD_ID);


    public static final RegistryObject<Item> krypton =Items.register("krypton",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Raw_Krypton =Items.register("raw_krypton",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ME =Items.register("me",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> YOMARI =Items.register("yomari",
    () -> new Item(new Item.Properties().food(ModFoodProperties.YOMARI)));

    public static final RegistryObject<Item> NEWARI_FOLK_MUSIC_DISC = Items.register("newari_folk_music_disc",
    () -> new Item(new Item.Properties().jukeboxPlayable(ModSounds.NEWARI_FOLK_KEY).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }



}
