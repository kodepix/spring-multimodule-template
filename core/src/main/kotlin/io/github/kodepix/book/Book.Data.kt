package io.github.kodepix.book

import jakarta.persistence.*
import org.springframework.beans.factory.annotation.*
import org.springframework.data.jpa.repository.*
import org.springframework.stereotype.*
import java.util.*

@Entity
class Book(
    @Id
    val id: Int,
    val title: String,
    val summary: String?,
    val content_hash: UUID,
)

interface Books : JpaRepository<Book, Int> {
    fun findAllByIdLessThan(idIsLessThan: Int): List<Book>

    @Component
    companion object {
        lateinit var books: Books @Autowired set
    }
}
