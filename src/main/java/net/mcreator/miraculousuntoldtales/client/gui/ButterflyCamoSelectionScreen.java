package net.mcreator.miraculousuntoldtales.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.miraculousuntoldtales.world.inventory.ButterflyCamoSelectionMenu;
import net.mcreator.miraculousuntoldtales.network.ButterflyCamoSelectionButtonMessage;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ButterflyCamoSelectionScreen extends AbstractContainerScreen<ButterflyCamoSelectionMenu> {
	private final static HashMap<String, Object> guistate = ButterflyCamoSelectionMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_invis_camo_button;
	ImageButton imagebutton_invis_camo_button1;
	ImageButton imagebutton_invis_camo_button2;

	public ButterflyCamoSelectionScreen(ButterflyCamoSelectionMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("miraculous_untold_tales:textures/screens/butterfly_camo_selection.png");

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

		guiGraphics.blit(new ResourceLocation("miraculous_untold_tales:textures/screens/butterfly_miraculous_camo_menu.png"), this.leftPos + -32, this.topPos + -29, 0, 0, 257, 227, 257, 227);

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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		imagebutton_invis_camo_button = new ImageButton(this.leftPos + -1, this.topPos + 19, 50, 52, 0, 0, 52, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_camo_button.png"), 50, 104, e -> {
			if (true) {
				MiraculousUntoldTalesMod.PACKET_HANDLER.sendToServer(new ButterflyCamoSelectionButtonMessage(0, x, y, z));
				ButterflyCamoSelectionButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invis_camo_button", imagebutton_invis_camo_button);
		this.addRenderableWidget(imagebutton_invis_camo_button);
		imagebutton_invis_camo_button1 = new ImageButton(this.leftPos + 72, this.topPos + 19, 50, 52, 0, 0, 52, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_camo_button1.png"), 50, 104, e -> {
		});
		guistate.put("button:imagebutton_invis_camo_button1", imagebutton_invis_camo_button1);
		this.addRenderableWidget(imagebutton_invis_camo_button1);
		imagebutton_invis_camo_button2 = new ImageButton(this.leftPos + 147, this.topPos + 17, 50, 52, 0, 0, 52, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_camo_button2.png"), 50, 104, e -> {
		});
		guistate.put("button:imagebutton_invis_camo_button2", imagebutton_invis_camo_button2);
		this.addRenderableWidget(imagebutton_invis_camo_button2);
	}
}
