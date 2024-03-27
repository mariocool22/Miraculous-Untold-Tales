package net.mcreator.miraculousuntoldtales.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.miraculousuntoldtales.network.MiraculousUntoldTalesModVariables;
import net.mcreator.miraculousuntoldtales.init.MiraculousUntoldTalesModItems;

public class LbActivetocamoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double previousRecipe = 0;
		if (((entity.getCapability(MiraculousUntoldTalesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MiraculousUntoldTalesModVariables.PlayerVariables())).ladybug_camos).equals("Mari")) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MiraculousUntoldTalesModItems.LADYBUG_MIRACULOUS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "curios replace ears 0 @p with miraculous_untold_tales:ladybugmiraculousmaricamo 1");
				}
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Please select a Camoflauge for this miraculous in /menu!"), true);
		}
	}
}
