package io.github.kodepix.spring.dsl.request

import io.github.kodepix.commons.*
import io.github.kodepix.spring.dsl.response.ResponseBuilder
import org.springframework.web.reactive.function.server.queryParamOrNull
import org.springframework.web.servlet.function.*
import java.security.Principal
import java.util.*
import kotlin.collections.orEmpty
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


class RouteInfo(
    val request: ServerRequest,
    val response: ResponseBuilder = ResponseBuilder()
) {
    lateinit var principal: Principal
    fun id(name: String = "id") = uuid(pathVar(name))
//    fun page(name: String = "p") = param(name)?.toIntOrNull() ?: 0
    fun pathVar(name: String): String = request.pathVariable(name)
    fun header(name: String): String? = request.headers().firstHeader(name)
//    fun param(name: String) = request.queryParamOrNull(name)
//    fun params(name: String) = request.queryParams()[name].orEmpty().toList()
}
