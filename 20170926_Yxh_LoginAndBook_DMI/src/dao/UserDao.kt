package dao

import db.UserDB
import entity.User

/**
 * Created by young on 2017/9/26.
 */
class UserDao {

    var userDB = UserDB.userDB

    fun selectUser(user: User): Boolean {
        return userDB
                .firstOrNull()
                ?.let { it.username == user.username && (it.password == user.password) }
                ?: false
    }

    fun insertUser(user: User) {
        userDB.add(user)
    }
}