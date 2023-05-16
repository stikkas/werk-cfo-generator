package ms.action.werkcfogen.service

import ms.action.werkcfogen.model.KafkaMessage

interface FactoryServiceI {
    fun createMessage(): KafkaMessage
}