package io.ktor.client.call

import kotlin.reflect.*

/**
 * Information about type.
 */
expect interface Type

/**
 * Ktor type information.
 * @property type: source KClass<*>
 * @property reifiedType: type with substituted generics
 */
data class TypeInfo(val type: KClass<*>, val reifiedType: Type)

/**
 * Returns [TypeInfo] for the specified type [T]
 */
expect inline fun <reified T> typeInfo(): TypeInfo
