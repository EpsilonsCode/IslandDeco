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
public class SkullStand<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "skullstand"), "main");
	private final ModelPart root;

	public SkullStand(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(30, 13).addBox(-0.5F, -21.0247F, -1.05F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(30, 30).addBox(9.5F, -25.475F, 0.525F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 30).addBox(-2.0F, -19.625F, -1.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-19.0F, -36.0F, 0.5F, 38.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 30).mirror().addBox(-13.5F, -25.475F, 0.525F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.3575F, 24.0F, 11.5789F));

		PartDefinition rope_r1 = root.addOrReplaceChild("rope_r1", CubeListBuilder.create().texOffs(28, 23).mirror().addBox(-1.675F, -1.975F, -1.075F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.6F, -33.5F, 0.925F, 0.0F, 0.0F, -0.7854F));

		PartDefinition rope_r2 = root.addOrReplaceChild("rope_r2", CubeListBuilder.create().texOffs(25, 9).mirror().addBox(-2.5F, -0.85F, -1.975F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.9512F, -34.5815F, 1.85F, 0.0F, 0.0F, 0.3927F));

		PartDefinition wood_r1 = root.addOrReplaceChild("wood_r1", CubeListBuilder.create().texOffs(8, 6).mirror().addBox(-5.5F, 1.0F, -0.175F, 15.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5831F, -22.888F, 1.825F, 0.0F, 0.0F, 0.3927F));

		PartDefinition wood_r2 = root.addOrReplaceChild("wood_r2", CubeListBuilder.create().texOffs(8, 20).mirror().addBox(1.6F, -12.775F, 0.0F, 2.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.8492F, -24.8934F, 1.325F, 0.0F, 0.0F, -0.3927F));

		PartDefinition wood_r3 = root.addOrReplaceChild("wood_r3", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(-19.0F, -1.5F, -0.1F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -35.5F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition rope_r3 = root.addOrReplaceChild("rope_r3", CubeListBuilder.create().texOffs(30, 27).mirror().addBox(-3.5F, -0.6F, -0.975F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.9512F, -23.5815F, 1.85F, 0.0F, 0.0F, 0.3927F));

		PartDefinition rope_r4 = root.addOrReplaceChild("rope_r4", CubeListBuilder.create().texOffs(14, 35).mirror().addBox(-0.225F, -1.5F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.1612F, -22.7247F, 2.1F, 0.0F, 0.0F, 0.7854F));

		PartDefinition wood_r4 = root.addOrReplaceChild("wood_r4", CubeListBuilder.create().texOffs(0, 3).addBox(-5.0F, -1.5F, -0.1F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -35.5F, 1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition wood_r5 = root.addOrReplaceChild("wood_r5", CubeListBuilder.create().texOffs(8, 20).addBox(-3.6F, -12.775F, 0.0F, 2.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.8492F, -24.8934F, 1.325F, 0.0F, 0.0F, 0.3927F));

		PartDefinition wood_r6 = root.addOrReplaceChild("wood_r6", CubeListBuilder.create().texOffs(8, 6).addBox(-9.5F, 1.0F, -0.25F, 15.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5831F, -22.888F, 1.825F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rope_r5 = root.addOrReplaceChild("rope_r5", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(-6.45F, -1.175F, -0.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-21.7257F, -19.9173F, -17.6431F, 0.3927F, 0.3927F, 0.7854F));

		PartDefinition rope_r6 = root.addOrReplaceChild("rope_r6", CubeListBuilder.create().texOffs(30, 30).mirror().addBox(-6.325F, -1.175F, 1.325F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-21.482F, -20.0119F, -17.0617F, 0.3927F, 0.3927F, 0.7854F));

		PartDefinition rope_r7 = root.addOrReplaceChild("rope_r7", CubeListBuilder.create().texOffs(30, 30).addBox(-2.3125F, -0.5F, -0.3125F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 30).addBox(-2.3125F, -0.45F, -1.6875F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0375F, -17.3269F, -14.5196F, 0.6105F, -0.648F, -0.4391F));

		PartDefinition rope_r8 = root.addOrReplaceChild("rope_r8", CubeListBuilder.create().texOffs(30, 30).addBox(-1.625F, -1.55F, 1.05F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 30).addBox(-1.5F, -1.55F, -0.325F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.869F, -22.625F, -15.531F, 0.3927F, -0.3927F, -0.7854F));

		PartDefinition rope_r9 = root.addOrReplaceChild("rope_r9", CubeListBuilder.create().texOffs(30, 13).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1052F, -18.2456F, 1.675F, 0.0F, 0.0F, 0.3927F));

		PartDefinition rope_r10 = root.addOrReplaceChild("rope_r10", CubeListBuilder.create().texOffs(14, 35).addBox(-0.775F, -1.5F, -1.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1612F, -22.7247F, 2.1F, 0.0F, 0.0F, -0.7854F));

		PartDefinition rope_r11 = root.addOrReplaceChild("rope_r11", CubeListBuilder.create().texOffs(30, 27).addBox(-0.5F, -0.6F, -0.975F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.9512F, -23.5815F, 1.85F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rope_r12 = root.addOrReplaceChild("rope_r12", CubeListBuilder.create().texOffs(25, 9).addBox(-2.5F, -0.85F, -1.975F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.9512F, -34.5815F, 1.85F, 0.0F, 0.0F, -0.3927F));

		PartDefinition rope_r13 = root.addOrReplaceChild("rope_r13", CubeListBuilder.create().texOffs(28, 23).addBox(-2.325F, -1.975F, -1.075F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.6F, -33.5F, 0.925F, 0.0F, 0.0F, 0.7854F));

		PartDefinition skull_1 = root.addOrReplaceChild("skull_1", CubeListBuilder.create().texOffs(8, 9).addBox(-3.0F, -37.825F, -3.95F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-1.0F, -34.0F, 0.0F, 2.0F, 41.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 28).addBox(-3.0F, -37.825F, 1.05F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition skull_r1 = skull_1.addOrReplaceChild("skull_r1", CubeListBuilder.create().texOffs(14, 30).addBox(2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(25, 9).addBox(-2.5F, -0.1464F, -2.0714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(14, 23).addBox(-2.5F, 0.8536F, -2.0714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 33).addBox(-2.5F, -0.1464F, -2.0714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -31.5299F, -1.9446F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_2 = root.addOrReplaceChild("skull_2", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -4.4363F, 0.8697F, 2.0F, 41.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.7F, -27.5137F, -15.9447F, 0.0F, -0.7854F, 0.0F));

		PartDefinition skull_r2 = skull_2.addOrReplaceChild("skull_r2", CubeListBuilder.create().texOffs(14, 28).addBox(-3.875F, -2.5F, 0.75F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(8, 9).addBox(-3.875F, -2.5F, -4.25F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.7613F, 1.1697F, 0.0F, 0.0F, -0.3927F));

		PartDefinition skull_r3 = skull_2.addOrReplaceChild("skull_r3", CubeListBuilder.create().texOffs(14, 30).addBox(2.5F, -0.1464F, -1.7714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(25, 9).addBox(-2.5F, -0.1464F, -1.7714F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(14, 23).addBox(-2.5F, 0.8536F, -1.7714F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(34, 33).addBox(-2.5F, -0.1464F, -1.7714F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9661F, -1.0749F, 0.7854F, 0.0F, 0.0F));

		PartDefinition skull_3 = root.addOrReplaceChild("skull_3", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-1.0F, -4.3151F, 0.7484F, 2.0F, 41.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(28.1107F, -27.6349F, -25.3839F, 0.0F, 0.7854F, 0.0F));

		PartDefinition skull_r4 = skull_3.addOrReplaceChild("skull_r4", CubeListBuilder.create().texOffs(14, 28).mirror().addBox(-1.075F, -0.55F, 2.4F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(8, 9).mirror().addBox(-1.075F, -0.55F, -2.6F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -5.6401F, 1.0484F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bone_1 = root.addOrReplaceChild("bone_1", CubeListBuilder.create().texOffs(34, 20).addBox(3.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 33).addBox(3.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 20).addBox(-4.46F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 13).addBox(-5.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 34).addBox(-5.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -19.245F, -0.37F, 0.0F, 0.0F, 0.7854F));

		PartDefinition bone_2 = root.addOrReplaceChild("bone_2", CubeListBuilder.create().texOffs(34, 20).mirror().addBox(-5.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 33).mirror().addBox(-5.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(14, 20).mirror().addBox(-4.54F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(35, 13).mirror().addBox(3.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 34).mirror().addBox(3.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.01F, -19.245F, -0.27F, 0.0F, 0.0F, -0.7854F));

		PartDefinition bone_3 = root.addOrReplaceChild("bone_3", CubeListBuilder.create().texOffs(34, 20).mirror().addBox(-5.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 33).mirror().addBox(-5.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(14, 20).mirror().addBox(-4.54F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(35, 13).mirror().addBox(3.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 34).mirror().addBox(3.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-22.235F, -23.795F, -14.92F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone_4 = root.addOrReplaceChild("bone_4", CubeListBuilder.create().texOffs(34, 20).mirror().addBox(-5.49F, -1.805F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 33).mirror().addBox(-5.49F, -0.355F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(14, 20).mirror().addBox(-4.54F, -0.98F, -0.48F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(35, 13).mirror().addBox(3.51F, 0.795F, -1.005F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(20, 34).mirror().addBox(3.51F, -1.655F, -1.005F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-22.235F, -17.045F, -14.92F, -0.3655F, -0.7119F, 0.5299F));

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