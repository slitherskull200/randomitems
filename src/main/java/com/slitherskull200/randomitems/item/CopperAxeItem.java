
package com.slitherskull200.randomitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.slitherskull200.randomitems.itemgroup.RandomItemsCopperItemGroup;
import com.slitherskull200.randomitems.RandomItemsModElements;

@RandomItemsModElements.ModElement.Tag
public class CopperAxeItem extends RandomItemsModElements.ModElement {
	@ObjectHolder("random_items:copper_axe")
	public static final Item block = null;
	public CopperAxeItem(RandomItemsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 100;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CopperIngotItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(RandomItemsCopperItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("copper_axe"));
	}
}
