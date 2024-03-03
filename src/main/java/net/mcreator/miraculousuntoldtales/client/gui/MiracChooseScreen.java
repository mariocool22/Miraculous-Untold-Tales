package net.mcreator.miraculousuntoldtales.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.miraculousuntoldtales.world.inventory.MiracChooseMenu;
import net.mcreator.miraculousuntoldtales.network.MiracChooseButtonMessage;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MiracChooseScreen extends AbstractContainerScreen<MiracChooseMenu> {
	private final static HashMap<String, Object> guistate = MiracChooseMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_empty1;

	public MiracChooseScreen(MiracChooseMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("miraculous_untold_tales:textures/screens/mirac_choose.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("miraculous_untold_tales:textures/screens/miraculous_choose.png"), this.leftPos + -96, this.topPos + -102, 0, 0, 192, 192, 192, 192);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_empty = new PlainTextButton(this.leftPos + -63, this.topPos + -34, 25, 20, Component.translatable("gui.miraculous_untold_tales.mirac_choose.button_empty"), e -> {
			if (true) {
				MiraculousUntoldTalesMod.PACKET_HANDLER.sendToServer(new MiracChooseButtonMessage(0, x, y, z));
				MiracChooseButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new PlainTextButton(this.leftPos + -41, this.topPos + -34, 25, 20, Component.translatable("gui.miraculous_untold_tales.mirac_choose.button_empty1"), e -> {
		}, this.font);
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
