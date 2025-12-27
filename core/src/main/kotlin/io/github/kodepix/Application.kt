package io.github.kodepix

import io.github.kodepix.author.*
import io.github.kodepix.book.*
import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.context.annotation.*
import org.springframework.web.servlet.function.*

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@SpringBootApplication
class Application

@Configuration
class Routes {
    @Bean
    fun routerFunction() = (bookRoutes + authorRoutes)!!
}
