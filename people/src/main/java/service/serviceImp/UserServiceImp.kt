package service.serviceImp

import domain.User
import service.UserService

/**
 * Created by young on 2017/10/27.
 */
class UserServiceImp : UserService {

    override fun register(user: User): String {

        return "success"
    }
}