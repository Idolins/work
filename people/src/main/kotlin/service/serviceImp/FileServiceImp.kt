/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package service.serviceImp

import dao.FileDao
import dao.daoImp.FileDaoImp
import domain.Files
import org.apache.struts2.ServletActionContext
import service.FileService
import util.IconUtil
import java.io.File
import java.io.Serializable
import java.util.*


/**
 * Created by young on 2017/11/5.
 */
class FileServiceImp : FileService {


    lateinit var file: File
    private lateinit var fileDao: FileDao
    override fun uploadFile(files: Array<File>, contentType: Array<String>, fileName: Array<String>) {
        fileDao = FileDaoImp()

        val realPath = ServletActionContext.getServletContext().getRealPath("/files")
        for (i in 0 until files.size) {
            val fileSuffix = fileName[i].substringAfter('.')
            val icon = IconUtil.getIcon(fileSuffix)
            val name = UUID.randomUUID().toString() + "." + fileName[i].substringAfter('.')
            val file = File("$realPath/$name")
            val path = file.canonicalPath
            val saveFile: Files = Files()
            saveFile.path = path
            saveFile.icon = icon
            saveFile.name = fileName[i]
            fileDao.uploadFile(saveFile)
            files[i].copyTo(file, true)
        }
    }

    override fun downLoadFile(id: Int): Files {
        fileDao = FileDaoImp()
        val file=fileDao.downLoadFile(id as Serializable)
        return file
    }


    override fun getAllFiles(): MutableList<Files> {
        fileDao = FileDaoImp()
        return fileDao.getAllFiles()
    }
}