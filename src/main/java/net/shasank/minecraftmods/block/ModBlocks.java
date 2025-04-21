package net.shasank.minecraftmods.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import net.shasank.minecraftmods.MinecraftMod;
import net.shasank.minecraftmods.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

   public static final DeferredRegister<Block> BLOCKS =
           DeferredRegister.create(ForgeRegistries.BLOCKS, MinecraftMod.MOD_ID);





    public static final RegistryObject<Block> Krypton_Block = registerBlock("krypton_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));


    public static final RegistryObject<Block> LAKHE_BLOCK = registerBlock("lakhe_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f).requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));


   private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
       RegistryObject<T> toReturn = BLOCKS.register(name, block);
       registerBlockItem(name, toReturn);
       return toReturn;
   }



private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
    ModItems.Items.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
}


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


}
