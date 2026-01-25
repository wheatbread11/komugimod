package com.wheatbread11.komugimod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.wheatbread11.komugimod.ModMeta;
import com.wheatbread11.komugimod.entity.custom.StargazerEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class StargazerModel<T extends StargazerEntity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(ModMeta.ID, "stargazer"), "main");

	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart wheel;

	public StargazerModel(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.wheel = this.root.getChild("wheel");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(8, 4).addBox(-6.0F, -14.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cod_r1 = body.addOrReplaceChild("cod_r1", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -7.5F, 5.0F, -1.5708F, 0.1745F, 0.0F));
		PartDefinition cod_r2 = body.addOrReplaceChild("cod_r2", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -7.5F, 5.0F, -1.5708F, -0.1745F, 0.0F));
		PartDefinition cod_r3 = body.addOrReplaceChild("cod_r3", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.5F, 5.0F, -1.4835F, 0.0F, 0.0F));
		PartDefinition cod_r4 = body.addOrReplaceChild("cod_r4", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 5.0F, -1.6581F, 0.0F, 0.0F));
		PartDefinition cod_r5 = body.addOrReplaceChild("cod_r5", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(0, 7).addBox(-9.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.5F, 5.0F, -1.6581F, 0.0F, 0.0F));
		PartDefinition cod_r6 = body.addOrReplaceChild("cod_r6", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(0, 7).addBox(7.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -10.5F, 5.0F, -1.4835F, 0.0F, 0.0F));
		PartDefinition cod_r7 = body.addOrReplaceChild("cod_r7", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -12.5F, -4.0F, 0.2515F, 0.0594F, -0.3442F));
		PartDefinition cod_r8 = body.addOrReplaceChild("cod_r8", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -12.5F, -4.0F, 0.2515F, -0.0594F, 0.3442F));
		PartDefinition cod_r9 = body.addOrReplaceChild("cod_r9", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -13.5F, -2.0F, 0.0873F, 0.0F, -0.3491F));
		PartDefinition cod_r10 = body.addOrReplaceChild("cod_r10", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -13.5F, -2.0F, 0.0873F, 0.0F, -0.0436F));
		PartDefinition cod_r11 = body.addOrReplaceChild("cod_r11", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -13.5F, -2.0F, 0.0873F, 0.0F, 0.0436F));
		PartDefinition cod_r12 = body.addOrReplaceChild("cod_r12", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -13.5F, -2.0F, 0.0873F, 0.0F, 0.3491F));
		PartDefinition cod_r13 = body.addOrReplaceChild("cod_r13", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -13.5F, -4.0F, 0.4362F, 0.0076F, -0.043F));
		PartDefinition cod_r14 = body.addOrReplaceChild("cod_r14", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -13.5F, -4.0F, 0.4362F, -0.0076F, 0.043F));
		PartDefinition cod_r15 = body.addOrReplaceChild("cod_r15", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -12.5F, 4.0F, -0.2515F, 0.0594F, 0.3442F));
		PartDefinition cod_r16 = body.addOrReplaceChild("cod_r16", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -12.5F, 4.0F, -0.2515F, -0.0594F, -0.3442F));
		PartDefinition cod_r17 = body.addOrReplaceChild("cod_r17", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -13.5F, 2.0F, -0.0873F, 0.0F, -0.3491F));
		PartDefinition cod_r18 = body.addOrReplaceChild("cod_r18", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -13.5F, 2.0F, -0.0873F, 0.0F, -0.0436F));
		PartDefinition cod_r19 = body.addOrReplaceChild("cod_r19", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -13.5F, 2.0F, -0.0873F, 0.0F, 0.0436F));
		PartDefinition cod_r20 = body.addOrReplaceChild("cod_r20", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -13.5F, 2.0F, -0.0873F, 0.0F, 0.3491F));
		PartDefinition cod_r21 = body.addOrReplaceChild("cod_r21", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -13.5F, 4.0F, -0.4362F, -0.0076F, -0.043F));
		PartDefinition cod_r22 = body.addOrReplaceChild("cod_r22", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -13.5F, 4.0F, -0.4362F, 0.0076F, 0.043F));
		PartDefinition wheel = root.addOrReplaceChild("wheel", CubeListBuilder.create().texOffs(11, 33).addBox(-9.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(0, 0).addBox(-10.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(0, 34).addBox(-10.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition wheel_r1 = wheel.addOrReplaceChild("wheel_r1", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 3.1416F));
		PartDefinition wheel_r2 = wheel.addOrReplaceChild("wheel_r2", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 3.1416F));
		PartDefinition wheel_r3 = wheel.addOrReplaceChild("wheel_r3", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -3.1416F, 0.0F, -3.1416F));
		PartDefinition wheel_r4 = wheel.addOrReplaceChild("wheel_r4", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 2.3562F, 0.0F, -3.1416F));
		PartDefinition wheel_r5 = wheel.addOrReplaceChild("wheel_r5", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 3.1416F));
		PartDefinition wheel_r6 = wheel.addOrReplaceChild("wheel_r6", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 3.1416F));
		PartDefinition wheel_r7 = wheel.addOrReplaceChild("wheel_r7", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 3.1416F));
		PartDefinition wheel_r8 = wheel.addOrReplaceChild("wheel_r8", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 2.7489F, 0.0F, 3.1416F));
		PartDefinition wheel_r9 = wheel.addOrReplaceChild("wheel_r9", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 3.1416F));
		PartDefinition wheel_r10 = wheel.addOrReplaceChild("wheel_r10", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 3.1416F));
		PartDefinition wheel_r11 = wheel.addOrReplaceChild("wheel_r11", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 3.1416F));
		PartDefinition wheel_r12 = wheel.addOrReplaceChild("wheel_r12", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 3.1416F));
		PartDefinition wheel_r13 = wheel.addOrReplaceChild("wheel_r13", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -2.7489F, 0.0F, 3.1416F));
		PartDefinition wheel_r14 = wheel.addOrReplaceChild("wheel_r14", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 3.1416F));
		PartDefinition wheel_r15 = wheel.addOrReplaceChild("wheel_r15", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
			.texOffs(0, 0).addBox(0.0F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition wheel_r16 = wheel.addOrReplaceChild("wheel_r16", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 3.1416F));
		PartDefinition wheel_r17 = wheel.addOrReplaceChild("wheel_r17", CubeListBuilder.create().texOffs(11, 33).addBox(-9.0F, -1.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition wheel_r18 = wheel.addOrReplaceChild("wheel_r18", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition wheel_r19 = wheel.addOrReplaceChild("wheel_r19", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition wheel_r20 = wheel.addOrReplaceChild("wheel_r20", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 0.0F));
		PartDefinition wheel_r21 = wheel.addOrReplaceChild("wheel_r21", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 2.7489F, 0.0F, 0.0F));
		PartDefinition wheel_r22 = wheel.addOrReplaceChild("wheel_r22", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, -2.7489F, 0.0F, 0.0F));
		PartDefinition wheel_r23 = wheel.addOrReplaceChild("wheel_r23", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 0.0F));
		PartDefinition wheel_r24 = wheel.addOrReplaceChild("wheel_r24", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));
		PartDefinition wheel_r25 = wheel.addOrReplaceChild("wheel_r25", CubeListBuilder.create().texOffs(0, 32).addBox(0.5F, -7.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition wheel_r26 = wheel.addOrReplaceChild("wheel_r26", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));
		PartDefinition wheel_r27 = wheel.addOrReplaceChild("wheel_r27", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 0.0F));
		PartDefinition wheel_r28 = wheel.addOrReplaceChild("wheel_r28", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition wheel_r29 = wheel.addOrReplaceChild("wheel_r29", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition wheel_r30 = wheel.addOrReplaceChild("wheel_r30", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));
		PartDefinition wheel_r31 = wheel.addOrReplaceChild("wheel_r31", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition wheel_r32 = wheel.addOrReplaceChild("wheel_r32", CubeListBuilder.create().texOffs(0, 34).addBox(0.0F, -7.3F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(StargazerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
	}

	@Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        root().render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

	@Override
	public ModelPart root(){
		return root;
	}
}