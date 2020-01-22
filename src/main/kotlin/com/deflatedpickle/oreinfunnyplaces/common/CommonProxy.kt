package com.deflatedpickle.oreinfunnyplaces.common

import com.deflatedpickle.oreinfunnyplaces.common.block.BlockOre
import com.deflatedpickle.oreinfunnyplaces.common.item.ItemOre
import com.deflatedpickle.oreinfunnyplaces.util.OreUtil
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

abstract class CommonProxy {
    open fun preInit(event: FMLPreInitializationEvent) {
        OreUtil.scourOreDictionary()
    }

    open fun init(event: FMLInitializationEvent) {
    }

    open fun registerModel(item: ItemOre, block: BlockOre) {
    }
}