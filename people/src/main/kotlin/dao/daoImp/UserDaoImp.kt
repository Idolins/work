package dao.daoImp

import dao.UserDao
import domain.User
import org.hibernate.Transaction
import org.hibernate.cfg.Configuration
import util.JDBCUtil
import java.sql.PreparedStatement

/**
 * Created by young on 2017/10/27.
 */
class UserDaoImp : UserDao {

    lateinit var tx: Transaction
    var connection = JDBCUtil.getConnection()
    lateinit var ps: PreparedStatement


    override fun insert(user: User): Int {
        println("user is ${user.nickName}")
        val configuration = Configuration().configure()
        val sessionFactory = configuration.buildSessionFactory()
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val a=session.save(user)
        println("a is $a")
        transaction.commit()
        session.close()
        return 0
    }

    override fun select(user: User): String {
        val configuration = Configuration().configure()
        val sessionFactory = configuration.buildSessionFactory()
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val userSql = session.get(User::class.java, 1) as User
        println("usersql is ${userSql.nickName}")

        transaction.commit()
        session.close()
        return "123"
    }

}