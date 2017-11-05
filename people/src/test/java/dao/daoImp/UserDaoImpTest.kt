package dao.daoImp

import dao.UserDao
import domain.User
import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by young on 2017/11/2.
 */
class UserDaoImpTest {

    lateinit var user: User
    lateinit var userDao: UserDao

    @Before
    fun setUp() {
        user = User()

        userDao = UserDaoImp()
    }

    @After
    fun tearDown() {
    }


    @Test
    fun insert() {
        user.nickname = "李二傻子"
        user.email="young@123.com"
        userDao.insert(user)
    }

    @Test
    fun select() {
        user.email="young@123.com"
        userDao.select(user)

    }

}