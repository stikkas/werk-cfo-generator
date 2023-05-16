package ms.action.werkcfogen.controller

import ms.action.werkcfogen.model.KafkaMessage
import ms.action.werkcfogen.service.FactorySerivce
import ms.action.werkcfogen.service.Sender
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/cfos")
class CfoController(
    private val sender: Sender,
    private val factory: FactorySerivce,
    @Value("\${app.kafka.topic.cfo}") private val topic: String
) {

    @PostMapping
    suspend fun generate(): KafkaMessage {
        val message = factory.createMessage()
        sender.send(topic, message)
        return message
    }
}
