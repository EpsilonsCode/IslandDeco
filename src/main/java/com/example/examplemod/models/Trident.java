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

public class Trident<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "trident"), "main");
	private final ModelPart root;

	public Trident(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rocks = root.addOrReplaceChild("rocks", CubeListBuilder.create().texOffs(28, 0).addBox(-2.5F, -0.8F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(8, 23).addBox(-3.3566F, -0.375F, -7.0944F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = rocks.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 23).addBox(0.75F, -0.375F, -5.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 31).addBox(-4.65F, -1.15F, -0.875F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(8, 23).addBox(-3.65F, -2.15F, 2.125F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(38, 26).addBox(-5.5F, -0.8F, 1.225F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(28, 7).addBox(0.625F, -0.925F, 1.175F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r2 = rocks.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(35, 14).addBox(-0.5F, -1.5F, -2.7F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.953F, -1.3F, 0.5113F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r3 = rocks.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(19, 34).addBox(-0.1875F, -0.6625F, -1.675F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(34, 21).addBox(-3.4375F, -0.3375F, 2.95F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(25, 26).addBox(-2.4625F, -2.3375F, 0.825F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1625F, -0.6625F, -4.375F, 0.0F, -0.7854F, 0.0F));

		PartDefinition trident = root.addOrReplaceChild("trident", CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, 1.5449F, -1.0F, 2.0F, 27.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(33, 34).addBox(-1.0F, -10.4551F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0F, -14.4551F, 0.0F, 14.0F, 18.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(8, 18).addBox(-6.0F, -0.4551F, -1.5F, 12.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(16, 40).addBox(-5.5F, -6.2051F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 37).addBox(3.5F, -6.2051F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -29.7699F, 0.0F));

		PartDefinition cube_r4 = trident.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6173F, -0.2812F, -0.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r5 = trident.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(28, 7).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6173F, -0.2812F, -0.5F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}