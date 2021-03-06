
package net.mcreator.galacticfactorycore.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.galacticfactorycore.itemgroup.GalacticFactoryCoreItemGroup;
import net.mcreator.galacticfactorycore.GalacticfactorycoreModElements;

@GalacticfactorycoreModElements.ModElement.Tag
public class AntimatterOrbItem extends GalacticfactorycoreModElements.ModElement {
	@ObjectHolder("galacticfactorycore:antimatter_orb")
	public static final Item block = null;

	public AntimatterOrbItem(GalacticfactorycoreModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GalacticFactoryCoreItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("antimatter_orb");
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
