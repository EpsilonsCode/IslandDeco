package com.example.examplemod.models;// Made with Blockbench 4.3.0
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

public class Moai<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "moai"), "main");
	private final ModelPart root;

	public Moai(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 54).addBox(-8.5F, -17.025F, -7.0F, 17.0F, 13.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-11.5F, -4.025F, -6.0F, 23.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-12.5F, -2.025F, -7.0F, 25.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(63, 29).addBox(-13.5F, -12.025F, -7.0F, 5.0F, 8.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(60, 13).addBox(-6.0F, -21.025F, -6.5F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -46.025F, -8.0F, 16.0F, 25.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(63, 29).mirror().addBox(8.5F, -12.025F, -7.0F, 5.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 80).addBox(-8.0F, -46.025F, -10.0F, 16.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = root.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 74).addBox(-3.5F, -11.75F, -0.25F, 7.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -33.525F, -11.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r2 = root.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 29).addBox(-7.0F, -1.95F, -0.7F, 14.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.525F, -8.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = root.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 80).mirror().addBox(-2.225F, -9.5F, -3.0F, 3.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.475F, -33.275F, -1.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r4 = root.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(80, 74).mirror().addBox(-1.5F, -1.5F, -4.875F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.0F, -3.525F, -0.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r5 = root.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 54).mirror().addBox(-1.5F, -4.0F, -6.025F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.7322F, -13.1359F, -0.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r6 = root.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 80).addBox(-0.775F, -9.5F, -3.0F, 3.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.475F, -33.275F, -1.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r7 = root.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(60, 54).addBox(-5.5F, -4.0F, -6.025F, 7.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.7322F, -13.1359F, -0.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r8 = root.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(80, 74).addBox(-0.5F, -1.5F, -4.875F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, -3.525F, -0.5F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}