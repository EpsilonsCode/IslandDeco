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

public class Plane<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "plane"), "main");
	private final ModelPart bone4;

	public Plane(ModelPart root) {
		this.bone4 = root.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone3 = bone4.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(44, 47).addBox(-11.2294F, -2.0186F, -5.9915F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 20).addBox(-11.2294F, -2.0176F, -5.9915F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).mirror().addBox(-11.2284F, -2.0186F, -5.9915F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 15).addBox(-4.2294F, -2.0186F, -5.9915F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(32, 20).addBox(-11.2294F, 0.9814F, -5.9915F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(44, 47).mirror().addBox(-11.2294F, -2.0186F, -1.9915F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(15.8294F, -0.9814F, -9.9085F));

		PartDefinition cube_r1 = bone3.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 42).addBox(-2.806F, -0.782F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5058F, -0.7686F, 5.4277F, 1.5708F, -1.0036F, 0.0F));

		PartDefinition cube_r2 = bone3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 44).addBox(-5.85F, -2.25F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(1.45F, 0.25F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(29, 0).addBox(-5.85F, -0.25F, -2.001F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5058F, -0.7686F, 5.4277F, 1.5708F, -0.3927F, 0.0F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 7).addBox(3.4998F, -0.7505F, -2.0006F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 7).addBox(-3.4992F, -0.7505F, -2.0006F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.2478F, 0.7319F, -6.3346F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone = bone4.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 19).addBox(-0.9116F, -4.5856F, -3.3292F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.4116F, -4.0656F, 5.2708F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(10, 50).addBox(0.0884F, -3.5656F, 8.1708F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(11, 32).addBox(0.4914F, -7.4026F, 6.5325F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 15).addBox(0.4934F, -8.4026F, 6.5325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.9116F, -5.5656F, -15.3075F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
		.texOffs(17, 19).addBox(-1.9116F, 0.2344F, -11.8075F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(34, 34).addBox(4.4177F, 5.8694F, -7.4717F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(50, 12).addBox(4.4177F, 6.8694F, -0.7397F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(34, 34).mirror().addBox(-4.241F, 5.8694F, -7.4717F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 12).mirror().addBox(-4.241F, 6.8694F, -0.7397F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0884F, -9.7344F, 15.3292F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 27).mirror().addBox(-0.5F, -1.75F, -0.3663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9116F, -2.0526F, 6.8989F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(17, 19).mirror().addBox(-0.5F, -1.3831F, -1.133F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9116F, -2.1026F, 6.8989F, -0.48F, 0.0F, -1.5708F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-0.5F, -0.75F, -0.3663F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9116F, -2.1526F, 6.8989F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 27).mirror().addBox(-1.7F, -1.975F, -5.5F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3636F, -2.5656F, 2.4268F, 0.0F, 0.3054F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 22).addBox(-0.5F, -0.75F, -0.3663F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0884F, -2.1526F, 6.8989F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(34, 27).addBox(-0.5F, -1.75F, -0.3663F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0884F, -2.0526F, 6.8989F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(4, 6).mirror().addBox(-1.5F, 8.65F, -0.5663F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.2884F, -2.1026F, 6.8989F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(4, 6).addBox(-1.5F, 8.65F, -0.5663F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1116F, -2.1026F, 6.8989F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 19).addBox(-0.5F, -1.3831F, -1.133F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0884F, -2.1026F, 6.8989F, -0.48F, 0.0F, 1.5708F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(34, 30).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-0.495F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9884F, -5.1403F, 5.7532F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(49, 43).addBox(-0.95F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(49, 43).mirror().addBox(-9.7087F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.4177F, 6.8025F, 0.1443F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(1.6F, -0.5F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4428F, -0.7656F, -9.0075F, -0.9888F, -0.1975F, 0.2898F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 32).addBox(-2.6F, -0.5F, -0.4F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6196F, -0.7656F, -9.0075F, -0.9888F, 0.1975F, -0.2898F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(19, 27).addBox(-2.3F, -2.0F, -5.5F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8132F, -2.5656F, 2.4268F, 0.0F, -0.3054F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(32, 43).addBox(-8.1869F, -0.5F, -5.6F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(28, 47).addBox(-7.6869F, -0.5F, -7.6F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(-5.1869F, -0.6F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.7753F, -6.0656F, -7.7726F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(6, 8).mirror().addBox(-1.2F, -0.5F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-20.7511F, -0.8945F, -6.0334F, 0.0F, 0.0873F, 0.0436F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(46, 20).mirror().addBox(-0.1461F, -0.5F, -2.0245F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.874F, -0.5886F, -5.3937F, 0.0F, -0.48F, 0.0873F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(45, 34).mirror().addBox(-2.7044F, -0.499F, -2.0082F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.874F, -0.5886F, -5.3937F, 0.0F, -0.2618F, 0.0873F));

		PartDefinition cube_r21 = bone2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(15, 38).mirror().addBox(0.8619F, -0.5F, -3.9626F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.874F, -0.5886F, -5.3937F, 0.0F, -0.8727F, 0.0873F));

		PartDefinition cube_r22 = bone2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(34, 27).mirror().addBox(-5.2F, -0.5F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6557F, -0.05F, 0.0651F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r23 = bone2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(36, 13).mirror().addBox(4.5579F, -0.5F, -2.1706F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.874F, -0.5886F, -5.3937F, 0.0F, -0.3491F, 0.0873F));

		PartDefinition cube_r24 = bone2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(3.6548F, -0.5F, -3.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(29, 7).mirror().addBox(-4.6452F, -0.5F, -3.3704F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.874F, -0.5886F, -5.3937F, 0.0F, 0.0873F, 0.0873F));

		PartDefinition cube_r25 = bone2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(49, 0).mirror().addBox(-7.3787F, -0.5F, -1.232F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.874F, -0.5886F, -5.3937F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r26 = bone2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(7, 11).mirror().addBox(-5.9819F, -0.5F, 2.2267F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.874F, -0.5886F, -5.3937F, 0.0F, -0.3927F, 0.0873F));

		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(30, 38).mirror().addBox(-5.3377F, -0.5F, -5.2414F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.874F, -0.5886F, -5.3937F, 0.0F, 0.6109F, 0.0873F));

		PartDefinition cube_r28 = bone2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(7, 11).addBox(3.9819F, -0.5F, 2.2267F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5002F, -0.5886F, -5.3937F, 0.0F, 0.3927F, -0.0873F));

		PartDefinition cube_r29 = bone2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(45, 34).addBox(-0.2956F, -0.499F, -2.0082F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5002F, -0.5886F, -5.3937F, 0.0F, 0.2618F, -0.0873F));

		PartDefinition cube_r30 = bone2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(46, 20).addBox(-2.8539F, -0.5F, -2.0245F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5002F, -0.5886F, -5.3937F, 0.0F, 0.48F, -0.0873F));

		PartDefinition cube_r31 = bone2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(29, 7).addBox(-4.3548F, -0.5F, -3.3704F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).addBox(-4.6548F, -0.5F, -3.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5002F, -0.5886F, -5.3937F, 0.0F, -0.0873F, -0.0873F));

		PartDefinition cube_r32 = bone2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(6, 8).addBox(-0.8F, -0.5F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.3773F, -0.8945F, -6.0334F, 0.0F, -0.0873F, -0.0436F));

		PartDefinition cube_r33 = bone2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(30, 38).addBox(2.3377F, -0.5F, -5.2414F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5002F, -0.5886F, -5.3937F, 0.0F, -0.6109F, -0.0873F));

		PartDefinition cube_r34 = bone2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(49, 0).addBox(4.3787F, -0.5F, -1.232F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5002F, -0.5886F, -5.3937F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r35 = bone2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(15, 38).addBox(-5.8619F, -0.5F, -3.9626F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5002F, -0.5886F, -5.3937F, 0.0F, 0.8727F, -0.0873F));

		PartDefinition cube_r36 = bone2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(36, 13).addBox(-8.5579F, -0.5F, -2.1706F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5002F, -0.5886F, -5.3937F, 0.0F, 0.3491F, -0.0873F));

		PartDefinition cube_r37 = bone2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(34, 27).addBox(0.2F, -0.5F, -4.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7181F, -0.05F, 0.0651F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bone7 = bone4.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-0.5765F, 0.0F, -16.4572F));

		PartDefinition cube_r38 = bone7.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 12).addBox(-3.5003F, -0.7505F, -1.9996F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(29, 12).addBox(-3.5003F, -0.7505F, 1.9994F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.842F, -0.2495F, 0.2141F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r39 = bone7.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(32, 20).addBox(-3.9321F, 0.2505F, -1.743F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.3545F, -0.2495F, 0.3373F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(32, 20).addBox(-16.8996F, 1.2498F, -8.6686F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1002F, -1.4998F, -13.9F, 0.0F, 0.6545F, 0.0F));

		PartDefinition bone6 = bone4.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(44, 47).addBox(-12.4317F, -1.5002F, 18.7034F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(32, 20).addBox(-12.4317F, -1.4992F, 18.7034F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(44, 47).mirror().addBox(-12.4317F, -1.5002F, 22.7024F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 15).addBox(-5.4317F, -1.5002F, 18.7034F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).mirror().addBox(-12.4307F, -1.5002F, 18.7034F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 20).addBox(-12.4317F, 1.4998F, 18.7034F, 7.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1002F, -1.4998F, -16.95F, 0.0F, -0.6981F, 0.0F));

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