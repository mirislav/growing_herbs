/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.growingherbs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.growingherbs.block.WeedplantBlock;
import net.mcreator.growingherbs.GrowingHerbsMod;

import java.util.function.Function;

public class GrowingHerbsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(GrowingHerbsMod.MODID);
	public static final DeferredBlock<Block> WEEDPLANT;
	static {
		WEEDPLANT = register("weedplant", WeedplantBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}