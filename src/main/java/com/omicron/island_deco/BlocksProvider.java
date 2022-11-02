package com.omicron.island_deco;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlocksProvider extends BlockStateProvider {
    public BlocksProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, IslandDeco.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        System.out.println("essunia");
        Registry.items.forEach((item -> {
            simpleBlock(item.get().getBlock(), new ModelFile.UncheckedModelFile("placeholder"));
        }));
        simpleBlock(Registry.SLAVE.get(), new ModelFile.UncheckedModelFile("placeholder"));
    }
}
