
package net.mcreator.miraculousuntoldtales.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.miraculousuntoldtales.procedures.LadybugmiraculousmaricamoBaubleIsEquippedProcedure;

public class LadybugmiraculousmaricamoItem extends Item implements ICurioItem {
	public LadybugmiraculousmaricamoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		LadybugmiraculousmaricamoBaubleIsEquippedProcedure.execute(slotContext.entity());
	}
}
