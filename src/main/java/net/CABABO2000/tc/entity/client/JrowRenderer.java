package net.CABABO2000.tc.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.CABABO2000.tc.entity.custom.JrowEntity;
import net.CABABO2000.tc.tc;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class JrowRenderer extends GeoEntityRenderer<JrowEntity> {
    public JrowRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new JrowModel());
        this.shadowRadius = 0.2f;
    }

    @Override
    public ResourceLocation getTextureLocation(JrowEntity instance) {
        return new ResourceLocation(tc.MOD_ID, "textures/entity/jrow/jrow.png");
    }

    @Override
    public RenderType getRenderType(JrowEntity animatable, float partialTicks, PoseStack stack, @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
