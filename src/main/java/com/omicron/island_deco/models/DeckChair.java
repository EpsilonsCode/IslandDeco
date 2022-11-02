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
import net.minecraft.world.entity.Entity;// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class DeckChair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "deckchair"), "main");
	private final ModelPart root;

	public DeckChair(ModelPart root) {
		this.root = root.getChild("root");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-0.5F, 24.0F, 1.0F));

		PartDefinition umbrella = root.addOrReplaceChild("umbrella", CubeListBuilder.create().texOffs(24, 70).addBox(-1.066F, -1.4846F, -0.9082F, 2.0F, 51.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 57).addBox(-5.6551F, -1.2115F, -5.3191F, 11.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.2387F, -48.5317F, 17.4915F, 0.0F, -0.7854F, 0.0F));

		PartDefinition fabric_r1 = umbrella.addOrReplaceChild("fabric_r1", CubeListBuilder.create().texOffs(-2, 40).mirror().addBox(-7.6089F, 0.754F, -6.8614F, 13.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-2, 40).addBox(15.9159F, 0.754F, -6.8614F, 13.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.8284F, 0.9811F, 11.3406F, -0.3927F, 0.0F, 0.0F));

		PartDefinition fabric_r2 = umbrella.addOrReplaceChild("fabric_r2", CubeListBuilder.create().texOffs(26, 70).addBox(-7.1386F, 0.754F, -5.3911F, 14.0F, 0.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(-1, 41).addBox(-7.1386F, 0.754F, -28.9159F, 14.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.4013F, 0.9811F, 10.7677F, 0.0F, 0.0F, -0.3927F));

		PartDefinition fabric_r3 = umbrella.addOrReplaceChild("fabric_r3", CubeListBuilder.create().texOffs(27, 70).mirror().addBox(-7.1386F, 0.754F, -5.3911F, 14.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(-1, 41).mirror().addBox(-7.1386F, 0.754F, -28.9159F, 14.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.3089F, 0.9811F, 10.7677F, 0.0F, 0.0F, 0.3927F));

		PartDefinition fabric_detail_r1 = umbrella.addOrReplaceChild("fabric_detail_r1", CubeListBuilder.create().texOffs(1, 1).mirror().addBox(5.3515F, 0.754F, -19.3639F, 2.0F, 0.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.6673F, 1.4139F, 0.9657F, 0.0F, 0.0F, 0.3927F));

		PartDefinition fabric_r4 = umbrella.addOrReplaceChild("fabric_r4", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-8.6089F, -1.246F, -6.3713F, 14.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.6673F, 3.1655F, 0.9657F, 0.0F, 0.0F, 0.3927F));

		PartDefinition fabric_detail_r2 = umbrella.addOrReplaceChild("fabric_detail_r2", CubeListBuilder.create().texOffs(38, 84).addBox(-16.8861F, 0.754F, 5.3911F, 36.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0264F, 1.4139F, 12.6989F, -0.3927F, 0.0F, 0.0F));

		PartDefinition fabric_r5 = umbrella.addOrReplaceChild("fabric_r5", CubeListBuilder.create().texOffs(27, 41).addBox(-4.6287F, -1.246F, -8.3317F, 11.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0264F, 3.1655F, 12.6989F, -0.3927F, 0.0F, 0.0F));

		PartDefinition fabric_r6 = umbrella.addOrReplaceChild("fabric_r6", CubeListBuilder.create().texOffs(27, 70).mirror().addBox(-7.6089F, 0.754F, -6.8614F, 13.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(27, 70).addBox(15.9159F, 0.754F, -6.8614F, 13.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.8284F, 0.9811F, -11.3696F, 0.3927F, 0.0F, 0.0F));

		PartDefinition fabric_detail_r3 = umbrella.addOrReplaceChild("fabric_detail_r3", CubeListBuilder.create().texOffs(1, 0).addBox(-7.3911F, 0.754F, -18.3639F, 2.0F, 0.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.7597F, 1.4139F, 0.9657F, 0.0F, 0.0F, -0.3927F));

		PartDefinition fabric_detail_r4 = umbrella.addOrReplaceChild("fabric_detail_r4", CubeListBuilder.create().texOffs(0, 39).addBox(-16.8861F, 0.754F, -7.3515F, 36.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0264F, 1.4139F, -12.728F, 0.3927F, 0.0F, 0.0F));

		PartDefinition fabric_r7 = umbrella.addOrReplaceChild("fabric_r7", CubeListBuilder.create().texOffs(0, 57).addBox(-5.6683F, -1.246F, -6.3713F, 14.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.7597F, 3.1655F, 0.9657F, 0.0F, 0.0F, -0.3927F));

		PartDefinition fabric_r8 = umbrella.addOrReplaceChild("fabric_r8", CubeListBuilder.create().texOffs(27, 41).addBox(-4.6287F, -1.246F, -5.3911F, 11.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0264F, 3.1655F, -12.728F, 0.3927F, 0.0F, 0.0F));

		PartDefinition table = root.addOrReplaceChild("table", CubeListBuilder.create().texOffs(17, 11).addBox(-10.5F, -3.35F, 13.75F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 11).addBox(-10.5F, -3.35F, 1.25F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-0.25F, -3.35F, 3.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).mirror().addBox(-12.75F, -3.35F, 3.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(-13.25F, -10.0F, 12.25F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).mirror().addBox(-1.75F, -10.0F, 12.25F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(-1.75F, -10.0F, 0.75F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).addBox(-13.25F, -10.0F, 0.75F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(25, 21).addBox(-14.0F, -12.0F, 0.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(6.5637F, 0.0F, -9.1501F));

		PartDefinition glass_1 = table.addOrReplaceChild("glass_1", CubeListBuilder.create().texOffs(14, 17).addBox(-7.5F, -12.5F, -9.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(17, 4).addBox(-7.5F, -18.5F, -9.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 0).addBox(-7.5F, -18.5F, -7.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 21).addBox(-5.5F, -18.5F, -8.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 21).addBox(-7.5F, -18.5F, -8.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 21).addBox(-6.5F, -15.5F, -8.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 0).addBox(-6.5F, -18.2F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, 20.0F));

		PartDefinition umbrella_r1 = glass_1.addOrReplaceChild("umbrella_r1", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -0.5F, -4.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.025F, -21.8697F, -5.9554F, 0.0F, 0.0F, 0.3927F));

		PartDefinition umbrella_r2 = glass_1.addOrReplaceChild("umbrella_r2", CubeListBuilder.create().texOffs(0, 20).addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9554F, -21.8697F, -7.975F, 0.0F, 0.0F, 0.3927F));

		PartDefinition glass_r1 = glass_1.addOrReplaceChild("glass_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.75F, -0.825F, 0.525F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -20.2F, -8.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition glass_2 = table.addOrReplaceChild("glass_2", CubeListBuilder.create().texOffs(14, 17).mirror().addBox(4.5F, -12.5F, -9.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 4).mirror().addBox(4.5F, -18.5F, -9.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(17, 0).mirror().addBox(4.5F, -18.5F, -7.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(18, 21).mirror().addBox(4.5F, -18.5F, -8.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(14, 21).mirror().addBox(6.5F, -18.5F, -8.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(22, 21).mirror().addBox(5.5F, -15.5F, -8.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(9, 0).mirror().addBox(5.5F, -18.2F, -8.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-14.0F, 0.0F, 13.0F));

		PartDefinition umbrella_r3 = glass_2.addOrReplaceChild("umbrella_r3", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(0.0F, -0.5F, -4.5F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.025F, -21.8697F, -5.9554F, 0.0F, 0.0F, -0.3927F));

		PartDefinition umbrella_r4 = glass_2.addOrReplaceChild("umbrella_r4", CubeListBuilder.create().texOffs(0, 20).mirror().addBox(-2.5F, -0.5F, 0.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9554F, -21.8697F, -7.975F, 0.0F, 0.0F, -0.3927F));

		PartDefinition glass_r2 = glass_2.addOrReplaceChild("glass_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.75F, -0.825F, 0.525F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.0F, -20.2F, -8.5F, 0.0F, 0.0F, -0.3927F));

		PartDefinition chair_1 = root.addOrReplaceChild("chair_1", CubeListBuilder.create().texOffs(52, 0).addBox(-5.475F, 0.7092F, -16.9745F, 10.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.8F, 1.1314F, -16.7805F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).mirror().addBox(6.125F, 1.1314F, -16.7805F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 31).addBox(-6.0F, 1.4425F, -15.1894F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-34.7113F, -10.0284F, -10.5208F, 0.0F, -0.3927F, 0.0F));

		PartDefinition wood_r1 = chair_1.addOrReplaceChild("wood_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-6.0F, 5.8252F, 1.5498F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(-6.0F, -16.1748F, 1.5498F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 70).mirror().addBox(6.0F, -17.4395F, 1.3145F, 2.0F, 37.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 70).addBox(-8.0F, -17.4395F, 1.3145F, 2.0F, 37.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-5.5F, -16.9622F, 0.7918F, 11.0F, 24.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4795F, 1.0837F, -0.7854F, 0.0F, 0.0F));

		PartDefinition wood_r2 = chair_1.addOrReplaceChild("wood_r2", CubeListBuilder.create().texOffs(26, 17).mirror().addBox(6.025F, 1.858F, 1.8554F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(26, 17).addBox(-7.95F, 1.858F, 1.8554F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4795F, 1.0837F, 0.3927F, 0.0F, 0.0F));

		PartDefinition wood_r3 = chair_1.addOrReplaceChild("wood_r3", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(6.125F, 6.6522F, -0.425F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 17).addBox(-7.8F, 6.6522F, -0.425F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4795F, 1.0837F, -0.3927F, 0.0F, 0.0F));

		PartDefinition chair_2 = root.addOrReplaceChild("chair_2", CubeListBuilder.create().texOffs(52, 0).addBox(-5.475F, 0.7092F, -16.9745F, 10.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.8F, 1.1314F, -16.7805F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).mirror().addBox(6.125F, 1.1314F, -16.7805F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 31).addBox(-6.0F, 1.4425F, -15.1894F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.8887F, -10.0284F, -19.0458F, 0.0F, 0.7854F, 0.0F));

		PartDefinition wood_r4 = chair_2.addOrReplaceChild("wood_r4", CubeListBuilder.create().texOffs(0, 31).addBox(-6.0F, 5.8252F, 1.5498F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 31).addBox(-6.0F, -16.1748F, 1.5498F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 70).mirror().addBox(6.0F, -17.4395F, 1.3145F, 2.0F, 37.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 70).addBox(-8.0F, -17.4395F, 1.3145F, 2.0F, 37.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-5.5F, -16.9622F, 0.7918F, 11.0F, 24.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4795F, 1.0837F, -0.7854F, 0.0F, 0.0F));

		PartDefinition wood_r5 = chair_2.addOrReplaceChild("wood_r5", CubeListBuilder.create().texOffs(26, 17).mirror().addBox(6.025F, 1.858F, 1.8554F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(26, 17).addBox(-7.95F, 1.858F, 1.8554F, 1.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4795F, 1.0837F, 0.3927F, 0.0F, 0.0F));

		PartDefinition wood_r6 = chair_2.addOrReplaceChild("wood_r6", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(6.125F, 6.6522F, -0.425F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 17).addBox(-7.8F, 6.6522F, -0.425F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4795F, 1.0837F, -0.3927F, 0.0F, 0.0F));

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