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
public class SkullPile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "skullpile"), "main");
	private final ModelPart root;

	public SkullPile(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.9425F, 24.0F, 9.16F));

		PartDefinition skull_1 = root.addOrReplaceChild("skull_1", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.241F, -21.5063F, -0.3927F, 0.0F, 0.0F));

		PartDefinition skull_r1 = skull_1.addOrReplaceChild("skull_r1", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_9 = root.addOrReplaceChild("skull_9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.241F, -21.5063F, -0.3927F, 0.0F, 0.0F));

		PartDefinition skull_8 = root.addOrReplaceChild("skull_8", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -5.584F, -2.2313F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -5.584F, -4.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -3.241F, -1.6516F, 0.3927F, 0.0F, 0.0F));

		PartDefinition skull_r2 = skull_8.addOrReplaceChild("skull_r2", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -1.9286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, 2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7111F, 0.7633F, -0.7854F, 0.0F, 0.0F));

		PartDefinition skull_10 = root.addOrReplaceChild("skull_10", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -5.584F, -2.2313F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -5.584F, -4.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 0.184F, -4.8266F, 0.0F, -0.7854F, 0.0F));

		PartDefinition skull_r3 = skull_10.addOrReplaceChild("skull_r3", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -1.9286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, 2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7111F, 0.7633F, -0.7854F, 0.0F, 0.0F));

		PartDefinition skull_7 = root.addOrReplaceChild("skull_7", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.65F, -3.241F, -13.0063F, -0.7854F, -0.7854F, 0.0F));

		PartDefinition skull_r4 = skull_7.addOrReplaceChild("skull_r4", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_2 = root.addOrReplaceChild("skull_2", CubeListBuilder.create().texOffs(32, 3).addBox(-2.8175F, -2.1165F, -7.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.3702F, -1.6165F, -7.1674F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(-4.3702F, -1.6165F, -7.1674F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 11).addBox(-3.3702F, -1.6165F, -7.1674F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 11).addBox(-3.3702F, 3.3835F, -7.1674F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(-0.8175F, -2.1165F, -2.7687F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(18.0F, -3.241F, -10.1813F));

		PartDefinition skull_3 = root.addOrReplaceChild("skull_3", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-5.0352F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 17).mirror().addBox(1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 11).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 11).mirror().addBox(0.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 18).mirror().addBox(-5.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4323F, -2.3575F, -21.1325F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone_1 = root.addOrReplaceChild("bone_1", CubeListBuilder.create().texOffs(22, 26).addBox(3.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 4).addBox(-5.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.01F, -3.245F, -18.37F));

		PartDefinition bone_2 = root.addOrReplaceChild("bone_2", CubeListBuilder.create().texOffs(22, 22).addBox(3.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 11).addBox(-5.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.01F, -0.795F, -29.32F));

		PartDefinition bone_6 = root.addOrReplaceChild("bone_6", CubeListBuilder.create(), PartPose.offset(3.01F, -3.245F, 2.18F));

		PartDefinition bone_r1 = bone_6.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(22, 16).addBox(-5.5F, 1.2875F, -1.65F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 11).addBox(-5.5F, 1.2875F, 0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.45F, 1.7625F, -0.975F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.5F, 1.2875F, -0.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 22).addBox(3.5F, 1.2875F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.51F, -0.0075F, -0.005F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone_5 = root.addOrReplaceChild("bone_5", CubeListBuilder.create().texOffs(22, 22).addBox(3.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 11).addBox(-5.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.36F, -0.395F, -6.92F, 0.0F, 0.3927F, 0.0F));

		PartDefinition skull_4 = root.addOrReplaceChild("skull_4", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -37.825F, -3.95F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -37.825F, 1.05F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 29.0F, -9.0F));

		PartDefinition skull_r5 = skull_4.addOrReplaceChild("skull_r5", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -31.5299F, -1.9446F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_5 = root.addOrReplaceChild("skull_5", CubeListBuilder.create().texOffs(32, 3).addBox(-0.9648F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(-2.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 11).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 11).addBox(-1.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(1.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2474F, -2.3575F, -11.3825F, 0.0F, -0.7854F, 0.0F));

		PartDefinition skull_6 = root.addOrReplaceChild("skull_6", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-5.0352F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 17).mirror().addBox(1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 11).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 11).mirror().addBox(0.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 18).mirror().addBox(-5.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4323F, -2.3575F, -21.1325F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone_3 = root.addOrReplaceChild("bone_3", CubeListBuilder.create().texOffs(22, 26).addBox(3.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 4).addBox(-5.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.01F, -3.245F, -18.37F));

		PartDefinition bone_4 = root.addOrReplaceChild("bone_4", CubeListBuilder.create().texOffs(22, 22).addBox(3.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 11).addBox(-5.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.985F, -0.695F, -19.07F, 0.0F, -0.7854F, 0.0F));

		PartDefinition skull_11 = root.addOrReplaceChild("skull_11", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.75F, -0.166F, -22.3063F, 0.0F, -0.7854F, 0.0F));

		PartDefinition skull_r6 = skull_11.addOrReplaceChild("skull_r6", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_12 = root.addOrReplaceChild("skull_12", CubeListBuilder.create(), PartPose.offsetAndRotation(4.625F, -11.641F, -22.3063F, -0.3927F, 0.0F, 0.0F));

		PartDefinition skull_13 = root.addOrReplaceChild("skull_13", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -5.584F, -2.2313F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -5.584F, -4.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.625F, -6.341F, -8.0016F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_r7 = skull_13.addOrReplaceChild("skull_r7", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -1.9286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, 2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7111F, 0.7633F, -0.7854F, 0.0F, 0.0F));

		PartDefinition skull_14 = root.addOrReplaceChild("skull_14", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -5.584F, -2.2313F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -5.584F, -4.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.375F, -8.216F, -5.6266F, 0.0F, -0.7854F, 0.0F));

		PartDefinition skull_r8 = skull_14.addOrReplaceChild("skull_r8", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -1.9286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, 2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7111F, 0.7633F, -0.7854F, 0.0F, 0.0F));

		PartDefinition skull_15 = root.addOrReplaceChild("skull_15", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.025F, -5.616F, -13.8063F, 0.0F, 0.0F, 0.7854F));

		PartDefinition skull_r9 = skull_15.addOrReplaceChild("skull_r9", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_16 = root.addOrReplaceChild("skull_16", CubeListBuilder.create().texOffs(32, 3).addBox(-0.9648F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(-2.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 11).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 11).addBox(-1.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(1.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.3224F, -1.9825F, -2.4575F, 0.0F, -0.7854F, 0.0F));

		PartDefinition skull_17 = root.addOrReplaceChild("skull_17", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-5.0352F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 17).mirror().addBox(1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 11).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 11).mirror().addBox(0.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 18).mirror().addBox(-5.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.8073F, -1.9825F, -25.9325F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone_7 = root.addOrReplaceChild("bone_7", CubeListBuilder.create().texOffs(22, 26).addBox(3.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 4).addBox(-5.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.11F, -6.47F, -16.82F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone_8 = root.addOrReplaceChild("bone_8", CubeListBuilder.create().texOffs(22, 22).addBox(3.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 11).addBox(-5.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.36F, -2.22F, -27.17F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone_9 = root.addOrReplaceChild("bone_9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1323F, -3.195F, -4.1666F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone_r2 = bone_9.addOrReplaceChild("bone_r2", CubeListBuilder.create().texOffs(22, 16).addBox(-5.5F, 1.2875F, -1.65F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 11).addBox(-5.5F, 1.2875F, 0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.45F, 1.7625F, -0.975F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.5F, 1.2875F, -0.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 22).addBox(3.5F, 1.2875F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0073F, -2.2825F, -0.0084F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone_10 = root.addOrReplaceChild("bone_10", CubeListBuilder.create().texOffs(22, 22).addBox(3.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 11).addBox(-5.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.485F, -3.445F, -4.47F, 0.0F, 0.0F, 0.7854F));

		PartDefinition skull_18 = root.addOrReplaceChild("skull_18", CubeListBuilder.create().texOffs(0, 11).addBox(-3.0F, -37.825F, -3.95F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(20, 20).addBox(-3.0F, -37.825F, 1.05F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.625F, 20.6F, -9.8F));

		PartDefinition skull_r10 = skull_18.addOrReplaceChild("skull_r10", CubeListBuilder.create().texOffs(22, 1).addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 3).addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -31.5299F, -1.9446F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_19 = root.addOrReplaceChild("skull_19", CubeListBuilder.create().texOffs(32, 3).addBox(-0.9648F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(-2.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 11).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 11).addBox(-1.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(1.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.8724F, -10.7575F, -12.1825F, 0.0F, -0.7854F, 0.0F));

		PartDefinition skull_20 = root.addOrReplaceChild("skull_20", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-5.0352F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 17).mirror().addBox(1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 11).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 11).mirror().addBox(0.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 18).mirror().addBox(-5.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.1573F, -1.9075F, -12.5575F, -0.7854F, -0.7854F, 0.0F));

		PartDefinition bone_11 = root.addOrReplaceChild("bone_11", CubeListBuilder.create().texOffs(22, 26).addBox(3.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 4).addBox(-5.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.865F, -1.045F, -7.92F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone_12 = root.addOrReplaceChild("bone_12", CubeListBuilder.create().texOffs(22, 22).addBox(3.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 6).addBox(3.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-4.46F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 11).addBox(-5.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 16).addBox(-5.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.84F, -0.795F, -27.17F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_21 = root.addOrReplaceChild("skull_21", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.8849F, -0.216F, -7.8063F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_r11 = skull_21.addOrReplaceChild("skull_r11", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_41 = root.addOrReplaceChild("skull_41", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.7151F, -11.666F, -13.0563F, -0.3927F, 0.0F, 0.0F));

		PartDefinition skull_r12 = skull_41.addOrReplaceChild("skull_r12", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_22 = root.addOrReplaceChild("skull_22", CubeListBuilder.create(), PartPose.offsetAndRotation(6.7151F, -11.666F, -13.0563F, -0.3927F, 0.0F, 0.0F));

		PartDefinition skull_23 = root.addOrReplaceChild("skull_23", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-3.0F, -5.584F, -2.2313F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, -4.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0151F, -1.691F, 6.7984F, 0.3927F, 0.0F, 0.0F));

		PartDefinition skull_r13 = skull_23.addOrReplaceChild("skull_r13", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -1.9286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, 2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, 0.7633F, -0.7854F, 0.0F, 0.0F));

		PartDefinition skull_24 = root.addOrReplaceChild("skull_24", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-3.0F, -5.584F, -2.2313F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, -4.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.4651F, -3.991F, 5.3734F, 0.0F, 0.3927F, 0.0F));

		PartDefinition skull_r14 = skull_24.addOrReplaceChild("skull_r14", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -1.9286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, 2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, 0.7633F, -0.7854F, 0.0F, 0.0F));

		PartDefinition skull_25 = root.addOrReplaceChild("skull_25", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(13.3651F, -11.666F, -4.5563F, -0.7854F, 0.7854F, 0.0F));

		PartDefinition skull_r15 = skull_25.addOrReplaceChild("skull_r15", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_26 = root.addOrReplaceChild("skull_26", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-3.1825F, -2.1165F, -7.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(2.3702F, -1.6165F, -7.1674F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 17).mirror().addBox(3.3702F, -1.6165F, -7.1674F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 11).mirror().addBox(2.3702F, -1.6165F, -7.1674F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 11).mirror().addBox(2.3702F, 3.3835F, -7.1674F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 18).mirror().addBox(-3.1825F, -2.1165F, -2.7687F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-11.2849F, -1.666F, -1.7313F));

		PartDefinition skull_27 = root.addOrReplaceChild("skull_27", CubeListBuilder.create().texOffs(32, 3).addBox(-0.9648F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(-2.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 11).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 11).addBox(-1.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(1.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.1474F, -10.7825F, -12.6825F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone_13 = root.addOrReplaceChild("bone_13", CubeListBuilder.create().texOffs(22, 26).mirror().addBox(-5.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 4).mirror().addBox(3.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.7051F, -11.67F, -9.92F));

		PartDefinition bone_14 = root.addOrReplaceChild("bone_14", CubeListBuilder.create().texOffs(22, 22).mirror().addBox(-5.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 11).mirror().addBox(3.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.7051F, -9.22F, -20.87F));

		PartDefinition bone_15 = root.addOrReplaceChild("bone_15", CubeListBuilder.create(), PartPose.offset(3.7051F, -2.745F, 10.63F));

		PartDefinition bone_r3 = bone_15.addOrReplaceChild("bone_r3", CubeListBuilder.create().texOffs(22, 16).mirror().addBox(3.5F, 1.2875F, -1.65F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 11).mirror().addBox(3.5F, 1.2875F, 0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.55F, 1.7625F, -0.975F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.5F, 1.2875F, -0.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 22).mirror().addBox(-5.5F, 1.2875F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.51F, -0.0075F, -0.005F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone_16 = root.addOrReplaceChild("bone_16", CubeListBuilder.create().texOffs(22, 22).mirror().addBox(-5.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 11).mirror().addBox(3.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2199F, -3.845F, -0.97F, 0.0F, 0.0F, -0.7854F));

		PartDefinition skull_28 = root.addOrReplaceChild("skull_28", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-3.0F, -37.825F, -3.95F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -37.825F, 1.05F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.7151F, 20.575F, -0.55F));

		PartDefinition skull_r16 = skull_28.addOrReplaceChild("skull_r16", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -31.5299F, -1.9446F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_29 = root.addOrReplaceChild("skull_29", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-5.0352F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 17).mirror().addBox(1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 11).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 11).mirror().addBox(0.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 18).mirror().addBox(-5.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5323F, -10.7825F, -2.9325F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_30 = root.addOrReplaceChild("skull_30", CubeListBuilder.create().texOffs(32, 3).addBox(-0.9648F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(-2.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 11).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 11).addBox(-1.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(1.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.1474F, -10.7825F, -12.6825F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bone_17 = root.addOrReplaceChild("bone_17", CubeListBuilder.create().texOffs(22, 26).mirror().addBox(-5.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 4).mirror().addBox(3.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(6.7051F, -11.67F, -9.92F));

		PartDefinition bone_18 = root.addOrReplaceChild("bone_18", CubeListBuilder.create().texOffs(22, 22).mirror().addBox(-5.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 11).mirror().addBox(3.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.2699F, -9.12F, -10.62F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_31 = root.addOrReplaceChild("skull_31", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0349F, -8.591F, -13.8563F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_r17 = skull_31.addOrReplaceChild("skull_r17", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_32 = root.addOrReplaceChild("skull_32", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0901F, -20.066F, -13.8563F, -0.3927F, 0.0F, 0.0F));

		PartDefinition skull_33 = root.addOrReplaceChild("skull_33", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-3.0F, -5.584F, -2.2313F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, -4.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9099F, -14.766F, 0.4484F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_r18 = skull_33.addOrReplaceChild("skull_r18", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -1.9286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, 2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, 0.7633F, -0.7854F, 0.0F, 0.0F));

		PartDefinition skull_34 = root.addOrReplaceChild("skull_34", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-3.0F, -5.584F, -2.2313F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, -4.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0901F, -16.641F, 2.8234F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_r19 = skull_34.addOrReplaceChild("skull_r19", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -1.9286F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -1.9286F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, 2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, 0.7633F, -0.7854F, 0.0F, 0.0F));

		PartDefinition skull_35 = root.addOrReplaceChild("skull_35", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-3.0F, -5.584F, -2.7687F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -5.584F, 2.2313F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.7401F, -14.041F, -5.3563F, 0.0F, 0.0F, -0.7854F));

		PartDefinition skull_r20 = skull_35.addOrReplaceChild("skull_r20", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7111F, -0.7633F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_36 = root.addOrReplaceChild("skull_36", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-5.0352F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 17).mirror().addBox(1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 11).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 11).mirror().addBox(0.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 18).mirror().addBox(-5.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6073F, -4.0075F, 5.9925F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_37 = root.addOrReplaceChild("skull_37", CubeListBuilder.create().texOffs(32, 3).addBox(-0.9648F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(-2.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 11).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 11).addBox(-1.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(1.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.5224F, -10.4075F, -17.4825F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone_19 = root.addOrReplaceChild("bone_19", CubeListBuilder.create().texOffs(22, 26).mirror().addBox(-5.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 4).mirror().addBox(3.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.6449F, -14.895F, -8.37F, -0.7854F, 0.0F, 0.0F));

		PartDefinition bone_20 = root.addOrReplaceChild("bone_20", CubeListBuilder.create().texOffs(22, 22).mirror().addBox(-5.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 11).mirror().addBox(3.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-19.2449F, -1.445F, -18.72F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone_21 = root.addOrReplaceChild("bone_21", CubeListBuilder.create(), PartPose.offsetAndRotation(5.5827F, -11.62F, 4.2834F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone_r4 = bone_21.addOrReplaceChild("bone_r4", CubeListBuilder.create().texOffs(22, 16).mirror().addBox(3.5F, 1.2875F, -1.65F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 11).mirror().addBox(3.5F, 1.2875F, 0.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.55F, 1.7625F, -0.975F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.5F, 1.2875F, -0.35F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 22).mirror().addBox(-5.5F, 1.2875F, -1.8F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0073F, -2.2825F, -0.0084F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone_22 = root.addOrReplaceChild("bone_22", CubeListBuilder.create().texOffs(22, 22).mirror().addBox(-5.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 11).mirror().addBox(3.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7699F, -3.12F, 3.98F, 0.0F, 0.0F, -0.7854F));

		PartDefinition skull_38 = root.addOrReplaceChild("skull_38", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-3.0F, -37.825F, -3.95F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 20).mirror().addBox(-3.0F, -37.825F, 1.05F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0901F, 12.175F, -1.35F));

		PartDefinition skull_r21 = skull_38.addOrReplaceChild("skull_r21", CubeListBuilder.create().texOffs(22, 1).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 11).mirror().addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 3).mirror().addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -31.5299F, -1.9446F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_39 = root.addOrReplaceChild("skull_39", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-5.0352F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 17).mirror().addBox(1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 11).mirror().addBox(0.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(13, 11).mirror().addBox(0.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 18).mirror().addBox(-5.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1573F, -13.0325F, -3.7325F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_40 = root.addOrReplaceChild("skull_40", CubeListBuilder.create().texOffs(32, 3).addBox(-0.9648F, -3.0F, -2.8175F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 17).addBox(-2.5176F, -2.5F, -2.2162F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(15, 11).addBox(-1.5176F, -2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(13, 11).addBox(-1.5176F, 2.5F, -2.2162F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(1.0352F, -3.0F, 2.1825F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.8724F, -2.8325F, -2.6075F, -0.7854F, 0.7854F, 0.0F));

		PartDefinition bone_23 = root.addOrReplaceChild("bone_23", CubeListBuilder.create().texOffs(22, 26).mirror().addBox(-5.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 4).mirror().addBox(3.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(15.5801F, -4.72F, 3.03F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone_24 = root.addOrReplaceChild("bone_24", CubeListBuilder.create().texOffs(22, 22).mirror().addBox(-5.49F, -0.995F, -1.805F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 6).mirror().addBox(-5.49F, -0.995F, -0.355F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(-4.54F, -0.52F, -0.98F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(21, 11).mirror().addBox(3.51F, -0.995F, 0.795F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 16).mirror().addBox(3.51F, -0.995F, -1.655F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(17.5551F, -9.22F, -18.72F, 0.0F, -0.7854F, 0.0F));

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