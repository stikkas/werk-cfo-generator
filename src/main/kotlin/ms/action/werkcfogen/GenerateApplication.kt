package ms.action.werkcfogen

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GenerateApplication {
    @Bean
    fun om() = jacksonObjectMapper()
}

fun main(args: Array<String>) {
    runApplication<GenerateApplication>(*args)
}
