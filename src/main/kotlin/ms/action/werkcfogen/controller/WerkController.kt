package ms.action.werkcfogen.controller

import ms.action.werkcfogen.dto.KafkaMessage
import ms.action.werkcfogen.service.FactorySerivce
import ms.action.werkcfogen.service.Sender
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/werks")
class WerkController(
    private val sender: Sender,
    private val factory: FactorySerivce
) {

    @PostMapping
    fun generate(): KafkaMessage {
        val message = factory.createMessage()
        sender.send("org_cdc_polka_test.public.uwerks", message)
        return message
    }
}
