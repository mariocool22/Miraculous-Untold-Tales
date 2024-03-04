package net.mcreator.miraculousuntoldtales.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.miraculousuntoldtales.world.inventory.ButterflyMainMenuMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ButterflyMainMenuScreen extends AbstractContainerScreen<ButterflyMainMenuMenu> {
	private final static HashMap<String, Object> guistate = ButterflyMainMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_camos;

	public ButterflyMainMenuScreen(ButterflyMainMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("miraculous_untold_tales:textures/screens/butterfly_main_menu.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.miraculous_untold_tales.butterfly_main_menu.label_butterfly_miraculous_selection_m"), 7, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.miraculous_untold_tales.butterfly_main_menu.label_menu"), 70, 17, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_camos = Button.builder(Component.translatable("gui.miraculous_untold_tales.butterfly_main_menu.button_camos"), e -> {
		}).bounds(this.leftPos + 59, this.topPos + 36, 51, 20).build();
		guistate.put("button:button_camos", button_camos);
		this.addRenderableWidget(button_camos);
	}
}
