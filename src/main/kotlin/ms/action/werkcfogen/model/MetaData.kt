package ms.action.werkcfogen.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Дополнительная информация о заводе
 *
 * @property city город
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class MetaData(
    @JsonProperty("CITY") var city: String? = null
)
