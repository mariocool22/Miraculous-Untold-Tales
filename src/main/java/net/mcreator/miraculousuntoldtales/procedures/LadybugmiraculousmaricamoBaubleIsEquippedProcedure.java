package net.mcreator.miraculousuntoldtales.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.miraculousuntoldtales.network.MiraculousUntoldTalesModVariables;
import net.mcreator.miraculousuntoldtales.init.MiraculousUntoldTalesModItems;

public class LadybugmiraculousmaricamoBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((!entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MiraculousUntoldTalesModItems.CAT_MIRACULOUSCAMO_ADRIAN.get(), lv).isPresent() : false)
				|| (!entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(MiraculousUntoldTalesModItems.BUTTERFLYMIRACULOUSCAMOGAB.get(), lv).isPresent() : false)) {
			{
				String _setval = "ladybug";
				entity.getCapability(MiraculousUntoldTalesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Main_Miraculous = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
