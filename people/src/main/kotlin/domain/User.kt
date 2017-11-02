package domain

import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by young on 2017/10/24.
 */
@Entity
@Table(name = "user")
class User : Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    var uid: Int = 0

    lateinit var username: String
    lateinit var nickName: String
    lateinit var password: String

    @Transient
    lateinit var rePassword: String
    var age: Int = 18
    lateinit var sex: String
    lateinit var birthday: Date
    lateinit var province: String
    lateinit var city: String
    lateinit var area: String
    lateinit var email: String


}

