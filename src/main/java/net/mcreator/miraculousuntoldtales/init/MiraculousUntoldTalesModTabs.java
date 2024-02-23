
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miraculousuntoldtales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

public class MiraculousUntoldTalesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MiraculousUntoldTalesMod.MODID);
	public static final RegistryObject<CreativeModeTab> MIRACULOUSOUS = REGISTRY.register("miraculousous",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.miraculous_untold_tales.miraculousous")).icon(() -> new ItemStack(MiraculousUntoldTalesModItems.LADYBUG_MIRACULOUS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MiraculousUntoldTalesModItems.LADYBUG_MIRACULOUS.get());
			}).withSearchBar().build());
}
