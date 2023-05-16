package ms.action.werkcfogen.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Работник
 * @property fio ФИО
 * @property role роль
 * @property mobilePhone номер мобильного телефона
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class Employee(
    @JsonProperty("FIO") var fio: String? = null,
    @JsonProperty("ROLE") var role: String? = null,
    @JsonProperty("MOBILE_PHONE") var mobilePhone: String? = null
)
