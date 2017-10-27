package domain

import java.util.*

/**
 * Created by young on 2017/10/24.
 */
class User {
    lateinit var username: String
    lateinit var nickName: String
    lateinit var password: String
    lateinit var rePassword: String
    var age: Int = 18
    lateinit var sex: String
    lateinit var birthday: Date
    var province: String = ""
    var city: String = ""
    var area: String = ""

    override fun toString(): String {
        return "User(username='$username', nickName='$nickName', password='$password', rePassword='$rePassword', age=$age, sex='$sex', birthday=$birthday, province='$province', city='$city', area='$area')"
    }



}

