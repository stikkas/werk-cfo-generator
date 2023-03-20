package ms.action.werkcfogen.service

import ms.action.werkcfogen.dto.KafkaMessage

interface SenderI {
    fun send(topic: String, message: KafkaMessage)
}