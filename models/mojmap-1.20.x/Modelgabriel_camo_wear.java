// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgabriel_camo_wear<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gabriel_camo_wear"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightArm;

	public Modelgabriel_camo_wear(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = Body.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(30, 0)
				.addBox(-1.5341F, 0.4146F, -2.4146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).texOffs(30, 2)
				.addBox(-1.4366F, 0.2439F, -2.439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2744F)).texOffs(12, 30)
				.addBox(-1.4366F, 0.5854F, -2.439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2744F)).texOffs(30, 0)
				.mirror().addBox(-1.339F, 0.4146F, -2.4146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.mirror(false).texOffs(0, 6)
				.addBox(-1.4366F, 0.5854F, -2.3415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2256F)).texOffs(0, 16)
				.addBox(-1.4366F, 0.2439F, -2.3415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2256F)).texOffs(22, 16)
				.addBox(-1.5341F, 0.4146F, -2.3415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2012F)).texOffs(22, 16)
				.mirror().addBox(-1.339F, 0.4146F, -2.3415F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2012F))
				.mirror(false), PartPose.offset(0.9366F, 0.8841F, 0.0244F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 20).mirror()
						.addBox(-0.378F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4207F)).mirror(false),
				PartPose.offsetAndRotation(-0.7654F, 1.1697F, -2.061F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(3, 1).mirror()
						.addBox(-0.378F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4207F)).mirror(false),
				PartPose.offsetAndRotation(-0.7453F, 1.1448F, -2.061F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(3, 5).mirror()
						.addBox(-0.4878F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4207F)).mirror(false),
				PartPose.offsetAndRotation(-0.6798F, 0.5718F, -2.061F, 0.0F, 0.0F, 0.8727F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 18).mirror()
						.addBox(-0.4878F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4207F)).mirror(false),
				PartPose.offsetAndRotation(-0.6598F, 0.5967F, -2.061F, 0.0F, 0.0F, 0.8727F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(27, 3).mirror()
						.addBox(-0.5122F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4207F)).mirror(false),
				PartPose.offsetAndRotation(-0.7129F, 0.6393F, -2.0854F, 0.0F, 0.0F, 0.8727F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(3, 1).addBox(-0.622F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.4207F)),
				PartPose.offsetAndRotation(-1.1278F, 1.1448F, -2.061F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 20).addBox(-0.622F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.4207F)),
				PartPose.offsetAndRotation(-1.1078F, 1.1697F, -2.061F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(3, 5).addBox(-0.5122F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.4207F)),
				PartPose.offsetAndRotation(-1.1934F, 0.5718F, -2.061F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 18).addBox(-0.5122F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.4207F)),
				PartPose.offsetAndRotation(-1.2134F, 0.5967F, -2.061F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(24, 2).mirror()
						.addBox(-0.5F, -0.5244F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4207F)).mirror(false),
				PartPose.offsetAndRotation(-0.7164F, 1.1931F, -2.0854F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(27, 5).mirror()
						.addBox(-0.4878F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4207F)).mirror(false),
				PartPose.offsetAndRotation(-0.7085F, 0.6455F, -2.0854F, 0.0F, 0.0F, 0.8727F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(24, 2).addBox(-0.5F, -0.5244F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.4207F)),
				PartPose.offsetAndRotation(-1.1568F, 1.1931F, -2.0854F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(24, 4).mirror()
						.addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4207F)).mirror(false),
				PartPose.offsetAndRotation(-0.7207F, 1.1993F, -2.0854F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(27, 5).addBox(-0.5122F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.4207F)),
				PartPose.offsetAndRotation(-1.1646F, 0.6455F, -2.0854F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(24, 4).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.4207F)),
				PartPose.offsetAndRotation(-1.1524F, 1.1993F, -2.0854F, 0.0F, 0.0F, -0.6981F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(27, 3).addBox(-0.4878F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(-0.4207F)),
				PartPose.offsetAndRotation(-1.1603F, 0.6393F, -2.0854F, 0.0F, 0.0F, -0.8727F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}