package ms.action.werkcfogen.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class KafkaMessage(
    @JsonProperty("op") val op: String,
    @JsonProperty("after") val after: After? = null,
    @JsonProperty("before") val before: Before? = null
)
