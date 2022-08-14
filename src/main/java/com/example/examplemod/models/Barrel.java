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

public class Barrel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "barrel"), "main");
	private final ModelPart root;

	public Barrel(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-20.026F, 24.0F, 5.3276F));

		PartDefinition barrel_1 = root.addOrReplaceChild("barrel_1", CubeListBuilder.create().texOffs(26, 55).addBox(-5.5F, -7.778F, -7.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.5F, -7.778F, -6.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-6.5F, -7.778F, -6.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 55).addBox(-5.5F, -7.778F, 3.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.5F, -7.778F, 4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-6.5F, -7.778F, 4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(45, 40).addBox(-7.5F, -7.728F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(45, 40).mirror().addBox(3.5F, -7.728F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(26, 55).addBox(-5.5F, 3.722F, -7.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.5F, 3.722F, -6.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-6.5F, 3.722F, -6.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 55).addBox(-5.5F, 3.722F, 3.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.5F, 3.722F, 4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-6.5F, 3.722F, 4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(45, 40).addBox(-7.5F, 3.772F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(45, 40).mirror().addBox(3.5F, 3.772F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(-5.0F, -10.028F, -5.0F, 10.0F, 20.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(30, 20).addBox(-7.0F, -10.428F, -5.0F, 3.0F, 21.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(4.0F, -10.428F, -5.0F, 3.0F, 21.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-5.0F, -10.478F, 4.0F, 10.0F, 21.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(56, 55).addBox(-6.0F, -10.478F, 5.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 30).addBox(5.0F, -10.478F, 5.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 55).addBox(-6.0F, -10.478F, -6.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 26).addBox(-5.0F, -10.478F, -7.0F, 10.0F, 21.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(26, 30).addBox(5.0F, -10.478F, -6.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.7454F, -10.572F, -5.6036F, 0.0F, -1.1781F, 0.0F));

		PartDefinition barrel_2 = root.addOrReplaceChild("barrel_2", CubeListBuilder.create().texOffs(26, 55).addBox(-5.5F, -7.778F, -7.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.5F, -7.778F, -6.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-6.5F, -7.778F, -6.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 55).addBox(-5.5F, -7.778F, 3.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.5F, -7.778F, 4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-6.5F, -7.778F, 4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(45, 40).addBox(-7.5F, -7.728F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(45, 40).mirror().addBox(3.5F, -7.728F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(26, 55).addBox(-5.5F, 3.722F, -7.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.5F, 3.722F, -6.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-6.5F, 3.722F, -6.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 55).addBox(-5.5F, 3.722F, 3.5F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(5.5F, 3.722F, 4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(4, 4).addBox(-6.5F, 3.722F, 4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(45, 40).addBox(-7.5F, 3.772F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(45, 40).mirror().addBox(3.5F, 3.772F, -5.5F, 4.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(-5.0F, -10.028F, -5.0F, 10.0F, 20.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(30, 20).addBox(-7.0F, -10.428F, -5.0F, 3.0F, 21.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(4.0F, -10.428F, -5.0F, 3.0F, 21.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(-5.0F, -10.478F, 4.0F, 10.0F, 21.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(56, 55).addBox(-6.0F, -10.478F, 5.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 30).addBox(5.0F, -10.478F, 5.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 55).addBox(-6.0F, -10.478F, -6.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 26).addBox(-5.0F, -10.478F, -7.0F, 10.0F, 21.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(26, 30).addBox(5.0F, -10.478F, -6.0F, 1.0F, 21.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.3954F, -9.697F, -2.9036F, 0.0F, 0.0F, -0.7854F));

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