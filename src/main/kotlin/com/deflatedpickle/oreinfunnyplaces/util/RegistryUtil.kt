package com.deflatedpickle.oreinfunnyplaces.util

import com.deflatedpickle.oreinfunnyplaces.OreInFunnyPlaces
import com.deflatedpickle.oreinfunnyplaces.common.block.BlockOre
import com.deflatedpickle.oreinfunnyplaces.common.item.ItemOre
import net.minecraft.item.ItemBlock
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.registry.ForgeRegistries
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.oredict.OreDictionary

object RegistryUtil {
    fun registerOre(origin: ItemBlock, oreType: OreType) {
        val drop = origin.block.getItemDropped(origin.block.defaultState, null, 0)

        val block = BlockOre(drop, oreType)
        val item = ItemOre(drop, oreType, block)
        block.drop = drop

        ForgeRegistries.BLOCKS.register(block)
        ForgeRegistries.ITEMS.register(item)

        OreInFunnyPlaces.proxy.registerModel(item, block)
        OreInFunnyPlaces.oreList.add(item)

        OreDictionary.registerOre("block.$oreType.$this", item)
        OreDictionary.registerOre("item.$oreType.$this", item)

        GameRegistry.addSmelting(block, ItemStack(item), 0.5f)
    }
}