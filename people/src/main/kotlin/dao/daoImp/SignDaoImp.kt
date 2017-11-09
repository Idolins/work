package dao.daoImp

import dao.SignDao
import domain.SignInfo
import org.hibernate.cfg.Configuration

/**
 * Created by young on 2017/11/9.
 */
class SignDaoImp : SignDao {


    override fun save(signInfo: SignInfo) {
        val configuration = Configuration().configure()
        val sessionFactory = configuration.buildSessionFactory()
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val flag = session.save(signInfo)
        transaction.commit()
        session.close()
    }
}