/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package service

import domain.Files
import java.io.File

/**
 * Created by young on 2017/11/5.
 */
interface FileService {
    fun uploadFile(files: Array<File>, contentType: Array<String>, fileName: Array<String>)

    fun downLoadFile(id:Int):Files

    fun getAllFiles(): MutableList<Files>
}