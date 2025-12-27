package io.github.kodepix.book

import io.github.kodepix.spring.dsl.*
import io.github.kodepix.spring.dsl.response.*
import org.springframework.web.servlet.function.*

val bookRoutes = router {

    "books".nest {

        get("{id}") {
            ok { id ->
                @Suppress("unused")
                object {
                    val id = id
                }
            }
        }

//        get { ok { ServerResponse1("123") } }

        post("data") {
            noContent<String> {
                println(it)
            }
        }

        post("data1") {
            noContent(::f)
        }
    }
}

fun f(id: String) {
    println(id)
}
