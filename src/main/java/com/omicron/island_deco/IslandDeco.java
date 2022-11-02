package com.omicron.island_deco;

import com.mojang.logging.LogUtils;
import net.minecraft.client.model.EntityModel;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("island_deco")
public class IslandDeco
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MODID = "island_deco";
    public static HashMap<String, EntityModel> models = new HashMap<>();

    public static HashMap<String, ResourceLocation> textures = new HashMap<>();

    public static ArrayList<DecoBlock> list = new ArrayList<>();


    public IslandDeco()
    {

        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        Registry.setup(modBus);
        modBus.addListener(IslandDeco::gatherData);
    }

    public static void gatherData(GatherDataEvent event)
    {
        System.out.println("essuszka");
        DataGenerator generator = event.getGenerator();
        if(event.includeClient())
        {
            generator.addProvider(new ItemsProvider(generator, event.getExistingFileHelper()));
            //generator.addProvider(new Languages(generator));
            generator.addProvider(new BlocksProvider(generator, event.getExistingFileHelper()));
        }
        try {
            generator.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
