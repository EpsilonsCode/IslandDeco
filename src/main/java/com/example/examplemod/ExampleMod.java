package com.example.examplemod;

import com.example.examplemod.models.*;
import com.mojang.logging.LogUtils;
import com.sun.jna.win32.W32APIFunctionMapper;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
public class ExampleMod
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MODID = "examplemod";
    public static HashMap<String, EntityModel> models = new HashMap<>();

    public static HashMap<String, ResourceLocation> textures = new HashMap<>();

    public static ArrayList<DecoBlock> list = new ArrayList<>();


    public ExampleMod()
    {
        //create connection for a server installed in localhost, with a user "root" with no password
        try (Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/", "root", null)) {
            // create a Statement
            try (Statement stmt = conn.createStatement()) {
                //execute query
                try (ResultSet rs = stmt.executeQuery("SELECT 'Hello World!'")) {
                    //position result to first
                    rs.first();
                    System.out.println(rs.getString(1)); //result is "Hello World!"
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        System.out.println("mod");

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        Registry.setup(modBus);
        modBus.addListener(ExampleMod::registerRenderers);
        modBus.addListener(ExampleMod::registerLayers);
        modBus.addListener(ExampleMod::textureStitch);
        modBus.addListener(ExampleMod::gatherData);
    }

    private static void registerRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        event.registerBlockEntityRenderer(Registry.TEST.get(), DecoBlockRenderer::new);
        System.out.println("renderer");
    }

    private static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        if(event.includeClient())
        {
            generator.addProvider(new Items(generator, event.getExistingFileHelper()));
        }
    }

    private static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event)
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

        System.out.println("layer");
    }



    private static void textureStitch(TextureStitchEvent.Pre event)
    {
        if (!event.getAtlas().location().equals(TextureAtlas.LOCATION_BLOCKS)) {
            return;
        }
        for(RegistryObject<Item> item : Registry.items)
        ExampleMod.textures.put(item.get().getRegistryName().getPath(), new ResourceLocation(ExampleMod.MODID, "entity/" + item.get().getRegistryName().getPath()));
        textures.forEach((id, texture) -> {
            event.addSprite(texture);
        });
        System.out.println("sprite");
    }
}
