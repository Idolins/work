/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package dao.daoImp

import dao.FileDao
import domain.Files
import org.hibernate.cfg.Configuration
import org.intellij.lang.annotations.Language
import util.HBNSessionFactory

/**
 * Created by young on 2017/11/5.
 */
class FileDaoImp : FileDao {

//    private val session = HBNSessionFactory.getSession()

    override fun uploadFile(file: Files): Int {
        val configuration = Configuration().configure()
        val sessionFactory = configuration.buildSessionFactory()
        val session = sessionFactory.openSession()
        val transaction = session.beginTransaction()
        val flag = session.save(file)
        transaction.commit()
        session.close()
        return flag as Int
    }


    override fun downLoadFile() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAllFiles(): MutableList<Files> {
        val configuration = Configuration().configure()
        val sessionFactory = configuration.buildSessionFactory()
        val session = sessionFactory.openSession()
        @Language("HQL")
        val hql = "from Files"
        val query = session.createQuery(hql)
        val fileLsit = query.list()
        return fileLsit as MutableList<Files>
    }
}