package io.github.kodepix.spring.dsl.request

import io.github.kodepix.commons.*
import io.github.kodepix.spring.dsl.response.*
import org.springframework.web.servlet.function.*


/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'GET'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.get(response: Response, crossinline handler: ServerRequest.() -> TResult) =
    get { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'GET', соответствующие заданному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.get(pattern: String, response: Response, crossinline handler: ServerRequest.() -> TResult) =
    get(pattern) { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'GET', соответствующие заданному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.get(pattern: String, response: Response, crossinline handler: ServerRequest.(Id) -> TResult) =
    get(pattern) { withId(response, handler) }


/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все запросы HTTP 'HEAD'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.head(response: Response, crossinline handler: ServerRequest.() -> TResult) =
    head { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'HEAD', соответствующие заданному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.head(pattern: String, response: Response, crossinline handler: ServerRequest.() -> TResult) =
    head(pattern) { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'HEAD', соответствующие заданному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.head(pattern: String, response: Response, crossinline handler: ServerRequest.(Id) -> TResult) =
    head(pattern) { withId(response, handler) }


/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'POST'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.post(response: Response, crossinline handler: ServerRequest.() -> TResult) =
    post { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'POST'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TModel : Any, reified TResult> RFunDsl.post(response: Response, crossinline handler: ServerRequest.(TModel) -> TResult) =
    post { withModel(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'POST', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.post(pattern: String, response: Response, crossinline handler: ServerRequest.() -> TResult) =
    post(pattern) { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'POST', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.post(pattern: String, response: Response, crossinline handler: ServerRequest.(Id) -> TResult) =
    post(pattern) { withId(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'POST', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TModel : Any, reified TResult> RFunDsl.post(pattern: String, response: Response, crossinline handler: ServerRequest.(Id, TModel) -> TResult) =
    post(pattern) { withIdAndModel(response, handler) }


/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PUT'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.put(response: Response, crossinline handler: ServerRequest.() -> TResult) =
    put { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PUT'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TModel : Any, reified TResult> RFunDsl.put(response: Response, crossinline handler: ServerRequest.(TModel) -> TResult) =
    put { withModel(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PUT', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.put(pattern: String, response: Response, crossinline handler: ServerRequest.() -> TResult) =
    put(pattern) { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PUT', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.put(pattern: String, response: Response, crossinline handler: ServerRequest.(Id) -> TResult) =
    put(pattern) { withId(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PUT', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TModel : Any, reified TResult> RFunDsl.put(pattern: String, response: Response, crossinline handler: ServerRequest.(Id, TModel) -> TResult) =
    put(pattern) { withIdAndModel(response, handler) }


/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PATCH'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.patch(response: Response, crossinline handler: ServerRequest.() -> TResult) =
    patch { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PATCH'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TModel : Any, reified TResult> RFunDsl.patch(response: Response, crossinline handler: ServerRequest.(TModel) -> TResult) =
    patch { withModel(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PATCH', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.patch(pattern: String, response: Response, crossinline handler: ServerRequest.() -> TResult) =
    patch(pattern) { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PATCH', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.patch(pattern: String, response: Response, crossinline handler: ServerRequest.(Id) -> TResult) =
    patch(pattern) { withId(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'PATCH', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TModel : Any, reified TResult> RFunDsl.patch(pattern: String, response: Response, crossinline handler: ServerRequest.(Id, TModel) -> TResult) =
    patch(pattern) { withIdAndModel(response, handler) }


/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'DELETE'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.delete(response: Response, crossinline handler: ServerRequest.() -> TResult) =
    delete { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'DELETE', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.delete(pattern: String, response: Response, crossinline handler: ServerRequest.() -> TResult) =
    delete(pattern) { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'DELETE', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.delete(pattern: String, response: Response, crossinline handler: ServerRequest.(Id) -> TResult) =
    delete(pattern) { withId(response, handler) }


/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все запросы HTTP 'OPTIONS'.
 *
 * @param TResult возвращаемый результат
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.options(response: Response, crossinline handler: ServerRequest.() -> TResult) =
    options { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'OPTIONS', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.options(pattern: String, response: Response, crossinline handler: ServerRequest.() -> TResult) =
    options(pattern) { noParams(response, handler) }

/**
 * Добавляет маршрут к заданной функции обработчика, который обрабатывает все HTTP-запросы 'OPTIONS', соответствующие данному шаблону.
 *
 * @param TResult возвращаемый результат
 * @param pattern шаблон для сопоставления
 * @param response функция, возвращающая результат с определённым статусом
 * @param handler обработчик запроса
 */
@RoutersDsl
inline fun <reified TResult> RFunDsl.options(pattern: String, response: Response, crossinline handler: ServerRequest.(Id) -> TResult) =
    options(pattern) { withId(response, handler) }


@PublishedApi
internal inline fun <reified TModel : Any, reified TResult> ServerRequest.withIdAndModel(response: Response, handler: ServerRequest.(Id, TModel) -> TResult) = run {
    val id: Int by this
    val model = body<TModel>()
    withId(response) { handler(Id(id), model) }
}

@PublishedApi
internal inline fun <reified TModel : Any, reified TResult> ServerRequest.withModel(response: Response, handler: ServerRequest.(TModel) -> TResult) = run {
    val model = body<TModel>()
    withId(response) { handler(model) }
}

@PublishedApi
internal inline fun <reified TResult> ServerRequest.withId(response: Response, handler: ServerRequest.(Id) -> TResult) = run {
    val id: Int by this
    noParams(response) { handler(Id(id)) }
}

@PublishedApi
internal inline fun <reified TResult> ServerRequest.noParams(response: Response, handler: ServerRequest.() -> TResult) = run {
    val routeInfo = RouteInfo(this)
    val result = handler()
    response.respond(result)
}

private typealias RFunDsl = RouterFunctionDsl
