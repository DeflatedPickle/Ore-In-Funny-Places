package com.deflatedpickle.oreinfunnyplaces.common.item

import com.deflatedpickle.oreinfunnyplaces.Reference
import com.deflatedpickle.oreinfunnyplaces.util.OreType
import net.minecraft.block.Block
import net.minecraft.client.resources.I18n
import net.minecraft.item.Item
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack
import net.minecraft.util.ResourceLocation

class ItemOre(val base: Item, val type: OreType, block: Block) : ItemBlock(block) {
    init {
        registryName = ResourceLocation(Reference.MOD_ID, "${base.translationKey}.${type.name.toLowerCase()}.item")
    }

    override fun getItemStackDisplayName(stack: ItemStack): String = "${I18n.format("oreinfunnyplaces:prefix.${type.name.toLowerCase()}")} ${I18n.format(base.getItemStackDisplayName(ItemStack(base)))}"
}