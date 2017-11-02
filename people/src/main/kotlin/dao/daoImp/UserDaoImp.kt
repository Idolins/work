package dao.daoImp

import dao.UserDao
import domain.User
import org.hibernate.Transaction
import org.intellij.lang.annotations.Language
import util.DateUtil
import util.JDBCUtil
import util.HBNSessionFactory
import java.sql.PreparedStatement
import java.sql.ResultSet

/**
 * Created by young on 2017/10/27.
 */
class UserDaoImp : UserDao {

    lateinit var tx:Transaction
    var connection = JDBCUtil.getConnection()
    lateinit var ps: PreparedStatement

    override fun insert(user: User): Int {

        var session= HBNSessionFactory.getSessionFactory()



        @Language("MySQL")
        val sql = "INSERT INTO user (nickname, password, username, age, sex, province, city, area, birthday,email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)"
        ps = connection.prepareStatement(sql)
        ps.setString(1, user.nickName)
        ps.setString(2, user.password)
        ps.setString(3, user.username)
        ps.setInt(4, user.age)
        ps.setString(5, user.sex)
        ps.setString(6, user.province)
        ps.setString(7, user.city)
        ps.setString(8, user.area)
        ps.setDate(9, DateUtil.formUtilDateToSqlDate(user.birthday))
        ps.setString(10, user.email)
        return ps.executeUpdate()
    }

    override fun select(user: User): String {
        @Language("MySQL")
        val sql = "SELECT * FROM user WHERE email = ?;"
        ps = connection.prepareStatement(sql)
        ps.setString(1, user.email)
        val rs: ResultSet? = ps.executeQuery()
        var password = ""
        while (rs?.next() != null) {
            password = rs.getString("password")
        }
        return password
    }

}