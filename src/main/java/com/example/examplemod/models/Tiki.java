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

public class Tiki<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "tiki"), "main");
	private final ModelPart bone2;

	public Tiki(ModelPart root) {
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition octagon_r1 = bone2.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.2F, -1.125F, -1.425F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2755F, -14.5F, -5.0326F, -0.3491F, -0.3927F, 0.0F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.3613F, -9.7212F, -7.2416F));

		PartDefinition octagon_r2 = bone.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(23, 10).addBox(1.4F, 0.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.03F, -0.0133F, 1.6238F, 0.0181F, -0.3923F, -0.0472F));

		PartDefinition octagon_r3 = bone.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(23, 10).addBox(-7.6F, 0.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9662F, -0.7043F, 2.3625F, 0.0181F, -0.3923F, -0.0472F));

		PartDefinition octagon_r4 = bone.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(23, 10).addBox(-5.4F, 0.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 10).addBox(-3.1F, 0.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1418F, -0.0067F, 2.1223F, 0.0181F, -0.3923F, -0.0472F));

		PartDefinition octagon_r5 = bone.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(23, 10).addBox(2.9F, 0.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4264F, 2.6531F, -1.0126F, 0.0181F, -0.3923F, -0.0472F));

		PartDefinition octagon_r6 = bone.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(23, 10).addBox(2.9F, 0.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7248F, 3.0504F, 1.1351F, 0.0181F, -0.3923F, -0.0472F));

		PartDefinition octagon_r7 = bone.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(23, 10).addBox(2.9F, 0.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3458F, 2.4529F, -0.0425F, 0.0181F, -0.3923F, -0.0472F));

		PartDefinition octagon_r8 = bone.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(23, 10).addBox(2.9F, 0.4F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6489F, 3.2518F, -1.5205F, 0.0181F, -0.3923F, -0.0472F));

		PartDefinition octagon_r9 = bone.addOrReplaceChild("octagon_r9", CubeListBuilder.create().texOffs(23, 3).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1379F, -0.3736F, 0.3289F));

		PartDefinition octagon_r10 = bone.addOrReplaceChild("octagon_r10", CubeListBuilder.create().texOffs(23, 0).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1418F, 5.0491F, 2.1223F, -0.1239F, -0.3736F, 0.3289F));

		PartDefinition octagon_r11 = bone.addOrReplaceChild("octagon_r11", CubeListBuilder.create().texOffs(23, 8).addBox(-1.2041F, -2.1F, -7.95F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 8).addBox(-1.2041F, -6.3F, -7.95F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4747F, 6.2212F, 7.6432F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r12 = bone.addOrReplaceChild("octagon_r12", CubeListBuilder.create().texOffs(23, 3).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0424F, 0.0F, 0.1379F, -0.3736F, -0.3289F));

		PartDefinition octagon_r13 = bone.addOrReplaceChild("octagon_r13", CubeListBuilder.create().texOffs(23, 6).addBox(-3.0F, -0.509F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9295F, 5.6412F, -0.354F, 0.2262F, 0.9637F, -0.0914F));

		PartDefinition octagon_r14 = bone.addOrReplaceChild("octagon_r14", CubeListBuilder.create().texOffs(23, 0).addBox(-1.5F, -0.5F, -0.6F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.1418F, -0.0067F, 2.1223F, 0.1239F, -0.3736F, -0.3289F));

		PartDefinition octagon_r15 = bone.addOrReplaceChild("octagon_r15", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0271F, -0.45F, 3.659F, 2.119F, -1.4356F, -2.4065F));

		PartDefinition octagon_r16 = bone.addOrReplaceChild("octagon_r16", CubeListBuilder.create().texOffs(23, 6).addBox(-3.0F, -0.5F, -0.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9295F, -0.5987F, -0.354F, -0.2262F, 0.9637F, 0.0914F));

		PartDefinition octagon_r17 = bone.addOrReplaceChild("octagon_r17", CubeListBuilder.create().texOffs(0, 10).addBox(-1.5F, -0.501F, -0.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0271F, 5.4924F, 3.659F, -2.119F, -1.4356F, 2.4065F));

		PartDefinition octagon = bone2.addOrReplaceChild("octagon", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.8F));

		PartDefinition octagon_r18 = octagon.addOrReplaceChild("octagon_r18", CubeListBuilder.create().texOffs(46, 0).addBox(-6.75F, -20.5F, -2.7959F, 13.0F, 21.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.7959F, -20.5F, -6.75F, 5.0F, 21.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1134F, -1.5F, -0.5984F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r19 = octagon.addOrReplaceChild("octagon_r19", CubeListBuilder.create().texOffs(54, 50).addBox(-6.75F, -20.5F, -2.7959F, 13.0F, 21.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(23, 21).addBox(-2.7959F, -20.5F, -6.75F, 5.0F, 21.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1134F, -1.5F, -0.5984F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon2 = bone2.addOrReplaceChild("octagon2", CubeListBuilder.create(), PartPose.offset(1.9F, -4.2F, -2.1F));

		PartDefinition octagon_r20 = octagon2.addOrReplaceChild("octagon_r20", CubeListBuilder.create().texOffs(0, 55).addBox(-3.1066F, -1.515F, -7.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0134F, -18.9F, 2.3134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r21 = octagon2.addOrReplaceChild("octagon_r21", CubeListBuilder.create().texOffs(0, 55).addBox(-3.1066F, -1.5F, -7.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0134F, -18.9F, 2.3134F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r22 = octagon2.addOrReplaceChild("octagon_r22", CubeListBuilder.create().texOffs(0, 55).addBox(-3.1066F, -1.52F, -7.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0134F, -18.9F, 2.3134F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r23 = octagon2.addOrReplaceChild("octagon_r23", CubeListBuilder.create().texOffs(0, 55).addBox(-3.1066F, -1.51F, -7.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0134F, -18.9F, 2.3134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon3 = bone2.addOrReplaceChild("octagon3", CubeListBuilder.create(), PartPose.offset(1.9F, -4.2F, -2.1F));

		PartDefinition octagon_r24 = octagon3.addOrReplaceChild("octagon_r24", CubeListBuilder.create().texOffs(0, 55).addBox(-3.1066F, -0.485F, -7.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0134F, 2.69F, 2.3134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r25 = octagon3.addOrReplaceChild("octagon_r25", CubeListBuilder.create().texOffs(0, 55).addBox(-3.1066F, -0.5F, -7.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0134F, 2.69F, 2.3134F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r26 = octagon3.addOrReplaceChild("octagon_r26", CubeListBuilder.create().texOffs(0, 55).addBox(-3.1066F, -0.48F, -7.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0134F, 2.69F, 2.3134F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r27 = octagon3.addOrReplaceChild("octagon_r27", CubeListBuilder.create().texOffs(0, 55).addBox(-3.1066F, -0.49F, -7.5F, 6.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0134F, 2.69F, 2.3134F, 0.0F, -0.3927F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}