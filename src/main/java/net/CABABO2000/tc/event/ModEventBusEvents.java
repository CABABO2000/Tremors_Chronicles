package net.CABABO2000.tc.event;

import net.CABABO2000.tc.entity.ModEntityTypes;
import net.CABABO2000.tc.entity.custom.JrowEntity;
import net.CABABO2000.tc.tc;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = tc.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.JROW.get(), JrowEntity.setAttributes());
    }
}
