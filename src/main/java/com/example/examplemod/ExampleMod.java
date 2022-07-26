package com.example.examplemod;

import com.example.examplemod.models.Bomb_model;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
public class ExampleMod
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MODID = "examplemod";

    public ExampleMod()
    {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        Registry.setup(modBus);
        modBus.addListener(ExampleMod::registerRenderers);
        modBus.addListener(ExampleMod::registerLayers);
        modBus.addListener(ExampleMod::textureStitch);
    }

    private static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerBlockEntityRenderer(Registry.TEST.get(), DecoBlockRenderer::new);
        System.out.println("renderer");
    }

    private static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(Bomb_model.LAYER_LOCATION, Bomb_model::createBodyLayer);
        System.out.println("layer");
    }

    private static void textureStitch(TextureStitchEvent.Pre event)
    {
        if (!event.getAtlas().location().equals(TextureAtlas.LOCATION_BLOCKS)) {
            return;
        }
        event.addSprite(DecoBlockRenderer.TEXUTRE);
        System.out.println("sprite");
    }
}
