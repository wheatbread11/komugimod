package net.wheatbread11.komugimod.neoforge.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.wheatbread11.komugimod.common.ModMeta;
import net.wheatbread11.komugimod.neoforge.entity.StargazerEntity;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class StargazerRenderer extends MobRenderer<StargazerEntity, StargazerModel<StargazerEntity>> {
    public StargazerRenderer(EntityRendererProvider.Context context) {
        super(context, new StargazerModel<>(context.bakeLayer(StargazerModel.LAYER_LOCATION)), 1.0f);
    }

    @Override
    public ResourceLocation getTextureLocation(StargazerEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(ModMeta.ID, "textures/entity/stargazer.png");
    }

    @Override
    public void render(StargazerEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.scale(1.0F, 1.0F, 1.0F);

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
