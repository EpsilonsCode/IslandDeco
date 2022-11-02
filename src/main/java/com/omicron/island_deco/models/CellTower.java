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
public class CellTower<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "celltower"), "main");
	private final ModelPart bone4;

	public CellTower(ModelPart root) {
		this.bone4 = root.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = bone4.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(16, 20).addBox(4.6852F, -15.2603F, -17.9574F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 9).addBox(13.6852F, -15.2603F, -16.9574F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(16, 0).addBox(3.6852F, -15.2603F, -17.9574F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(16, 18).addBox(3.6852F, -15.2603F, -9.9574F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 9).addBox(4.9852F, -22.0613F, -17.1574F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 9).addBox(4.9852F, -22.0613F, -10.9909F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 0).addBox(4.9852F, -20.9613F, -16.6574F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(20, 9).mirror().addBox(12.5451F, -21.9613F, -10.9909F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 9).mirror().addBox(12.5451F, -21.9613F, -17.1574F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(26, 0).mirror().addBox(12.5451F, -20.8613F, -16.6574F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 22).addBox(5.0451F, -20.9613F, -11.0574F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 22).addBox(5.0451F, -20.9613F, -17.0574F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 7).addBox(3.6852F, -21.1613F, -15.5574F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 0).addBox(12.5451F, -23.9613F, -14.0909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 7).mirror().addBox(13.2451F, -21.1613F, -15.5574F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(16, 0).addBox(12.0852F, -25.9613F, -14.5909F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(55, 8).addBox(8.6451F, -20.9613F, -10.0574F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 9).addBox(12.5852F, -26.8613F, -14.0909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 0).addBox(4.4852F, -25.9613F, -14.5909F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 9).addBox(4.9852F, -26.8613F, -14.0909F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 0).addBox(4.9451F, -23.9613F, -14.0909F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.4652F, -27.1873F, 13.5742F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(12, 0).mirror().addBox(5.3852F, -15.2613F, 9.9909F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.22F, -1.5514F, -28.5651F, -0.096F, 0.0F, 0.0873F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 0).mirror().addBox(5.3852F, -15.2613F, -10.9909F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.22F, -1.5514F, 1.4167F, 0.096F, 0.0F, 0.0873F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(4, 0).addBox(-6.3852F, -15.2613F, -10.9909F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.1504F, -1.5514F, 1.4167F, 0.096F, 0.0F, -0.0873F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 0).addBox(-6.3852F, -15.2613F, 9.9909F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.1504F, -1.5514F, -28.5651F, -0.096F, 0.0F, -0.0873F));

		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(3.4844F, 6.5057F, -13.9645F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F, -9.0F, -0.501F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4398F, 16.8555F, -6.365F, -0.065F, -0.0707F, -0.914F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(32, 24).addBox(-0.5F, -6.0F, -0.4983F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9303F, 5.7733F, -5.3061F, -0.0444F, 0.0851F, 1.0017F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(31, 40).addBox(-0.5F, -5.0F, -0.425F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.427F, -2.8641F, -4.465F, -0.065F, -0.0707F, -0.914F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(8, 45).addBox(-0.5F, -2.2F, -0.501F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2968F, -12.1294F, -3.6003F, -0.0444F, 0.0851F, 1.0017F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 45).addBox(-0.5F, -2.4F, -0.499F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.381F, -18.1274F, -2.9921F, -0.065F, -0.0707F, -0.914F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(35, 47).addBox(-0.5F, -2.4F, -0.501F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.381F, -18.1274F, 3.7727F, 0.065F, 0.0707F, -0.914F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 47).addBox(-0.5F, -2.2F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2968F, -12.1294F, 4.3809F, 0.0444F, -0.0851F, 1.0017F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(16, 41).addBox(-0.5F, -5.0F, -0.525F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.427F, -2.8641F, 5.2456F, 0.065F, 0.0707F, -0.914F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 24).addBox(-0.5F, -5.9F, -0.5004F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.9303F, 5.7733F, 6.0867F, 0.0444F, -0.0851F, 1.0017F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(20, 22).addBox(-0.5F, -9.0F, -0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.4398F, 16.8555F, 7.1456F, 0.065F, 0.0707F, -0.914F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 22).mirror().addBox(-13.6475F, 1.6811F, -0.2978F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.675F, 0.0F, 0.0F, -1.5267F, 0.6503F, -1.4484F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(23, 40).mirror().addBox(4.9054F, -2.6902F, -0.1478F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4125F, 0.0F, 0.0F, 1.5291F, 0.5706F, 1.644F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(51, 14).mirror().addBox(12.9724F, -14.758F, -0.4978F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, -1.5267F, 0.6503F, -1.4484F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 45).mirror().addBox(1.4479F, -7.5886F, 0.1022F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1138F, 0.0F, 0.0F, -1.5267F, 0.6503F, -1.4484F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(43, 48).mirror().addBox(-9.532F, -9.8996F, -0.4978F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.625F, 0.0F, 0.0F, 1.5291F, 0.5706F, 1.644F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(24, 22).addBox(12.6475F, 1.6811F, -0.2978F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.2865F, 0.0F, 0.0F, -1.5267F, -0.6503F, 1.4484F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(23, 40).addBox(-5.9054F, -2.6902F, -0.1478F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.549F, 0.0F, 0.0F, 1.5291F, -0.5706F, -1.644F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 45).addBox(-2.4479F, -7.5886F, -0.3978F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.3503F, 0.0F, 0.0F, -1.5267F, -0.6503F, 1.4484F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(51, 14).addBox(-13.9724F, -14.758F, -0.4978F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.4615F, 0.0F, 0.0F, -1.5267F, -0.6503F, 1.4484F));

		PartDefinition cube_r24 = bone3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(43, 48).addBox(8.532F, -9.8996F, -0.4978F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.3365F, 0.0F, 0.0F, 1.5291F, -0.5706F, -1.644F));

		PartDefinition bone2 = bone4.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition octagon1 = bone2.addOrReplaceChild("octagon1", CubeListBuilder.create().texOffs(51, 50).addBox(-1.4556F, -7.1167F, -50.9427F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 9).addBox(-0.8845F, -14.1167F, -50.4427F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 40).addBox(-0.3845F, -18.0167F, -50.4427F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 2.2F, -0.4F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r1 = octagon1.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(37, 18).addBox(-2.5F, -0.5F, -1.0355F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 0).addBox(-1.0355F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.42F, -5.8167F, -49.9427F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r2 = octagon1.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(38, 6).addBox(-2.5F, -0.5F, -1.0355F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(35, 35).addBox(-1.0355F, -0.5F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.42F, -5.8167F, -49.9427F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon3 = bone2.addOrReplaceChild("octagon3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2799F, -47.6603F, 5.6167F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r3 = octagon3.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(18, 54).addBox(-3.4617F, -0.6F, -1.5421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(55, 16).addBox(-1.4115F, -0.6F, -3.5924F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9598F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r4 = octagon3.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(55, 4).addBox(-3.5383F, -0.6F, -1.5421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(55, 18).addBox(-1.488F, -0.6F, 2.4076F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9598F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon4 = bone2.addOrReplaceChild("octagon4", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, -8.0F, 8.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r5 = octagon4.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(26, 0).addBox(2.5383F, -0.6F, -1.5421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(44, 14).addBox(-1.4115F, -0.6F, 2.4076F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 2.3833F, -39.6603F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r6 = octagon4.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(26, 3).addBox(2.4617F, -0.6F, -1.5421F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(55, 14).addBox(-1.488F, -0.6F, -3.5924F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 2.3833F, -39.6603F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon5 = bone2.addOrReplaceChild("octagon5", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, -8.9F, 8.6F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r7 = octagon5.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(50, 8).addBox(3.5383F, -0.5F, -1.9563F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 28).addBox(-1.8257F, -0.5F, -4.5924F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 2.2833F, -38.6779F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r8 = octagon5.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(51, 46).addBox(-4.5383F, -0.5F, -1.9563F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 38).addBox(-1.9022F, -0.5F, -4.5924F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 2.2833F, -38.6779F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon2 = bone2.addOrReplaceChild("octagon2", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, -9.0F, 8.6F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r9 = octagon2.addOrReplaceChild("octagon_r9", CubeListBuilder.create().texOffs(16, 4).addBox(2.4617F, -0.5F, -4.3706F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(51, 53).addBox(-2.9022F, -0.5F, 0.9934F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 2.2833F, -36.0647F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r10 = octagon2.addOrReplaceChild("octagon_r10", CubeListBuilder.create().texOffs(50, 4).addBox(-3.4617F, -0.5F, -4.3706F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 12).addBox(-0.8257F, -0.5F, 0.9934F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 2.2833F, -36.0647F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon9 = bone2.addOrReplaceChild("octagon9", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, -9.0F, 8.7F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r11 = octagon9.addOrReplaceChild("octagon_r11", CubeListBuilder.create().texOffs(44, 9).addBox(-5.4617F, -0.5F, -2.3706F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(49, 42).addBox(-2.2399F, -0.5F, -5.5924F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 1.6833F, -38.5955F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r12 = octagon9.addOrReplaceChild("octagon_r12", CubeListBuilder.create().texOffs(44, 35).addBox(-5.5383F, -0.5F, -2.3706F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(49, 44).addBox(-2.3164F, -0.5F, -5.5924F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 1.6833F, -38.5955F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon867 = bone2.addOrReplaceChild("octagon867", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r13 = octagon867.addOrReplaceChild("octagon_r13", CubeListBuilder.create().texOffs(40, 30).addBox(4.5383F, -0.5F, -2.3706F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(38, 9).addBox(-2.2399F, -0.5F, 4.4076F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.32F, -7.0167F, -47.5955F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r14 = octagon867.addOrReplaceChild("octagon_r14", CubeListBuilder.create().texOffs(43, 0).addBox(4.4617F, -0.5F, -2.3706F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(49, 2).addBox(-2.3164F, -0.5F, 4.4076F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.32F, -7.0167F, -47.5955F, 0.0F, -0.3927F, 0.0F));

		PartDefinition a86768 = bone2.addOrReplaceChild("a86768", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, -8.9F, 8.6F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r15 = a86768.addOrReplaceChild("octagon_r15", CubeListBuilder.create().texOffs(35, 41).addBox(5.5765F, -0.5F, -2.8772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(48, 40).addBox(-2.6159F, -0.5F, -6.6848F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 0.9833F, -38.6131F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r16 = a86768.addOrReplaceChild("octagon_r16", CubeListBuilder.create().texOffs(42, 42).addBox(-6.5765F, -0.5F, -2.8772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(49, 0).addBox(-2.7689F, -0.5F, -6.6848F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 0.9833F, -38.6131F, 0.0F, -0.3927F, 0.0F));

		PartDefinition b867866 = bone2.addOrReplaceChild("b867866", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, -8.1F, 8.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition octagon_r17 = b867866.addOrReplaceChild("octagon_r17", CubeListBuilder.create().texOffs(37, 11).addBox(-6.4235F, -0.5F, -2.8772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(47, 24).addBox(-2.6159F, -0.5F, 5.3152F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 0.3833F, -39.5131F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r18 = b867866.addOrReplaceChild("octagon_r18", CubeListBuilder.create().texOffs(40, 24).addBox(5.4235F, -0.5F, -2.8772F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(47, 26).addBox(-2.7689F, -0.5F, 5.3152F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.68F, 0.3833F, -39.5131F, 0.0F, -0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}