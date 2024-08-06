
package net.mcreator.miraculousuntoldtales.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ButterflymiraculouscamogabItem extends Item implements ICurioItem {
	public ButterflymiraculouscamogabItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
