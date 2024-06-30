package net.mcreator.miraculousuntoldtales.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.miraculousuntoldtales.network.MiraculousUntoldTalesModVariables;

public class TransformationCheckerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(MiraculousUntoldTalesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new MiraculousUntoldTalesModVariables.PlayerVariables())).Main_Miraculous).equals("ladybug")) {
			OpenMiracChooseProcedure.execute(world, x, y, z, entity);
		}
	}
}
