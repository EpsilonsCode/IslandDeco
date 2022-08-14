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

public class SurfBoard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "surfboard"), "main");
	private final ModelPart root;

	public SurfBoard(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(24, 4).mirror().addBox(-7.0F, -18.0F, 4.0F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(24, 4).addBox(4.0F, -18.0F, 4.0F, 3.0F, 18.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-7.5F, -17.0F, 3.0F, 15.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition fins_r1 = root.addOrReplaceChild("fins_r1", CubeListBuilder.create().texOffs(0, 35).addBox(-0.5F, -0.675F, -0.125F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(21, 32).addBox(-0.5F, -0.675F, -3.125F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(8, 35).mirror().addBox(-3.0F, -2.025F, 3.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(29, 32).mirror().addBox(-3.0F, -2.025F, 0.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(8, 35).addBox(2.0F, -2.025F, 3.3F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(29, 32).addBox(2.0F, -2.025F, 0.3F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.375F, -4.25F, 0.7854F, 0.0F, 0.0F));

		PartDefinition board_r1 = root.addOrReplaceChild("board_r1", CubeListBuilder.create().texOffs(33, 4).mirror().addBox(-6.5F, 10.0F, -4.25F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(24, 29).addBox(-5.5F, -26.0F, -4.25F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 25).addBox(-6.5F, -25.0F, -4.25F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(33, 4).addBox(-1.5F, 10.0F, -4.25F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.5F, -23.0F, -4.25F, 10.0F, 33.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -9.0F, 2.0F, -0.3927F, 0.0F, 0.0F));

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