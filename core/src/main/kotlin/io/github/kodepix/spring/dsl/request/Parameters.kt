package io.github.kodepix.spring.dsl.request

import io.github.kodepix.commons.*
import org.springframework.web.servlet.function.*
import java.util.*
import kotlin.reflect.*

/**
 * Операторная функция, позволяющая делегировать переменные по параметрам вызова.
 * Он конвертирует в тип [R].
 */
inline operator fun <reified R : Any> ServerRequest.getValue(thisRef: Any?, property: KProperty<*>) = getOrFail<R>(property.name)

/**
 * Получает значение параметра, связанное с этим [name], преобразуя в тип [R].
 */
inline fun <reified R : Any> ServerRequest.getOrFail(name: String) = getOrFailImpl(name, R::class)


@PublishedApi
internal inline fun <reified R : Any> ServerRequest.getOrFailImpl(name: String, type: KClass<R>) = run {
    val value = pathVariable(name)
    convertPrimitives(type, value).cast<R>()
}

@PublishedApi
internal fun convertPrimitives(klass: KClass<*>, value: String) = when (klass) {
    Int::class -> value.toInt()
    Float::class -> value.toFloat()
    Double::class -> value.toDouble()
    Long::class -> value.toLong()
    Short::class -> value.toShort()
    Char::class -> value.single()
    Boolean::class -> value.toBoolean()
    UUID::class -> uuid(value)
    String::class -> value
    else -> null
}
