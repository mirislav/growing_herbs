/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.growingherbs.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.growingherbs.GrowingHerbsMod;

@EventBusSubscriber
public class GrowingHerbsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GrowingHerbsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(GrowingHerbsModItems.WEED.get());
			tabData.accept(GrowingHerbsModItems.BUD.get());
			tabData.accept(GrowingHerbsModBlocks.WEEDPLANT.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(GrowingHerbsModItems.ROLLINGPAPERS.get());
			tabData.accept(GrowingHerbsModItems.WEEDSEEDS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GrowingHerbsModItems.LIGHTER.get());
			tabData.accept(GrowingHerbsModItems.BONG.get());
			tabData.accept(GrowingHerbsModItems.PET.get());
			tabData.accept(GrowingHerbsModItems.DIRTYPET.get());
		}
	}
}