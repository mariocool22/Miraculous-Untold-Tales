package net.mcreator.miraculousuntoldtales.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class TransformationCheckerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (true) {
			OpenMiracChooseProcedure.execute(world, x, y, z, entity);
		}
	}
}
