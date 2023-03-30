package ms.action.werkcfogen

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jsonMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GenerateApplication {
    @Bean
    fun om() = jsonMapper {
        addModule(kotlinModule())
        addModule(JavaTimeModule())
    }
}

fun main(args: Array<String>) {
    runApplication<GenerateApplication>(*args)
}
