package net.mcreator.miraculousuntoldtales.client.renderer;

import top.theillusivec4.curios.api.client.ICurioRenderer;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.miraculousuntoldtales.init.MiraculousUntoldTalesModLayerDefinitions;
import net.mcreator.miraculousuntoldtales.client.model.Modelmarinette_camo_wearible;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LadybugmiraculousmaricamoRenderer implements ICurioRenderer {
	private static final ResourceLocation TEXTURE = new ResourceLocation("miraculous_untold_tales", "textures/entities/for_most_of_lb_camos.png");
	private final Modelmarinette_camo_wearible model;

	public LadybugmiraculousmaricamoRenderer() {
		this.model = new Modelmarinette_camo_wearible(Minecraft.getInstance().getEntityModels().bakeLayer(MiraculousUntoldTalesModLayerDefinitions.LADYBUGMIRACULOUSMARICAMO));
	}

	@Override
	public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack, SlotContext slotContext, PoseStack matrixStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer, int light, float limbSwing,
			float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
		LivingEntity entity = slotContext.entity();
		ICurioRenderer.translateIfSneaking(matrixStack, entity);
		ICurioRenderer.rotateIfSneaking(matrixStack, entity);
		this.model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
		this.model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(renderTypeBuffer, RenderType.armorCutoutNoCull(TEXTURE), false, stack.hasFoil());
		this.model.renderToBuffer(matrixStack, vertexconsumer, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
	}
}
