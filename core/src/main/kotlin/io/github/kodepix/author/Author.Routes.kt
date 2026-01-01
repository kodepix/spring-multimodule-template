package io.github.kodepix.author

import io.github.kodepix.spring.dsl.request.*
import io.github.kodepix.spring.dsl.response.*
import org.springframework.web.servlet.function.*

val authorRoutes = router {

    "author".nest {

        post("data/{nextId}", response = noContentOrNotFound) { nextId ->
            println(nextId)
            1
        }
    }
}
