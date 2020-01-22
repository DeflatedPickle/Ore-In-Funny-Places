package com.deflatedpickle.oreinfunnyplaces.client.event

import com.deflatedpickle.oreinfunnyplaces.OreInFunnyPlaces
import com.deflatedpickle.oreinfunnyplaces.common.block.BlockOre
import com.deflatedpickle.picklelib.colour.Colour
import net.minecraft.client.renderer.color.IBlockColor
import net.minecraft.client.renderer.color.IItemColor
import net.minecraft.item.ItemStack
import net.minecraftforge.client.event.ColorHandlerEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.oredict.OreDictionary

object ForgeClientEventHandler {
    @SubscribeEvent
    fun onColorHandlerEventBlock(event: ColorHandlerEvent.Block) {
        for (i in OreInFunnyPlaces.oreList) {
            event.blockColors.registerBlockColorHandler(IBlockColor { state, worldIn, pos, tintIndex ->
                val colourList = Colour(ItemStack((i.block as BlockOre).base)).scaledColour
                return@IBlockColor if (colourList.isNotEmpty()) {
                    if (tintIndex == 0) colourList.first() else -1
                } else -1

            }, i.block)
        }
    }

    @SubscribeEvent
    fun onColorHandlerEventItem(event: ColorHandlerEvent.Item) {
        for (i in OreInFunnyPlaces.oreList) {
            event.itemColors.registerItemColorHandler(IItemColor { stack, tintIndex ->
                val colourList = Colour(ItemStack(i.base)).scaledColour
                return@IItemColor if (colourList.isNotEmpty()) {
                    if (tintIndex == 0) colourList.first() else -1
                } else -1
            }, i)
        }
    }
}