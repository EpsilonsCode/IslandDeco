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

public class SandCastle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sandcastle"), "main");
	private final ModelPart bone10;

	public SandCastle(ModelPart root) {
		this.bone10 = root.getChild("bone10");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone9 = bone10.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(13.611F, -0.5F, 7.2855F));

		PartDefinition octagon_r1 = bone9.addOrReplaceChild("octagon_r1", CubeListBuilder.create().texOffs(32, 25).addBox(-6.8F, -9.5F, -0.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(33, 59).addBox(-6.4F, -8.5F, -0.5426F, 6.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2388F, 0.0F, 1.1279F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r2 = bone9.addOrReplaceChild("octagon_r2", CubeListBuilder.create().texOffs(37, 7).addBox(-8.1F, -9.5F, -0.8574F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(37, 7).addBox(-8.1F, -9.5F, 2.1426F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1945F, 0.0F, 1.036F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone13 = bone10.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(-13.611F, -0.5F, 7.2855F));

		PartDefinition octagon_r3 = bone13.addOrReplaceChild("octagon_r3", CubeListBuilder.create().texOffs(32, 25).mirror().addBox(5.8F, -9.5F, -0.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(33, 59).mirror().addBox(0.4F, -8.5F, -0.5426F, 6.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2388F, 0.0F, 1.1279F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r4 = bone13.addOrReplaceChild("octagon_r4", CubeListBuilder.create().texOffs(37, 7).mirror().addBox(2.1F, -9.5F, -0.8574F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(37, 7).mirror().addBox(2.1F, -9.5F, 2.1426F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1945F, 0.0F, 1.036F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone2 = bone10.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(11.2F, 0.0F, -9.4F));

		PartDefinition octagon11 = bone2.addOrReplaceChild("octagon11", CubeListBuilder.create(), PartPose.offset(0.6F, 0.0F, -0.8F));

		PartDefinition octagon_r5 = octagon11.addOrReplaceChild("octagon_r5", CubeListBuilder.create().texOffs(51, 62).addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4278F, -0.5F, 18.6134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r6 = octagon11.addOrReplaceChild("octagon_r6", CubeListBuilder.create().texOffs(51, 62).addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4278F, -0.5F, 18.6134F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r7 = octagon11.addOrReplaceChild("octagon_r7", CubeListBuilder.create().texOffs(51, 62).addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4278F, -0.5F, 18.6134F, 0.0F, -1.9635F, 0.0F));

		PartDefinition octagon_r8 = octagon11.addOrReplaceChild("octagon_r8", CubeListBuilder.create().texOffs(51, 62).addBox(-1.2426F, -3.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4278F, -3.5F, 18.6134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon5 = bone2.addOrReplaceChild("octagon5", CubeListBuilder.create(), PartPose.offset(-23.0F, 0.0F, -0.8F));

		PartDefinition octagon_r9 = octagon5.addOrReplaceChild("octagon_r9", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4278F, -0.5F, 18.6134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r10 = octagon5.addOrReplaceChild("octagon_r10", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4278F, -0.5F, 18.6134F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r11 = octagon5.addOrReplaceChild("octagon_r11", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4278F, -0.5F, 18.6134F, 0.0F, 1.9635F, 0.0F));

		PartDefinition octagon_r12 = octagon5.addOrReplaceChild("octagon_r12", CubeListBuilder.create().texOffs(51, 62).mirror().addBox(-1.2426F, -3.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4278F, -3.5F, 18.6134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon12 = bone2.addOrReplaceChild("octagon12", CubeListBuilder.create(), PartPose.offset(16.6F, -1.1F, 0.0F));

		PartDefinition octagon_r13 = octagon12.addOrReplaceChild("octagon_r13", CubeListBuilder.create().texOffs(19, 59).mirror().addBox(-1.0355F, -19.5F, -2.5F, 2.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-39.1134F, 1.1F, 17.8134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r14 = octagon12.addOrReplaceChild("octagon_r14", CubeListBuilder.create().texOffs(19, 59).mirror().addBox(-1.0355F, -6.5F, -2.5F, 2.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-39.1134F, -11.9F, 17.8134F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r15 = octagon12.addOrReplaceChild("octagon_r15", CubeListBuilder.create().texOffs(19, 59).mirror().addBox(-1.0355F, -6.5F, -2.5F, 2.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-39.1134F, -11.9F, 17.8134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r16 = octagon12.addOrReplaceChild("octagon_r16", CubeListBuilder.create().texOffs(19, 59).addBox(-1.0355F, -19.5F, -2.5F, 2.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4866F, 1.1F, 17.8134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r17 = octagon12.addOrReplaceChild("octagon_r17", CubeListBuilder.create().texOffs(19, 59).addBox(-1.0355F, -6.5F, -2.5F, 2.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4866F, -11.9F, 17.8134F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r18 = octagon12.addOrReplaceChild("octagon_r18", CubeListBuilder.create().texOffs(19, 59).addBox(-1.0355F, -6.5F, -2.5F, 2.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.4866F, -11.9F, 17.8134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon13 = bone2.addOrReplaceChild("octagon13", CubeListBuilder.create(), PartPose.offset(0.6F, 0.0F, -0.8F));

		PartDefinition octagon_r19 = octagon13.addOrReplaceChild("octagon_r19", CubeListBuilder.create().texOffs(46, 18).addBox(-3.0F, -0.5F, -1.2426F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(19, 22).addBox(-1.2426F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4278F, -19.7F, 18.6134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r20 = octagon13.addOrReplaceChild("octagon_r20", CubeListBuilder.create().texOffs(65, 45).addBox(-3.0F, -0.5F, -1.2426F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(37, 0).addBox(-1.2426F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4278F, -19.7F, 18.6134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r21 = octagon13.addOrReplaceChild("octagon_r21", CubeListBuilder.create().texOffs(19, 22).addBox(-0.4F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5232F, -20.7F, 21.0685F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r22 = octagon13.addOrReplaceChild("octagon_r22", CubeListBuilder.create().texOffs(3, 24).addBox(-0.65F, -0.5F, -3.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3362F, -20.7F, 18.5613F, 0.0F, 0.3491F, 0.0F));

		PartDefinition octagon_r23 = octagon13.addOrReplaceChild("octagon_r23", CubeListBuilder.create().texOffs(0, 23).addBox(0.2574F, -7.6F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.727F, -13.6F, 22.6588F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r24 = octagon13.addOrReplaceChild("octagon_r24", CubeListBuilder.create().texOffs(19, 26).addBox(0.2574F, -7.6F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4414F, -13.6F, 18.6078F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r25 = octagon13.addOrReplaceChild("octagon_r25", CubeListBuilder.create().texOffs(5, 22).addBox(0.2574F, -7.6F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5097F, -13.6F, 20.9039F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r26 = octagon13.addOrReplaceChild("octagon_r26", CubeListBuilder.create().texOffs(0, 27).addBox(0.2574F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7546F, -13.6F, 20.5475F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon7 = bone2.addOrReplaceChild("octagon7", CubeListBuilder.create(), PartPose.offset(-23.0F, 0.0F, -0.8F));

		PartDefinition octagon_r27 = octagon7.addOrReplaceChild("octagon_r27", CubeListBuilder.create().texOffs(46, 18).mirror().addBox(-3.0F, -0.5F, -1.2426F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(19, 22).mirror().addBox(-1.2426F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4278F, -19.7F, 18.6134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r28 = octagon7.addOrReplaceChild("octagon_r28", CubeListBuilder.create().texOffs(65, 45).mirror().addBox(-3.0F, -0.5F, -1.2426F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(37, 0).mirror().addBox(-1.2426F, -0.5F, -3.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4278F, -19.7F, 18.6134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r29 = octagon7.addOrReplaceChild("octagon_r29", CubeListBuilder.create().texOffs(19, 22).mirror().addBox(-0.6F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5232F, -20.7F, 21.0685F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r30 = octagon7.addOrReplaceChild("octagon_r30", CubeListBuilder.create().texOffs(3, 24).mirror().addBox(-0.35F, -0.5F, -3.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3362F, -20.7F, 18.5613F, 0.0F, -0.3491F, 0.0F));

		PartDefinition octagon_r31 = octagon7.addOrReplaceChild("octagon_r31", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-1.2574F, -7.6F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.727F, -13.6F, 22.6588F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r32 = octagon7.addOrReplaceChild("octagon_r32", CubeListBuilder.create().texOffs(19, 26).mirror().addBox(-1.2574F, -7.6F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4414F, -13.6F, 18.6078F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r33 = octagon7.addOrReplaceChild("octagon_r33", CubeListBuilder.create().texOffs(5, 22).mirror().addBox(-1.2574F, -7.6F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5097F, -13.6F, 20.9039F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r34 = octagon7.addOrReplaceChild("octagon_r34", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-1.2574F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.7546F, -13.6F, 20.5475F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone7 = bone10.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(3, 26).addBox(9.929F, -8.0F, -11.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(9.929F, -8.0F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(3, 26).mirror().addBox(-3.071F, -8.0F, -11.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 25).mirror().addBox(-3.071F, -8.0F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(19, 24).addBox(7.429F, -14.0F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(8.429F, -14.0F, -8.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.071F, -7.0F, -11.1F, 14.0F, 13.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(28, 34).addBox(-0.571F, -13.0F, -9.5F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(19, 24).addBox(7.429F, -14.0F, -9.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(19, 24).mirror().addBox(-0.571F, -14.0F, -9.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(-0.571F, -14.0F, -8.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(19, 24).mirror().addBox(-0.571F, -14.0F, -4.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.929F, -6.0F, 20.3943F));

		PartDefinition bone6 = bone10.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition octagon6 = bone6.addOrReplaceChild("octagon6", CubeListBuilder.create(), PartPose.offset(16.6F, -1.1F, 0.0F));

		PartDefinition octagon_r35 = octagon6.addOrReplaceChild("octagon_r35", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-2.5F, -19.5F, -1.0355F, 5.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-27.9134F, 1.1F, 8.4134F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r36 = octagon6.addOrReplaceChild("octagon_r36", CubeListBuilder.create().texOffs(0, 62).addBox(-2.5F, -19.5F, -1.0355F, 5.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.2866F, 1.1F, 8.4134F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone8 = bone10.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(-8.6152F, -0.5F, 0.5946F));

		PartDefinition bone4 = bone10.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(8.8808F, -4.5F, 1.1388F));

		PartDefinition cube_r1 = bone4.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 22).addBox(1.3F, -9.5F, 5.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 34).addBox(0.1F, -9.5F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.3F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r2 = bone4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(19, 22).addBox(-1.5F, -9.5F, -2.6F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(19, 22).addBox(3.5F, -9.5F, -2.6F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(28, 36).addBox(2.5F, -9.5F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 0).addBox(2.5F, -9.5F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-1.5F, -8.5F, -3.6F, 5.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4192F, 0.0F, 0.5612F, 0.0F, 0.48F, 0.0F));

		PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(-8.8808F, -4.5F, 1.1388F));

		PartDefinition cube_r3 = bone11.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-4.3F, -9.5F, 5.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 34).mirror().addBox(-1.1F, -9.5F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 1.3F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r4 = bone11.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 22).mirror().addBox(1.5F, -9.5F, -2.6F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(19, 22).mirror().addBox(-3.5F, -9.5F, -2.6F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 36).mirror().addBox(-3.5F, -9.5F, 4.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(37, 0).mirror().addBox(-3.5F, -9.5F, -3.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 22).mirror().addBox(-3.5F, -8.5F, -3.6F, 5.0F, 13.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4192F, 0.0F, 0.5612F, 0.0F, -0.48F, 0.0F));

		PartDefinition bone3 = bone10.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.8F));

		PartDefinition octagon2 = bone3.addOrReplaceChild("octagon2", CubeListBuilder.create(), PartPose.offset(0.3F, -0.1F, 0.0F));

		PartDefinition octagon3 = bone3.addOrReplaceChild("octagon3", CubeListBuilder.create(), PartPose.offset(0.6F, 0.0F, 0.0F));

		PartDefinition octagon4 = bone3.addOrReplaceChild("octagon4", CubeListBuilder.create(), PartPose.offset(16.6F, -1.1F, 0.8F));

		PartDefinition bone12 = bone10.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(7.7971F, -14.5167F, -3.9742F, 0.0F, -0.7854F, 0.0F));

		PartDefinition octagon_r37 = bone12.addOrReplaceChild("octagon_r37", CubeListBuilder.create().texOffs(65, 48).addBox(-3.24F, -0.5F, -1.3462F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(41, 46).addBox(-1.3462F, -0.5F, -3.25F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0045F, -2.0833F, -0.0124F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r38 = bone12.addOrReplaceChild("octagon_r38", CubeListBuilder.create().texOffs(66, 28).addBox(-3.23F, -0.5F, -1.3462F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(15, 44).addBox(-1.3572F, -0.5F, -3.25F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0045F, -2.0833F, -0.0124F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r39 = bone12.addOrReplaceChild("octagon_r39", CubeListBuilder.create().texOffs(3, 28).addBox(0.2574F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5929F, 4.0167F, 1.9217F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r40 = bone12.addOrReplaceChild("octagon_r40", CubeListBuilder.create().texOffs(0, 29).addBox(-1.3426F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.999F, 4.0167F, 5.0568F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r41 = bone12.addOrReplaceChild("octagon_r41", CubeListBuilder.create().texOffs(29, 22).addBox(5.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 23).addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1605F, -3.0833F, -2.818F, 0.0F, -1.1345F, 0.0F));

		PartDefinition octagon_r42 = bone12.addOrReplaceChild("octagon_r42", CubeListBuilder.create().texOffs(29, 24).addBox(0.2574F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1361F, 4.0167F, 2.4629F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r43 = bone12.addOrReplaceChild("octagon_r43", CubeListBuilder.create().texOffs(29, 26).addBox(0.2574F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1057F, 4.0167F, -0.0246F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r44 = bone12.addOrReplaceChild("octagon_r44", CubeListBuilder.create().texOffs(66, 13).addBox(-1.0627F, -1.25F, -2.4887F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0629F, 5.6667F, 0.0084F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r45 = bone12.addOrReplaceChild("octagon_r45", CubeListBuilder.create().texOffs(66, 13).addBox(-1.0355F, -9.5F, -2.5F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0837F, 13.9167F, -0.0124F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r46 = bone12.addOrReplaceChild("octagon_r46", CubeListBuilder.create().texOffs(67, 57).addBox(-1.0355F, -9.5F, -2.5F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0837F, 13.9167F, -0.0124F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r47 = bone12.addOrReplaceChild("octagon_r47", CubeListBuilder.create().texOffs(66, 13).addBox(-1.0627F, -1.25F, -2.4887F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0837F, 5.6667F, -0.0418F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r48 = bone12.addOrReplaceChild("octagon_r48", CubeListBuilder.create().texOffs(70, 0).addBox(-1.2155F, -7.25F, -2.9113F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1173F, 5.6667F, -0.0212F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r49 = bone12.addOrReplaceChild("octagon_r49", CubeListBuilder.create().texOffs(70, 0).addBox(-1.2155F, -7.25F, -3.0113F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0457F, 5.6667F, -0.0332F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r50 = bone12.addOrReplaceChild("octagon_r50", CubeListBuilder.create().texOffs(8, 71).addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, 4.9167F, -0.0124F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r51 = bone12.addOrReplaceChild("octagon_r51", CubeListBuilder.create().texOffs(70, 0).addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0249F, 4.9167F, -0.0124F, 0.0F, -0.3927F, 0.0F));

		PartDefinition bone5 = bone10.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.7971F, -14.5167F, -3.9742F, 0.0F, 0.7854F, 0.0F));

		PartDefinition octagon_r52 = bone5.addOrReplaceChild("octagon_r52", CubeListBuilder.create().texOffs(65, 48).mirror().addBox(-3.26F, -0.5F, -1.3462F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(41, 46).mirror().addBox(-1.3462F, -0.5F, -3.25F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0045F, -2.0833F, -0.0124F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r53 = bone5.addOrReplaceChild("octagon_r53", CubeListBuilder.create().texOffs(66, 28).mirror().addBox(-3.27F, -0.5F, -1.3462F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(15, 44).mirror().addBox(-1.3352F, -0.5F, -3.25F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0045F, -2.0833F, -0.0124F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r54 = bone5.addOrReplaceChild("octagon_r54", CubeListBuilder.create().texOffs(3, 28).mirror().addBox(-1.2574F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.5929F, 4.0167F, 1.9217F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r55 = bone5.addOrReplaceChild("octagon_r55", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(0.3426F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.999F, 4.0167F, 5.0568F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r56 = bone5.addOrReplaceChild("octagon_r56", CubeListBuilder.create().texOffs(29, 22).mirror().addBox(-6.3F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 23).mirror().addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.1605F, -3.0833F, -2.818F, 0.0F, 1.1345F, 0.0F));

		PartDefinition octagon_r57 = bone5.addOrReplaceChild("octagon_r57", CubeListBuilder.create().texOffs(29, 24).mirror().addBox(-1.2574F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1361F, 4.0167F, 2.4629F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r58 = bone5.addOrReplaceChild("octagon_r58", CubeListBuilder.create().texOffs(29, 26).mirror().addBox(-1.2574F, -7.6F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1057F, 4.0167F, -0.0246F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r59 = bone5.addOrReplaceChild("octagon_r59", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-1.0084F, -1.25F, -2.4887F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0629F, 5.6667F, 0.0084F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r60 = bone5.addOrReplaceChild("octagon_r60", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-1.0355F, -9.5F, -2.5F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 13.9167F, -0.0124F, 0.0F, 0.3927F, 0.0F));

		PartDefinition octagon_r61 = bone5.addOrReplaceChild("octagon_r61", CubeListBuilder.create().texOffs(67, 57).mirror().addBox(-1.0355F, -9.5F, -2.5F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 13.9167F, -0.0124F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r62 = bone5.addOrReplaceChild("octagon_r62", CubeListBuilder.create().texOffs(66, 13).mirror().addBox(-1.0084F, -1.25F, -2.4887F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0837F, 5.6667F, -0.0418F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r63 = bone5.addOrReplaceChild("octagon_r63", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-1.2698F, -7.25F, -2.9113F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1173F, 5.6667F, -0.0212F, 0.0F, -1.1781F, 0.0F));

		PartDefinition octagon_r64 = bone5.addOrReplaceChild("octagon_r64", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-1.2698F, -7.25F, -3.0113F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0457F, 5.6667F, -0.0332F, 0.0F, 1.1781F, 0.0F));

		PartDefinition octagon_r65 = bone5.addOrReplaceChild("octagon_r65", CubeListBuilder.create().texOffs(8, 71).mirror().addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 4.9167F, -0.0124F, 0.0F, -0.3927F, 0.0F));

		PartDefinition octagon_r66 = bone5.addOrReplaceChild("octagon_r66", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-1.2426F, -6.5F, -3.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0249F, 4.9167F, -0.0124F, 0.0F, 0.3927F, 0.0F));

		PartDefinition bone = bone10.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 44).addBox(2.0F, -9.0F, -5.0F, 3.0F, 9.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(24, 46).addBox(-2.0F, -9.0F, -5.0F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(50, 46).addBox(-2.0F, -9.0F, -4.0F, 4.0F, 9.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).mirror().addBox(-5.0F, -9.0F, -5.0F, 3.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(28, 22).addBox(-4.5F, -13.0F, -4.5F, 9.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).addBox(2.5F, -14.0F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 1).addBox(4.5F, -14.0F, -2.5F, 0.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.5F, -14.0F, -2.5F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(37, 8).addBox(-2.5F, -14.0F, -4.5F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(37, 7).addBox(-3.5F, -20.0F, 13.8943F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(37, 7).addBox(-3.5F, -20.0F, 19.8943F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(37, 8).addBox(-2.5F, -14.0F, 3.5F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.5F, -14.0F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 6).mirror().addBox(-4.5F, -14.0F, -4.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(-4.5F, -14.0F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(53, 25).mirror().addBox(-1.0F, -0.5F, -4.51F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5901F, -4.9154F, -0.5F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 25).addBox(-1.0F, -0.5F, -4.51F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5901F, -4.9154F, -0.5F, 0.0F, 0.0F, 0.5672F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}