package net.volwert123.more_food.datagen.provider;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFItems;

public class MFItemModelProvider extends ItemModelProvider {
    public MFItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreFood.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Item> item : MFItems.ITEMS.getEntries()) {
            basicItem(item.get());
        }
    }
}