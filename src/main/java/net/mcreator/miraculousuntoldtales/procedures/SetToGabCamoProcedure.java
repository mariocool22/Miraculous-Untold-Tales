package net.mcreator.miraculousuntoldtales.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.miraculousuntoldtales.network.MiraculousUntoldTalesModVariables;

public class SetToGabCamoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Gab";
			entity.getCapability(MiraculousUntoldTalesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Butterfly_camos = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
