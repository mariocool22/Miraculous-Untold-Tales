
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.miraculousuntoldtales.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.miraculousuntoldtales.network.TransformMessage;
import net.mcreator.miraculousuntoldtales.network.PowerOneMessage;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MiraculousUntoldTalesModKeyMappings {
	public static final KeyMapping TRANSFORM = new KeyMapping("key.miraculous_untold_tales.transform", GLFW.GLFW_KEY_T, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MiraculousUntoldTalesMod.PACKET_HANDLER.sendToServer(new TransformMessage(0, 0));
				TransformMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping POWER_ONE = new KeyMapping("key.miraculous_untold_tales.power_one", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MiraculousUntoldTalesMod.PACKET_HANDLER.sendToServer(new PowerOneMessage(0, 0));
				PowerOneMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TRANSFORM);
		event.register(POWER_ONE);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TRANSFORM.consumeClick();
				POWER_ONE.consumeClick();
			}
		}
	}
}
