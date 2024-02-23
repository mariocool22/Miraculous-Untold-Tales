
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miraculousuntoldtales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.miraculousuntoldtales.item.LadybugMiraculousItem;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

public class MiraculousUntoldTalesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MiraculousUntoldTalesMod.MODID);
	public static final RegistryObject<Item> LADYBUG_MIRACULOUS = REGISTRY.register("ladybug_miraculous", () -> new LadybugMiraculousItem());
}
