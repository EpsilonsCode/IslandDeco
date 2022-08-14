package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.IItemRenderProperties;

import java.util.function.Consumer;

public class DecoBlockItem extends BlockItem {
    public DecoBlockItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer)
    {
        consumer.accept(new IItemRenderProperties()
        {
            private final DecoBlockItemRenderer stackRenderer = Minecraft.getInstance() != null ? new DecoBlockItemRenderer(
                    Minecraft.getInstance().getBlockEntityRenderDispatcher(),
                    Minecraft.getInstance().getEntityModels()
            ) : null;

            @Override
            public BlockEntityWithoutLevelRenderer getItemStackRenderer() { return stackRenderer; }
        });
    }
}
