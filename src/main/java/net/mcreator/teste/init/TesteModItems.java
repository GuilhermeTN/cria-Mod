
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teste.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.teste.item.GraphiteStickItem;
import net.mcreator.teste.item.GraphitePlateItem;
import net.mcreator.teste.item.GraphiteAmontoadoItem;
import net.mcreator.teste.item.AlicateItem;
import net.mcreator.teste.TesteMod;

public class TesteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TesteMod.MODID);
	public static final RegistryObject<Item> GRAPHITE_STICK = REGISTRY.register("graphite_stick", () -> new GraphiteStickItem());
	public static final RegistryObject<Item> GRAPHITE_PLATE = REGISTRY.register("graphite_plate", () -> new GraphitePlateItem());
	public static final RegistryObject<Item> ALICATE = REGISTRY.register("alicate", () -> new AlicateItem());
	public static final RegistryObject<Item> GRAPHITE_AMONTOADO = REGISTRY.register("graphite_amontoado", () -> new GraphiteAmontoadoItem());
	public static final RegistryObject<Item> PRENSA = block(TesteModBlocks.PRENSA);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
