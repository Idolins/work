package domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by young on 2017/10/24.
 */
@Entity
@Table(name = "user")
class User {

    @Id
    var uid: Int = 0

    lateinit var username: String
    lateinit var nickName: String
    lateinit var password: String
    lateinit var rePassword: String
    var age: Int = 18
    lateinit var sex: String
    lateinit var birthday: Date
    lateinit var province: String
    lateinit var city: String
    lateinit var area: String
    lateinit var email: String


}

