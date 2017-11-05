package util

import org.hibernate.Session
import org.hibernate.SessionFactory

/**
 * Created by young on 2017/11/2.
 */
object HBNSessionFactory {

    private lateinit var sessionFactory: SessionFactory

    // 公用的获取会话
    fun getSession(): Session {
        return sessionFactory.openSession()
    }
}