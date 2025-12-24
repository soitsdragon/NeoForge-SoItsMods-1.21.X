/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.soitsdragon.soitsmods.init;

import net.soitsdragon.soitsmods.block.FloofyPlushBlock;
import net.soitsdragon.soitsmods.block.DragonPlushBlock;
import net.soitsdragon.soitsmods.SoitsmodsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

public class SoitsmodsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SoitsmodsMod.MODID);
	public static final DeferredBlock<Block> DRAGON_PLUSH;
	public static final DeferredBlock<Block> FLOOFY_PLUSH;
	static {
		DRAGON_PLUSH = REGISTRY.register("dragon_plush", DragonPlushBlock::new);
		FLOOFY_PLUSH = REGISTRY.register("floofy_plush", FloofyPlushBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}