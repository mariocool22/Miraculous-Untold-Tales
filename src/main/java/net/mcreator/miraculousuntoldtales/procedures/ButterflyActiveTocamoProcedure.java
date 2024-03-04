package net.mcreator.miraculousuntoldtales.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.miraculousuntoldtales.network.MiraculousUntoldTalesModVariables;
import net.mcreator.miraculousuntoldtales.init.MiraculousUntoldTalesModItems;

public class ButterflyActiveTocamoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(MiraculousUntoldTalesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MiraculousUntoldTalesModVariables.PlayerVariables())).Butterfly_camos).equals("Gab")) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MiraculousUntoldTalesModItems.BUTTERFLY_MIRACULOUS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MiraculousUntoldTalesModItems.BUTTERFLYMIRACULOUSCAMOGAB.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Please select a camo through /Menu!"), true);
		}
	}
}
