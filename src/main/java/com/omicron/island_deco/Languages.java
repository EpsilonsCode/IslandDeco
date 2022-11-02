package com.omicron.island_deco;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class Languages extends LanguageProvider {
    public Languages(DataGenerator gen) {
        super(gen, IslandDeco.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        Registry.items.forEach(itemRegistryObject -> {
            add(itemRegistryObject.get(), "ez");
        });
    }
}
