/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.soitsdragon.soits_plushies.init;

import net.soitsdragon.soits_plushies.SoitsPlushiesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class SoitsPlushiesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoitsPlushiesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SO_ITS_PLUSHIES = REGISTRY.register("so_its_plushies",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.soits_plushies.so_its_plushies")).icon(() -> new ItemStack(SoitsPlushiesModBlocks.DRAGON_PLUSH.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SoitsPlushiesModBlocks.DRAGON_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.FLOOFY_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.KIKU_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.ADRI_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.LAVENDER_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.FLUFFY_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.SAZU_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.LUNI_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.RAVEN_PLUSH.get().asItem());
				tabData.accept(SoitsPlushiesModBlocks.ISO_LURA_PLUSH.get().asItem());
			}).withSearchBar().build());
}