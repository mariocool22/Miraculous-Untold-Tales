package net.mcreator.miraculousuntoldtales.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.miraculousuntoldtales.world.inventory.CatCamoGuiMenu;
import net.mcreator.miraculousuntoldtales.network.CatCamoGuiButtonMessage;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CatCamoGuiScreen extends AbstractContainerScreen<CatCamoGuiMenu> {
	private final static HashMap<String, Object> guistate = CatCamoGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_invis_camo_button;

	public CatCamoGuiScreen(CatCamoGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("miraculous_untold_tales:textures/screens/cat_camo_gui.png");

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

		guiGraphics.blit(new ResourceLocation("miraculous_untold_tales:textures/screens/cat_camo_selection.png"), this.leftPos + -48, this.topPos + -25, 0, 0, 277, 221, 277, 221);

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
		imagebutton_invis_camo_button = new ImageButton(this.leftPos + -15, this.topPos + 12, 50, 52, 0, 0, 52, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_camo_button.png"), 50, 104, e -> {
			if (true) {
				MiraculousUntoldTalesMod.PACKET_HANDLER.sendToServer(new CatCamoGuiButtonMessage(0, x, y, z));
				CatCamoGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invis_camo_button", imagebutton_invis_camo_button);
		this.addRenderableWidget(imagebutton_invis_camo_button);
	}
}
