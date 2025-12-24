// Made with Blockbench 5.0.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltop_hat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "top_hat"), "main");
	private final ModelPart Hats;
	private final ModelPart tophat;
	private final ModelPart bottom;
	private final ModelPart bottom_sides;
	private final ModelPart ribbon;
	private final ModelPart top;

	public Modeltop_hat(ModelPart root) {
		this.Hats = root.getChild("Hats");
		this.tophat = this.Hats.getChild("tophat");
		this.bottom = this.tophat.getChild("bottom");
		this.bottom_sides = this.bottom.getChild("bottom_sides");
		this.ribbon = this.bottom_sides.getChild("ribbon");
		this.top = this.ribbon.getChild("top");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Hats = partdefinition.addOrReplaceChild("Hats", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tophat = Hats.addOrReplaceChild("tophat", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.6F, -6.35F, -0.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition bottom = tophat.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 28).addBox(-5.5F,
				-0.75F, -4.5F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_sides = bottom.addOrReplaceChild("bottom_sides", CubeListBuilder.create(),
				PartPose.offset(0.5F, 0.25F, -0.5F));

		PartDefinition cube_r1 = bottom_sides.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(39, 23).addBox(-1.0F, -0.5001F, -5.0001F, 2.0F, 1.0002F, 10.0002F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(4.7326F, -0.8447F, 1.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r2 = bottom_sides.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(39, 35).addBox(-1.0F, -0.5001F, -5.0001F, 2.0F, 1.0002F, 10.0002F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(-6.7325F, -0.8446F, 1.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition ribbon = bottom_sides.addOrReplaceChild("ribbon", CubeListBuilder.create().texOffs(1, 39)
				.addBox(-5.75F, -3.25F, -3.25F, 9.0F, 2.5F, 8.5F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition top = ribbon.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 50).addBox(-5.0F,
				-7.0F, -3.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.3F)), PartPose.offset(-0.2F, -2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Hats.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}