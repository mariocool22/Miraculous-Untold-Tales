package net.mcreator.miraculousuntoldtales.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.miraculousuntoldtales.network.MiraculousUntoldTalesModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class SelectMainMiraculousProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "Miraculous")).equals("ladybug")) {
			{
				String _setval = "ladybug";
				entity.getCapability(MiraculousUntoldTalesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Main_Miraculous = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("select a valid entry"), false);
		}
	}
}
