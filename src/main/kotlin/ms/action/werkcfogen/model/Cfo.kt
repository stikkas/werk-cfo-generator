package ms.action.werkcfogen.model

import java.time.LocalDateTime

class Cfo {
    var id: Int? = null

    var cfoId: Int = 0

    lateinit var lastModifiedDatetime: LocalDateTime

    lateinit var lastModifiedType: String

    var cfoType: String? = null

    var format: String? = null

    var fullNameDirector: String? = null

    var mobilePhoneDirector: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cfo

        return (id == other.id) &&
                (cfoId == other.cfoId) &&
                (lastModifiedDatetime == other.lastModifiedDatetime) &&
                (lastModifiedType == other.lastModifiedType) &&
                (cfoType == other.cfoType) &&
                (format == other.format) &&
                (fullNameDirector == other.fullNameDirector) &&
                (mobilePhoneDirector == other.mobilePhoneDirector)
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + cfoId
        result = 31 * result + lastModifiedDatetime.hashCode()
        result = 31 * result + lastModifiedType.hashCode()
        result = 31 * result + (cfoType?.hashCode() ?: 0)
        result = 31 * result + (format?.hashCode() ?: 0)
        result = 31 * result + (fullNameDirector?.hashCode() ?: 0)
        result = 31 * result + (mobilePhoneDirector?.hashCode() ?: 0)
        return result
    }
}
