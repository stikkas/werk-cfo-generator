package ms.action.werkcfogen.service

import com.fasterxml.jackson.databind.ObjectMapper
import java.time.LocalTime
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
private val random = Random(System.currentTimeMillis())

private val names = listOf("Иван", "Петр", "Семен", "Аркадий", "Валентин", "Игорь", "Антон", "Михаил")
private val lastNames = listOf("Кузнецов", "Стуков", "Решетов", "Крайний", "Борщ", "Трутнев", "Загулда", "Рыков")
private val middleNames = listOf("Иванович", "Петрович", "Терентьевич", "Алексеевич", "Александрович")
private val roles = listOf("директор магазина", "продавец", "кассир", "менеджер")
private val cities = listOf("Москва г", "Казань", "Тверь г", "Рязань", "Саратов", "Смоленск г")

private fun randomTime() = LocalTime.of(random.nextInt(24), random.nextInt(60))
private fun <T> randomFrom(list: List<T>): T = list[random.nextInt(0, list.size)]
private fun fio() = if (random.nextBoolean())
    "${randomFrom(lastNames)} ${randomFrom(names)} ${randomFrom(middleNames)}"
else
    null

private fun mobilePhone() = if (random.nextBoolean())
    sequence<Int> { random.nextInt(10) }.take(10).joinToString("", "+7")
else
    null


@Service
class FactorySerivce(private val om: ObjectMapper) : FactoryServiceI {

    override fun createMessage(): KafkaMessage {
        val operation = randomFrom(operations)
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
            om.writeValueAsString(Employee(fio(), randomFrom(roles), mobilePhone()))
        }
        val hours = arrayOf(randomTime(), randomTime()).sortedArray()

        return Instancio.of(After::class.java)
            .set(field(After::werkId.name), random.nextLong(MAX_ID_VALUE))
            .set(field(After::cfoId.name), random.nextLong(MAX_ID_VALUE))
            .set(field(After::metaData.name), om.writeValueAsString(MetaData(randomFrom(cities))))
            .set(field(After::employees.name), employees)
            .set(field(After::openHour.name), hours[0])
            .set(field(After::closeHour.name), hours[1])
            .create()
    }
}
