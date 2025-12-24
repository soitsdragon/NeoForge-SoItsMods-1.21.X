package net.soitsdragon.soitsmods.init;

import net.soitsdragon.soitsmods.recipe.DragonsHatsRecipe;
import net.soitsdragon.soitsmods.integration.jei.DragonsHatsJeiCategory;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;

@JeiPlugin
public class SoitsmodsModJeiPlugin implements IModPlugin {
	public static RecipeType<RecipeHolder<DragonsHatsRecipe>> DragonsHatsCategoryType = new RecipeType<>(DragonsHatsJeiCategory.UID, (Class<RecipeHolder<DragonsHatsRecipe>>) (Class<?>) DragonsHatsRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("soitsmods:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new DragonsHatsJeiCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		registration.addRecipes(DragonsHatsCategoryType, recipeManager.getAllRecipesFor(DragonsHatsRecipe.Type.INSTANCE));
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(SoitsmodsModItems.SANTA_HAT_HELMET.get()), DragonsHatsCategoryType);
		registration.addRecipeCatalyst(new ItemStack(SoitsmodsModItems.TOP_HAT_HELMET.get()), DragonsHatsCategoryType);
	}

	@Override
	public void registerGuiHandlers(IGuiHandlerRegistration registration) {
	}
}