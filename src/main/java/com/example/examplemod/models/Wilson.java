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

public class Wilson<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wilson"), "main");
	private final ModelPart root;

	public Wilson(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rocks = root.addOrReplaceChild("rocks", CubeListBuilder.create().texOffs(22, 72).addBox(0.274F, -2.45F, -1.5492F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 60).addBox(-5.348F, -1.325F, -7.1221F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(57, 15).addBox(-0.925F, -1.225F, -6.325F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(17, 20).addBox(-14.9444F, -0.8F, -5.6066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 18).addBox(-13.7194F, -0.8F, -3.0934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 55).addBox(-8.025F, -1.225F, -3.15F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(12, 72).addBox(5.274F, -2.025F, 0.9742F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.348F, -0.9F, 6.5471F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(48, 37).addBox(1.8F, -0.8F, 2.225F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(7, 16).addBox(12.2194F, -0.375F, 4.5066F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-9.4444F, -0.375F, 1.2934F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 53).addBox(-3.025F, -0.8F, 0.575F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.025F, 0.0F, 0.0F));

		PartDefinition rocks_r1 = rocks.addOrReplaceChild("rocks_r1", CubeListBuilder.create().texOffs(26, 46).addBox(0.825F, -2.3375F, -2.4625F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(12, 68).addBox(2.95F, -0.3375F, -3.4375F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.725F, -0.6625F, 4.4875F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rocks_r2 = rocks.addOrReplaceChild("rocks_r2", CubeListBuilder.create().texOffs(17, 16).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.2944F, 0.125F, 8.2066F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rocks_r3 = rocks.addOrReplaceChild("rocks_r3", CubeListBuilder.create().texOffs(0, 16).addBox(4.5F, -0.375F, -1.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.725F, 0.0F, 3.725F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rocks_r4 = rocks.addOrReplaceChild("rocks_r4", CubeListBuilder.create().texOffs(62, 29).addBox(-3.5F, -0.3125F, -3.8125F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.075F, -0.6625F, 3.8875F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rocks_r5 = rocks.addOrReplaceChild("rocks_r5", CubeListBuilder.create().texOffs(45, 66).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.47F, 0.225F, 1.3073F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rocks_r6 = rocks.addOrReplaceChild("rocks_r6", CubeListBuilder.create().texOffs(66, 36).addBox(-0.3F, -1.5F, -2.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4887F, -1.3F, 3.297F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rocks_r7 = rocks.addOrReplaceChild("rocks_r7", CubeListBuilder.create().texOffs(9, 45).addBox(-4.625F, -1.45F, 2.15F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(32, 28).addBox(-9.625F, -2.15F, -0.85F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-6.725F, -0.8F, 4.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 50).addBox(-2.175F, -1.65F, -0.875F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.0F, 5.25F, 0.0F, -0.3927F, 0.0F));

		PartDefinition rocks_r8 = rocks.addOrReplaceChild("rocks_r8", CubeListBuilder.create().texOffs(66, 56).addBox(-6.95F, -0.3375F, 0.4375F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(45, 0).addBox(-5.825F, -2.3375F, -1.5375F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5F, -0.6625F, 2.3125F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rocks_r9 = rocks.addOrReplaceChild("rocks_r9", CubeListBuilder.create().texOffs(44, 46).addBox(0.825F, -2.3375F, -1.5375F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(26, 68).addBox(2.95F, -0.3375F, 0.4375F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.725F, -1.0875F, -3.0625F, 0.0F, -0.7854F, 0.0F));

		PartDefinition rocks_r10 = rocks.addOrReplaceChild("rocks_r10", CubeListBuilder.create().texOffs(17, 18).addBox(-0.5F, -0.5F, 1.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0194F, -0.3F, -8.3066F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rocks_r11 = rocks.addOrReplaceChild("rocks_r11", CubeListBuilder.create().texOffs(20, 17).addBox(4.5F, -0.375F, 0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(63, 0).addBox(-4.625F, -1.45F, -6.15F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(32, 37).addBox(-9.625F, -2.15F, -5.15F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(68, 70).addBox(-6.725F, -0.8F, -7.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(66, 23).addBox(-2.175F, -1.65F, -2.125F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -0.425F, -3.825F, 0.0F, 0.3927F, 0.0F));

		PartDefinition rocks_r12 = rocks.addOrReplaceChild("rocks_r12", CubeListBuilder.create().texOffs(62, 62).addBox(-3.5F, -0.3125F, -0.1875F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.35F, -1.0875F, -3.9875F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rocks_r13 = rocks.addOrReplaceChild("rocks_r13", CubeListBuilder.create().texOffs(67, 7).addBox(-1.875F, -2.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.745F, -0.2F, -1.4073F, 0.0F, 0.7854F, 0.0F));

		PartDefinition rocks_r14 = rocks.addOrReplaceChild("rocks_r14", CubeListBuilder.create().texOffs(0, 68).addBox(-0.3F, -1.5F, -0.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5113F, -1.725F, -1.872F, 0.0F, 0.3927F, 0.0F));

		PartDefinition rocks_r15 = rocks.addOrReplaceChild("rocks_r15", CubeListBuilder.create().texOffs(57, 69).addBox(-6.95F, -0.3375F, -3.4375F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(48, 26).addBox(-5.825F, -2.3375F, -2.4625F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.775F, -1.0875F, -2.4125F, 0.0F, -0.7854F, 0.0F));

		PartDefinition stick = root.addOrReplaceChild("stick", CubeListBuilder.create().texOffs(0, 5).addBox(2.2608F, 0.0489F, -7.4438F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.9957F, -1.6489F, -3.1785F));

		PartDefinition stick_r1 = stick.addOrReplaceChild("stick_r1", CubeListBuilder.create().texOffs(36, 69).addBox(-2.975F, -1.375F, -0.725F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0608F, -1.0783F, 4.1175F, 0.0F, -0.7854F, 0.0F));

		PartDefinition stick_r2 = stick.addOrReplaceChild("stick_r2", CubeListBuilder.create().texOffs(43, 22).addBox(-6.325F, -1.0F, -3.875F, 11.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.8858F, -1.0783F, 3.9925F, 0.0F, 0.0F, 0.7854F));

		PartDefinition stick_r3 = stick.addOrReplaceChild("stick_r3", CubeListBuilder.create().texOffs(0, 59).addBox(-1.7F, 0.8F, 0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0434F, -2.9011F, -1.0614F, 0.0F, 0.7854F, 0.0F));

		PartDefinition stick_r4 = stick.addOrReplaceChild("stick_r4", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -4.05F, -9.35F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5434F, 0.6489F, 0.0886F, 0.3927F, 0.0F, 0.0F));

		PartDefinition stick_r5 = stick.addOrReplaceChild("stick_r5", CubeListBuilder.create().texOffs(0, 16).addBox(-1.2463F, -0.95F, -5.5021F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.1303F, 1.8239F, 9.2904F, 0.0F, 0.3927F, 0.0F));

		PartDefinition stick_r6 = stick.addOrReplaceChild("stick_r6", CubeListBuilder.create().texOffs(16, 45).addBox(-0.9593F, -1.05F, -0.9408F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.1303F, 1.8239F, 9.2904F, 0.0F, 0.7854F, 0.0F));

		PartDefinition stick_r7 = stick.addOrReplaceChild("stick_r7", CubeListBuilder.create().texOffs(71, 14).addBox(-0.95F, -1.0F, -1.575F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0457F, 0.9489F, -4.8215F, 0.0F, 0.3927F, 0.0F));

		PartDefinition stick_r8 = stick.addOrReplaceChild("stick_r8", CubeListBuilder.create().texOffs(17, 24).addBox(-14.0F, -1.0F, 8.425F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.9957F, 0.6489F, -10.8215F, 0.0F, -0.3927F, 0.0F));

		PartDefinition wilson = root.addOrReplaceChild("wilson", CubeListBuilder.create().texOffs(58, 43).addBox(-4.575F, -10.2571F, 0.375F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(51, 7).addBox(-3.5F, -3.4571F, -4.5F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-3.5F, 3.3929F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-4.0F, -3.9571F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(17, 16).addBox(-3.5F, -4.6071F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(41, 8).addBox(-4.5F, -3.4571F, -3.5F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(34, 53).addBox(-3.5F, -3.4571F, 3.5F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 45).addBox(3.5F, -3.4571F, -3.5F, 1.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.325F, -4.9179F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition hair_r1 = wilson.addOrReplaceChild("hair_r1", CubeListBuilder.create().texOffs(0, 61).addBox(-2.725F, -3.5F, -1.825F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.575F, -6.7571F, -1.05F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hair_r2 = wilson.addOrReplaceChild("hair_r2", CubeListBuilder.create().texOffs(50, 59).addBox(-5.675F, -3.5F, 2.425F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.575F, -6.7571F, -3.05F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hair_r3 = wilson.addOrReplaceChild("hair_r3", CubeListBuilder.create().texOffs(16, 61).addBox(-4.0F, -3.5F, 0.0F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.575F, -6.7571F, 1.95F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hair_r4 = wilson.addOrReplaceChild("hair_r4", CubeListBuilder.create().texOffs(32, 61).addBox(-5.425F, -3.5F, -2.7F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.575F, -6.7571F, 3.95F, 0.0F, -0.3927F, 0.0F));

		PartDefinition hair_side_r1 = wilson.addOrReplaceChild("hair_side_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-0.825F, -3.5F, -4.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.325F, -7.0821F, -0.3F, 0.0F, 0.7854F, 0.0F));

		PartDefinition hair_side_r2 = wilson.addOrReplaceChild("hair_side_r2", CubeListBuilder.create().texOffs(16, 23).addBox(1.125F, -3.5F, -2.225F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.75F, -7.0821F, -0.3F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hair_side_r3 = wilson.addOrReplaceChild("hair_side_r3", CubeListBuilder.create().texOffs(0, 30).addBox(0.0F, -3.5F, -4.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.75F, -7.0821F, -0.3F, 0.0F, -0.7854F, 0.0F));

		PartDefinition hair_side_r4 = wilson.addOrReplaceChild("hair_side_r4", CubeListBuilder.create().texOffs(32, 0).addBox(-1.6F, -3.5F, -4.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -7.0821F, -0.3F, 0.0F, 0.3927F, 0.0F));

		PartDefinition hair_side_r5 = wilson.addOrReplaceChild("hair_side_r5", CubeListBuilder.create().texOffs(16, 30).addBox(0.0F, -3.5F, -4.0F, 0.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.25F, -7.0821F, -0.3F, 0.0F, -0.7854F, 0.0F));

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