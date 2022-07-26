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

public class Bomb_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	public final ModelPart bomb;

	public Bomb_model(ModelPart root) {
		this.bomb = root.getChild("bomb");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bomb = partdefinition.addOrReplaceChild("bomb", CubeListBuilder.create().texOffs(18, 6).addBox(-1.0186F, 9.3062F, -0.9747F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 0).addBox(-1.5186F, 8.6062F, -1.4747F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 10).addBox(-1.9186F, 7.1062F, -2.0747F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.4186F, 4.4062F, -2.6747F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).addBox(-1.9186F, 2.4062F, -2.0747F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(-1.4186F, -0.0938F, -1.6247F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 16).addBox(-0.9186F, -2.0938F, -1.1247F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(19, 19).addBox(-0.4186F, -2.9938F, -0.6247F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 4).addBox(-0.4193F, -5.1937F, 0.375F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(-0.4193F, -5.1937F, -0.6264F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3814F, 15.6938F, -1.7253F, 0.2182F, 0.0F, -0.2618F));

		PartDefinition cube_r1 = bomb.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 3).addBox(-0.5F, -0.5F, -0.5007F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-0.5F, -0.5F, 0.5007F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0807F, -4.6937F, -0.1257F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = bomb.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 8).mirror().addBox(-1.0F, -0.7F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2885F, -4.6937F, 1.0824F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r3 = bomb.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 8).mirror().addBox(-1.0F, -0.7F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.2878F, -4.6937F, -1.3325F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r4 = bomb.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 8).addBox(-1.0F, -0.7F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.125F, -4.6937F, -1.3325F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r5 = bomb.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 8).addBox(-1.0F, -0.7F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1257F, -4.6937F, 1.0824F, 0.0F, 0.7854F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bomb.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}