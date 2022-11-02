package com.omicron.island_deco;

import com.omicron.island_deco.models.*;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = IslandDeco.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvent {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerBlockEntityRenderer(Registry.TEST.get(), DecoBlockRenderer::new);
        //System.out.println("renderer");
    }



    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(Bomb.LAYER_LOCATION, Bomb::createBodyLayer);
        event.registerLayerDefinition(Barrel.LAYER_LOCATION, Barrel::createBodyLayer);
        event.registerLayerDefinition(Wilson.LAYER_LOCATION, Wilson::createBodyLayer);
        event.registerLayerDefinition(Moai.LAYER_LOCATION, Moai::createBodyLayer);
        event.registerLayerDefinition(Plane.LAYER_LOCATION, Plane::createBodyLayer);
        event.registerLayerDefinition(SandCastle.LAYER_LOCATION, SandCastle::createBodyLayer);
        event.registerLayerDefinition(SkullPile.LAYER_LOCATION, SkullPile::createBodyLayer);
        event.registerLayerDefinition(SkullStand.LAYER_LOCATION, SkullStand::createBodyLayer);
        event.registerLayerDefinition(Trident.LAYER_LOCATION, Trident::createBodyLayer);

        event.registerLayerDefinition(AztecRuins.LAYER_LOCATION, AztecRuins::createBodyLayer);
        event.registerLayerDefinition(Buoy.LAYER_LOCATION, Buoy::createBodyLayer);
        event.registerLayerDefinition(CellTower.LAYER_LOCATION, CellTower::createBodyLayer);
        event.registerLayerDefinition(Coin.LAYER_LOCATION, Coin::createBodyLayer);
        event.registerLayerDefinition(Column.LAYER_LOCATION, Column::createBodyLayer);
        event.registerLayerDefinition(PirateChest.LAYER_LOCATION, PirateChest::createBodyLayer);
        event.registerLayerDefinition(SurfBoard.LAYER_LOCATION, SurfBoard::createBodyLayer);
        event.registerLayerDefinition(Tiki.LAYER_LOCATION, Tiki::createBodyLayer);
        event.registerLayerDefinition(TotenKohLanta.LAYER_LOCATION, TotenKohLanta::createBodyLayer);
        event.registerLayerDefinition(Towel.LAYER_LOCATION, Towel::createBodyLayer);
        event.registerLayerDefinition(WaterTower.LAYER_LOCATION, WaterTower::createBodyLayer);

        event.registerLayerDefinition(DeckChair.LAYER_LOCATION, DeckChair::createBodyLayer);

        //System.out.println("layer");
    }

    @SubscribeEvent
    public static void textureStitch(TextureStitchEvent.Pre event)
    {
        if (!event.getAtlas().location().equals(TextureAtlas.LOCATION_BLOCKS)) {
            return;
        }
        for(RegistryObject<BlockItem> item : Registry.items)
            IslandDeco.textures.put(item.get().getRegistryName().getPath(), new ResourceLocation(IslandDeco.MODID, "entity/" + item.get().getRegistryName().getPath()));
        IslandDeco.textures.forEach((id, texture) -> {
            event.addSprite(texture);
        });
        //System.out.println("sprite");
    }
}
