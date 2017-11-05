/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import service.FileService
import service.serviceImp.FileServiceImp
import java.io.File

/**
 * Created by young on 2017/11/5.
 */
class UploadAction : ActionSupport() {

    lateinit var upload: Array<File>
    lateinit var uploadContentType: Array<String>
    lateinit var uploadFileName: Array<String>
    lateinit var fileService: FileService

    override fun execute(): String {

        fileService = FileServiceImp()
        fileService.uploadFile(upload, uploadContentType, uploadFileName)
        return Action.SUCCESS
    }


    fun showAllFiles(): String {
        fileService = FileServiceImp()
        fileService.getAllFiles().map { println(it) }
        ActionContext.getContext().put("files", fileService.getAllFiles())
        return Action.SUCCESS
    }
}