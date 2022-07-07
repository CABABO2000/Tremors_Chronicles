package net.CABABO2000.tc.block;

import net.CABABO2000.tc.block.custom.Baridium_Ore;
import net.CABABO2000.tc.tc;
import net.CABABO2000.tc.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.ibm.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, tc.MOD_ID);

    public static final RegistryObject<Block> SCARLIGHT_ORE = registerBlock("scarlight_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(10f).requiresCorrectToolForDrops().lightLevel((i) -> 4).explosionResistance(6f)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> ENDER_DRAGON_ORE = registerBlock("ender_dragon_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(12f).requiresCorrectToolForDrops().explosionResistance(6f)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> ENDER_DRAGON_SKULL_ORE = registerBlock("ender_dragon_skull_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(12f).requiresCorrectToolForDrops().explosionResistance(6f)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BARIDIUM_ORE = registerBlock("baridium_ore",
            () -> new Baridium_Ore(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(12f).requiresCorrectToolForDrops().explosionResistance(-1f)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
