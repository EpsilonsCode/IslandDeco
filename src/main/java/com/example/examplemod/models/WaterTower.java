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

public class WaterTower<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "watertower"), "main");
	private final ModelPart bone5;

	public WaterTower(ModelPart root) {
		this.bone5 = root.getChild("bone5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0338F, 24.0F, 0.0F));

		PartDefinition bone2 = bone5.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0338F, -8.0F, -12.8F, 26.0F, 8.0F, 26.0F, new CubeDeformation(0.0F))
		.texOffs(0, 34).addBox(-9.4F, -8.72F, -9.6F, 19.0F, 2.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(113, 140).addBox(-2.28F, -50.8F, -2.88F, 5.0F, 42.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(78, 0).addBox(-8.88F, -9.2F, -8.8F, 18.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-0.34F, -4.05F, -3.52F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.9324F, -4.0F, -10.4F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-0.04F, -4.05F, -1.28F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.9324F, -4.0F, 10.4F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 13).addBox(-2.66F, -4.05F, -3.52F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, -4.0F, -10.4F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 55).addBox(-2.96F, -4.05F, -1.28F, 3.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.0F, -4.0F, 10.4F, 0.0F, 0.829F, 0.0F));

		PartDefinition octagon2 = bone2.addOrReplaceChild("octagon2", CubeListBuilder.create(), PartPose.offset(13.28F, -36.64F, -13.12F));

		PartDefinition octagon21312 = bone2.addOrReplaceChild("octagon21312", CubeListBuilder.create(), PartPose.offset(13.12F, -34.56F, -13.28F));

		PartDefinition octagon_r1 = octagon21312.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(122, 20).addBox(-9.4F, -13.2F, -3.9765F, 19.0F, 14.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(62, 92).addBox(-4.0235F, -13.2F, -9.6F, 8.0F, 14.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.8F, -16.64F, 12.8F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r2 = octagon21312.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(0, 139).addBox(-9.4F, -13.2F, -3.9765F, 19.0F, 14.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(97, 106).addBox(-4.0235F, -13.2F, -9.6F, 8.0F, 14.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.8F, -16.64F, 12.8F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon232132 = bone2.addOrReplaceChild("octagon232132", CubeListBuilder.create(), PartPose.offset(13.28F, -33.44F, -13.12F));

		PartDefinition octagon_r3 = octagon232132.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(0, 55).addBox(-5.0294F, -1.2F, -12.0F, 10.0F, 2.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(97, 92).addBox(-12.0F, -1.2F, -4.9706F, 24.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(97, 92).addBox(-12.0F, 13.825F, -4.9706F, 24.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 55).addBox(-5.0294F, 13.75F, -12.0F, 10.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.8F, -31.64F, 12.8F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r4 = octagon232132.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(102, 61).addBox(-12.0F, -1.2F, -4.9706F, 24.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(52, 34).addBox(-5.0294F, -1.2F, -12.0F, 10.0F, 2.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(102, 61).addBox(-12.0F, 13.8F, -4.9706F, 24.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(52, 34).addBox(-5.0294F, 13.8F, -12.0F, 10.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.8F, -31.64F, 12.8F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon3 = octagon232132.addOrReplaceChild("octagon3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3F, 0.0F));

		PartDefinition bone3 = bone5.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(102, 85).addBox(-19.54F, -19.799F, -0.2519F, 20.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(133, 140).addBox(-19.94F, -19.799F, -19.0919F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(133, 140).mirror().addBox(-0.5676F, -19.799F, -19.0919F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(9.72F, -10.001F, 9.5719F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(66, 150).mirror().addBox(-1.1F, -21.0F, -0.8F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4924F, -19.799F, 0.5481F, 0.096F, 0.0F, -0.0873F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 30).mirror().addBox(-0.5F, -0.1F, -26.8F, 1.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(90, 30).addBox(-19.8724F, -0.1F, -26.8F, 1.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0676F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.475F, -0.1F, -27.6F, 1.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 81).addBox(-19.8974F, -0.1F, -27.6F, 1.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0676F, -17.4655F, -2.2839F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 150).mirror().addBox(-1.1F, -21.0F, -0.2F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4924F, -19.799F, -19.6919F, -0.096F, 0.0F, -0.0873F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(127, 115).mirror().addBox(-0.5211F, -1.1196F, -12.4954F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9981F, -27.8616F, -9.2459F, 0.7859F, -0.0308F, -0.0745F));

		PartDefinition cube_r10 = bone3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(55, 125).mirror().addBox(-0.5189F, -0.796F, -12.1806F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9981F, -27.8616F, -9.2459F, -0.7859F, 0.0308F, -0.0745F));

		PartDefinition cube_r11 = bone3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(55, 125).addBox(-0.4811F, -0.796F, -12.1806F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.5095F, -27.8616F, -9.2459F, -0.7859F, -0.0308F, 0.0745F));

		PartDefinition cube_r12 = bone3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(127, 115).addBox(-0.4789F, -1.1196F, -12.4954F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.5095F, -27.8616F, -9.2459F, 0.7859F, 0.0308F, 0.0745F));

		PartDefinition cube_r13 = bone3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(102, 85).addBox(-9.8586F, -1.2778F, -0.9682F, 20.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6814F, -18.5212F, -18.9237F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r14 = bone3.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(102, 79).addBox(-6.8746F, 6.0675F, -1.0682F, 30.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6814F, -18.5212F, -18.9237F, -3.1416F, 0.0F, 2.3562F));

		PartDefinition cube_r15 = bone3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(102, 77).addBox(-23.0325F, 5.9747F, -0.9682F, 30.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6814F, -18.5212F, -18.9237F, 3.1416F, 0.0F, -2.3562F));

		PartDefinition cube_r16 = bone3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(102, 77).addBox(-9.4F, -0.5F, -0.4F, 30.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.7428F, -4.3033F, 0.1481F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r17 = bone3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(78, 24).addBox(-12.7325F, -1.3254F, -0.45F, 25.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6814F, -28.4974F, -18.4419F, -0.0618F, -0.0617F, -0.7835F));

		PartDefinition cube_r18 = bone3.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(102, 81).addBox(-12.1746F, -1.2325F, -0.55F, 25.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6814F, -28.4974F, -18.4419F, -0.0618F, 0.0686F, 0.7835F));

		PartDefinition cube_r19 = bone3.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(78, 24).addBox(-12.7325F, -1.3254F, -0.55F, 25.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6814F, -28.4974F, -0.7019F, 0.0618F, 0.0617F, -0.7835F));

		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(102, 81).addBox(-12.1746F, -1.2325F, -0.45F, 25.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.6814F, -28.4974F, -0.7019F, 0.0618F, -0.0686F, 0.7835F));

		PartDefinition cube_r21 = bone3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(102, 79).addBox(-9.0F, -0.5F, -0.4F, 30.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.8225F, -12.3744F, 0.2481F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r22 = bone3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(62, 150).addBox(0.1F, -21.0F, -0.2F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, -19.799F, -19.6919F, -0.096F, 0.0F, 0.0873F));

		PartDefinition cube_r23 = bone3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(66, 150).addBox(0.1F, -21.0F, -0.8F, 1.0F, 44.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, -19.799F, 0.5481F, 0.096F, 0.0F, 0.0873F));

		PartDefinition bone4 = bone5.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2162F, -26.1327F, 12.82F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(11, 0).addBox(-6.3F, 20.8F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 2).addBox(-6.3F, 16.5F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 13).addBox(-6.3F, 10.9F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 15).addBox(-6.3F, 6.3F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(-6.3F, 0.7F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 49).addBox(-6.3F, -4.2F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 51).addBox(-6.3F, -9.5F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 55).addBox(-6.3F, -14.4F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 34).addBox(-6.3F, -19.6F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 36).addBox(-6.3F, -25.1F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 38).addBox(-6.3F, -29.9F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(105, 139).mirror().addBox(-7.0F, -41.5F, 2.5F, 1.0F, 68.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(105, 139).addBox(-0.5F, -41.5F, 2.5F, 1.0F, 68.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 40).addBox(-6.3F, -34.8F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 42).addBox(-6.3F, -40.0F, 2.6F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1222F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}