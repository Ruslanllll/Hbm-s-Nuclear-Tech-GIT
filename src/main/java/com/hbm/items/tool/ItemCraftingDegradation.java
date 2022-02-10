package com.hbm.items.tool;

import com.hbm.lib.RefStrings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCraftingDegradation extends Item {
	
	public ItemCraftingDegradation(int durability) {
		this.setMaxStackSize(1);
		this.setMaxDamage(durability);
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		if(this.getMaxDamage() > 0) {
			stack.setItemDamage(stack.getItemDamage() + 1);
			return stack;
			
		} else {
			return stack;
		}
	}
	
	@Override
	public Item setUnlocalizedName(String unlocalizedName) {
		super.setUnlocalizedName(unlocalizedName);
		this.setTextureName(RefStrings.MODID + ":"+ unlocalizedName);
		return this;
	}
}