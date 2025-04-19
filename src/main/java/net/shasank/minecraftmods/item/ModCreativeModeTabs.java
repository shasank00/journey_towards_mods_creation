package net.shasank.minecraftmods.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shasank.minecraftmods.MinecraftMod;
import net.shasank.minecraftmods.block.ModBlocks;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftMod.MOD_ID);

public static final RegistryObject<CreativeModeTab> SHASANK_MOD = CREATIVE_MODE_TABS.register("shasank_mod",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ME.get()))
                .title(Component.translatable("creativetab.mymodshasank.shasank_mod"))
                .displayItems((itemDisplayParameters, output) ->{
                    output.accept(ModItems.krypton.get());
                    output.accept(ModItems.Raw_Krypton.get());
                    output.accept(ModBlocks.Krypton_Block.get());
                    output.accept(ModItems.ME.get());
                    output.accept(ModItems.YOMARI.get());
                }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
