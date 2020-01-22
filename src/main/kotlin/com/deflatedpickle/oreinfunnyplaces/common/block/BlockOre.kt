package com.deflatedpickle.oreinfunnyplaces.common.block

import com.deflatedpickle.oreinfunnyplaces.Reference
import com.deflatedpickle.oreinfunnyplaces.util.OreType
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item
import net.minecraft.util.BlockRenderLayer
import net.minecraft.util.ResourceLocation
import java.util.Random

class BlockOre(val base: Item, type: OreType) : Block(Material.GROUND) {
    lateinit var drop: Item

    init {
        registryName = ResourceLocation(Reference.MOD_ID, "${base.translationKey}_${type.name.toLowerCase()}.block")
        creativeTab = CreativeTabs.BUILDING_BLOCKS
    }

    override fun getItemDropped(state: IBlockState, rand: Random, fortune: Int): Item = drop

    override fun getRenderLayer(): BlockRenderLayer = BlockRenderLayer.CUTOUT_MIPPED
}