package ms.action.werkcfogen.model

import java.time.LocalDateTime

class Werk {
    var id: Int? = null

    var werkId: Int = 0

    lateinit var lastModifiedDatetime: LocalDateTime

    lateinit var lastModifiedType: String

    var cfoId: Int? = null

    var title: String? = null

    var address: String? = null

    var email: String? = null

    var status: String? = null

    var coordinates: String? = null

    var metro: String? = null

    var openHour: String? = null

    var closeHour: String? = null

    var city: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        val obj = other as? Werk
        return obj != null &&
                id == obj.id &&
                werkId == obj.werkId &&
                lastModifiedDatetime == obj.lastModifiedDatetime &&
                lastModifiedType == obj.lastModifiedType &&
                cfoId == obj.cfoId &&
                title == obj.title &&
                address == obj.address &&
                email == obj.email &&
                status == obj.status &&
                coordinates == obj.coordinates &&
                metro == obj.metro &&
                openHour == obj.openHour &&
                closeHour == obj.closeHour &&
                city == obj.city
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + werkId
        result = 31 * result + lastModifiedDatetime.hashCode()
        result = 31 * result + lastModifiedType.hashCode()
        result = 31 * result + (cfoId ?: 0)
        result = 31 * result + (title?.hashCode() ?: 0)
        result = 31 * result + (address?.hashCode() ?: 0)
        result = 31 * result + (email?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (coordinates?.hashCode() ?: 0)
        result = 31 * result + (metro?.hashCode() ?: 0)
        result = 31 * result + (openHour?.hashCode() ?: 0)
        result = 31 * result + (closeHour?.hashCode() ?: 0)
        result = 31 * result + (city?.hashCode() ?: 0)
        return result
    }
}
