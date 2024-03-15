
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miraculousuntoldtales.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

public class MiraculousUntoldTalesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MiraculousUntoldTalesMod.MODID);
	public static final RegistryObject<SoundEvent> LBTRANSFORM = REGISTRY.register("lbtransform", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("miraculous_untold_tales", "lbtransform")));
}
