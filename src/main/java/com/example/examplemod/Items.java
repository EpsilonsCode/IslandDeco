package com.example.examplemod;


import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
public class Items extends ItemModelProvider {
    public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ExampleMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for(RegistryObject<Item> item : Registry.items)
        {

            ModelFile.UncheckedModelFile file = new ModelFile.UncheckedModelFile("builtin/entity");
            getBuilder(item.get().getRegistryName().getPath()).parent(file);
            //withExistingParent(item.get().getRegistryName().getPath(), "builtin/entity");
        }
    }
}
