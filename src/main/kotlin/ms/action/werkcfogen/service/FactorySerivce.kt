package ms.action.werkcfogen.service

import com.fasterxml.jackson.databind.ObjectMapper
import kotlin.random.Random
import ms.action.werkcfogen.model.After
import ms.action.werkcfogen.model.Before
import ms.action.werkcfogen.model.Employee
import ms.action.werkcfogen.model.KafkaMessage
import ms.action.werkcfogen.model.MetaData
import org.instancio.Instancio
import org.instancio.Select.field
import org.springframework.stereotype.Service

private const val MAX_SIZE = 10
private const val MAX_ID_VALUE = 1000L
private val operations = listOf("c", "u", "d")

@Service
class FactorySerivce(private val om: ObjectMapper) : FactoryServiceI {
    private val random = Random(System.currentTimeMillis())

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
        .set(field(Before::werkId.name), random.nextLong(MAX_ID_VALUE))
        .set(field(Before::cfoId.name), random.nextLong(MAX_ID_VALUE))
        .create()

    private fun createAfter(): After {
        val amountOfEmployees = random.nextInt(0, MAX_SIZE)
        val employees = if (amountOfEmployees == 0) null else (1..amountOfEmployees).map {
            Instancio.of(Employee::class.java)
                .create()
        }
        return Instancio.of(After::class.java)
            .set(
                field("metaData"),
                om.writeValueAsString(Instancio.create(MetaData::class.java))
            )
            .set(
                field("employees"),
                employees?.let { om.writeValueAsString(it) }
            )
            .create()
    }
}
/*
3.2.4 {
  5.1. Контракт internship/event
  6.2. Контракт internship/event (PUT)
  7.2. Контракт internship/event (DELETE)
}
TS.7.2.1 Нижний слой для хранения данных HR НСИ
*/