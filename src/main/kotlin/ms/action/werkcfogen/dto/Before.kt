package ms.action.werkcfogen.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Before(
    @JsonProperty("address") val address: String? = null,
    @JsonProperty("cfo_id") val cfoId: Int? = null,
    @JsonProperty("close_hour") val closeHour: String? = null,
    @JsonProperty("coordinates") val coordinates: String? = null,
    @JsonProperty("created") val created: Long? = null,
    @JsonProperty("email") val email: List<String>? = null,
    @JsonProperty("fact_close_date") val factCloseDate: String? = null,
    @JsonProperty("fact_open_date") val factOpenDate: Int? = null,
    @JsonProperty("inn") val inn: String? = null,
    @JsonProperty("is_archive") val isArchive: Boolean? = null,
    @JsonProperty("meta_data") val metaData: String? = null,
    @JsonProperty("metro") val metro: String? = null,
    @JsonProperty("modified") val modified: Long? = null,
    @JsonProperty("mvp") val mvp: String? = null,
    @JsonProperty("nq_id") val nqId: String? = null,
    @JsonProperty("open_hour") val openHour: String? = null,
    @JsonProperty("phone") val phone: String? = null,
    @JsonProperty("sap_id") val sapId: String? = null,
    @JsonProperty("status") val status: String? = null,
    @JsonProperty("timezone") val timezone: String? = null,
    @JsonProperty("timezone_offset") val timezoneOffset: String? = null,
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("werk_id") val werkId: Int? = null
)
