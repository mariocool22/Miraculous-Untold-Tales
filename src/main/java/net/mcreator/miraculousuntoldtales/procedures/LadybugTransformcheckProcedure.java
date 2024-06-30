package net.mcreator.miraculousuntoldtales.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.miraculousuntoldtales.network.MiraculousUntoldTalesModVariables;

public class LadybugTransformcheckProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(MiraculousUntoldTalesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MiraculousUntoldTalesModVariables.PlayerVariables())).Ladybug_Suits).equals("Ladybug")) {
		}
	}
}
