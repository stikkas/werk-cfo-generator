package ms.action.werkcfogen.service

import ms.action.werkcfogen.dto.KafkaMessage

interface FactoryServiceI {
    fun createMessage(): KafkaMessage
}