
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miraculousuntoldtales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.miraculousuntoldtales.item.LadybugmiraculousmaricamoItem;
import net.mcreator.miraculousuntoldtales.item.LadybugMiraculousItem;
import net.mcreator.miraculousuntoldtales.item.CatMiraculouscamoAdrianItem;
import net.mcreator.miraculousuntoldtales.item.CatMiraculousItem;
import net.mcreator.miraculousuntoldtales.item.ButterflymiraculouscamogabItem;
import net.mcreator.miraculousuntoldtales.item.ButterflyMiraculousItem;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

public class MiraculousUntoldTalesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MiraculousUntoldTalesMod.MODID);
	public static final RegistryObject<Item> LADYBUG_MIRACULOUS = REGISTRY.register("ladybug_miraculous", () -> new LadybugMiraculousItem());
	public static final RegistryObject<Item> LADYBUGMIRACULOUSMARICAMO = REGISTRY.register("ladybugmiraculousmaricamo", () -> new LadybugmiraculousmaricamoItem());
	public static final RegistryObject<Item> CAT_MIRACULOUS = REGISTRY.register("cat_miraculous", () -> new CatMiraculousItem());
	public static final RegistryObject<Item> CAT_MIRACULOUSCAMO_ADRIAN = REGISTRY.register("cat_miraculouscamo_adrian", () -> new CatMiraculouscamoAdrianItem());
	public static final RegistryObject<Item> BUTTERFLY_MIRACULOUS = REGISTRY.register("butterfly_miraculous", () -> new ButterflyMiraculousItem());
	public static final RegistryObject<Item> BUTTERFLYMIRACULOUSCAMOGAB = REGISTRY.register("butterflymiraculouscamogab", () -> new ButterflymiraculouscamogabItem());
}
