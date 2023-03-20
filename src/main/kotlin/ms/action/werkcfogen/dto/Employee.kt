package ms.action.werkcfogen.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class Employee(
    @JsonProperty("FIO") var fio: String? = null,
    @JsonProperty("SEX") var sex: String? = null,
    @JsonProperty("ROLE") var role: String? = null,
    @JsonProperty("TYPE") var type: String? = null,
    @JsonProperty("EMAIL") var email: String? = null,
    @JsonProperty("HPERN") var hpern: String? = null,
    @JsonProperty("PERNR") var pernr: String? = null,
    @JsonProperty("PROZT") var prozt: String? = null,
    @JsonProperty("USRID") var usrid: String? = null,
    @JsonProperty("SEX_ID") var sexId: String? = null,
    @JsonProperty("ROLE_ID") var roleId: String? = null,
    @JsonProperty("TYPE_ID") var typeId: String? = null,
    @JsonProperty("STELL_ID") var stellId: String? = null,
    @JsonProperty("STELL_TXT") var stellTxt: String? = null,
    @JsonProperty("MOBILE_PHONE") var mobilePhone: String? = null
)
