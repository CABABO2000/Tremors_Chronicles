package net.CABABO2000.tc.item;

import net.CABABO2000.tc.tc;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, tc.MOD_ID);

    //Scarlight Fragment

    public static final RegistryObject<Item> SCARLIGHT = ITEMS.register("scarlight",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)){
                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 25000;
                }
            });

    public static final RegistryObject<Item> ENDER_DRAGON_BONE_FRAGMENT = ITEMS.register("ender_dragon_bone_fragment",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant()));

    public static final RegistryObject<Item> ENDER_DRAGON_SKULL_FRAGMENT = ITEMS.register("ender_dragon_skull_fragment",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).fireResistant()));

    public static final RegistryObject<Item> BARIDIUM = ITEMS.register("baridium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> FRESH_BARIDIUM = ITEMS.register("fresh_baridium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).rarity(Rarity.EPIC)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
