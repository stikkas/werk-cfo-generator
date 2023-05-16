package ms.action.werkcfogen.service

import ms.action.werkcfogen.model.KafkaMessage

interface SenderI {
    fun send(topic: String, message: KafkaMessage)
}