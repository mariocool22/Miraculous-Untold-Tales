package net.mcreator.miraculousuntoldtales.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.miraculousuntoldtales.world.inventory.CatMainMenuMenu;
import net.mcreator.miraculousuntoldtales.network.CatMainMenuButtonMessage;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CatMainMenuScreen extends AbstractContainerScreen<CatMainMenuMenu> {
	private final static HashMap<String, Object> guistate = CatMainMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_invis_for_selection_menu;

	public CatMainMenuScreen(CatMainMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("miraculous_untold_tales:textures/screens/cat_main_menu.png");

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

		guiGraphics.blit(new ResourceLocation("miraculous_untold_tales:textures/screens/cat_main_menu.png"), this.leftPos + -58, this.topPos + -29, 0, 0, 276, 226, 276, 226);

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
		imagebutton_invis_for_selection_menu = new ImageButton(this.leftPos + 97, this.topPos + 10, 91, 47, 0, 0, 47, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_for_selection_menu.png"), 91, 94, e -> {
			if (true) {
				MiraculousUntoldTalesMod.PACKET_HANDLER.sendToServer(new CatMainMenuButtonMessage(0, x, y, z));
				CatMainMenuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invis_for_selection_menu", imagebutton_invis_for_selection_menu);
		this.addRenderableWidget(imagebutton_invis_for_selection_menu);
	}
}
