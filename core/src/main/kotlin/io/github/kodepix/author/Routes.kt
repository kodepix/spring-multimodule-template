package io.github.kodepix.author

import io.github.kodepix.spring.dsl.*
import io.github.kodepix.spring.dsl.response.noContent
import org.springframework.web.servlet.function.*

val authorRoutes = router {

    "author".nest {

//        get { ok { ServerResponse1("123") } }

        post("data") {
            noContent<String> {
                println(it)
            }
        }
    }
}

data class ServerResponse1(val status: String)
