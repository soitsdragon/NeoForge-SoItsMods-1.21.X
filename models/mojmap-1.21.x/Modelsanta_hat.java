// Made with Blockbench 5.0.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsanta_hat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "modelsanta_hat"), "main");
	private final ModelPart santahat;
	private final ModelPart hat;
	private final ModelPart redpart;
	private final ModelPart middlepart;
	private final ModelPart theupperpart;
	private final ModelPart Player;
	private final ModelPart Head;

	public Modelsanta_hat(ModelPart root) {
		this.santahat = root.getChild("santahat");
		this.hat = this.santahat.getChild("hat");
		this.redpart = this.hat.getChild("redpart");
		this.middlepart = this.hat.getChild("middlepart");
		this.theupperpart = this.middlepart.getChild("theupperpart");
		this.Player = root.getChild("Player");
		this.Head = this.Player.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition santahat = partdefinition.addOrReplaceChild("santahat", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hat = santahat.addOrReplaceChild("hat", CubeListBuilder.create(),
				PartPose.offset(-1.6F, -1.1F, -0.5F));

		PartDefinition border_r1 = hat
				.addOrReplaceChild("border_r1",
						CubeListBuilder.create().texOffs(0, 37).addBox(-6.0F, -7.0F, -5.0F, 11.0F, 2.0F, 11.0F,
								new CubeDeformation(0.4F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition redpart = hat.addOrReplaceChild("redpart", CubeListBuilder.create(),
				PartPose.offset(4.5F, -2.1F, -11.5F));

		PartDefinition base_r1 = redpart.addOrReplaceChild("base_r1",
				CubeListBuilder.create().texOffs(0, 51).addBox(-5.5F, -10.0F, -4.5F, 10.0F, 3.0F, 10.0F,
						new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-4.5F, 2.1F, 11.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition middlepart = hat.addOrReplaceChild("middlepart", CubeListBuilder.create(),
				PartPose.offset(6.0F, -6.1F, -10.0F));

		PartDefinition theupperpart = middlepart.addOrReplaceChild("theupperpart", CubeListBuilder.create(),
				PartPose.offset(1.5F, -4.0F, 1.5F));

		PartDefinition snowball_r1 = theupperpart.addOrReplaceChild(
				"snowball_r1", CubeListBuilder.create().texOffs(36, 39).addBox(-2.5502F, -2.4665F, -2.25F, 3.5F, 3.5F,
						3.5F, new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(2.5F, 9.1F, 9.5F, 0.0F, 0.0F, 0.3927F));

		PartDefinition tophang_r1 = theupperpart.addOrReplaceChild("tophang_r1",
				CubeListBuilder.create().texOffs(32, 51).addBox(14.0F, -6.0F, -9.0F, 11.0F, 4.0F, 5.0F,
						new CubeDeformation(0.4F)),
				PartPose.offsetAndRotation(-18.5F, -8.9F, 15.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition Player = partdefinition.addOrReplaceChild("Player", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = Player.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		santahat.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Player.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}