package com.omicron.island_deco;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;
import com.omicron.island_deco.models.CellTower;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;

public class DecoBlockItemRenderer extends BlockEntityWithoutLevelRenderer {
    public DecoBlockItemRenderer(BlockEntityRenderDispatcher pBlockEntityRenderDispatcher, EntityModelSet pEntityModelSet) {
        super(pBlockEntityRenderDispatcher, pEntityModelSet);
    }

    public void renderByItem(ItemStack pStack, ItemTransforms.TransformType pTransformType, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight, int pPackedOverlay) {
        Item item = pStack.getItem();
        if (item instanceof BlockItem) {
            Block block = ((BlockItem) item).getBlock();
            if(block instanceof DecoBlock decoBlock)
            {
                pPoseStack.pushPose();
                pPoseStack.translate(0.5, 0.7, 0.5);
                pPoseStack.scale(0.2F, 0.2F, 0.2F);
                pPoseStack.mulPose(Quaternion.fromXYZDegrees(new Vector3f(0, 0, 180)));
                EntityModel model = IslandDeco.models.get(decoBlock.model);
                model.renderToBuffer(pPoseStack, new Material(TextureAtlas.LOCATION_BLOCKS, IslandDeco.textures.get(pStack.getItem().getRegistryName().getPath())).buffer(pBuffer, RenderType::entityCutoutNoCull), pPackedLight, pPackedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);
                pPoseStack.popPose();
            }
        }
    }
}
