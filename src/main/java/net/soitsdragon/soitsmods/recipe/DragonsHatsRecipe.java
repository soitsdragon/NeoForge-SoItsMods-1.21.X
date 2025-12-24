package net.soitsdragon.soitsmods.recipe;

import org.jetbrains.annotations.NotNull;

import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.NonNullList;
import net.minecraft.core.HolderLookup;

import javax.annotation.Nonnull;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.MapCodec;

public record DragonsHatsRecipe(Ingredient santa_hatItemInput, SizedIngredient top_hatItemInput) implements Recipe<RecipeInput> {
	public @NotNull ItemStack getItemStackResult(String output) {
		return ItemStack.EMPTY;
	}

	public @NotNull FluidStack getFluidStackResult(String output) {
		return FluidStack.EMPTY;
	}

	public @NotNull boolean getBooleanResult(String output) {
		return false;
	}

	public @NotNull double getDoubleResult(String output) {
		return 0.0d;
	}

	public @NotNull String getStringResult(String output) {
		return "";
	}

	public static class Type implements RecipeType<DragonsHatsRecipe> {
		private Type() {
		}

		public static final RecipeType<DragonsHatsRecipe> INSTANCE = new Type();
	}

	public static class Serializer implements RecipeSerializer<DragonsHatsRecipe> {
		public static final Serializer INSTANCE = new Serializer();
		public final MapCodec<DragonsHatsRecipe> CODEC = RecordCodecBuilder
				.mapCodec(instance -> instance.group(Ingredient.CODEC.fieldOf("santa_hat").forGetter(DragonsHatsRecipe::santa_hatItemInput), SizedIngredient.FLAT_CODEC.fieldOf("top_hat").forGetter(DragonsHatsRecipe::top_hatItemInput)).apply(instance,
						Serializer::createDragonsHatsRecipe));
		private static final StreamCodec<RegistryFriendlyByteBuf, DragonsHatsRecipe> STREAM_CODEC = StreamCodec.of(Serializer::write, Serializer::read);

		@Override
		public @NotNull MapCodec<DragonsHatsRecipe> codec() {
			return CODEC;
		}

		@Override
		public @NotNull StreamCodec<RegistryFriendlyByteBuf, DragonsHatsRecipe> streamCodec() {
			return STREAM_CODEC;
		}

		private static DragonsHatsRecipe read(RegistryFriendlyByteBuf buffer) {
			Ingredient santa_hatItemInput = Ingredient.CONTENTS_STREAM_CODEC.decode(buffer);
			SizedIngredient top_hatItemInput = SizedIngredient.STREAM_CODEC.decode(buffer);
			return new DragonsHatsRecipe(santa_hatItemInput, top_hatItemInput);
		}

		private static void write(RegistryFriendlyByteBuf buffer, DragonsHatsRecipe recipe) {
			Ingredient.CONTENTS_STREAM_CODEC.encode(buffer, recipe.santa_hatItemInput());
			SizedIngredient.STREAM_CODEC.encode(buffer, recipe.top_hatItemInput());
		}

		static DragonsHatsRecipe createDragonsHatsRecipe(Ingredient santa_hatItemInput, SizedIngredient top_hatItemInput) {
			return new DragonsHatsRecipe(santa_hatItemInput, top_hatItemInput);
		}
	}

	// Unused
	@Override
	public @NotNull RecipeSerializer<?> getSerializer() {
		return Serializer.INSTANCE;
	}

	// Unused
	@Override
	public @NotNull RecipeType<?> getType() {
		return Type.INSTANCE;
	}

	// Unused
	@Override
	public @Nonnull NonNullList<Ingredient> getIngredients() {
		return NonNullList.withSize(1, Ingredient.EMPTY);
	}

	// Unused
	@Override
	public boolean matches(@NotNull RecipeInput pContainer, @NotNull Level Level) {
		return false;
	}

	// Unused
	@Override
	public boolean canCraftInDimensions(int pWidth, int pHeight) {
		return true;
	}

	// Unused
	@Override
	public @NotNull ItemStack getResultItem(HolderLookup.Provider provider) {
		return ItemStack.EMPTY;
	}

	// Unused
	@Override
	public ItemStack assemble(@NotNull RecipeInput input, @NotNull HolderLookup.Provider holder) {
		return ItemStack.EMPTY;
	}
}