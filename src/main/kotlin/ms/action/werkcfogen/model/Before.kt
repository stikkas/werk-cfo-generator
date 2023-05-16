package ms.action.werkcfogen.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Информация о заводе или ЦФО до совершения операции
 *
 * @property cfoId идентификатор ЦФО
 * @property werkId идентификатор завода
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class Before(
    @JsonProperty("cfo_id") val cfoId: Long? = null,
    @JsonProperty("werk_id") val werkId: Long? = null
)
