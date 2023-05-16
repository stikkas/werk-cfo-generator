package ms.action.werkcfogen.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Информация о заводе или ЦФО, получаемая из топика кафки
 *
 * @property op тип операции
 * @property after данные после соверщения операции
 * @property before данные до соверщения операции
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class KafkaMessage(
    @JsonProperty("op") val op: String,
    @JsonProperty("after") val after: After? = null,
    @JsonProperty("before") val before: Before? = null
)
