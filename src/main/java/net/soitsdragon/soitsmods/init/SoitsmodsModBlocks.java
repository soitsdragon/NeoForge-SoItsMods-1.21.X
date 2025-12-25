/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.soitsdragon.soitsmods.init;

import net.soitsdragon.soitsmods.block.*;
import net.soitsdragon.soitsmods.SoitsmodsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class SoitsmodsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SoitsmodsMod.MODID);
	public static final DeferredBlock<Block> DRAGON_PLUSH;
	public static final DeferredBlock<Block> FLOOFY_PLUSH;
	public static final DeferredBlock<Block> KIKU_PLUSH;
	public static final DeferredBlock<Block> ADRI_PLUSH;
	public static final DeferredBlock<Block> LAVENDER_PLUSH;
	public static final DeferredBlock<Block> FLUFFY_PLUSH;
	static {
		DRAGON_PLUSH = REGISTRY.register("dragon_plush", DragonPlushBlock::new);
		FLOOFY_PLUSH = REGISTRY.register("floofy_plush", FloofyPlushBlock::new);
		KIKU_PLUSH = REGISTRY.register("kiku_plush", KikuPlushBlock::new);
		ADRI_PLUSH = REGISTRY.register("adri_plush", AdriPlushBlock::new);
		LAVENDER_PLUSH = REGISTRY.register("lavender_plush", LavenderPlushBlock::new);
		FLUFFY_PLUSH = REGISTRY.register("fluffy_plush", FluffyPlushBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}