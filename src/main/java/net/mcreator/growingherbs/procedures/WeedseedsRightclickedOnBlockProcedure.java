package net.mcreator.growingherbs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.growingherbs.init.GrowingHerbsModBlocks;

public class WeedseedsRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		world.setBlock(BlockPos.containing(x, y + 1, z), GrowingHerbsModBlocks.WEEDPLANT.get().defaultBlockState(), 3);
		itemstack.shrink(1);
	}
}