/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.soitsdragon.soitsmods.init;

import net.soitsdragon.soitsmods.item.TopHatItem;
import net.soitsdragon.soitsmods.item.SantaHatItem;
import net.soitsdragon.soitsmods.SoitsmodsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class SoitsmodsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SoitsmodsMod.MODID);
	public static final DeferredItem<Item> SANTA_HAT_HELMET;
	public static final DeferredItem<Item> TOP_HAT_HELMET;
	public static final DeferredItem<Item> DRAGON_PLUSH;
	public static final DeferredItem<Item> FLOOFY_PLUSH;
	public static final DeferredItem<Item> KIKU_PLUSH;
	public static final DeferredItem<Item> ADRI_PLUSH;
	public static final DeferredItem<Item> LAVENDER_PLUSH;
	public static final DeferredItem<Item> FLUFFY_PLUSH;
	static {
		SANTA_HAT_HELMET = REGISTRY.register("santa_hat_helmet", SantaHatItem.Helmet::new);
		TOP_HAT_HELMET = REGISTRY.register("top_hat_helmet", TopHatItem.Helmet::new);
		DRAGON_PLUSH = block(SoitsmodsModBlocks.DRAGON_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		FLOOFY_PLUSH = block(SoitsmodsModBlocks.FLOOFY_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		KIKU_PLUSH = block(SoitsmodsModBlocks.KIKU_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		ADRI_PLUSH = block(SoitsmodsModBlocks.ADRI_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		LAVENDER_PLUSH = block(SoitsmodsModBlocks.LAVENDER_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		FLUFFY_PLUSH = block(SoitsmodsModBlocks.FLUFFY_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}