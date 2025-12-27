@file:Suppress("unused")

package io.github.kodepix.spring.dsl.response

import io.github.kodepix.commons.*
import org.springframework.http.HttpStatus.*
import org.springframework.web.servlet.function.*
import java.net.*
import kotlin.reflect.*


/**
 * Returns a request result with a status of `200 OK`.
 *
 * Usage:
 *
 * ```kotlin
 * get {
 *     ok { -> Any() }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TResult : Any> ServerRequest.ok(fn: () -> TResult) = respond(OK, fn())

/**
 * Returns a request result with a status of `200 OK`.
 *
 * Usage:
 *
 * ```kotlin
 * get {
 *     ok { id -> Any() }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TResult : Any> ServerRequest.ok(fn: (Id) -> TResult) = run {
    val id by this
    respond(OK, fn(Id(id.toInt())))
}

/**
 * Returns a request result with a status of `200 OK`.
 *
 * If the result is null, then `404 NOT FOUND` is returned.
 *
 * Usage:
 *
 * ```kotlin
 * get {
 *     okOrNotFound { -> Any() }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TResult : Any> ServerRequest.okOrNotFound(fn: () -> TResult) = run {
    internalOkOrNotFound { fn() }
}

/**
 * Returns a request result with a status of `200 OK`.
 *
 * If the result is null, then `404 NOT FOUND` is returned.
 *
 * Usage:
 *
 * ```kotlin
 * get {
 *     okOrNotFound { id -> Any() }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TResult : Any> ServerRequest.okOrNotFound(fn: (Id) -> TResult) = run {
    val id by this
    internalOkOrNotFound { fn(Id(id.toInt())) }
}

@PublishedApi
internal inline fun <reified TResult> internalOkOrNotFound(fn: () -> TResult) {
    val result = fn()
    if (result != null)
        respond(OK, result)
    else
        respond(NOT_FOUND)
}


/**
 * Returns a request result with a status of `201 CREATED`.
 *
 * Usage:
 *
 * ```kotlin
 * post {
 *     created { str: String -> Any() }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TModel : Any, reified TResult : Any> ServerRequest.created(fn: (TModel) -> TResult) = run {
    val model = body<TModel>()
    val result = fn(model)
    respond(CREATED, location = URI(""), result = result)
}


/**
 * Returns a request result with a status of `201 CREATED`.
 *
 * Usage:
 *
 * ```kotlin
 * post {
 *     created { str: String, id -> Any() }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TModel : Any, reified TResult : Any> ServerRequest.created(fn: (TModel, Id) -> TResult) = run {
    val id by this
    val model = body<TModel>()
    val result = fn(model, Id(id.toInt()))
    respond(CREATED, location = URI(""), result = result)
}


/**
 * Returns a request result with a status of `202 ACCEPTED`.
 *
 * Usage:
 *
 * ```kotlin
 * post {
 *     accepted { str: String -> Any() }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TModel : Any> ServerRequest.accepted(fn: (TModel) -> Unit) = run {
    val model = body<TModel>()
    fn(model)
    respond(ACCEPTED)
}


/**
 * Returns a request result with a status of `204 NO CONTENT`.
 *
 * If the result of [fn] is not equal to `1`, then `404 NOT FOUND` is returned.
 *
 * Usage:
 *
 * ```kotlin
 * post {
 *     noContentOrNotFound { id -> 1 }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun ServerRequest.noContentOrNotFound(fn: (Id) -> Int) = run {
    val id by this
    val result = fn(Id(id.toInt()))
    internalNoContentOrNotFound { result }
}

/**
 * Returns a request result with a status of `204 NO CONTENT`.
 *
 * If the result of [fn] is not equal to `1`, then `404 NOT FOUND` is returned.
 *
 * Usage:
 *
 * ```kotlin
 * post {
 *     noContentOrNotFound { str: String, id -> 1 }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TModel : Any> ServerRequest.noContentOrNotFound(fn: (TModel, Id) -> Int) = run {
    val id by this
    val model = body<TModel>()
    val result = fn(model, Id(id.toInt()))
    internalNoContentOrNotFound { result }
}

@PublishedApi
internal inline fun internalNoContentOrNotFound(fn: () -> Int) {
    if (fn() == 1)
        respond(NO_CONTENT)
    else
        respond(NOT_FOUND)
}


/**
 * Returns a request result with a status of `204 NO CONTENT`.
 *
 * Usage:
 *
 * ```kotlin
 * post {
 *     noContent {}
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun ServerRequest.noContent(fn: () -> Unit) = run {
    fn()
    respond(NO_CONTENT)
}

/**
 * Returns a request result with a status of `204 NO CONTENT`.
 *
 * Usage:
 *
 * ```kotlin
 * post {
 *     noContent { str: String -> }
 * }
 * ```
 *
 * @param fn request handler
 */
@HandlersDsl
inline fun <reified TModel : Any> ServerRequest.noContent(fn: (TModel) -> Unit) = run {
    val model = body<TModel>()
    fn(model)
    respond(NO_CONTENT)
}


@DslMarker
annotation class HandlersDsl


operator fun ServerRequest.getValue(thisRef: Any?, property: KProperty<*>) = pathVariable(property.name)!!
