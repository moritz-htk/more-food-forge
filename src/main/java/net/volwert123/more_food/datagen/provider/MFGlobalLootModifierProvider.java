package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.loot.MFAddItemModifier;
import net.volwert123.more_food.registry.MFItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MFGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public MFGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, MoreFood.MOD_ID, registries);
    }

    @Override
    protected void start() {
        addBlockLoot("rice_grass", MFItems.RICE.get(), Blocks.SHORT_GRASS);
        addBlockLoot("rice_fern", MFItems.RICE.get(), Blocks.FERN);
    }

    private void addBlockLoot(String id, Item item, Block block) {
        add(id, new MFAddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).build(),
                LootItemRandomChanceCondition.randomChance(0.15f).build()
        }, item, List.of(Holder.direct(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build()))));
    }
}