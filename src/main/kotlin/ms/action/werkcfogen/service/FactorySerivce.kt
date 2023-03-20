package ms.action.werkcfogen.service

import com.fasterxml.jackson.databind.ObjectMapper
import kotlin.random.Random
import ms.action.werkcfogen.dto.After
import ms.action.werkcfogen.dto.Before
import ms.action.werkcfogen.dto.Employee
import ms.action.werkcfogen.dto.KafkaMessage
import ms.action.werkcfogen.dto.MetaData
import org.instancio.Instancio
import org.instancio.Select
import org.springframework.stereotype.Service

@Service
class FactorySerivce(private val om: ObjectMapper) : FactoryServiceI {
    private val operations = listOf("c", "u", "d")
    private val random = Random(System.currentTimeMillis())
    private val maxSize = 10

    override fun createMessage(): KafkaMessage {
        val operation = operations[random.nextInt(0, operations.size)]
        val (after, before) = when (operation) {
            "d" -> null to createBefore()
            "c" -> createAfter() to null
            else -> createAfter() to createBefore()
        }
        return KafkaMessage(operation, after, before)
    }

    private fun createBefore(): Before = Instancio.of(Before::class.java)
        .set(
            Select.field("metaData"),
            om.writeValueAsString(Instancio.create(MetaData::class.java))
        )
        .create()

    private fun createAfter(): After {
        val amountOfEmployees = random.nextInt(0, maxSize)
        val employees = if (amountOfEmployees == 0) null else Instancio.ofList(Employee::class.java)
            .size(amountOfEmployees)
            .create()
        return Instancio.of(After::class.java)
            .set(
                Select.field("metaData"),
                om.writeValueAsString(Instancio.create(MetaData::class.java))
            )
            .set(
                Select.field("employees"),
                employees?.let { om.writeValueAsString(it) }
            )
            .create()
    }
}