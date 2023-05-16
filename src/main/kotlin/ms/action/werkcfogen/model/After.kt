package ms.action.werkcfogen.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalTime

/**
 * Информация о заводе или ЦФО после совершения операции
 *
 * @property address адрес
 * @property cfoId идентификатор ЦФО
 * @property werkId идентификатор завода
 * @property email список адресов электронной почты
 * @property openHour время открытия
 * @property closeHour время закрытия
 * @property coordinates координаты объекта для отображения на карте
 * @property metro близлежащая станция метро
 * @property cfoType тип ЦФО
 * @property employees список работников
 * @property format тип завода
 * @property metaData дополнительная информация
 * @property status состояние (открыт / закрыт)
 * @property title наименование
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class After(
    @JsonProperty("address") val address: String?, //"141580, Московская обл, Солнечногорский р-н, стр.1",
    @JsonProperty("cfo_id") val cfoId: Long? = null, // 1
    @JsonProperty("werk_id") val werkId: Long? = null, // 2
    @JsonProperty("email") val email: List<String>? = null, // [ "URL-4732-Dir@x5.ru" ]
    @JsonProperty("open_hour") val openHour: LocalTime? = null, // null
    @JsonProperty("close_hour") val closeHour: LocalTime? = null, // null
    @JsonProperty("coordinates") val coordinates: String? = null, // "55.9726, 37.3072"
    @JsonProperty("metro") val metro: String? = null, //"отсутствует метро"
    @JsonProperty("cfo_type") val cfoType: String? = null, // "S"
    @JsonProperty("employees") val employees: String? = null, //"[{\"FIO\": \"Гаврилов Виктор Вадимович\"}]"
    @JsonProperty("format") val format: String? = null, // "D"
    @JsonProperty("meta_data") val metaData: String? = null, // "{\"MR\": \"MRDND\", \"NQ\": \"1055\"}"
    @JsonProperty("status") val status: String? = null, // "Объект закрыт"
    @JsonProperty("title") val title: String? = null //"РЦ Черная Грязь (закрыт)"
)
