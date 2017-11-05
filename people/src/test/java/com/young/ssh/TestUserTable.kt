package com.young.ssh

import org.hibernate.cfg.Configuration
import org.hibernate.service.ServiceRegistryBuilder
import org.hibernate.tool.hbm2ddl.SchemaExport
import org.junit.After
import org.junit.Before
import org.junit.Test


/**
 * Created by young on 2017/11/2.
 */
class TestUserTable {

    @Before
    fun beforeInfo() {
        println("准备初始化数据库")
    }

    @Test
    fun createTable() {
        val configuration = Configuration().configure()
        val export = SchemaExport(configuration)
        export.create(true, true)
    }

    @After
    fun afterInfo() {
        println("数据库初始化完成")
    }
}