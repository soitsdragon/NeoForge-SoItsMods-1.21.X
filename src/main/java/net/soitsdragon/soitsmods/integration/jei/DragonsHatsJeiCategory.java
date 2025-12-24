package net.soitsdragon.soitsmods.integration.jei;

import net.soitsdragon.soitsmods.recipe.RecipeUtils;
import net.soitsdragon.soitsmods.recipe.DragonsHatsRecipe;
import net.soitsdragon.soitsmods.init.SoitsmodsModJeiPlugin;
import net.soitsdragon.soitsmods.init.SoitsmodsModItems;

import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.GuiGraphics;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class DragonsHatsJeiCategory implements IRecipeCategory<RecipeHolder<DragonsHatsRecipe>> {
	public static final ResourceLocation UID = ResourceLocation.parse("soitsmods:dragons_hats");
	public static final ResourceLocation TEXTURE = ResourceLocation.parse("soitsmods:textures/screens/dragonskin.png");
	private final IDrawable background;
	private final IDrawable icon;

	public DragonsHatsJeiCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 16, 16);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(SoitsmodsModItems.SANTA_HAT_HELMET.get()));
	}

	@Override
	public RecipeType<RecipeHolder<DragonsHatsRecipe>> getRecipeType() {
		return SoitsmodsModJeiPlugin.DragonsHatsCategoryType;
	}

	@Override
	public Component getTitle() {
		return Component.translatable("jei.soitsmods.dragons_hats");
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public int getWidth() {
		return this.background.getWidth();
	}

	@Override
	public int getHeight() {
		return this.background.getHeight();
	}

	@Override
	public void draw(RecipeHolder<DragonsHatsRecipe> recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
		this.background.draw(guiGraphics);
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, RecipeHolder<DragonsHatsRecipe> recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 0, 0).addIngredients(VanillaTypes.ITEM_STACK, RecipeUtils.getItemStacks(recipe.value().santa_hatItemInput()));
		builder.addSlot(RecipeIngredientRole.INPUT, 0, 0).addIngredients(VanillaTypes.ITEM_STACK, RecipeUtils.getItemStacks(recipe.value().top_hatItemInput()));
	}
}