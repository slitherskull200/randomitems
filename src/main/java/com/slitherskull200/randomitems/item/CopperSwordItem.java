
package com.slitherskull200.randomitems.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.slitherskull200.randomitems.itemgroup.RandomItemsCopperItemGroup;
import com.slitherskull200.randomitems.RandomItemsModElements;

@RandomItemsModElements.ModElement.Tag
public class CopperSwordItem extends RandomItemsModElements.ModElement {
	@ObjectHolder("random_items:copper_sword")
	public static final Item block = null;
	public CopperSwordItem(RandomItemsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 500;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 7f;
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
		}, 3, -2f, new Item.Properties().group(RandomItemsCopperItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("copper_sword"));
	}
}
