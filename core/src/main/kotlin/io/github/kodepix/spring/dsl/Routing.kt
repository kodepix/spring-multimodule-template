@file:Suppress("unused")

package io.github.kodepix.spring.dsl

import org.springframework.web.servlet.function.*


/**
 * Adds a route to the given handler function that handles all HTTP `GET` requests.
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.get(f: ServerRequest.() -> ServerResponse) = GET(f)

/**
 * Adds a route to the given handler ction that handles all HTTP `GET` requests
 * that match the given pattern.
 * @param pattern the pattern to match to
 */
@RoutersDsl
fun RouterFunctionDsl.get(pattern: String, f: ServerRequest.() -> ServerResponse) = GET(pattern, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `GET` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.get(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = GET(predicate, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `GET` requests
 * that match the given pattern and predicate.
 * @param pattern the pattern to match to
 * @param predicate additional predicate to match
 * @since 5.2
 */
@RoutersDsl
fun RouterFunctionDsl.get(pattern: String, predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = GET(pattern, predicate, f)

/**
 * Return a [RequestPredicate] that matches if request's HTTP method is `GET`
 * and the given `pattern` matches against the request path.
 * @see RequestPredicates.GET
 */
@RoutersDsl
fun RouterFunctionDsl.get(pattern: String) = GET(pattern)


/**
 * Adds a route to the given handler ction that handles all HTTP `HEAD` requests.
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.head(f: ServerRequest.() -> ServerResponse) = HEAD(f)

/**
 * Adds a route to the given handler ction that handles all HTTP `HEAD` requests
 * that match the given pattern.
 * @param pattern the pattern to match to
 */
@RoutersDsl
fun RouterFunctionDsl.head(pattern: String, f: ServerRequest.() -> ServerResponse) = HEAD(pattern, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `HEAD` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.head(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = HEAD(predicate, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `HEAD` requests
 * that match the given pattern and predicate.
 * @param pattern the pattern to match to
 * @param predicate additional predicate to match
 * @since 5.2
 */
@RoutersDsl
fun RouterFunctionDsl.head(pattern: String, predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = HEAD(pattern, predicate, f)

/**
 * Return a [RequestPredicate] that matches if request's HTTP method is `HEAD`
 * and the given `pattern` matches against the request path.
 * @see RequestPredicates.HEAD
 */
@RoutersDsl
fun RouterFunctionDsl.head(pattern: String) = HEAD(pattern)


/**
 * Adds a route to the given handler ction that handles all HTTP `POST` requests.
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.post(f: ServerRequest.() -> ServerResponse) = POST(f)

/**
 * Adds a route to the given handler ction that handles all HTTP `POST` requests
 * that match the given pattern.
 * @param pattern the pattern to match to
 */
@RoutersDsl
fun RouterFunctionDsl.post(pattern: String, f: ServerRequest.() -> ServerResponse) = POST(pattern, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `POST` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.post(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = POST(predicate, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `POST` requests
 * that match the given pattern and predicate.
 * @param pattern the pattern to match to
 * @param predicate additional predicate to match
 * @since 5.2
 */
@RoutersDsl
fun RouterFunctionDsl.post(pattern: String, predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = POST(pattern, predicate, f)

/**
 * Return a [RequestPredicate] that matches if request's HTTP method is `POST`
 * and the given `pattern` matches against the request path.
 * @see RequestPredicates.POST
 */
@RoutersDsl
fun RouterFunctionDsl.post(pattern: String) = POST(pattern)


/**
 * Adds a route to the given handler ction that handles all HTTP `PUT` requests.
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.put(f: ServerRequest.() -> ServerResponse) = PUT(f)

/**
 * Adds a route to the given handler ction that handles all HTTP `PUT` requests
 * that match the given pattern.
 * @param pattern the pattern to match to
 */
@RoutersDsl
fun RouterFunctionDsl.put(pattern: String, f: ServerRequest.() -> ServerResponse) = PUT(pattern, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `PUT` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.put(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = PUT(predicate, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `PUT` requests
 * that match the given pattern and predicate.
 * @param pattern the pattern to match to
 * @param predicate additional predicate to match
 * @since 5.2
 */
@RoutersDsl
fun RouterFunctionDsl.put(pattern: String, predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = PUT(pattern, predicate, f)

/**
 * Return a [RequestPredicate] that matches if request's HTTP method is `PUT`
 * and the given `pattern` matches against the request path.
 * @see RequestPredicates.PUT
 */
@RoutersDsl
fun RouterFunctionDsl.put(pattern: String) = PUT(pattern)


/**
 * Adds a route to the given handler ction that handles all HTTP `PATCH` requests.
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.patch(f: ServerRequest.() -> ServerResponse) = PATCH(f)

/**
 * Adds a route to the given handler ction that handles all HTTP `PATCH` requests
 * that match the given pattern.
 * @param pattern the pattern to match to
 */
@RoutersDsl
fun RouterFunctionDsl.patch(pattern: String, f: ServerRequest.() -> ServerResponse) = PATCH(pattern, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `PATCH` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.patch(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = PATCH(predicate, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `PATCH` requests
 * that match the given pattern and predicate.
 * @param pattern the pattern to match to
 * @param predicate additional predicate to match
 * @since 5.2
 */
@RoutersDsl
fun RouterFunctionDsl.patch(pattern: String, predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = PATCH(pattern, predicate, f)

/**
 * Return a [RequestPredicate] that matches if request's HTTP method is `PATCH`
 * and the given `pattern` matches against the request path.
 * @param pattern the path pattern to match against
 * @return a predicate that matches if the request method is `PATCH` and if the given pattern
 * matches against the request path
 */
@RoutersDsl
fun RouterFunctionDsl.patch(pattern: String) = PATCH(pattern)


/**
 * Adds a route to the given handler ction that handles all HTTP `DELETE` requests.
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.delete(f: ServerRequest.() -> ServerResponse) = DELETE(f)

/**
 * Adds a route to the given handler ction that handles all HTTP `DELETE` requests
 * that match the given pattern.
 * @param pattern the pattern to match to
 */
@RoutersDsl
fun RouterFunctionDsl.delete(pattern: String, f: ServerRequest.() -> ServerResponse) = DELETE(pattern, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `DELETE` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.delete(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = DELETE(predicate, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `DELETE` requests
 * that match the given pattern and predicate.
 * @param pattern the pattern to match to
 * @param predicate additional predicate to match
 * @since 5.2
 */
@RoutersDsl
fun RouterFunctionDsl.delete(pattern: String, predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = DELETE(pattern, predicate, f)

/**
 * Return a [RequestPredicate] that matches if request's HTTP method is `DELETE`
 * and the given `pattern` matches against the request path.
 * @param pattern the path pattern to match against
 * @return a predicate that matches if the request method is `DELETE` and if the given pattern
 * matches against the request path
 */
@RoutersDsl
fun RouterFunctionDsl.delete(pattern: String) = DELETE(pattern)


/**
 * Adds a route to the given handler ction that handles all HTTP `OPTIONS` requests.
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.options(f: ServerRequest.() -> ServerResponse) = OPTIONS(f)

/**
 * Adds a route to the given handler ction that handles all HTTP `OPTIONS` requests
 * that match the given pattern.
 * @param pattern the pattern to match to
 */
@RoutersDsl
fun RouterFunctionDsl.options(pattern: String, f: ServerRequest.() -> ServerResponse) = OPTIONS(pattern, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `OPTIONS` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.options(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = OPTIONS(predicate, f)

/**
 * Adds a route to the given handler ction that handles all HTTP `OPTIONS` requests
 * that match the given pattern and predicate.
 * @param pattern the pattern to match to
 * @param predicate additional predicate to match
 * @since 5.2
 */
@RoutersDsl
fun RouterFunctionDsl.options(pattern: String, predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = OPTIONS(pattern, predicate, f)

/**
 * Return a [RequestPredicate] that matches if request's HTTP method is `OPTIONS`
 * and the given `pattern` matches against the request path.
 * @param pattern the path pattern to match against
 * @return a predicate that matches if the request method is `OPTIONS` and if the given pattern
 * matches against the request path
 */
@RoutersDsl
fun RouterFunctionDsl.options(pattern: String) = OPTIONS(pattern)


@DslMarker
annotation class RoutersDsl
