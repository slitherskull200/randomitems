
package com.slitherskull200.randomitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.slitherskull200.randomitems.itemgroup.RandomItemsCopperItemGroup;
import com.slitherskull200.randomitems.RandomItemsModElements;

@RandomItemsModElements.ModElement.Tag
public class CopperShovelItem extends RandomItemsModElements.ModElement {
	@ObjectHolder("random_items:copper_shovel")
	public static final Item block = null;
	public CopperShovelItem(RandomItemsModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 101;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperIngotItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(RandomItemsCopperItemGroup.tab)) {
		}.setRegistryName("copper_shovel"));
	}
}
