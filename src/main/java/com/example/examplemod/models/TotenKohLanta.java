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

public class TotenKohLanta<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "totenkohlanta"), "main");
	private final ModelPart bone;

	public TotenKohLanta(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-3.016F, -5.3317F, -0.9008F, 6.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-2.516F, -6.2317F, -0.8758F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(16, 4).addBox(-1.516F, -6.5951F, -0.9008F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 5).addBox(2.984F, 7.8674F, -0.9008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 24).addBox(2.984F, -0.8317F, -0.9008F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 11).addBox(3.984F, 2.8674F, -0.9008F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 11).mirror().addBox(-6.016F, 2.8674F, -0.9008F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(6, 21).addBox(2.984F, 2.8674F, -0.9008F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 21).mirror().addBox(-4.016F, 2.8674F, -0.9008F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(24, 5).mirror().addBox(-4.016F, 7.8674F, -0.9008F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(18, 22).addBox(-4.016F, -0.8317F, -0.9008F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(29, 23).addBox(-0.516F, -3.5203F, -1.1008F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(43, 5).addBox(-2.516F, -7.6317F, -1.0008F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.016F, 15.9317F, 1.6008F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 29).mirror().addBox(-0.5F, -1.0F, -0.47F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6401F, -3.5385F, -0.6008F, 0.0F, 0.0F, 1.0908F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 29).addBox(-0.5F, -1.0F, -0.495F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6721F, -3.5385F, -0.6008F, 0.0F, 0.0F, -1.0908F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(38, 2).addBox(-2.9F, -1.5F, -0.02F, 6.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.016F, 5.9683F, -1.0008F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 8).addBox(-0.4F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8596F, -5.6977F, 0.1492F, 0.0F, 0.0F, 3.1416F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(26, 2).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6926F, -4.9013F, 0.1742F, 0.0F, 0.0F, 2.618F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 26).addBox(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2037F, -5.8586F, 0.1492F, 0.0F, 0.0F, 1.7017F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 16).addBox(-3.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.4596F, -0.5977F, 0.1992F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 22).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.3476F, -0.2133F, 0.1742F, 0.0F, 0.0F, 1.0036F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(22, 12).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0465F, 0.0507F, 0.1492F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 23).addBox(-0.6F, -2.2F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8276F, -5.6977F, 0.1492F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 10).addBox(-0.5F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6606F, -4.9013F, 0.1742F, 0.0F, 0.0F, -2.618F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(14, 26).addBox(-2.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1717F, -5.8586F, 0.1492F, 0.0F, 0.0F, -1.7017F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(16, 0).addBox(-0.5F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4276F, -0.5977F, 0.1992F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(24, 16).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3156F, -0.2133F, 0.1742F, 0.0F, 0.0F, -1.0036F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(24, 20).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0145F, 0.0507F, 0.1492F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(10, 19).addBox(-0.4F, -0.5F, -0.975F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2057F, 6.9914F, 0.0992F, 0.0F, 0.0F, -1.2217F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 26).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.34F, 6.8639F, 0.0992F, 0.0F, 0.0F, 1.0908F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2796F, 5.73F, 0.1992F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(18, 27).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3116F, 5.73F, 0.1992F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(18, 19).addBox(-0.5F, -0.5F, -0.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8663F, 6.6355F, 0.1242F, 0.0F, 0.0F, -1.2217F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -0.5F, -0.925F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8219F, 6.6638F, 0.1242F, 0.0F, 0.0F, 1.1781F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(16, 7).mirror().addBox(-0.4F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8268F, 6.288F, 0.1242F, 0.0F, 0.0F, -1.0472F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(16, 7).addBox(-1.6F, -0.4F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7948F, 6.288F, 0.1242F, 0.0F, 0.0F, 1.0472F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(4, 28).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7443F, -5.8907F, 0.0492F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 6).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7123F, -5.8907F, 0.0492F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(28, 13).addBox(-0.4F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2595F, -6.4487F, 0.1242F, 0.0F, 0.0F, 1.0472F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(28, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2866F, -6.8245F, 0.0742F, 0.0F, 0.0F, 1.1781F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(4, 25).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2546F, -6.8245F, 0.0742F, 0.0F, 0.0F, -1.1781F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 28).addBox(-0.6F, -0.6F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2275F, -6.4487F, 0.1242F, 0.0F, 0.0F, -1.0472F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}