/* Copyright (c) 2019 DeflatedPickle under the MIT license */

package com.deflatedpickle.oreinfunnyplaces

import com.deflatedpickle.oreinfunnyplaces.common.CommonProxy
import com.deflatedpickle.oreinfunnyplaces.common.item.ItemOre
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.NAME,
        version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS,
        dependencies = Reference.DEPENDENCIES,
        modLanguageAdapter = Reference.ADAPTER
)
object OreInFunnyPlaces {
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    lateinit var proxy: CommonProxy

    val oreList = mutableListOf<ItemOre>()

    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        proxy.preInit(event)
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        proxy.init(event)
    }
}
