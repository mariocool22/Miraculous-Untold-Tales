package net.mcreator.miraculousuntoldtales.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmarinette_camo_wearible<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("miraculous_untold_tales", "modelmarinette_camo_wearible"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelmarinette_camo_wearible(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition earings = Head.addOrReplaceChild("earings",
				CubeListBuilder.create().texOffs(6, 10).addBox(-4.878F, -5.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7024F)).texOffs(0, 8).addBox(-4.878F, -5.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7024F)).texOffs(0, 0)
						.addBox(-4.7805F, -5.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6537F)).texOffs(0, 0).addBox(-4.7805F, -5.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6537F)).texOffs(0, 8).mirror()
						.addBox(2.878F, -5.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7024F)).mirror(false).texOffs(0, 8).mirror().addBox(2.878F, -5.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7024F)).mirror(false).texOffs(0, 0)
						.mirror().addBox(2.7805F, -5.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6537F)).mirror(false).texOffs(0, 0).mirror().addBox(2.7805F, -5.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6537F)).mirror(false),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = earings.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(0, 0).addBox(-9.0341F, -2.0F,
				-1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)), PartPose.offsetAndRotation(4.0049F, -4.3461F, 0.3487F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r2 = earings.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 4).mirror().addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(0, 4).addBox(-9.0341F, -2.0F,
				-1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)), PartPose.offsetAndRotation(4.0049F, -4.3582F, 0.3608F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r3 = earings.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(0, 0).addBox(-9.0341F, -2.0F,
				-1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)), PartPose.offsetAndRotation(4.0049F, -4.3461F, -0.3487F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r4 = earings.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(0, 0).addBox(-9.0341F, -2.0F,
				-1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)), PartPose.offsetAndRotation(4.0049F, -4.3582F, -0.3608F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r5 = earings.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false),
				PartPose.offsetAndRotation(4.0049F, -5.0534F, 0.3487F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r6 = earings.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(6, 2).addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).texOffs(0, 0).addBox(-9.0341F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)),
				PartPose.offsetAndRotation(4.0049F, -5.0534F, -0.3487F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r7 = earings.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.0244F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6537F)).mirror(false).texOffs(0, 0).mirror()
						.addBox(-1.0F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6537F)).mirror(false).texOffs(0, 8).mirror().addBox(-0.9268F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7024F)).mirror(false).texOffs(0, 8)
						.mirror().addBox(-0.9268F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7024F)).mirror(false).texOffs(0, 0).addBox(-8.561F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6537F)).texOffs(0, 0)
						.addBox(-8.5366F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6537F)).texOffs(0, 8).addBox(-8.6341F, -1.0F, -0.85F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7024F)).texOffs(0, 8)
						.addBox(-8.6341F, -1.0F, -1.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7024F)),
				PartPose.offsetAndRotation(3.7805F, -4.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r8 = earings.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(6, 6).mirror().addBox(-0.9756F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(6, 6).addBox(-9.0341F, -2.0F,
				-1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)), PartPose.offsetAndRotation(4.0049F, -5.0655F, -0.3608F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r9 = earings.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(0, 8).addBox(-9.1073F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)),
				PartPose.offsetAndRotation(4.0537F, -4.3975F, 0.4095F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r10 = earings.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(0, 8).addBox(-9.1073F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)),
				PartPose.offsetAndRotation(4.0537F, -4.3975F, -0.4095F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r11 = earings.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(0, 8).addBox(-9.1073F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)),
				PartPose.offsetAndRotation(4.0537F, -5.0167F, 0.4095F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r12 = earings.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)).mirror(false).texOffs(0, 8).addBox(-9.1073F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)),
				PartPose.offsetAndRotation(4.0537F, -5.0167F, -0.4095F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r13 = earings.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0244F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.9024F)),
				PartPose.offsetAndRotation(-4.0049F, -5.0655F, 0.3608F, 2.3562F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
