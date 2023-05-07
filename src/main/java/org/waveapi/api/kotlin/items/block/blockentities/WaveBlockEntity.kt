package org.waveapi.api.kotlin.items.block.blockentities

import org.waveapi.api.items.block.blockentities.BlockEntityCastingType
import org.waveapi.api.items.block.blockentities.WaveTileEntity
import java.util.*

fun <T> WaveTileEntity?.toType(type: BlockEntityCastingType<T>?): T? {
    return Objects.requireNonNull<T?>(null)
}
