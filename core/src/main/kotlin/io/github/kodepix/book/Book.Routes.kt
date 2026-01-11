package io.github.kodepix.book

import io.github.kodepix.book.Books.Companion.books
import io.github.kodepix.spring.dsl.request.*
import io.github.kodepix.spring.dsl.response.*
import org.springframework.web.servlet.function.*
import java.net.*

val bookRoutes = router {

    "books".nest {


        get("search", response = ok) { ->
            val q = param("q")
            q
        }

        get(response = ok) {
            books.findAllByIdLessThan(12)
        }


        post("data", response = okOrNotFound) { ->
            "data"
        }

        post("data/{id}", response = okOrNotFound) { id ->
            println(id)
            "data/{id}"
        }

        post("data2/{id}", response = okOrNotFound) { id, model: String ->
            println(id)
            println(model)
            "data2/{id} $model"
            null as String?
        }



        post("data2", response = createdOrNotFound(URI("?"))) { ->
            11
        }

        post("data/{nextId}/{param1}", response = noContentOrNotFound) { ->
            val nextId: Int by this
            val param1: String by this
            val model = body<String>()

            println(nextId)
            println(param1)
            println(model)

            11
        }


        // без шаблона для сопоставления: внизу
        post(response = ok) { ->
            "OK"
        }
    }
}

private fun ServerRequest.header(function: () -> String) {
    TODO("Not yet implemented")
}
