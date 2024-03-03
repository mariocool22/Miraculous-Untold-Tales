package net.mcreator.miraculousuntoldtales.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;

import net.mcreator.miraculousuntoldtales.client.renderer.LadybugmiraculousmaricamoRenderer;
import net.mcreator.miraculousuntoldtales.client.renderer.ButterflymiraculouscamogabRenderer;
import net.mcreator.miraculousuntoldtales.client.model.Modelmarinette_camo_wearible;
import net.mcreator.miraculousuntoldtales.client.model.Modelgabriel_camo_wear;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MiraculousUntoldTalesModCuriosRenderers {
	@SubscribeEvent
	public static void registerLayers(final EntityRenderersEvent.RegisterLayerDefinitions evt) {
		evt.registerLayerDefinition(MiraculousUntoldTalesModLayerDefinitions.LADYBUGMIRACULOUSMARICAMO, Modelmarinette_camo_wearible::createBodyLayer);
		evt.registerLayerDefinition(MiraculousUntoldTalesModLayerDefinitions.BUTTERFLYMIRACULOUSCAMOGAB, Modelgabriel_camo_wear::createBodyLayer);
	}

	@SubscribeEvent
	public static void clientSetup(final FMLClientSetupEvent evt) {
		CuriosRendererRegistry.register(MiraculousUntoldTalesModItems.LADYBUGMIRACULOUSMARICAMO.get(), LadybugmiraculousmaricamoRenderer::new);
		CuriosRendererRegistry.register(MiraculousUntoldTalesModItems.BUTTERFLYMIRACULOUSCAMOGAB.get(), ButterflymiraculouscamogabRenderer::new);
	}
}
