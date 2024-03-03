
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miraculousuntoldtales.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.miraculousuntoldtales.client.model.Modelmarinette_camo_wearible;
import net.mcreator.miraculousuntoldtales.client.model.Modelgabriel_camo_wear;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MiraculousUntoldTalesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgabriel_camo_wear.LAYER_LOCATION, Modelgabriel_camo_wear::createBodyLayer);
		event.registerLayerDefinition(Modelmarinette_camo_wearible.LAYER_LOCATION, Modelmarinette_camo_wearible::createBodyLayer);
	}
}
