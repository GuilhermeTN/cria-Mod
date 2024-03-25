
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.teste.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.teste.world.inventory.PrensainterfaceMenu;
import net.mcreator.teste.TesteMod;

public class TesteModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TesteMod.MODID);
	public static final RegistryObject<MenuType<PrensainterfaceMenu>> PRENSAINTERFACE = REGISTRY.register("prensainterface", () -> IForgeMenuType.create(PrensainterfaceMenu::new));
}
