/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.soitsdragon.soits_plushies.init;

import net.soitsdragon.soits_plushies.SoitsPlushiesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class SoitsPlushiesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SoitsPlushiesMod.MODID);
	public static final DeferredItem<Item> DRAGON_PLUSH;
	public static final DeferredItem<Item> FLOOFY_PLUSH;
	public static final DeferredItem<Item> KIKU_PLUSH;
	public static final DeferredItem<Item> ADRI_PLUSH;
	public static final DeferredItem<Item> LAVENDER_PLUSH;
	public static final DeferredItem<Item> FLUFFY_PLUSH;
	public static final DeferredItem<Item> SAZU_PLUSH;
	public static final DeferredItem<Item> LUNI_PLUSH;
	public static final DeferredItem<Item> RAVEN_PLUSH;
	public static final DeferredItem<Item> ISO_LURA_PLUSH;
	static {
		DRAGON_PLUSH = block(SoitsPlushiesModBlocks.DRAGON_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		FLOOFY_PLUSH = block(SoitsPlushiesModBlocks.FLOOFY_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		KIKU_PLUSH = block(SoitsPlushiesModBlocks.KIKU_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		ADRI_PLUSH = block(SoitsPlushiesModBlocks.ADRI_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		LAVENDER_PLUSH = block(SoitsPlushiesModBlocks.LAVENDER_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		FLUFFY_PLUSH = block(SoitsPlushiesModBlocks.FLUFFY_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		SAZU_PLUSH = block(SoitsPlushiesModBlocks.SAZU_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		LUNI_PLUSH = block(SoitsPlushiesModBlocks.LUNI_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		RAVEN_PLUSH = block(SoitsPlushiesModBlocks.RAVEN_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
		ISO_LURA_PLUSH = block(SoitsPlushiesModBlocks.ISO_LURA_PLUSH, new Item.Properties().rarity(Rarity.RARE).fireResistant());
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