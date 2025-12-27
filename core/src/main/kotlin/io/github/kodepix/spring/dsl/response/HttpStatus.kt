package io.github.kodepix.spring.dsl.response

import org.springframework.http.*
import org.springframework.web.servlet.function.ServerResponse.*
import java.net.*


@HttpStatusDsl
fun respond(status: HttpStatus) = status(status).build()!!

@HttpStatusDsl
fun respond(status: HttpStatus, result: Any) = status(status).body(result)!!

@HttpStatusDsl
fun respond(status: HttpStatus, location: URI) = status(status).location(location).build()!!

@HttpStatusDsl
fun respond(status: HttpStatus, location: URI, result: Any) = status(status).location(location).body(result)!!

@DslMarker
annotation class HttpStatusDsl
