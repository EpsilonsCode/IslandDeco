package com.omicron.island_deco;


import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
public class ItemsProvider extends ItemModelProvider {
    public ItemsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, IslandDeco.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for(RegistryObject<BlockItem> item : Registry.items)
        {

            ModelFile.UncheckedModelFile file = new ModelFile.UncheckedModelFile("builtin/entity");
            getBuilder(item.get().getRegistryName().getPath()).parent(file);
            //withExistingParent(item.get().getRegistryName().getPath(), "builtin/entity");
        }
    }
}
