package dao

import DB.UserDB
import entity.User

/**
 * Created by young on 2017/9/7.
 */
class UserDao {
    fun addUser(user: User): Boolean = UserDB.userList.add(user)


    fun getUser(user: User): Boolean {
        for ((username, password) in UserDB.userList) {
            if (username == user.username && (password == user.password)) {
                return true
            }
        }
        return false
    }
}