
package net.mcreator.miraculousuntoldtales.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.miraculousuntoldtales.procedures.LbActivetocamoProcedure;

public class LadybugMiraculousItem extends Item {
	public LadybugMiraculousItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		LbActivetocamoProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
