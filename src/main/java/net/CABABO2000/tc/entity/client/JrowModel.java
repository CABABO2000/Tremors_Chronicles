package net.CABABO2000.tc.entity.client;

import net.CABABO2000.tc.entity.custom.JrowEntity;
import net.CABABO2000.tc.tc;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JrowModel extends AnimatedGeoModel<JrowEntity> {
    @Override
    public ResourceLocation getModelLocation(JrowEntity object) {
        return new ResourceLocation(tc.MOD_ID, "geo/jrow.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(JrowEntity object) {
        return new ResourceLocation(tc.MOD_ID, "textures/entity/jrow/jrow.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(JrowEntity animatable) {
        return new ResourceLocation(tc.MOD_ID, "animations/jrow.animation.json");
    }
}
