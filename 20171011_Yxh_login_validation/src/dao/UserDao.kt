package dao

import db.UserDB
import entity.User

/**
 * Created by young on 2017/10/11.
 */
class UserDao {

    var userDB = UserDB.userDB

    fun selectUser(user: User): Boolean {
        println("userdb ")
        return userDB
                .firstOrNull()
                ?.let { it.email == user.email && (it.password == user.password) }
                ?: false
    }

    fun insertUser(user: User) {
        userDB.add(user)
        println(arrayListOf(userDB))
    }
}