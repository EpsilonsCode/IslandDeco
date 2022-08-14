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

public class Coin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "coin"), "main");
	private final ModelPart root;

	public Coin(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-0.025F, 24.0F, 0.0F));

		PartDefinition coin = root.addOrReplaceChild("coin", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = coin.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 23).addBox(-4.0F, -11.25F, 2.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-6.0F, -10.25F, 2.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(36, 34).mirror().addBox(8.0F, -7.25F, 2.0F, 1.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 39).mirror().addBox(9.0F, -5.25F, 2.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 39).addBox(-10.0F, -5.25F, 2.0F, 1.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(36, 34).addBox(-9.0F, -7.25F, 2.0F, 1.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-8.0F, -9.25F, 2.0F, 16.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.025F, -8.0F, 1.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition rocks = root.addOrReplaceChild("rocks", CubeListBuilder.create().texOffs(44, 43).addBox(2.274F, -2.025F, 3.7758F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(-3.348F, -0.9F, -1.7971F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 34).addBox(1.075F, -0.8F, -1.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 27).addBox(11.4944F, -0.375F, -0.2816F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-12.4444F, -0.375F, 4.4566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 15).addBox(-6.025F, -0.8F, 2.175F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition rocks_r1 = rocks.addOrReplaceChild("rocks_r1", CubeListBuilder.create().texOffs(22, 27).addBox(0.825F, -2.3375F, -1.5375F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(40, 30).addBox(2.95F, -0.3375F, 0.4375F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.725F, -0.6625F, 2.2625F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rocks_r2 = rocks.addOrReplaceChild("rocks_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5694F, 0.125F, -2.9816F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rocks_r3 = rocks.addOrReplaceChild("rocks_r3", CubeListBuilder.create().texOffs(16, 27).addBox(4.5F, -0.375F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 0).addBox(-4.625F, -1.45F, -6.15F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-9.625F, -2.15F, -5.15F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(44, 38).addBox(-6.725F, -0.8F, -7.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(38, 7).addBox(-2.175F, -1.65F, -2.125F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.5F, 0.0F, 0.3927F, 0.0F));

		PartDefinition rocks_r4 = rocks.addOrReplaceChild("rocks_r4", CubeListBuilder.create().texOffs(36, 23).addBox(-3.5F, -0.3125F, -0.1875F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.35F, -0.6625F, 1.3375F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rocks_r5 = rocks.addOrReplaceChild("rocks_r5", CubeListBuilder.create().texOffs(0, 39).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.745F, 0.225F, 3.9177F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rocks_r6 = rocks.addOrReplaceChild("rocks_r6", CubeListBuilder.create().texOffs(20, 40).addBox(-0.3F, -1.5F, -0.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5113F, -1.3F, 3.453F, 0.0F, 0.3927F, 0.0F));

		PartDefinition rocks_r7 = rocks.addOrReplaceChild("rocks_r7", CubeListBuilder.create().texOffs(44, 34).addBox(-6.95F, -0.3375F, -3.4375F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-5.825F, -2.3375F, -2.4625F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.775F, -0.6625F, 2.9125F, 0.0F, -0.7854F, 0.0F));

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