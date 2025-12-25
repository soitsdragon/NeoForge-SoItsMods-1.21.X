/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.soitsdragon.soits_plushies.init;

import net.soitsdragon.soits_plushies.block.*;
import net.soitsdragon.soits_plushies.SoitsPlushiesMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class SoitsPlushiesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SoitsPlushiesMod.MODID);
	public static final DeferredBlock<Block> DRAGON_PLUSH;
	public static final DeferredBlock<Block> FLOOFY_PLUSH;
	public static final DeferredBlock<Block> KIKU_PLUSH;
	public static final DeferredBlock<Block> ADRI_PLUSH;
	public static final DeferredBlock<Block> LAVENDER_PLUSH;
	public static final DeferredBlock<Block> FLUFFY_PLUSH;
	public static final DeferredBlock<Block> SAZU_PLUSH;
	public static final DeferredBlock<Block> LUNI_PLUSH;
	public static final DeferredBlock<Block> RAVEN_PLUSH;
	public static final DeferredBlock<Block> ISO_LURA_PLUSH;
	static {
		DRAGON_PLUSH = REGISTRY.register("dragon_plush", DragonPlushBlock::new);
		FLOOFY_PLUSH = REGISTRY.register("floofy_plush", FloofyPlushBlock::new);
		KIKU_PLUSH = REGISTRY.register("kiku_plush", KikuPlushBlock::new);
		ADRI_PLUSH = REGISTRY.register("adri_plush", AdriPlushBlock::new);
		LAVENDER_PLUSH = REGISTRY.register("lavender_plush", LavenderPlushBlock::new);
		FLUFFY_PLUSH = REGISTRY.register("fluffy_plush", FluffyPlushBlock::new);
		SAZU_PLUSH = REGISTRY.register("sazu_plush", SazuPlushBlock::new);
		LUNI_PLUSH = REGISTRY.register("luni_plush", LuniPlushBlock::new);
		RAVEN_PLUSH = REGISTRY.register("raven_plush", RavenPlushBlock::new);
		ISO_LURA_PLUSH = REGISTRY.register("iso_lura_plush", IsoLuraPlushBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}