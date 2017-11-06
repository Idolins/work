package service

import domain.Files
import java.io.File

/**
 * Created by young on 2017/11/5.
 */
interface FileService {
    fun uploadFile(files: Array<File>, contentType: Array<String>, fileName: Array<String>)

    fun downLoadFile(id: Int): Files

    fun getAllFiles(): MutableList<Files>

    fun deleteFile(id:Int):String
}