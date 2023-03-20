package ms.action.werkcfogen.service

import com.fasterxml.jackson.databind.ObjectMapper
import ms.action.werkcfogen.dto.KafkaMessage
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class Sender(private val om: ObjectMapper, private val template: KafkaTemplate<String, String>) : SenderI {

    override fun send(topic: String, message: KafkaMessage) {
        template.send(topic, om.writeValueAsString(message))
    }
}