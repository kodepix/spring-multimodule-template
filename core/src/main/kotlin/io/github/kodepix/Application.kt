package io.github.kodepix

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@SpringBootApplication
class Application
