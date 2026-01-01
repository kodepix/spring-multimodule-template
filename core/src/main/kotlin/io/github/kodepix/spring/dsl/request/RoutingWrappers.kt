@file:Suppress("unused")

package io.github.kodepix.spring.dsl.request

import org.springframework.web.servlet.function.*


/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'GET'.
 */
@RoutersDsl
fun RouterFunctionDsl.get(f: ServerRequest.() -> ServerResponse) = GET(f)

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'GET', соответствующие заданному шаблону.
 *
 * @param pattern шаблон для сопоставления
 */
@RoutersDsl
fun RouterFunctionDsl.get(pattern: String, f: ServerRequest.() -> ServerResponse) = GET(pattern, f)

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'GET', соответствующие заданному предикату.
 * @param predicate предикат для сопоставления
 */
@RoutersDsl
fun RouterFunctionDsl.get(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = GET(predicate, f)

/**
 * Adds a route to the given handler function that handles all HTTP `GET` requests
 * that match the given pattern and predicate.
 * @param pattern шаблон для сопоставления
 * @param predicate additional predicate to match
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
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все запросы HTTP 'HEAD'.
 */
@RoutersDsl
fun RouterFunctionDsl.head(f: ServerRequest.() -> ServerResponse) = HEAD(f)

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'HEAD', соответствующие заданному шаблону.
 *
 * @param pattern шаблон для сопоставления
 */
@RoutersDsl
fun RouterFunctionDsl.head(pattern: String, f: ServerRequest.() -> ServerResponse) = HEAD(pattern, f)

/**
 * Adds a route to the given handler function that handles all HTTP `HEAD` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.head(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = HEAD(predicate, f)

/**
 * Adds a route to the given handler function that handles all HTTP `HEAD` requests
 * that match the given pattern and predicate.
 * @param pattern шаблон для сопоставления
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
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'POST'.
 */
@RoutersDsl
fun RouterFunctionDsl.post(f: ServerRequest.() -> ServerResponse) = POST(f)

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'POST', соответствующие данному шаблону.
 *
 * @param pattern шаблон для сопоставления
 */
@RoutersDsl
fun RouterFunctionDsl.post(pattern: String, f: ServerRequest.() -> ServerResponse) = POST(pattern, f)

/**
 * Adds a route to the given handler function that handles all HTTP `POST` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.post(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = POST(predicate, f)

/**
 * Adds a route to the given handler function that handles all HTTP `POST` requests
 * that match the given pattern and predicate.
 * @param pattern шаблон для сопоставления
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
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PUT'.
 */
@RoutersDsl
fun RouterFunctionDsl.put(f: ServerRequest.() -> ServerResponse) = PUT(f)

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PUT', соответствующие данному шаблону.
 *
 * @param pattern шаблон для сопоставления
 */
@RoutersDsl
fun RouterFunctionDsl.put(pattern: String, f: ServerRequest.() -> ServerResponse) = PUT(pattern, f)

/**
 * Adds a route to the given handler function that handles all HTTP `PUT` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.put(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = PUT(predicate, f)

/**
 * Adds a route to the given handler function that handles all HTTP `PUT` requests
 * that match the given pattern and predicate.
 * @param pattern шаблон для сопоставления
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
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PATCH'.
 */
@RoutersDsl
fun RouterFunctionDsl.patch(f: ServerRequest.() -> ServerResponse) = PATCH(f)

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PATCH', соответствующие данному шаблону.
 *
 * @param pattern шаблон для сопоставления
 */
@RoutersDsl
fun RouterFunctionDsl.patch(pattern: String, f: ServerRequest.() -> ServerResponse) = PATCH(pattern, f)

/**
 * Adds a route to the given handler function that handles all HTTP `PATCH` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.patch(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = PATCH(predicate, f)

/**
 * Adds a route to the given handler function that handles all HTTP `PATCH` requests
 * that match the given pattern and predicate.
 * @param pattern шаблон для сопоставления
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
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'DELETE'.
 */
@RoutersDsl
fun RouterFunctionDsl.delete(f: ServerRequest.() -> ServerResponse) = DELETE(f)

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'DELETE', соответствующие данному шаблону.
 *
 * @param pattern шаблон для сопоставления
 */
@RoutersDsl
fun RouterFunctionDsl.delete(pattern: String, f: ServerRequest.() -> ServerResponse) = DELETE(pattern, f)

/**
 * Adds a route to the given handler function that handles all HTTP `DELETE` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.delete(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = DELETE(predicate, f)

/**
 * Adds a route to the given handler function that handles all HTTP `DELETE` requests
 * that match the given pattern and predicate.
 * @param pattern шаблон для сопоставления
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
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все запросы HTTP 'OPTIONS'.
 */
@RoutersDsl
fun RouterFunctionDsl.options(f: ServerRequest.() -> ServerResponse) = OPTIONS(f)

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'OPTIONS', соответствующие данному шаблону.
 *
 * @param pattern шаблон для сопоставления
 */
@RoutersDsl
fun RouterFunctionDsl.options(pattern: String, f: ServerRequest.() -> ServerResponse) = OPTIONS(pattern, f)

/**
 * Adds a route to the given handler function that handles all HTTP `OPTIONS` requests
 * that match the given predicate.
 * @param predicate predicate to match
 * @since 5.3
 */
@RoutersDsl
fun RouterFunctionDsl.options(predicate: RequestPredicate, f: ServerRequest.() -> ServerResponse) = OPTIONS(predicate, f)

/**
 * Adds a route to the given handler function that handles all HTTP `OPTIONS` requests
 * that match the given pattern and predicate.
 * @param pattern шаблон для сопоставления
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
