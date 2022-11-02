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
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Buoy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "buoy"), "main");
	private final ModelPart root;

	public Buoy(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 33).addBox(6.0F, -6.0F, -12.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-9.0F, -6.0F, -12.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.0F, -6.0F, 9.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(6.0F, -6.0F, 9.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(-12.0F, -6.0F, -9.0F, 6.0F, 6.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(6.0F, -6.0F, -9.0F, 6.0F, 6.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(30, 0).addBox(-6.0F, -6.0F, 6.0F, 12.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(30, 24).addBox(-6.0F, -6.0F, -12.0F, 12.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

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