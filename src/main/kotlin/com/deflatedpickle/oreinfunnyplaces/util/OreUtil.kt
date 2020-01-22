package com.deflatedpickle.oreinfunnyplaces.util

import net.minecraft.item.ItemBlock
import net.minecraftforge.oredict.OreDictionary

object OreUtil {
    fun scourOreDictionary() {
        for (i in OreDictionary.getOreNames()) {
            if (i.startsWith("ore")) {
                val oreList = OreDictionary.getOres(i).map { it.item as ItemBlock }

                if (oreList.isNotEmpty()) {
                    OreType.values().forEach { ore ->
                        RegistryUtil.registerOre(
                                origin = oreList.first(),
                                oreType = ore
                        )
                    }
                }
            }
        }
    }
}