package com.example.examplemod;

import com.example.examplemod.models.*;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class DecoBlockRenderer implements BlockEntityRenderer<DecoBlockEntity> {

    public static final ResourceLocation TEXUTRE = new ResourceLocation(ExampleMod.MODID, "entity/bomb");

    public static final Material BOMB_TEXTURE = new Material(TextureAtlas.LOCATION_BLOCKS, TEXUTRE);

    private Bomb model;

    public DecoBlockRenderer(BlockEntityRendererProvider.Context context)
    {
        ExampleMod.models.put("bomb", new Bomb(context.bakeLayer(Bomb.LAYER_LOCATION)));
        ExampleMod.models.put("barrel", new Barrel(context.bakeLayer(Barrel.LAYER_LOCATION)));
        ExampleMod.models.put("wilson", new Wilson(context.bakeLayer(Wilson.LAYER_LOCATION)));
        ExampleMod.models.put("moai", new Moai(context.bakeLayer(Moai.LAYER_LOCATION)));
        ExampleMod.models.put("plane", new Plane(context.bakeLayer(Plane.LAYER_LOCATION)));
        ExampleMod.models.put("sandcastle", new SandCastle(context.bakeLayer(SandCastle.LAYER_LOCATION)));
        ExampleMod.models.put("skull_pile", new SkullPile(context.bakeLayer(SkullPile.LAYER_LOCATION)));
        ExampleMod.models.put("skull_stand", new SkullStand(context.bakeLayer(SkullStand.LAYER_LOCATION)));
        ExampleMod.models.put("trident", new Trident(context.bakeLayer(Trident.LAYER_LOCATION)));

        ExampleMod.models.put("aztec_ruins", new AztecRuins(context.bakeLayer(AztecRuins.LAYER_LOCATION)));
        ExampleMod.models.put("buoy", new Buoy(context.bakeLayer(Buoy.LAYER_LOCATION)));
        ExampleMod.models.put("cell_tower", new CellTower(context.bakeLayer(CellTower.LAYER_LOCATION)));
        ExampleMod.models.put("coin", new Coin(context.bakeLayer(Coin.LAYER_LOCATION)));
        ExampleMod.models.put("column", new Column(context.bakeLayer(Column.LAYER_LOCATION)));
        ExampleMod.models.put("pirate_chest", new PirateChest(context.bakeLayer(PirateChest.LAYER_LOCATION)));
        ExampleMod.models.put("surf_board", new SurfBoard(context.bakeLayer(SurfBoard.LAYER_LOCATION)));
        ExampleMod.models.put("tiki", new Tiki(context.bakeLayer(Tiki.LAYER_LOCATION)));
        ExampleMod.models.put("toten_koh_lanta", new TotenKohLanta(context.bakeLayer(TotenKohLanta.LAYER_LOCATION)));
        ExampleMod.models.put("towel", new Towel(context.bakeLayer(Towel.LAYER_LOCATION)));
        ExampleMod.models.put("water_tower", new WaterTower(context.bakeLayer(WaterTower.LAYER_LOCATION)));

        ExampleMod.models.put("deck_chair", new Towel(context.bakeLayer(Towel.LAYER_LOCATION)));
        //ModelPart part = context.bakeLayer(Bomb.LAYER_LOCATION);
        //this.model = new Bomb(part);
        System.out.println("test constructor");
    }

    public void render(DecoBlockEntity entity, float partial, PoseStack stack, MultiBufferSource buffer, int p_112311_, int p_112312_) {
        //System.out.println("test render");
        stack.pushPose();
        stack.translate(0.5, 1.5, 0.5);
        stack.mulPose(Quaternion.fromXYZDegrees(new Vector3f(0, entity.getBlockState().getValue(DecoBlock.FACING).get2DDataValue() * -90, 180)));
        //stack.translate(-0.5, -1.5, 0.5);
        ExampleMod.models.get(entity.model).renderToBuffer(stack, new Material(TextureAtlas.LOCATION_BLOCKS, ExampleMod.textures.get(entity.getBlockState().getBlock().getRegistryName().getPath())).buffer(buffer, RenderType::entityCutoutNoCull), p_112311_, p_112312_, 1.0F, 1.0F, 1.0F, 1.0F);



        //model.renderToBuffer(stack, BOMB_TEXTURE.buffer(buffer, RenderType::entityCutoutNoCull), p_112311_, p_112312_, 1.0F, 1.0F, 1.0F, 1.0F);
        //model.bomb.render(stack, BOMB_TEXTURE.buffer(buffer, RenderType::entityCutoutNoCull), p_112311_, p_112312_);
        stack.popPose();
    }

    @Override
    public boolean shouldRenderOffScreen(DecoBlockEntity pBlockEntity) {
        return true;
    }

}
