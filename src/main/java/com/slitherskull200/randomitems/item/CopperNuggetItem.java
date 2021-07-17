
package com.slitherskull200.randomitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.slitherskull200.randomitems.itemgroup.RandomItemsCopperItemGroup;
import com.slitherskull200.randomitems.RandomItemsModElements;

@RandomItemsModElements.ModElement.Tag
public class CopperNuggetItem extends RandomItemsModElements.ModElement {
	@ObjectHolder("random_items:copper_nugget")
	public static final Item block = null;
	public CopperNuggetItem(RandomItemsModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RandomItemsCopperItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("copper_nugget");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
