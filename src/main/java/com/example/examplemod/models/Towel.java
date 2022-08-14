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

public class Towel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "towel"), "main");
	private final ModelPart root;

	public Towel(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 0).addBox(-7.5F, -0.5F, -15.5F, 15.0F, 1.0F, 31.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition glasses_r1 = root.addOrReplaceChild("glasses_r1", CubeListBuilder.create().texOffs(16, 7).addBox(-2.5F, -1.225F, 0.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(12, 18).addBox(2.5F, -1.225F, 0.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(-3.5F, -1.225F, 0.0F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.5F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hat_r1 = root.addOrReplaceChild("hat_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-2.3F, -0.725F, -2.7F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.3F, 0.275F, -4.7F, 8.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0F, 11.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bag_r1 = root.addOrReplaceChild("bag_r1", CubeListBuilder.create().texOffs(16, 4).addBox(-3.525F, -3.0F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(16, 4).addBox(-0.125F, -3.0F, -3.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).addBox(-3.825F, -1.0F, -4.0F, 4.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -6.0F, -4.0F, 0.0F, -0.3927F, 0.0F));

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