package ms.action.werkcfogen.dto

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalTime

data class After(
    @JsonProperty("address") val address: String?,
    @JsonProperty("business_type") val businessType: String? = null,
    @JsonProperty("cfo_id") val cfoId: Int? = null,
    @JsonProperty("werk_id") val werkId: Int? = null,
    @JsonProperty("sap_id") val sapId: String? = null,
    @JsonProperty("nq_id") val nqId: String? = null,
    @JsonProperty("mvp") val mvp: String? = null,
    @JsonProperty("inn") val inn: String? = null,
    @JsonProperty("phone") val phone: String? = null,
    @JsonProperty("email") val email: List<String>? = null,
    @JsonProperty("timezone") val timezone: String? = null,
    @JsonFormat(pattern = "HH:mm:ss")
    @JsonProperty("open_hour") val openHour: LocalTime? = null,
    @JsonFormat(pattern = "HH:mm:ss")
    @JsonProperty("close_hour") val closeHour: LocalTime? = null,
    @JsonProperty("coordinates") val coordinates: String? = null,
    @JsonProperty("metro") val metro: String? = null,
    @JsonProperty("fact_open_date") val factOpenDate: Int? = null,
    @JsonProperty("fact_close_date") val factCloseDate: Int? = null,
    @JsonProperty("cfo_parent") val cfoParent: String? = null,
    @JsonProperty("cfo_type") val cfoType: String? = null,
    @JsonProperty("close_date") val closeDate: Int? = null,
    @JsonProperty("created") val created: Long? = null,
    @JsonProperty("employees") val employees: String? = null,
    @JsonProperty("format") val format: String? = null,
    @JsonProperty("is_archive") val isArchive: Boolean? = null,
    @JsonProperty("mdm_id") val mdmId: String? = null,
    @JsonProperty("meta_data") val metaData: String? = null,
    @JsonProperty("modified") val modified: Long? = null,
    @JsonProperty("open_date") val openDate: Int? = null,
    @JsonProperty("status") val status: String? = null,
    @JsonProperty("subformat") val subFormat: String? = null,
    @JsonProperty("title") val title: String? = null,
    @JsonProperty("timezone_offset") val timezoneOffset: String? = null
)
