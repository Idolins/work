package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport
import java.io.File

/**
 * Created by young on 2017/10/23.
 */
class UploadAction : ActionSupport() {
    lateinit var file: File
    lateinit var fileContentType: String
    lateinit var fileFileName: String

    override fun execute(): String {
        val path = File("D:\\upload\\$fileFileName")
        file.copyTo(path, true, DEFAULT_BUFFER_SIZE) //8 * 1024
        return Action.SUCCESS
    }
}