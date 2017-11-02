package util

import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration

/**
 * Created by young on 2017/11/2.
 */
object HBNSessionFactory {

    private var sessionFactory: SessionFactory? = null

    // 公用的获取会话
    fun getSessionFactory(): SessionFactory? {
        if (sessionFactory == null) {
            val configuration = Configuration().configure()
            val sessionFactory = configuration.buildSessionFactory()
            val session = sessionFactory.openSession()

        }
        return sessionFactory
    }
}