package com.deflatedpickle.oreinfunnyplaces.client

import com.deflatedpickle.oreinfunnyplaces.Reference
import com.deflatedpickle.oreinfunnyplaces.client.event.ForgeClientEventHandler
import com.deflatedpickle.oreinfunnyplaces.common.CommonProxy
import com.deflatedpickle.oreinfunnyplaces.common.block.BlockOre
import com.deflatedpickle.oreinfunnyplaces.common.item.ItemOre
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.client.renderer.block.statemap.IStateMapper
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

class ClientProxy : CommonProxy() {
    override fun preInit(event: FMLPreInitializationEvent) {
        super.preInit(event)

        MinecraftForge.EVENT_BUS.register(ForgeClientEventHandler)
    }

    override fun registerModel(item: ItemOre, block: BlockOre) {
        ModelLoader.setCustomStateMapper(block) {
            mapOf(block.defaultState to ModelResourceLocation("${Reference.MOD_ID}:ore_${item.type.name.toLowerCase()}", "normal"))
        }

        // Minecraft.getMinecraft().renderItem.itemModelMesher.register(
        ModelLoader.setCustomModelResourceLocation(
                item,
                0,
                ModelResourceLocation(ResourceLocation(Reference.MOD_ID, "ore_${item.type.name.toLowerCase()}"), "normal")
        )
    }
}