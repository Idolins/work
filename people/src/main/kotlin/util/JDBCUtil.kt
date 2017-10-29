package util

import java.sql.Connection
import java.sql.DriverManager

/**
 * Created by young on 2017/10/27.
 */
object JDBCUtil {
    val user = "root"
    val password = "1234"
    val url = "jdbc:mysql://localhost:3306/ssh"
    val dirver = "com.mysql.jdbc.Driver"

    fun getConnection(): Connection {
        Class.forName(dirver)
        return DriverManager.getConnection(url, user, password)
    }
}