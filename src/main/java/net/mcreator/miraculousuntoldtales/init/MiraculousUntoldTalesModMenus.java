
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miraculousuntoldtales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.miraculousuntoldtales.world.inventory.MiracChooseMenu;
import net.mcreator.miraculousuntoldtales.world.inventory.LbCamoGuiMenu;
import net.mcreator.miraculousuntoldtales.world.inventory.LadybugMainMenuMenu;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

public class MiraculousUntoldTalesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MiraculousUntoldTalesMod.MODID);
	public static final RegistryObject<MenuType<MiracChooseMenu>> MIRAC_CHOOSE = REGISTRY.register("mirac_choose", () -> IForgeMenuType.create(MiracChooseMenu::new));
	public static final RegistryObject<MenuType<LadybugMainMenuMenu>> LADYBUG_MAIN_MENU = REGISTRY.register("ladybug_main_menu", () -> IForgeMenuType.create(LadybugMainMenuMenu::new));
	public static final RegistryObject<MenuType<LbCamoGuiMenu>> LB_CAMO_GUI = REGISTRY.register("lb_camo_gui", () -> IForgeMenuType.create(LbCamoGuiMenu::new));
}
