package ms.action.werkcfogen.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "cfo", schema = "org")
class Cfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @Column(name = "cfo_id")
    var cfoId: Int = 0

    @Column(name = "last_modified_datetime")
    lateinit var lastModifiedDatetime: LocalDateTime

    @Column(name = "last_modified_type")
    lateinit var lastModifiedType: String

    @Column(name = "cfo_type")
    var cfoType: String? = null

    @Column(name = "format")
    var format: String? = null

    @Column(name = "full_name_director")
    var fullNameDirector: String? = null

    @Column(name = "mobile_phone_director")
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