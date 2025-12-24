package net.soitsdragon.soitsmods.init;

import net.soitsdragon.soitsmods.recipe.DragonsHatsRecipe;
import net.soitsdragon.soitsmods.SoitsmodsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber(modid = SoitsmodsMod.MODID)
public class SoitsmodsModRecipeTypes {
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, "soitsmods");
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, "soitsmods");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = ModList.get().getModContainerById("soitsmods").get().getEventBus();
		event.enqueueWork(() -> {
			RECIPE_TYPES.register(bus);
			SERIALIZERS.register(bus);
			// Recipe Types
			RECIPE_TYPES.register("dragons_hats", () -> DragonsHatsRecipe.Type.INSTANCE);
			// Recipe Serializer
			SERIALIZERS.register("dragons_hats", () -> DragonsHatsRecipe.Serializer.INSTANCE);
		});
	}
}