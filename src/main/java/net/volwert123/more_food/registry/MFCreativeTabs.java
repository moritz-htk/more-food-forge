package net.volwert123.more_food.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.volwert123.more_food.MoreFood;

public class MFCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreFood.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MORE_FOOD_MAIN = TABS.register(MoreFood.MOD_ID + "_main", () -> CreativeModeTab.builder().title(Component.literal("More Food")).icon(() -> new ItemStack(MFItems.COOKED_CARROT.get())).build());
}