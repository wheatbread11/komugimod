// Made with Blockbench 5.0.7

package net.wheatbread11.komugimod.neoforge.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.wheatbread11.komugimod.common.ModMeta;
import net.wheatbread11.komugimod.neoforge.entity.StargazerEntity;

public class StargazerModel<T extends StargazerEntity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(ModMeta.ID, "stargazer"), "main");

	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart cod;
	private final ModelPart wheel;
	private final ModelPart ring;
	private final ModelPart strut;
	private final ModelPart steering;
	private final ModelPart head;
	private final ModelPart shaft;

	public StargazerModel(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.cod = this.body.getChild("cod");
		this.wheel = this.body.getChild("wheel");
		this.ring = this.wheel.getChild("ring");
		this.strut = this.wheel.getChild("strut");
		this.steering = this.wheel.getChild("steering");
		this.head = this.steering.getChild("head");
		this.shaft = this.steering.getChild("shaft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-12.0F, -28.0F, -12.0F, 24.0F, 24.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cod = body.addOrReplaceChild("cod", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cod_r1 = cod.addOrReplaceChild("cod_r1", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -16.0F, 10.0F, -1.5708F, 0.1745F, 0.0F));

		PartDefinition cod_r2 = cod.addOrReplaceChild("cod_r2", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -16.0F, 10.0F, -1.5708F, -0.1745F, 0.0F));

		PartDefinition cod_r3 = cod.addOrReplaceChild("cod_r3", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.0F, 10.0F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cod_r4 = cod.addOrReplaceChild("cod_r4", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.0F, 10.0F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cod_r5 = cod.addOrReplaceChild("cod_r5", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(-18.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -10.0F, 10.0F, -1.6581F, 0.0F, 0.0F));

		PartDefinition cod_r6 = cod.addOrReplaceChild("cod_r6", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 24).addBox(14.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -22.0F, 10.0F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cod_r7 = cod.addOrReplaceChild("cod_r7", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -25.0F, -8.0F, 0.2515F, 0.0594F, -0.3442F));

		PartDefinition cod_r8 = cod.addOrReplaceChild("cod_r8", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -25.0F, -8.0F, 0.2515F, -0.0594F, 0.3442F));

		PartDefinition cod_r9 = cod.addOrReplaceChild("cod_r9", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -27.0F, -4.0F, 0.0873F, 0.0F, -0.3491F));

		PartDefinition cod_r10 = cod.addOrReplaceChild("cod_r10", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -27.0F, -4.0F, 0.0873F, 0.0F, -0.0436F));

		PartDefinition cod_r11 = cod.addOrReplaceChild("cod_r11", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -27.0F, -4.0F, 0.0873F, 0.0F, 0.0436F));

		PartDefinition cod_r12 = cod.addOrReplaceChild("cod_r12", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -27.0F, -4.0F, 0.0873F, 0.0F, 0.3491F));

		PartDefinition cod_r13 = cod.addOrReplaceChild("cod_r13", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -27.0F, -8.0F, 0.4362F, 0.0076F, -0.043F));

		PartDefinition cod_r14 = cod.addOrReplaceChild("cod_r14", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -27.0F, -8.0F, 0.4362F, -0.0076F, 0.043F));

		PartDefinition cod_r15 = cod.addOrReplaceChild("cod_r15", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -25.0F, 8.0F, -0.2515F, 0.0594F, 0.3442F));

		PartDefinition cod_r16 = cod.addOrReplaceChild("cod_r16", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -25.0F, 8.0F, -0.2515F, -0.0594F, -0.3442F));

		PartDefinition cod_r17 = cod.addOrReplaceChild("cod_r17", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -27.0F, 4.0F, -0.0873F, 0.0F, -0.3491F));

		PartDefinition cod_r18 = cod.addOrReplaceChild("cod_r18", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -27.0F, 4.0F, -0.0873F, 0.0F, -0.0436F));

		PartDefinition cod_r19 = cod.addOrReplaceChild("cod_r19", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -27.0F, 4.0F, -0.0873F, 0.0F, 0.0436F));

		PartDefinition cod_r20 = cod.addOrReplaceChild("cod_r20", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -27.0F, 4.0F, -0.0873F, 0.0F, 0.3491F));

		PartDefinition cod_r21 = cod.addOrReplaceChild("cod_r21", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -27.0F, 8.0F, -0.4362F, -0.0076F, -0.043F));

		PartDefinition cod_r22 = cod.addOrReplaceChild("cod_r22", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -27.0F, 8.0F, -0.4362F, 0.0076F, 0.043F));

		PartDefinition wheel = body.addOrReplaceChild("wheel", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, 0.0F));

		PartDefinition ring = wheel.addOrReplaceChild("ring", CubeListBuilder.create().texOffs(18, 0).addBox(-20.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ring_r1 = ring.addOrReplaceChild("ring_r1", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 3.1416F));

		PartDefinition ring_r2 = ring.addOrReplaceChild("ring_r2", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 3.1416F));

		PartDefinition ring_r3 = ring.addOrReplaceChild("ring_r3", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition ring_r4 = ring.addOrReplaceChild("ring_r4", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 2.3562F, 0.0F, -3.1416F));

		PartDefinition ring_r5 = ring.addOrReplaceChild("ring_r5", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 3.1416F));

		PartDefinition ring_r6 = ring.addOrReplaceChild("ring_r6", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 3.1416F));

		PartDefinition ring_r7 = ring.addOrReplaceChild("ring_r7", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 3.1416F));

		PartDefinition ring_r8 = ring.addOrReplaceChild("ring_r8", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition ring_r9 = ring.addOrReplaceChild("ring_r9", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, 2.3562F, 0.0F, 0.0F));

		PartDefinition ring_r10 = ring.addOrReplaceChild("ring_r10", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 0.0F));

		PartDefinition ring_r11 = ring.addOrReplaceChild("ring_r11", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition ring_r12 = ring.addOrReplaceChild("ring_r12", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition ring_r13 = ring.addOrReplaceChild("ring_r13", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, -2.3562F, 0.0F, 0.0F));

		PartDefinition ring_r14 = ring.addOrReplaceChild("ring_r14", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition ring_r15 = ring.addOrReplaceChild("ring_r15", CubeListBuilder.create().texOffs(18, 0).addBox(0.0F, -14.6F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition strut = wheel.addOrReplaceChild("strut", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition strut_r1 = strut.addOrReplaceChild("strut_r1", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 2.7489F, 0.0F, 3.1416F));

		PartDefinition strut_r2 = strut.addOrReplaceChild("strut_r2", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 3.1416F));

		PartDefinition strut_r3 = strut.addOrReplaceChild("strut_r3", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 3.1416F));

		PartDefinition strut_r4 = strut.addOrReplaceChild("strut_r4", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 3.1416F));

		PartDefinition strut_r5 = strut.addOrReplaceChild("strut_r5", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 3.1416F));

		PartDefinition strut_r6 = strut.addOrReplaceChild("strut_r6", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, -2.7489F, 0.0F, 3.1416F));

		PartDefinition strut_r7 = strut.addOrReplaceChild("strut_r7", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 3.1416F));

		PartDefinition strut_r8 = strut.addOrReplaceChild("strut_r8", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 3.1416F));

		PartDefinition strut_r9 = strut.addOrReplaceChild("strut_r9", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition strut_r10 = strut.addOrReplaceChild("strut_r10", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition strut_r11 = strut.addOrReplaceChild("strut_r11", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, 1.9635F, 0.0F, 0.0F));

		PartDefinition strut_r12 = strut.addOrReplaceChild("strut_r12", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, 2.7489F, 0.0F, 0.0F));

		PartDefinition strut_r13 = strut.addOrReplaceChild("strut_r13", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, -2.7489F, 0.0F, 0.0F));

		PartDefinition strut_r14 = strut.addOrReplaceChild("strut_r14", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, -1.9635F, 0.0F, 0.0F));

		PartDefinition strut_r15 = strut.addOrReplaceChild("strut_r15", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition strut_r16 = strut.addOrReplaceChild("strut_r16", CubeListBuilder.create().texOffs(16, 24).addBox(1.0F, -14.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition steering = wheel.addOrReplaceChild("steering", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = steering.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 10).addBox(-20.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wheel_r1 = head.addOrReplaceChild("wheel_r1", CubeListBuilder.create().texOffs(0, 10).addBox(0.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition shaft = steering.addOrReplaceChild("shaft", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wheel_r2 = shaft.addOrReplaceChild("wheel_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -2.0F, -2.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(StargazerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

        this.animateWalk(StargazerAnimations.RUNNING, limbSwing, limbSwingAmount, 1.0f, 1.0f);
        this.animate(entity.idleAnimationState, StargazerAnimations.IDLE, ageInTicks, 1f);
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