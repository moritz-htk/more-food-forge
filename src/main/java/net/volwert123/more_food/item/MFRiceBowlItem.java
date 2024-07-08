package net.volwert123.more_food.item;

import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class MFRiceBowlItem extends Item {
    private final FoodProperties foodProperties;

    public MFRiceBowlItem(Properties properties, FoodProperties foodProperties) {
        super(properties.stacksTo(1).food(foodProperties));
        this.foodProperties = foodProperties;
    }

    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity user) {
        Player player = user instanceof Player ? (Player) user : null;
        if (player != null){
            player.awardStat(Stats.ITEM_USED.get(this));
            player.getFoodData().eat(foodProperties);
            if (!player.getAbilities().instabuild) stack.shrink(1);
        }
        if (player == null || !player.getAbilities().instabuild) {
            if (stack.isEmpty()) return new ItemStack(Items.BOWL);
            if (player != null) player.getInventory().add(new ItemStack(Items.BOWL));
        }
        return stack;
    }
}