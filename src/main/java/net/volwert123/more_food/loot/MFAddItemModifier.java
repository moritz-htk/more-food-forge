package net.volwert123.more_food.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctions;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MFAddItemModifier extends LootModifier {
    public static final Supplier<MapCodec<MFAddItemModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.mapCodec(inst ->
                    codecStart(inst)
                            .and(BuiltInRegistries.ITEM.byNameCodec()
                                    .fieldOf("item")
                                    .forGetter(m -> m.item))
                            .and(LootItemFunctions.CODEC
                                    .listOf()
                                    .fieldOf("functions")
                                    .forGetter(m -> m.functions))
                            .apply(inst, MFAddItemModifier::new)));

    private final Item item;
    private final List<Holder<LootItemFunction>> functions;
    private final BiFunction<ItemStack, LootContext, ItemStack> compositeFunction;

    public MFAddItemModifier(LootItemCondition[] conditionsIn, Item item, final List<Holder<LootItemFunction>> functions) {
        super(conditionsIn);
        this.item = item;
        this.functions = functions;

        List<BiFunction<ItemStack, LootContext, ItemStack>> functionList = functions.stream()
                .map(holder -> {
                    LootItemFunction lootItemFunction = holder.value();
                    return (BiFunction<ItemStack, LootContext, ItemStack>) (lootItemFunction);
                })
                .collect(Collectors.toList());
        compositeFunction = LootItemFunctions.compose(functionList);
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generatedLoot, @NotNull LootContext context) {
        for (LootItemCondition condition : this.conditions) {
            if (!condition.test(context)) {
                return generatedLoot;
            }
        }

        final ItemStack stack = new ItemStack(this.item);
        compositeFunction.apply(stack, context);
        generatedLoot.add(stack);
        return generatedLoot;
    }

    @Override
    public @NotNull MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}