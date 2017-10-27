package service

import domain.User

/**
 * Created by young on 2017/10/27.
 */
interface UserService {
    fun register(user: User): String
}