package com.example.examplemod;

import com.example.examplemod.models.Bomb_model;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;

public class DecoBlockRenderer implements BlockEntityRenderer<DecoBlockEntity> {

    public static final ResourceLocation TEXUTRE = new ResourceLocation(ExampleMod.MODID, "entity/bomb");

    public static final Material BOMB_TEXTURE = new Material(TextureAtlas.LOCATION_BLOCKS, TEXUTRE);

    private Bomb_model model;

    public DecoBlockRenderer(BlockEntityRendererProvider.Context context)
    {
        ModelPart part = context.bakeLayer(Bomb_model.LAYER_LOCATION);
        this.model = new Bomb_model(part);
        System.out.println("test constructor");
    }


    @Override
    public void render(DecoBlockEntity entity, float partial, PoseStack stack, MultiBufferSource buffer, int p_112311_, int p_112312_) {
        System.out.println("test render");
        model.bomb.render(stack, BOMB_TEXTURE.buffer(buffer, RenderType::entityCutoutNoCull), p_112311_, p_112312_);
    }

}
