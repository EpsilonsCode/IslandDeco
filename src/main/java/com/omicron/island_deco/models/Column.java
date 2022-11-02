package com.omicron.island_deco.models;// Made with Blockbench 4.3.0
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Column<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "column"), "main");
	private final ModelPart bone;

	public Column(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-37.0F, -5.0F, 0.0F, 17.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(26, 31).addBox(-20.0F, -5.0F, 1.3F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-11.6F, -5.0F, 1.3F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(-16.5F, -10.0F, 1.1F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(26, 18).addBox(-24.8F, -10.0F, 1.1F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(58, 35).addBox(-6.1F, -5.001F, 3.29F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(57, 1).addBox(-6.1F, -3.0F, 1.32F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(23, 71).addBox(-3.1F, -5.0F, 4.3F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(14.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(52, 59).addBox(-4.0F, -0.5F, -3.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(69, 55).addBox(-4.0F, -2.5F, -0.5F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(49, 47).addBox(-1.0F, -2.5F, -3.5F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.8563F, -12.5F, 4.3587F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 13).addBox(-4.3F, -4.0F, -2.8F, 9.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.8427F, -6.0F, 3.0549F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(28, 44).addBox(3.5F, -1.5F, -5.5F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.7F, -2.5F, -8.4F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 7).addBox(-8.5F, -2.5F, -2.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.7F, -2.5F, -8.4F, 0.0F, -0.5672F, 0.0F));

		PartDefinition octagon5 = bone.addOrReplaceChild("octagon5", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.8195F, -11.5F, 5.5121F, 0.0F, 1.0472F, 0.0F));

		PartDefinition octagon_r1 = octagon5.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(0, 39).addBox(2.0F, -3.5F, -1.2426F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(35, 71).addBox(-3.0F, -5.5F, -1.2426F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-1.0F, -6.5F, -1.2426F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-1.2426F, -6.1F, 0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-3.0F, -8.5F, -1.2426F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 59).addBox(-1.2426F, -5.5F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.787F, -0.1F, 8.1134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r2 = octagon5.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -4.5F, -1.2426F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 33).addBox(-3.0F, -5.5F, -1.2426F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(-2.9F, -7.5F, -1.2426F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 17).addBox(-1.2426F, -7.5F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 59).addBox(-1.2426F, -5.51F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.787F, -0.1F, 8.1134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r3 = octagon5.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(26, 31).addBox(-1.2426F, -0.5F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3146F, -5.7F, 5.9278F, 0.0F, -0.2618F, 0.0F));

		PartDefinition octagon3 = bone.addOrReplaceChild("octagon3", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.0F, -10.6F, 5.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition octagon_r4 = octagon3.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(26, 13).addBox(-3.5F, -1.51F, -1.4497F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 59).addBox(-1.4497F, -1.52F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -27.5F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r5 = octagon3.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(42, 0).addBox(-3.5F, -1.5F, -1.4497F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(66, 0).addBox(-1.4497F, -1.5F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -27.5F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagoni = bone.addOrReplaceChild("octagoni", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.0F, -0.9F, -0.4F, 0.0F, 1.0472F, 0.0F));

		PartDefinition octagon_r6 = octagoni.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(28, 54).addBox(-2.75F, -17.5F, -1.1391F, 5.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 52).addBox(-1.1391F, -17.5F, -2.75F, 2.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0417F, -13.5F, -3.3817F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r7 = octagoni.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(58, 18).addBox(-2.75F, -17.5F, -1.1391F, 5.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 52).addBox(-1.1391F, -17.5F, -2.75F, 2.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0417F, -13.5F, -3.3817F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagonl = bone.addOrReplaceChild("octagonl", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.0195F, -11.5F, 5.0121F, 0.0F, 1.0472F, 0.0F));

		PartDefinition octagon_r8 = octagonl.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(58, 68).addBox(-3.0F, -5.5F, -1.2426F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r9 = octagonl.addOrReplaceChild("octagon_r9", CubeListBuilder.create().texOffs(58, 68).addBox(-3.0F, -3.0F, -1.2426F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r10 = octagonl.addOrReplaceChild("octagon_r10", CubeListBuilder.create().texOffs(58, 68).addBox(-3.0F, -3.0F, -1.2426F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r11 = octagonl.addOrReplaceChild("octagon_r11", CubeListBuilder.create().texOffs(58, 68).addBox(-3.0F, -3.0F, -1.2426F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, 0.0F, -1.9635F, 0.0F));

		PartDefinition octagon6 = octagonl.addOrReplaceChild("octagon6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -20.9F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition octagon_r12 = octagon6.addOrReplaceChild("octagon_r12", CubeListBuilder.create().texOffs(58, 68).addBox(-3.0F, -5.5F, -1.2426F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r13 = octagon6.addOrReplaceChild("octagon_r13", CubeListBuilder.create().texOffs(58, 68).addBox(-3.0F, -3.0F, -1.2426F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r14 = octagon6.addOrReplaceChild("octagon_r14", CubeListBuilder.create().texOffs(58, 68).addBox(-3.0F, -3.0F, -1.2426F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r15 = octagon6.addOrReplaceChild("octagon_r15", CubeListBuilder.create().texOffs(58, 68).addBox(-3.0F, -3.0F, -1.2426F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 0.0F, 0.0F, -1.9635F, 0.0F));

		PartDefinition octagon = bone.addOrReplaceChild("octagon", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.0F, -10.6F, 5.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition octagon_r16 = octagon.addOrReplaceChild("octagon_r16", CubeListBuilder.create().texOffs(66, 46).addBox(-1.4497F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9635F, 0.0F));

		PartDefinition octagon_r17 = octagon.addOrReplaceChild("octagon_r17", CubeListBuilder.create().texOffs(66, 46).addBox(-1.4497F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r18 = octagon.addOrReplaceChild("octagon_r18", CubeListBuilder.create().texOffs(66, 46).addBox(-1.4497F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r19 = octagon.addOrReplaceChild("octagon_r19", CubeListBuilder.create().texOffs(66, 46).addBox(-1.4497F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon2 = bone.addOrReplaceChild("octagon2", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.0F, -10.6F, 5.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition octagon_r20 = octagon2.addOrReplaceChild("octagon_r20", CubeListBuilder.create().texOffs(66, 46).addBox(-1.4497F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1F, 0.0F, 2.9F, 0.0F, 1.9635F, 0.0F));

		PartDefinition octagon_r21 = octagon2.addOrReplaceChild("octagon_r21", CubeListBuilder.create().texOffs(66, 46).addBox(-1.4497F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1F, 0.0F, 2.9F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r22 = octagon2.addOrReplaceChild("octagon_r22", CubeListBuilder.create().texOffs(66, 46).addBox(-1.4497F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1F, 0.0F, 2.9F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r23 = octagon2.addOrReplaceChild("octagon_r23", CubeListBuilder.create().texOffs(66, 46).addBox(-1.4497F, -0.5F, -3.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.1F, 0.0F, 2.9F, 0.0F, -0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}