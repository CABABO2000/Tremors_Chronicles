package net.CABABO2000.tc.entity;

import net.CABABO2000.tc.entity.custom.JrowEntity;
import net.CABABO2000.tc.tc;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, tc.MOD_ID);

    public static final RegistryObject<EntityType<JrowEntity>> JROW = ENTITY_TYPES.register("jrow",
            () -> EntityType.Builder.of(JrowEntity::new, MobCategory.MONSTER)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(tc.MOD_ID, "jrow").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
