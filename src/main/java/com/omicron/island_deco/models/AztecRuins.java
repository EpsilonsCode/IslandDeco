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
import net.minecraft.world.entity.Entity;// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class AztecRuins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "aztecruins"), "main");
	private final ModelPart bone;

	public AztecRuins(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 15).addBox(-9.52F, 2.0789F, 1.4904F, 17.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-10.02F, 0.3789F, 0.9904F, 18.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(28, 32).addBox(-7.02F, 1.2789F, -1.0096F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-7.02F, 2.1789F, -2.8096F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 28).addBox(-7.02F, 2.9789F, -4.8096F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(-7.02F, 3.8789F, -6.8096F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.285F, -1.9211F, -0.0096F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(20, 47).addBox(-9.02F, 3.5279F, -11.1646F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.015F, -1.9211F, -0.0096F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(49, 0).addBox(4.28F, 3.5279F, -11.1646F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(-8.52F, -5.6211F, 7.4904F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(52, 32).addBox(1.88F, -8.3211F, 7.9904F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(5, 9).addBox(3.88F, -9.3211F, 7.9904F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(3.88F, -10.3211F, 9.9904F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 15).addBox(1.88F, -9.3211F, 10.9904F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(2.88F, -8.8211F, 8.0154F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(-8.52F, -22.7211F, 7.4904F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(36, 48).addBox(-8.02F, -16.5211F, 7.9904F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.92F, 19.0211F, -4.7904F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 47).addBox(-7.6F, -22.8F, 2.7F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.2308F, 0.0968F, 15.0774F, 2.069F, 0.5553F, 0.3663F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 48).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2636F, -0.6202F, 0.9449F, 2.069F, 0.5553F, 0.3663F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 48).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.02F, -8.0211F, 9.9904F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 48).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.02F, -19.2211F, 9.9904F, 3.1416F, -1.5708F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.88F, -5.1211F, 9.9904F, 3.1416F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.02F, -17.0211F, 9.9904F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 47).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.02F, -11.0211F, 9.9904F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 48).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.02F, -2.1211F, 9.9904F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(36, 48).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.88F, -2.1211F, 9.9904F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 36).addBox(-1.49F, -1.5F, -1.5F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-14.79F, -1.5F, -1.5F, 3.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.78F, 4.3397F, -6.2047F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(46, 15).addBox(-1.5F, -1.5F, -2.5F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(40, 36).addBox(-14.8F, -1.5F, -2.5F, 3.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.78F, 1.6145F, -1.4238F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -1.0F, -6.5F, 18.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.02F, 4.0789F, 7.4904F, 0.0F, 3.1416F, 0.0F));

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