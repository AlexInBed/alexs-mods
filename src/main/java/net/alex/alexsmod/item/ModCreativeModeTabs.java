package net.alex.alexsmod.item;

import net.alex.alexsmod.AlexsMod;
import net.alex.alexsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlexsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALEXS_MOD_TAB = CREATIVE_MODE_TABS.register("alexs_mod_tab",  () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ADAMANTIUM.get()))
            .title(Component.translatable("creativetab.alexs_mod_tab"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.ADAMANTIUM.get());
                output.accept(ModItems.RAW_ADAMANTIUM.get());
                output.accept(ModItems.ADAMANTIUM_CLAWS.get());
                output.accept(ModBlocks.ADAMANTIUM_ORE.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
