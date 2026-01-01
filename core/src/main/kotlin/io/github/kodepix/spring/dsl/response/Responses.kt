package io.github.kodepix.spring.dsl.response

import org.springframework.http.*
import org.springframework.http.HttpStatus.*
import org.springframework.web.servlet.function.*
import org.springframework.web.servlet.function.ServerResponse.*
import java.net.*


/**
 * Returns a request result with a status of `200 OK`.
 */
@HttpStatusDsl
val ok = Response {
    require(it != null)
    respond(OK, it)
}

/**
 * Returns a request result with a status of `200 OK`.
 *
 * If the result is null, then `404 NOT FOUND` is returned.
 */
@HttpStatusDsl
val okOrNotFound = Response {
    if (it != null)
        respond(OK, it)
    else
        respond(NOT_FOUND)
}


/**
 * Returns a request result with a status of `201 CREATED`.
 *
 * If the result is null, then `404 NOT FOUND` is returned.
 */
@HttpStatusDsl
fun createdOrNotFound(location: URI) = Response {
    if (it != null)
        respond(CREATED, location = location, result = it)
    else
        respond(NOT_FOUND)
}


/**
 * Returns a request result with a status of `202 ACCEPTED`.
 */
@HttpStatusDsl
val accepted = Response { respond(ACCEPTED) }


/**
 * Returns a request result with a status of `204 NO CONTENT`.
 */
@HttpStatusDsl
val noContent = Response { respond(NO_CONTENT) }

/**
 * Returns a request result with a status of `204 NO CONTENT`.
 *
 * If the result is not equal to `1`, then `404 NOT FOUND` is returned.
 */
@HttpStatusDsl
val noContentOrNotFound = Response {
    respond(
        if (it == 1)
            NO_CONTENT
        else
            NOT_FOUND
    )
}


fun interface Response {
    fun respond(result: Any?): ServerResponse
}

@HttpStatusDsl
private fun respond(status: HttpStatus) = status(status).build()!!

@HttpStatusDsl
private fun respond(status: HttpStatus, result: Any) = status(status).body(result)!!

@HttpStatusDsl
private fun respond(status: HttpStatus, location: URI, result: Any) = status(status).location(location).body(result)!!


@DslMarker
annotation class HttpStatusDsl
