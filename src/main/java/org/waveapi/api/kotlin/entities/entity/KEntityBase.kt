package org.waveapi.api.kotlin.entities.entity

import org.waveapi.api.entities.entity.EntityBase
import kotlin.reflect.KClass

fun <T : Any> EntityBase?.to(kClass: KClass<T>): T? {
    return null
}