/* Copyright (c) 2019 DeflatedPickle under the MIT license */

package com.deflatedpickle.oreinfunnyplaces

object Reference {
    const val MOD_ID = "oreinfunnyplaces"
    const val NAME = "OreInFunnyPlaces"
    // Versions follow this format: MCVERSION-MAJORMOD.MAJORAPI.MINOR.PATCH.
    const val VERSION = "1.12.2-1.0.0.0"
    const val ACCEPTED_VERSIONS = "[1.12.1, 1.12.2]"

    const val CLIENT_PROXY_CLASS = "com.deflatedpickle.oreinfunnyplaces.client.ClientProxy"
    const val SERVER_PROXY_CLASS = "com.deflatedpickle.oreinfunnyplaces.server.ServerProxy"

    const val DEPENDENCIES = "required-after:forgelin"
    const val ADAPTER = "net.shadowfacts.forgelin.KotlinAdapter"
}
