package net.mcreator.miraculousuntoldtales.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.miraculousuntoldtales.world.inventory.LadybugMainMenuMenu;
import net.mcreator.miraculousuntoldtales.network.LadybugMainMenuButtonMessage;
import net.mcreator.miraculousuntoldtales.MiraculousUntoldTalesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LadybugMainMenuScreen extends AbstractContainerScreen<LadybugMainMenuMenu> {
	private final static HashMap<String, Object> guistate = LadybugMainMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_invis_for_selection_menu;
	ImageButton imagebutton_invis_for_selection_menu1;
	ImageButton imagebutton_invis_for_selection_menu2;
	ImageButton imagebutton_invis_for_selection_menu3;
	ImageButton imagebutton_invis_for_selection_menu4;

	public LadybugMainMenuScreen(LadybugMainMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("miraculous_untold_tales:textures/screens/ladybug_main_menu.png");

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

		guiGraphics.blit(new ResourceLocation("miraculous_untold_tales:textures/screens/ladybug_main_menu.png"), this.leftPos + -142, this.topPos + -110, 0, 0, 278, 224, 278, 224);

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
		imagebutton_invis_for_selection_menu = new ImageButton(this.leftPos + -118, this.topPos + -76, 91, 47, 0, 0, 47, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_for_selection_menu.png"), 91, 94, e -> {
		});
		guistate.put("button:imagebutton_invis_for_selection_menu", imagebutton_invis_for_selection_menu);
		this.addRenderableWidget(imagebutton_invis_for_selection_menu);
		imagebutton_invis_for_selection_menu1 = new ImageButton(this.leftPos + 25, this.topPos + -75, 91, 47, 0, 0, 47, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_for_selection_menu1.png"), 91, 94, e -> {
			if (true) {
				MiraculousUntoldTalesMod.PACKET_HANDLER.sendToServer(new LadybugMainMenuButtonMessage(1, x, y, z));
				LadybugMainMenuButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_invis_for_selection_menu1", imagebutton_invis_for_selection_menu1);
		this.addRenderableWidget(imagebutton_invis_for_selection_menu1);
		imagebutton_invis_for_selection_menu2 = new ImageButton(this.leftPos + -117, this.topPos + 31, 91, 47, 0, 0, 47, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_for_selection_menu2.png"), 91, 94, e -> {
		});
		guistate.put("button:imagebutton_invis_for_selection_menu2", imagebutton_invis_for_selection_menu2);
		this.addRenderableWidget(imagebutton_invis_for_selection_menu2);
		imagebutton_invis_for_selection_menu3 = new ImageButton(this.leftPos + 24, this.topPos + 33, 91, 47, 0, 0, 47, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_for_selection_menu3.png"), 91, 94, e -> {
		});
		guistate.put("button:imagebutton_invis_for_selection_menu3", imagebutton_invis_for_selection_menu3);
		this.addRenderableWidget(imagebutton_invis_for_selection_menu3);
		imagebutton_invis_for_selection_menu4 = new ImageButton(this.leftPos + -49, this.topPos + -23, 91, 47, 0, 0, 47, new ResourceLocation("miraculous_untold_tales:textures/screens/atlas/imagebutton_invis_for_selection_menu4.png"), 91, 94, e -> {
		});
		guistate.put("button:imagebutton_invis_for_selection_menu4", imagebutton_invis_for_selection_menu4);
		this.addRenderableWidget(imagebutton_invis_for_selection_menu4);
	}
}
