package net.volwert123.more_food.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.volwert123.more_food.MoreFood;
import net.volwert123.more_food.registry.MFItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class MFRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public MFRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output) {
        // Carrot Recipes
        createIronFoodRecipe(MFItems.IRON_CARROT.get(), Items.CARROT).save(output, createOutputLocation(MFItems.IRON_CARROT.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_CARROT.get(), Items.CARROT).save(output, createOutputLocation(MFItems.DIAMOND_CARROT.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_CARROT.get(), Items.CARROT).save(output, createOutputLocation(MFItems.EMERALD_CARROT.get()));
        createCookingRecipes(MFItems.COOKED_CARROT.get(), Items.CARROT, output);
        createPiecesRecipe(MFItems.CARROT_PIECES.get(), Items.CARROT).save(output, createOutputLocation(MFItems.CARROT_PIECES.get()));
        createSoupRecipe(MFItems.CARROT_SOUP.get(), Items.CARROT, MFItems.CARROT_PIECES.get()).save(output, createOutputLocation(MFItems.CARROT_SOUP.get()));
        createBreadRecipe(MFItems.CARROT_BREAD.get(), Items.CARROT, MFItems.CARROT_PIECES.get()).save(output, createOutputLocation(MFItems.CARROT_BREAD.get()));
        createPieRecipe(MFItems.CARROT_PIE.get(), Items.CARROT).save(output, createOutputLocation(MFItems.CARROT_PIE.get()));

        // Apple Recipes
        createIronFoodRecipe(MFItems.IRON_APPLE.get(), Items.APPLE).save(output, createOutputLocation(MFItems.IRON_APPLE.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_APPLE.get(), Items.APPLE).save(output, createOutputLocation(MFItems.DIAMOND_APPLE.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_APPLE.get(), Items.APPLE).save(output, createOutputLocation(MFItems.EMERALD_APPLE.get()));
        createCookingRecipes(MFItems.COOKED_APPLE.get(), Items.APPLE, output);
        createPiecesRecipe(MFItems.APPLE_PIECES.get(), Items.APPLE).save(output, createOutputLocation(MFItems.APPLE_PIECES.get()));
        createSoupRecipe(MFItems.APPLE_SOUP.get(), Items.APPLE, MFItems.APPLE_PIECES.get()).save(output, createOutputLocation(MFItems.APPLE_SOUP.get()));
        createBreadRecipe(MFItems.APPLE_BREAD.get(), Items.APPLE, MFItems.APPLE_PIECES.get()).save(output, createOutputLocation(MFItems.APPLE_BREAD.get()));
        createPieRecipe(MFItems.APPLE_PIE.get(), Items.APPLE).save(output, createOutputLocation(MFItems.APPLE_PIE.get()));

        // Kelp Recipes
        createIronFoodRecipe(MFItems.IRON_KELP.get(), Items.DRIED_KELP).save(output, createOutputLocation(MFItems.IRON_KELP.get()));
        createGoldenFoodRecipe(MFItems.GOLDEN_KELP.get(), Items.DRIED_KELP).save(output, createOutputLocation(MFItems.GOLDEN_KELP.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_KELP.get(), Items.DRIED_KELP).save(output, createOutputLocation(MFItems.DIAMOND_KELP.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_KELP.get(), Items.DRIED_KELP).save(output, createOutputLocation(MFItems.EMERALD_KELP.get()));
        createPiecesRecipe(MFItems.KELP_PIECES.get(), Items.DRIED_KELP).save(output, createOutputLocation(MFItems.KELP_PIECES.get()));
        createSoupRecipe(MFItems.KELP_SOUP.get(), Items.DRIED_KELP, MFItems.KELP_PIECES.get()).save(output, createOutputLocation(MFItems.KELP_SOUP.get()));

        // Potato Recipes
        createIronFoodRecipe(MFItems.IRON_POTATO.get(), Items.POTATO).save(output, createOutputLocation(MFItems.IRON_POTATO.get()));
        createGoldenFoodRecipe(MFItems.GOLDEN_POTATO.get(), Items.POTATO).save(output, createOutputLocation(MFItems.GOLDEN_POTATO.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_POTATO.get(), Items.POTATO).save(output, createOutputLocation(MFItems.DIAMOND_POTATO.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_POTATO.get(), Items.POTATO).save(output, createOutputLocation(MFItems.EMERALD_POTATO.get()));
        createPiecesRecipe(MFItems.POTATO_PIECES.get(), Items.POTATO).save(output, createOutputLocation(MFItems.POTATO_PIECES.get()));
        createSoupRecipe(MFItems.POTATO_SOUP.get(), Items.POTATO, MFItems.POTATO_PIECES.get()).save(output, createOutputLocation(MFItems.POTATO_SOUP.get()));
        createBreadRecipe(MFItems.POTATO_BREAD.get(), Items.POTATO, MFItems.POTATO_PIECES.get()).save(output, createOutputLocation(MFItems.POTATO_BREAD.get()));

        // Phantom Recipes
        createCookingRecipes(MFItems.COOKED_PHANTOM.get(), Items.PHANTOM_MEMBRANE, output);
        createPiecesRecipe(MFItems.PHANTOM_PIECES.get(), Items.PHANTOM_MEMBRANE).save(output, createOutputLocation(MFItems.PHANTOM_PIECES.get()));
        createSoupRecipe(MFItems.PHANTOM_SOUP.get(), Items.PHANTOM_MEMBRANE, MFItems.PHANTOM_PIECES.get()).save(output, createOutputLocation(MFItems.PHANTOM_SOUP.get()));

        // Pufferfish Recipes
        createPiecesRecipe(MFItems.PUFFERFISH_PIECES.get(), Items.PUFFERFISH).save(output, createOutputLocation(MFItems.PUFFERFISH_PIECES.get()));
        createSoupRecipe(MFItems.PUFFERFISH_SOUP.get(), Items.PUFFERFISH, MFItems.PUFFERFISH_PIECES.get()).save(output, createOutputLocation(MFItems.PUFFERFISH_SOUP.get()));

        // Pumpkin Recipes
        createSoupRecipe(MFItems.PUMPKING_SOUP.get(), Items.PUMPKIN, Items.PUMPKIN_SEEDS).save(output, createOutputLocation(MFItems.PUMPKING_SOUP.get()));
        createBreadRecipe(MFItems.PUMPKING_BREAD.get(), Items.PUMPKIN, Items.PUMPKIN_SEEDS).save(output, createOutputLocation(MFItems.PUMPKING_BREAD.get()));

        // Bamboo Recipes
        createCookingRecipes(MFItems.COOKED_BAMBOO.get(), Items.BAMBOO, output);
        createPiecesRecipe(MFItems.BAMBOO_PIECES.get(), Items.BAMBOO).save(output, createOutputLocation(MFItems.BAMBOO_PIECES.get()));
        createSoupRecipe(MFItems.BAMBOO_SOUP.get(), Items.BAMBOO, MFItems.BAMBOO_PIECES.get()).save(output, createOutputLocation(MFItems.BAMBOO_SOUP.get()));

        // Rabbit Recipes
        createIronFoodRecipe(MFItems.IRON_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(output, createOutputLocation(MFItems.IRON_COOKED_RABBIT.get()));
        createGoldenFoodRecipe(MFItems.GOLDEN_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(output, createOutputLocation(MFItems.GOLDEN_COOKED_RABBIT.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(output, createOutputLocation(MFItems.DIAMOND_COOKED_RABBIT.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_COOKED_RABBIT.get(), Items.COOKED_RABBIT).save(output, createOutputLocation(MFItems.EMERALD_COOKED_RABBIT.get()));

        // Melon Slice Recipes
        createIronFoodRecipe(MFItems.IRON_MELON_SLICE.get(), Items.MELON_SLICE).save(output, createOutputLocation(MFItems.IRON_MELON_SLICE.get()));
        createGoldenFoodRecipe(MFItems.GOLDEN_MELON_SLICE.get(), Items.MELON_SLICE).save(output, createOutputLocation(MFItems.GOLDEN_MELON_SLICE.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_MELON_SLICE.get(), Items.MELON_SLICE).save(output, createOutputLocation(MFItems.DIAMOND_MELON_SLICE.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_MELON_SLICE.get(), Items.MELON_SLICE).save(output, createOutputLocation(MFItems.EMERALD_MELON_SLICE.get()));

        // Cooked Chicken Recipes
        createIronFoodRecipe(MFItems.IRON_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(output, createOutputLocation(MFItems.IRON_COOKED_CHICKEN.get()));
        createGoldenFoodRecipe(MFItems.GOLDEN_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(output, createOutputLocation(MFItems.GOLDEN_COOKED_CHICKEN.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(output, createOutputLocation(MFItems.DIAMOND_COOKED_CHICKEN.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_COOKED_CHICKEN.get(), Items.COOKED_CHICKEN).save(output, createOutputLocation(MFItems.EMERALD_COOKED_CHICKEN.get()));

        // Cooked Mutton Recipes
        createIronFoodRecipe(MFItems.IRON_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(output, createOutputLocation(MFItems.IRON_COOKED_MUTTON.get()));
        createGoldenFoodRecipe(MFItems.GOLDEN_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(output, createOutputLocation(MFItems.GOLDEN_COOKED_MUTTON.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(output, createOutputLocation(MFItems.DIAMOND_COOKED_MUTTON.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_COOKED_MUTTON.get(), Items.COOKED_MUTTON).save(output, createOutputLocation(MFItems.EMERALD_COOKED_MUTTON.get()));

        // Cooked Porkchop Recipes
        createIronFoodRecipe(MFItems.IRON_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(output, createOutputLocation(MFItems.IRON_COOKED_PORKCHOP.get()));
        createGoldenFoodRecipe(MFItems.GOLDEN_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(output, createOutputLocation(MFItems.GOLDEN_COOKED_PORKCHOP.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(output, createOutputLocation(MFItems.DIAMOND_COOKED_PORKCHOP.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_COOKED_PORKCHOP.get(), Items.COOKED_PORKCHOP).save(output, createOutputLocation(MFItems.EMERALD_COOKED_PORKCHOP.get()));

        // Cooked Beef Recipes
        createIronFoodRecipe(MFItems.IRON_COOKED_BEEF.get(), Items.COOKED_BEEF).save(output, createOutputLocation(MFItems.IRON_COOKED_BEEF.get()));
        createGoldenFoodRecipe(MFItems.GOLDEN_COOKED_BEEF.get(), Items.COOKED_BEEF).save(output, createOutputLocation(MFItems.GOLDEN_COOKED_BEEF.get()));
        createDiamondFoodRecipe(MFItems.DIAMOND_COOKED_BEEF.get(), Items.COOKED_BEEF).save(output, createOutputLocation(MFItems.DIAMOND_COOKED_BEEF.get()));
        createEmeraldFoodRecipe(MFItems.EMERALD_COOKED_BEEF.get(), Items.COOKED_BEEF).save(output, createOutputLocation(MFItems.EMERALD_COOKED_BEEF.get()));

        // Rice Bowl Recipes
        createRiceBowlRecipe(MFItems.RICE_CHICKEN_BOWL.get(), Items.COOKED_CHICKEN).save(output, createOutputLocation(MFItems.RICE_CHICKEN_BOWL.get()));
        createRiceBowlRecipe(MFItems.RICE_SALMON_BOWL.get(), Items.COOKED_SALMON).save(output, createOutputLocation(MFItems.RICE_SALMON_BOWL.get()));
        createRiceBowlRecipe(MFItems.RICE_COD_BOWL.get(), Items.COOKED_COD).save(output, createOutputLocation(MFItems.RICE_COD_BOWL.get()));
        createRiceVegetableBowlRecipe().save(output, createOutputLocation(MFItems.RICE_VEGETABLE_BOWL.get()));
        createRiceBowlRecipe(MFItems.RICE_PUDDING.get(), Items.MILK_BUCKET).save(output, createOutputLocation(MFItems.RICE_PUDDING.get()));
        createRiceHoneyPuddingRecipe().save(output, createOutputLocation(MFItems.RICE_HONEY_PUDDING.get()));

        // Sushi Recipes
        createSushiRecipe(MFItems.SUSHI_BAMBOO.get(), Items.BAMBOO).save(output, createOutputLocation(MFItems.SUSHI_BAMBOO.get()));
        createSushiRecipe(MFItems.SUSHI_CARROT.get(), Items.CARROT).save(output, createOutputLocation(MFItems.SUSHI_CARROT.get()));
        createSushiRecipe(MFItems.SUSHI_BEETROOT.get(), Items.BEETROOT).save(output, createOutputLocation(MFItems.SUSHI_BEETROOT.get()));
        createSushiRecipe(MFItems.SUSHI_SALMON.get(), Items.SALMON).save(output, createOutputLocation(MFItems.SUSHI_SALMON.get()));

        // Egg Recipes
        createCookingRecipes(MFItems.COOKED_EGG.get(), Items.EGG, output);

        // Bacon Recipes
        createRawBaconRecipe().save(output, createOutputLocation(MFItems.RAW_BACON.get()));
        createCookingRecipes(MFItems.COOKED_BACON.get(), MFItems.RAW_BACON.get(), output);
        createCookedBaconEggRecipe().save(output, createOutputLocation(MFItems.COOKED_BACON_EGG.get()));

        // Chocolate Recipes
        createChocolateRecipe().save(output, createOutputLocation(MFItems.CHOCOLATE.get()));
        createChocolateBarRecipe().save(output, createOutputLocation(MFItems.CHOCOLATE_BAR.get()));
    }

    private static ShapedRecipeBuilder createIronFoodRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('I', Items.IRON_INGOT)
                .define('#', input)
                .pattern("III")
                .pattern("I#I")
                .pattern("III")
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapedRecipeBuilder createGoldenFoodRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('G', Items.GOLD_INGOT)
                .define('#', input)
                .pattern("GGG")
                .pattern("G#G")
                .pattern("GGG")
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapedRecipeBuilder createDiamondFoodRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('D', Items.DIAMOND)
                .define('#', input)
                .pattern("DDD")
                .pattern("D#D")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapedRecipeBuilder createEmeraldFoodRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('E', Items.EMERALD)
                .define('#', input)
                .pattern("EEE")
                .pattern("E#E")
                .pattern("EEE")
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD))
                .unlockedBy(getHasName(input), has(input));
    }

    private static void createCookingRecipes(ItemLike output, ItemLike input, RecipeOutput recipeOutput) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,200, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, new ResourceLocation(MoreFood.MOD_ID, getItemName(output) + "_smelting"));
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,100, RecipeSerializer.SMOKING_RECIPE, SmokingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, new ResourceLocation(MoreFood.MOD_ID, getItemName(output) + "_smoking"));
        SimpleCookingRecipeBuilder.generic(Ingredient.of(input), RecipeCategory.FOOD, output,1.0f,600, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, CampfireCookingRecipe::new).unlockedBy(getHasName(input), has(input)).save(recipeOutput, new ResourceLocation(MoreFood.MOD_ID, getItemName(output) + "_campfire_cooking"));
    }

    private static ShapelessRecipeBuilder createPiecesRecipe(ItemLike output, ItemLike input) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 4)
                .requires(input)
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapelessRecipeBuilder createSoupRecipe(ItemLike output, ItemLike input, ItemLike material) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, output)
                .requires(Items.BOWL)
                .requires(input)
                .requires(material)
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(material), has(material));
    }

    private static ShapelessRecipeBuilder createBreadRecipe(ItemLike output, ItemLike input, ItemLike material) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, output)
                .requires(Items.WHEAT, 2)
                .requires(input)
                .requires(material)
                .unlockedBy(getHasName(Items.WHEAT), has(Items.WHEAT))
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(material), has(material));
    }

    private static ShapelessRecipeBuilder createPieRecipe(ItemLike output, ItemLike input) {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, output)
                .requires(input)
                .requires(Items.EGG)
                .requires(Items.SUGAR)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.EGG), has(Items.EGG))
                .unlockedBy(getHasName(Items.SUGAR), has(Items.SUGAR));
    }

    private static ShapedRecipeBuilder createRiceBowlRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('B', Items.BOWL)
                .define('R', MFItems.RICE.get())
                .define('#', input)
                .pattern("  #")
                .pattern("RRR")
                .pattern(" B ")
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(MFItems.RICE.get()), has(MFItems.RICE.get()))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapedRecipeBuilder createRiceVegetableBowlRecipe() {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, MFItems.RICE_VEGETABLE_BOWL.get())
                .define('B', Items.BOWL)
                .define('R', MFItems.RICE.get())
                .define('A', MFItems.COOKED_BAMBOO.get())
                .define('C', Items.CARROT)
                .pattern(" AC")
                .pattern("RRR")
                .pattern(" B ")
                .unlockedBy(getHasName(Items.BOWL), has(Items.BOWL))
                .unlockedBy(getHasName(MFItems.RICE.get()), has(MFItems.RICE.get()))
                .unlockedBy(getHasName(MFItems.COOKED_BAMBOO.get()), has(MFItems.COOKED_BAMBOO.get()))
                .unlockedBy(getHasName(Items.CARROT), has(Items.CARROT));
    }

    private static ShapelessRecipeBuilder createRiceHoneyPuddingRecipe() {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MFItems.RICE_HONEY_PUDDING.get())
                .requires(MFItems.RICE_PUDDING.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy(getHasName(MFItems.RICE_HONEY_PUDDING.get()), has(MFItems.RICE_HONEY_PUDDING.get()))
                .unlockedBy(getHasName(Items.HONEY_BOTTLE), has(Items.HONEY_BOTTLE));
    }

    private static ShapedRecipeBuilder createSushiRecipe(ItemLike output, ItemLike input) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, output)
                .define('D', Items.DRIED_KELP)
                .define('R', MFItems.RICE.get())
                .define('#', input)
                .pattern("R#R")
                .pattern("DDD")
                .unlockedBy(getHasName(Items.DRIED_KELP), has(Items.DRIED_KELP))
                .unlockedBy(getHasName(MFItems.RICE.get()), has(MFItems.RICE.get()))
                .unlockedBy(getHasName(input), has(input));
    }

    private static ShapelessRecipeBuilder createRawBaconRecipe() {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MFItems.RAW_BACON.get())
                .requires(Items.PORKCHOP)
                .unlockedBy(getHasName(Items.PORKCHOP), has(Items.PORKCHOP));
    }

    private static ShapelessRecipeBuilder createCookedBaconEggRecipe() {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MFItems.COOKED_BACON_EGG.get())
                .requires(MFItems.COOKED_BACON.get())
                .requires(MFItems.COOKED_EGG.get())
                .unlockedBy(getHasName(MFItems.COOKED_BACON.get()), has(MFItems.COOKED_BACON.get()))
                .unlockedBy(getHasName(MFItems.COOKED_EGG.get()), has(MFItems.COOKED_EGG.get()));
    }

    private static ShapelessRecipeBuilder createChocolateRecipe() {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MFItems.CHOCOLATE.get())
                .requires(Items.MILK_BUCKET)
                .requires(Items.COCOA_BEANS)
                .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET))
                .unlockedBy(getHasName(Items.COCOA_BEANS), has(Items.COCOA_BEANS));
    }

    private static ShapelessRecipeBuilder createChocolateBarRecipe() {
        return ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, MFItems.CHOCOLATE_BAR.get())
                .requires(Items.PAPER)
                .requires(MFItems.CHOCOLATE.get())
                .unlockedBy(getHasName(Items.PAPER), has(Items.PAPER))
                .unlockedBy(getHasName(MFItems.CHOCOLATE.get()), has(MFItems.CHOCOLATE.get()));
    }

    private static ResourceLocation createOutputLocation(ItemLike item) {
        return new ResourceLocation(MoreFood.MOD_ID, getItemName(item));
    }
}