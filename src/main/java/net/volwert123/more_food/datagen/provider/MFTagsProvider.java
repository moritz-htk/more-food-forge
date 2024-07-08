package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFBlocks;
import net.volwert123.more_food.registry.MFItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MFTagsProvider {
    public static class Items extends TagsProvider<Item> {
        public static final TagKey<Item> FOODS_VEGETABLES = registerKey("foods/vegetables");
        public static final TagKey<Item> FOODS_VEGETABLES_CARROTS = registerKey("foods/vegetables/carrots");
        public static final TagKey<Item> PIECES = registerKey("pieces");
        public static final TagKey<Item> FOODS_SOUPS = registerKey("foods/soups");
        public static final TagKey<Item> FOODS_BREADS = registerKey("foods/breads");
        public static final TagKey<Item> FOODS_PIES = registerKey("foods/pies");
        public static final TagKey<Item> FOODS_FRUITS = registerKey("foods/fruits");
        public static final TagKey<Item> FOODS_FRUITS_APPLES = registerKey("foods/fruits/apples");
        public static final TagKey<Item> FOODS_VEGETABLES_KELPS = registerKey("foods/vegetables/kelps");
        public static final TagKey<Item> FOODS_VEGETABLES_POTATOES = registerKey("foods/vegetables/potatoes");
        public static final TagKey<Item> FOODS_FOOD_POISONING = registerKey("foods/food_poisoning");
        public static final TagKey<Item> FOODS_COOKED_MEATS = registerKey("foods/cooked_meats");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_RABBITS = registerKey("foods/cooked_meats/cooked_rabbits");
        public static final TagKey<Item> FOODS_VEGETABLES_MELON_SLICES = registerKey("foods/vegetables/melon_slices");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_CHICKENS = registerKey("foods/cooked_meats/cooked_chickens");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_MUTTONS = registerKey("foods/cooked_meats/cooked_muttons");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_PORKCHOPS = registerKey("foods/cooked_meats/cooked_porkchops");
        public static final TagKey<Item> FOODS_COOKED_MEATS_COOKED_BEEFS = registerKey("foods/cooked_meats/cooked_beefs");
        public static final TagKey<Item> CROPS_RICE = registerKey("crops/rice");
        public static final TagKey<Item> FOODS = registerKey("foods");
        public static final TagKey<Item> FOODS_SUSHIS = registerKey("foods/sushis");
        public static final TagKey<Item> FOODS_RAW_MEATS = registerKey("foods/raw_meats");
        public static final TagKey<Item> FOODS_CANDIES = registerKey("foods/candies");

        public Items(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, Registries.ITEM, registries, MoreFood.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            tag(FOODS_VEGETABLES).addOptionalTag(FOODS_VEGETABLES_CARROTS).addOptionalTag(FOODS_VEGETABLES_KELPS).addOptionalTag(FOODS_VEGETABLES_POTATOES).addOptionalTag(FOODS_VEGETABLES_MELON_SLICES);
            tag(FOODS_VEGETABLES_CARROTS).add(MFItems.IRON_CARROT.getKey()).add(MFItems.DIAMOND_CARROT.getKey()).add(MFItems.EMERALD_CARROT.getKey()).add(MFItems.COOKED_CARROT.getKey());
            tag(PIECES).add(MFItems.CARROT_PIECES.getKey()).add(MFItems.APPLE_PIECES.getKey()).add(MFItems.KELP_PIECES.getKey()).add(MFItems.POTATO_PIECES.getKey()).add(MFItems.PHANTOM_PIECES.getKey()).add(MFItems.PUFFERFISH_PIECES.getKey()).add(MFItems.BAMBOO_PIECES.getKey());
            tag(FOODS_SOUPS).add(MFItems.CARROT_SOUP.getKey()).add(MFItems.APPLE_SOUP.getKey()).add(MFItems.KELP_SOUP.getKey()).add(MFItems.POTATO_SOUP.getKey()).add(MFItems.PHANTOM_SOUP.getKey()).add(MFItems.PUMPKING_SOUP.getKey()).add(MFItems.BAMBOO_SOUP.getKey());
            tag(FOODS_BREADS).add(MFItems.CARROT_BREAD.getKey()).add(MFItems.APPLE_BREAD.getKey()).add(MFItems.POTATO_BREAD.getKey()).add(MFItems.PUMPKING_BREAD.getKey());
            tag(FOODS_PIES).add(MFItems.CARROT_PIE.getKey()).add(MFItems.APPLE_PIE.getKey());
            tag(FOODS_FRUITS).addOptionalTag(FOODS_FRUITS_APPLES);
            tag(FOODS_FRUITS_APPLES).add(MFItems.IRON_APPLE.getKey()).add(MFItems.DIAMOND_APPLE.getKey()).add(MFItems.EMERALD_APPLE.getKey()).add(MFItems.COOKED_APPLE.getKey());
            tag(FOODS_VEGETABLES_KELPS).add(MFItems.IRON_KELP.getKey()).add(MFItems.GOLDEN_KELP.getKey()).add(MFItems.DIAMOND_KELP.getKey()).add(MFItems.EMERALD_KELP.getKey());
            tag(FOODS_VEGETABLES_POTATOES).add(MFItems.IRON_POTATO.getKey()).add(MFItems.GOLDEN_POTATO.getKey()).add(MFItems.DIAMOND_POTATO.getKey()).add(MFItems.EMERALD_POTATO.getKey());
            tag(FOODS_FOOD_POISONING).add(MFItems.PUFFERFISH_SOUP.getKey());
            tag(FOODS_COOKED_MEATS).add(MFItems.COOKED_PHANTOM.getKey()).add(MFItems.COOKED_BACON.getKey()).addOptionalTag(FOODS_COOKED_MEATS_COOKED_RABBITS).addOptionalTag(FOODS_COOKED_MEATS_COOKED_CHICKENS).addOptionalTag(FOODS_COOKED_MEATS_COOKED_MUTTONS).addOptionalTag(FOODS_COOKED_MEATS_COOKED_PORKCHOPS).addOptionalTag(FOODS_COOKED_MEATS_COOKED_BEEFS);
            tag(FOODS_COOKED_MEATS_COOKED_RABBITS).add(MFItems.IRON_COOKED_RABBIT.getKey()).add(MFItems.GOLDEN_COOKED_RABBIT.getKey()).add(MFItems.DIAMOND_COOKED_RABBIT.getKey()).add(MFItems.EMERALD_COOKED_RABBIT.getKey());
            tag(FOODS_VEGETABLES_MELON_SLICES).add(MFItems.IRON_MELON_SLICE.getKey()).add(MFItems.GOLDEN_MELON_SLICE.getKey()).add(MFItems.DIAMOND_MELON_SLICE.getKey()).add(MFItems.EMERALD_MELON_SLICE.getKey());
            tag(FOODS_COOKED_MEATS_COOKED_CHICKENS).add(MFItems.IRON_COOKED_CHICKEN.getKey()).add(MFItems.GOLDEN_COOKED_CHICKEN.getKey()).add(MFItems.DIAMOND_COOKED_CHICKEN.getKey()).add(MFItems.EMERALD_COOKED_CHICKEN.getKey());
            tag(FOODS_COOKED_MEATS_COOKED_MUTTONS).add(MFItems.IRON_COOKED_MUTTON.getKey()).add(MFItems.GOLDEN_COOKED_MUTTON.getKey()).add(MFItems.DIAMOND_COOKED_MUTTON.getKey()).add(MFItems.EMERALD_COOKED_MUTTON.getKey());
            tag(FOODS_COOKED_MEATS_COOKED_PORKCHOPS).add(MFItems.IRON_COOKED_PORKCHOP.getKey()).add(MFItems.GOLDEN_COOKED_PORKCHOP.getKey()).add(MFItems.DIAMOND_COOKED_PORKCHOP.getKey()).add(MFItems.EMERALD_COOKED_PORKCHOP.getKey());
            tag(FOODS_COOKED_MEATS_COOKED_BEEFS).add(MFItems.IRON_COOKED_BEEF.getKey()).add(MFItems.GOLDEN_COOKED_BEEF.getKey()).add(MFItems.DIAMOND_COOKED_BEEF.getKey()).add(MFItems.EMERALD_COOKED_BEEF.getKey());
            tag(Tags.Items.CROPS).addOptionalTag(CROPS_RICE);
            tag(CROPS_RICE).add(MFItems.RICE.getKey());
            tag(FOODS).add(MFItems.RICE_CHICKEN_BOWL.getKey()).add(MFItems.RICE_SALMON_BOWL.getKey()).add(MFItems.RICE_COD_BOWL.getKey()).add(MFItems.RICE_VEGETABLE_BOWL.getKey()).add(MFItems.RICE_PUDDING.getKey()).add(MFItems.RICE_HONEY_PUDDING.getKey()).add(MFItems.COOKED_EGG.getKey()).add(MFItems.COOKED_BACON_EGG.getKey()).addOptionalTag(FOODS_PIES).addOptionalTag(FOODS_SUSHIS);
            tag(FOODS_SUSHIS).add(MFItems.SUSHI_BAMBOO.getKey()).add(MFItems.SUSHI_CARROT.getKey()).add(MFItems.SUSHI_BEETROOT.getKey()).add(MFItems.SUSHI_SALMON.getKey());
            tag(FOODS_RAW_MEATS).add(MFItems.RAW_BACON.getKey());
            tag(FOODS_CANDIES).add(MFItems.CHOCOLATE.getKey()).add(MFItems.CHOCOLATE_BAR.getKey());
        }

        private static TagKey<Item> registerKey(String path) {
            return TagKey.create(Registries.ITEM, new ResourceLocation("forge", path));
        }
    }

    public static class Blocks extends TagsProvider<Block> {
        public Blocks(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, Registries.BLOCK, registries, MoreFood.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.@NotNull Provider provider) {
            tag(BlockTags.CROPS).add(TagEntry.element(MFBlocks.RICE_CROP.getId()));
        }
    }
}