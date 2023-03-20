package ms.action.werkcfogen.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "werk", schema = "org")
class Werk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @Column(name = "werk_id")
    var werkId: Int = 0

    @Column(name = "last_modified_datetime")
    lateinit var lastModifiedDatetime: LocalDateTime

    @Column(name = "last_modified_type")
    lateinit var lastModifiedType: String

    @Column(name = "cfo_id")
    var cfoId: Int? = null

    @Column(name = "title")
    var title: String? = null

    @Column(name = "address")
    var address: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "status")
    var status: String? = null

    @Column(name = "coordinates")
    var coordinates: String? = null

    @Column(name = "metro")
    var metro: String? = null

    @Column(name = "open_hour")
    var openHour: String? = null

    @Column(name = "close_hour")
    var closeHour: String? = null

    @Column(name = "city")
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
