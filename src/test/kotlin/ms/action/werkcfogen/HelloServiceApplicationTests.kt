package ms.action.werkcfogen

import ms.action.werkcfogen.model.After
import ms.action.werkcfogen.model.Employee
import ms.action.werkcfogen.model.MetaData
import org.junit.jupiter.api.Test

class HelloServiceApplicationTests {
    private val om = GenerateApplication().om()

    @Test
    fun checkJsonMapping() {
        val after = After(
            "Square St., 5",
            metaData = om.writeValueAsString(MetaData("London")),
            employees = om.writeValueAsString(
                listOf(
                    Employee(
                        "Иванов Иван Иванович",
                        "Директор магазина",
                        "+7909003323"
                    )
                )
            )
        )
        val result = om.writeValueAsString(after)
        println(result)
    }
}
