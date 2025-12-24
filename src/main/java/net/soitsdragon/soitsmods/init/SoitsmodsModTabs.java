/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.soitsdragon.soitsmods.init;

import net.soitsdragon.soitsmods.SoitsmodsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class SoitsmodsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoitsmodsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DRAGONS_MOD = REGISTRY.register("dragons_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.soitsmods.dragons_mod")).icon(() -> new ItemStack(SoitsmodsModItems.SANTA_HAT_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SoitsmodsModItems.SANTA_HAT_HELMET.get());
				tabData.accept(SoitsmodsModItems.TOP_HAT_HELMET.get());
				tabData.accept(SoitsmodsModBlocks.DRAGON_PLUSH.get().asItem());
				tabData.accept(SoitsmodsModBlocks.FLOOFY_PLUSH.get().asItem());
			}).withSearchBar().build());
}