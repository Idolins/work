package dao

import domain.User

/**
 * Created by young on 2017/10/29.
 */
interface UserDao {
    fun insert(user: User): Int
    fun select(user: User): String
}