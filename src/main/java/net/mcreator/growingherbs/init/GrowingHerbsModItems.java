/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.growingherbs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.growingherbs.item.*;
import net.mcreator.growingherbs.GrowingHerbsMod;

import java.util.function.Function;

public class GrowingHerbsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GrowingHerbsMod.MODID);
	public static final DeferredItem<Item> WEED;
	public static final DeferredItem<Item> ROLLINGPAPERS;
	public static final DeferredItem<Item> JOINT;
	public static final DeferredItem<Item> BUD;
	public static final DeferredItem<Item> WEEDSEEDS;
	public static final DeferredItem<Item> WEEDPLANT;
	public static final DeferredItem<Item> LIGHTER;
	public static final DeferredItem<Item> BONG;
	public static final DeferredItem<Item> PET;
	public static final DeferredItem<Item> DIRTYPET;
	public static final DeferredItem<Item> COOKIES;
	public static final DeferredItem<Item> DOUGH;
	static {
		WEED = register("weed", WeedItem::new);
		ROLLINGPAPERS = register("rollingpapers", RollingpapersItem::new);
		JOINT = register("joint", JointItem::new);
		BUD = register("bud", BudItem::new);
		WEEDSEEDS = register("weedseeds", WeedseedsItem::new);
		WEEDPLANT = block(GrowingHerbsModBlocks.WEEDPLANT);
		LIGHTER = register("lighter", LighterItem::new);
		BONG = register("bong", BongItem::new);
		PET = register("pet", PETItem::new);
		DIRTYPET = register("dirtypet", DirtypetItem::new);
		COOKIES = register("cookies", CookiesItem::new);
		DOUGH = register("dough", DoughItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}