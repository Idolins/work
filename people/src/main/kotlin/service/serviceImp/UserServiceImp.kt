package service.serviceImp

import dao.UserDao
import dao.daoImp.UserDaoImp
import domain.User
import service.UserService

/**
 * Created by young on 2017/10/27.
 */
class UserServiceImp : UserService {


    lateinit var userDao: UserDao

    override fun register(user: User): Int {
        userDao = UserDaoImp()
        return userDao.insert(user)
    }

    override fun login(user: User): Boolean {
        userDao = UserDaoImp()
        val passwordOfSql = userDao.select(user)
        return user.password == passwordOfSql
    }
}