
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miraculousuntoldtales.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.miraculousuntoldtales.client.gui.MiracChooseScreen;
import net.mcreator.miraculousuntoldtales.client.gui.LbCamoGuiScreen;
import net.mcreator.miraculousuntoldtales.client.gui.LadybugMainMenuScreen;
import net.mcreator.miraculousuntoldtales.client.gui.CatMainMenuScreen;
import net.mcreator.miraculousuntoldtales.client.gui.CatCamoGuiScreen;
import net.mcreator.miraculousuntoldtales.client.gui.ButterflyMainMenuScreen;
import net.mcreator.miraculousuntoldtales.client.gui.ButterflyCamoSelectionScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MiraculousUntoldTalesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MiraculousUntoldTalesModMenus.MIRAC_CHOOSE.get(), MiracChooseScreen::new);
			MenuScreens.register(MiraculousUntoldTalesModMenus.LADYBUG_MAIN_MENU.get(), LadybugMainMenuScreen::new);
			MenuScreens.register(MiraculousUntoldTalesModMenus.LB_CAMO_GUI.get(), LbCamoGuiScreen::new);
			MenuScreens.register(MiraculousUntoldTalesModMenus.BUTTERFLY_MAIN_MENU.get(), ButterflyMainMenuScreen::new);
			MenuScreens.register(MiraculousUntoldTalesModMenus.BUTTERFLY_CAMO_SELECTION.get(), ButterflyCamoSelectionScreen::new);
			MenuScreens.register(MiraculousUntoldTalesModMenus.CAT_MAIN_MENU.get(), CatMainMenuScreen::new);
			MenuScreens.register(MiraculousUntoldTalesModMenus.CAT_CAMO_GUI.get(), CatCamoGuiScreen::new);
		});
	}
}
