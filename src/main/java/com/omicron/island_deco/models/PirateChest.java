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

public class PirateChest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "piratechest"), "main");
	private final ModelPart root;

	public PirateChest(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-11.4813F, 17.0F, 0.0F));

		PartDefinition coins = root.addOrReplaceChild("coins", CubeListBuilder.create(), PartPose.offset(-6.5F, 0.0F, -7.5F));

		PartDefinition coin_r1 = coins.addOrReplaceChild("coin_r1", CubeListBuilder.create().texOffs(84, 65).addBox(-0.5F, -0.15F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.0125F, -11.2F, 4.825F, 0.0F, 0.0F, 0.7854F));

		PartDefinition coin_r2 = coins.addOrReplaceChild("coin_r2", CubeListBuilder.create().texOffs(84, 65).addBox(-1.725F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.0125F, -10.375F, 6.075F, 0.0F, -0.3927F, 0.0F));

		PartDefinition coin_r3 = coins.addOrReplaceChild("coin_r3", CubeListBuilder.create().texOffs(84, 65).addBox(4.05F, -16.175F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(84, 65).addBox(7.525F, -16.775F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.2375F, 4.35F, 21.35F, 0.0F, 0.0F, 0.0F));

		PartDefinition coin_r4 = coins.addOrReplaceChild("coin_r4", CubeListBuilder.create().texOffs(84, 65).addBox(-0.325F, -0.625F, -0.025F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.7875F, -11.55F, 9.975F, 0.0F, 0.0F, 0.3927F));

		PartDefinition coin_r5 = coins.addOrReplaceChild("coin_r5", CubeListBuilder.create().texOffs(84, 65).addBox(-2.35F, -0.125F, -0.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.4875F, -11.8F, 3.1F, 0.0F, 0.3927F, 0.0F));

		PartDefinition coin_r6 = coins.addOrReplaceChild("coin_r6", CubeListBuilder.create().texOffs(84, 65).addBox(7.2F, 1.0F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.4937F, -11.8F, 4.7481F, 0.0F, -0.3927F, 0.0F));

		PartDefinition coin_r7 = coins.addOrReplaceChild("coin_r7", CubeListBuilder.create().texOffs(84, 65).addBox(-0.475F, 1.85F, 0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.1813F, -11.375F, 2.0679F, 0.0F, 0.7854F, 0.0F));

		PartDefinition coin_r8 = coins.addOrReplaceChild("coin_r8", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(4.5F, 0.575F, 5.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(22.3937F, -11.45F, 1.5929F, 0.0F, -0.7854F, 0.0F));

		PartDefinition coin_r9 = coins.addOrReplaceChild("coin_r9", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.725F, 2.35F, -0.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(22.3937F, -11.025F, 2.0679F, 0.0F, -0.7854F, 0.0F));

		PartDefinition coin_r10 = coins.addOrReplaceChild("coin_r10", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-2.2F, 0.425F, 1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(13.1563F, -11.45F, 4.7481F, 0.0F, 0.0F, -0.7854F));

		PartDefinition coin_r11 = coins.addOrReplaceChild("coin_r11", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.1F, 1.15F, -0.7F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(21.0875F, -11.45F, 3.1F, 0.0F, -0.3927F, 0.0F));

		PartDefinition coin_r12 = coins.addOrReplaceChild("coin_r12", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-10.975F, -16.775F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 65).mirror().addBox(-7.5F, -16.175F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(27.3375F, 4.7F, 20.35F, 0.0F, 0.0F, 0.0F));

		PartDefinition coin_r13 = coins.addOrReplaceChild("coin_r13", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-2.45F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(14.7875F, -10.95F, 13.225F, 0.0F, 0.0F, -0.3927F));

		PartDefinition coin_r14 = coins.addOrReplaceChild("coin_r14", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.725F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(17.5625F, -10.025F, 5.075F, 0.0F, 0.3927F, 0.0F));

		PartDefinition coin_r15 = coins.addOrReplaceChild("coin_r15", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.725F, 0.125F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(13.5625F, -10.85F, 3.825F, 0.0F, 0.0F, -0.3927F));

		PartDefinition coin_r16 = coins.addOrReplaceChild("coin_r16", CubeListBuilder.create().texOffs(84, 65).addBox(-7.95F, 0.575F, 5.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.1813F, -11.8F, 2.5929F, 0.0F, 0.7854F, 0.0F));

		PartDefinition coin_r17 = coins.addOrReplaceChild("coin_r17", CubeListBuilder.create().texOffs(84, 65).addBox(-0.5F, -0.15F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.6625F, -10.4F, 4.825F, 0.0F, 0.0F, 0.7854F));

		PartDefinition coin_r18 = coins.addOrReplaceChild("coin_r18", CubeListBuilder.create().texOffs(84, 65).addBox(-1.725F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.6625F, -10.4F, 6.075F, 0.0F, -0.3927F, 0.0F));

		PartDefinition coin_r19 = coins.addOrReplaceChild("coin_r19", CubeListBuilder.create().texOffs(84, 65).addBox(4.05F, -16.175F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(84, 65).addBox(7.525F, -16.775F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.8875F, 5.15F, 21.35F, 0.0F, 0.0F, 0.0F));

		PartDefinition coin_r20 = coins.addOrReplaceChild("coin_r20", CubeListBuilder.create().texOffs(84, 65).addBox(-0.325F, -0.625F, -0.025F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(33.4375F, -10.75F, 9.975F, 0.0F, 0.0F, 0.3927F));

		PartDefinition coin_r21 = coins.addOrReplaceChild("coin_r21", CubeListBuilder.create().texOffs(84, 65).addBox(-2.35F, -0.625F, -0.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(26.1375F, -11.0F, 3.1F, 0.0F, 0.3927F, 0.0F));

		PartDefinition coin_r22 = coins.addOrReplaceChild("coin_r22", CubeListBuilder.create().texOffs(84, 65).addBox(7.2F, 1.0F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(26.1437F, -11.0F, 4.7481F, 0.0F, -0.3927F, 0.0F));

		PartDefinition coin_r23 = coins.addOrReplaceChild("coin_r23", CubeListBuilder.create().texOffs(84, 65).addBox(-0.475F, 0.575F, 0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.8313F, -10.575F, 2.0679F, 0.0F, 0.7854F, 0.0F));

		PartDefinition coin_r24 = coins.addOrReplaceChild("coin_r24", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(4.5F, 0.575F, 5.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(33.0437F, -10.65F, 1.5929F, 0.0F, -0.7854F, 0.0F));

		PartDefinition coin_r25 = coins.addOrReplaceChild("coin_r25", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.725F, 0.575F, -0.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(33.0437F, -10.225F, 2.0679F, 0.0F, -0.7854F, 0.0F));

		PartDefinition coin_r26 = coins.addOrReplaceChild("coin_r26", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-2.2F, 0.425F, 1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(23.8063F, -10.65F, 4.7481F, 0.0F, 0.0F, -0.7854F));

		PartDefinition coin_r27 = coins.addOrReplaceChild("coin_r27", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.1F, -1.05F, -0.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(31.7375F, -10.65F, 3.1F, 0.0F, -0.3927F, 0.0F));

		PartDefinition coin_r28 = coins.addOrReplaceChild("coin_r28", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-10.975F, -16.775F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 65).mirror().addBox(-7.5F, -16.175F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(37.9875F, 5.5F, 20.35F, 0.0F, 0.0F, 0.0F));

		PartDefinition coin_r29 = coins.addOrReplaceChild("coin_r29", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-2.45F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(25.4375F, -10.15F, 13.225F, 0.0F, 0.0F, -0.3927F));

		PartDefinition coin_r30 = coins.addOrReplaceChild("coin_r30", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.725F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(28.2125F, -10.05F, 5.075F, 0.0F, 0.3927F, 0.0F));

		PartDefinition coin_r31 = coins.addOrReplaceChild("coin_r31", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.725F, 0.125F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(24.2125F, -10.05F, 3.825F, 0.0F, 0.0F, -0.3927F));

		PartDefinition coin_r32 = coins.addOrReplaceChild("coin_r32", CubeListBuilder.create().texOffs(84, 65).addBox(-7.95F, 0.575F, 5.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.8313F, -11.0F, 2.5929F, 0.0F, 0.7854F, 0.0F));

		PartDefinition coin_r33 = coins.addOrReplaceChild("coin_r33", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(4.5F, 0.575F, 5.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(10.1312F, -11.0F, 2.5929F, 0.0F, -0.7854F, 0.0F));

		PartDefinition coin_r34 = coins.addOrReplaceChild("coin_r34", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-2.95F, -0.15F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3F, -10.4F, 4.825F, 0.0F, 0.0F, -0.7854F));

		PartDefinition coin_r35 = coins.addOrReplaceChild("coin_r35", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.725F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.3F, -10.4F, 6.075F, 0.0F, 0.3927F, 0.0F));

		PartDefinition coin_r36 = coins.addOrReplaceChild("coin_r36", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-7.5F, -16.175F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 65).mirror().addBox(-10.975F, -16.775F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(15.075F, 5.15F, 21.35F, 0.0F, 0.0F, 0.0F));

		PartDefinition coin_r37 = coins.addOrReplaceChild("coin_r37", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-3.125F, -0.625F, -0.025F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.525F, -10.75F, 9.975F, 0.0F, 0.0F, -0.3927F));

		PartDefinition coin_r38 = coins.addOrReplaceChild("coin_r38", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-1.1F, -0.625F, -0.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.825F, -11.0F, 3.1F, 0.0F, -0.3927F, 0.0F));

		PartDefinition coin_r39 = coins.addOrReplaceChild("coin_r39", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-10.65F, 1.0F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.8188F, -11.0F, 4.7481F, 0.0F, 0.3927F, 0.0F));

		PartDefinition coin_r40 = coins.addOrReplaceChild("coin_r40", CubeListBuilder.create().texOffs(84, 65).mirror().addBox(-2.975F, 0.575F, 0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.1312F, -10.575F, 2.0679F, 0.0F, -0.7854F, 0.0F));

		PartDefinition coin_r41 = coins.addOrReplaceChild("coin_r41", CubeListBuilder.create().texOffs(84, 65).addBox(-7.95F, 0.575F, 5.85F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9188F, -10.65F, 1.5929F, 0.0F, 0.7854F, 0.0F));

		PartDefinition coin_r42 = coins.addOrReplaceChild("coin_r42", CubeListBuilder.create().texOffs(84, 65).addBox(-1.725F, 0.575F, -0.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9188F, -10.225F, 2.0679F, 0.0F, 0.7854F, 0.0F));

		PartDefinition coin_r43 = coins.addOrReplaceChild("coin_r43", CubeListBuilder.create().texOffs(84, 65).addBox(-1.25F, 0.425F, 1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.1562F, -10.65F, 4.7481F, 0.0F, 0.0F, 0.7854F));

		PartDefinition coin_r44 = coins.addOrReplaceChild("coin_r44", CubeListBuilder.create().texOffs(84, 65).addBox(-2.35F, -1.05F, -0.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.225F, -10.65F, 3.1F, 0.0F, 0.3927F, 0.0F));

		PartDefinition coin_r45 = coins.addOrReplaceChild("coin_r45", CubeListBuilder.create().texOffs(84, 65).addBox(7.525F, -16.775F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(84, 65).addBox(4.05F, -16.175F, -13.1F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.025F, 5.5F, 20.35F, 0.0F, 0.0F, 0.0F));

		PartDefinition coin_r46 = coins.addOrReplaceChild("coin_r46", CubeListBuilder.create().texOffs(84, 65).addBox(-1.0F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.525F, -10.15F, 13.225F, 0.0F, 0.0F, 0.3927F));

		PartDefinition coin_r47 = coins.addOrReplaceChild("coin_r47", CubeListBuilder.create().texOffs(84, 65).addBox(-1.725F, -0.625F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.75F, -10.05F, 5.075F, 0.0F, -0.3927F, 0.0F));

		PartDefinition coin_r48 = coins.addOrReplaceChild("coin_r48", CubeListBuilder.create().texOffs(84, 65).addBox(-1.725F, 0.125F, -1.725F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.75F, -10.05F, 3.825F, 0.0F, 0.0F, 0.3927F));

		PartDefinition base = root.addOrReplaceChild("base", CubeListBuilder.create().texOffs(9, 0).addBox(-1.0F, -6.4333F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.5187F, -5.0083F, -8.5F, 38.0F, 15.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(81, 52).addBox(-6.5187F, 8.0667F, -9.5F, 36.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(81, 52).addBox(-6.5187F, 8.0667F, 6.5F, 36.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 80).addBox(-8.5F, 8.0667F, -7.5F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(80, 69).addBox(-7.0187F, -6.9583F, -9.5F, 37.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(66, 80).addBox(-8.75F, -6.9833F, -9.5F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(81, 52).addBox(-6.5187F, -6.9333F, 6.4F, 36.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 94).addBox(-9.5F, -4.9333F, -10.5F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(12, 94).addBox(-9.5F, -4.9333F, 5.5F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(86, 55).addBox(-9.75F, 9.0667F, -10.75F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(84, 73).addBox(-9.75F, 9.0667F, 5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(84, 86).addBox(-9.75F, -7.1833F, -10.75F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(86, 55).addBox(-9.75F, 9.0667F, -10.75F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 94).addBox(-9.5F, -4.9333F, -10.5F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(84, 86).addBox(-9.75F, -7.1833F, -10.75F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(91, 0).addBox(-9.75F, -7.1833F, 5.25F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(86, 55).mirror().addBox(29.2125F, 9.0667F, -10.75F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 94).mirror().addBox(29.4625F, -4.9333F, -10.5F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 86).mirror().addBox(29.2125F, -7.1833F, -10.75F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(66, 80).mirror().addBox(30.2125F, -6.9833F, -9.5F, 1.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(91, 0).mirror().addBox(29.2125F, -7.1833F, 5.25F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(12, 94).mirror().addBox(29.4625F, -4.9333F, 5.5F, 3.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 73).mirror().addBox(29.2125F, 9.0667F, 5.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 80).mirror().addBox(30.4625F, 8.0667F, -7.5F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(9, 0).mirror().addBox(21.9625F, -6.4333F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, -3.0667F, 1.0F));

		PartDefinition lid = base.addOrReplaceChild("lid", CubeListBuilder.create().texOffs(0, 69).addBox(-7.2768F, -7.5216F, -10.1974F, 38.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 84).addBox(-6.8456F, -3.2466F, -11.4474F, 14.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 84).mirror().addBox(16.1169F, -3.2466F, -11.4474F, 14.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 30).addBox(-9.2581F, -8.4177F, -11.725F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-1.2206F, -7.7693F, -10.3942F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(71, 84).addBox(-9.1956F, -1.1302F, -17.4257F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(80, 69).addBox(-6.2768F, -0.8802F, -15.9507F, 36.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-6.2768F, -0.8802F, -13.9507F, 36.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(29, 84).addBox(-8.2581F, -0.8802F, -14.4507F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(86, 48).addBox(-0.7581F, -1.3802F, -1.4507F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(86, 48).mirror().addBox(22.2044F, -1.3802F, -1.4507F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 30).mirror().addBox(21.7419F, -7.7693F, -10.3942F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 30).mirror().addBox(10.3419F, -7.7693F, -10.3942F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(71, 84).mirror().addBox(29.7669F, -1.1302F, -17.4257F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(29, 84).mirror().addBox(29.7044F, -0.8802F, -14.4507F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 30).mirror().addBox(29.7794F, -8.4177F, -11.725F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2419F, -6.0531F, 6.9507F, -0.7854F, 0.0F, 0.0F));

		PartDefinition metaldetail_r1 = lid.addOrReplaceChild("metaldetail_r1", CubeListBuilder.create().texOffs(84, 80).mirror().addBox(4.5375F, -2.9293F, 0.6554F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 80).addBox(-34.5F, -2.9293F, 0.6554F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.2419F, -5.6541F, -2.6464F, -1.3177F, 0.0F, 0.0F));

		PartDefinition metaldetail_r2 = lid.addOrReplaceChild("metaldetail_r2", CubeListBuilder.create().texOffs(0, 7).mirror().addBox(4.5325F, -3.0221F, -4.1294F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 7).addBox(-34.49F, -3.0221F, -4.1294F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.2419F, -3.7178F, -2.1456F, -0.5323F, 0.0F, 0.0F));

		PartDefinition metaldetail_r3 = lid.addOrReplaceChild("metaldetail_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(4.5325F, -3.0221F, -1.1206F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(-34.49F, -3.0221F, -1.1206F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.2419F, -3.7178F, -13.7558F, 0.5323F, 0.0F, 0.0F));

		PartDefinition metaldetail_r4 = lid.addOrReplaceChild("metaldetail_r4", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(4.5375F, -2.9293F, -5.4304F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(91, 5).mirror().addBox(-14.9F, -2.1793F, -5.4304F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(91, 5).mirror().addBox(-3.5F, -2.1793F, -5.4304F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(91, 5).addBox(-26.4625F, -2.1793F, -5.4304F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(-34.5F, -2.9293F, -5.4304F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.2419F, -5.6541F, -13.255F, 1.3177F, 0.0F, 0.0F));

		PartDefinition metaldetail_r5 = lid.addOrReplaceChild("metaldetail_r5", CubeListBuilder.create().texOffs(56, 84).mirror().addBox(-7.4625F, -1.6793F, 1.1554F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(56, 84).mirror().addBox(3.9375F, -1.6793F, 1.1554F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(9, 3).addBox(-19.025F, -1.6793F, 4.9054F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 84).addBox(-19.025F, -1.6793F, 1.1554F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.8044F, -5.6759F, -2.6833F, -1.3177F, 0.0F, 0.0F));

		PartDefinition metaldetail_r6 = lid.addOrReplaceChild("metaldetail_r6", CubeListBuilder.create().texOffs(62, 84).mirror().addBox(-7.4625F, -2.0221F, -5.1294F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(62, 84).mirror().addBox(3.9375F, -2.0221F, -5.1294F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(62, 84).addBox(-19.025F, -2.0221F, -5.1294F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.8044F, -3.4235F, -2.1138F, -0.5323F, 0.0F, 0.0F));

		PartDefinition metaldetail_r7 = lid.addOrReplaceChild("metaldetail_r7", CubeListBuilder.create().texOffs(46, 84).mirror().addBox(-7.4625F, -2.0221F, -1.1206F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 84).mirror().addBox(3.9375F, -2.0221F, -1.1206F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 84).addBox(-19.025F, -2.0221F, -1.1206F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.8044F, -3.4235F, -13.7876F, 0.5323F, 0.0F, 0.0F));

		PartDefinition latch_r1 = lid.addOrReplaceChild("latch_r1", CubeListBuilder.create().texOffs(84, 39).mirror().addBox(-2.5F, 0.275F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 39).addBox(-25.1375F, 0.275F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(23.5419F, -1.5791F, -15.9059F, 0.3927F, 0.0F, 0.0F));

		PartDefinition lid_r1 = lid.addOrReplaceChild("lid_r1", CubeListBuilder.create().texOffs(81, 46).mirror().addBox(-15.4625F, -2.9293F, 4.4304F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(81, 46).mirror().addBox(-7.4438F, -2.9293F, 4.4304F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(81, 46).addBox(-30.4063F, -2.9293F, 4.4304F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 77).addBox(-30.4625F, -2.9293F, 0.6554F, 38.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(23.1857F, -4.7581F, -4.174F, -1.3177F, 0.0F, 0.0F));

		PartDefinition lid_r2 = lid.addOrReplaceChild("lid_r2", CubeListBuilder.create().texOffs(0, 43).addBox(-7.4375F, -3.0221F, -1.1206F, 38.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1607F, -2.8218F, -12.2282F, 0.5323F, 0.0F, 0.0F));

		PartDefinition lid_r3 = lid.addOrReplaceChild("lid_r3", CubeListBuilder.create().texOffs(0, 61).addBox(-7.4625F, -2.9293F, -4.8304F, 38.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1857F, -4.7581F, -11.7274F, 1.3177F, 0.0F, 0.0F));

		PartDefinition lid_r4 = lid.addOrReplaceChild("lid_r4", CubeListBuilder.create().texOffs(0, 52).addBox(-7.4375F, -3.0221F, -4.1294F, 38.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1607F, -2.8218F, -3.6732F, -0.5323F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}