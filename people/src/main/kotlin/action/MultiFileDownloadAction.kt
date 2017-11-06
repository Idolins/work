package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport
import util.ZipUtil
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by young on 2017/11/6.
 */
class MultiFileDownloadAction : ActionSupport() {

    //接收JSP页面传递过来的附件的路径
    var attachmentPath: String? = null

    //最终压缩后的zip文件的路径，传递给通用的下载Action
    var fileName: String? = null


    /**
     * 下载多个附件
     * 实现：将多个附近压缩成zip包,然后再下载zip包
     */
    fun downloadMultiFile(): String {
        //使用当前时间生成文件名称
        val formatDate = SimpleDateFormat("yyyyMMddHHmmssSSS").format(Date())
        //压缩后的zip文件存放路径
        fileName = "D:/test/$formatDate.zip"
        if (attachmentPath != null && "" != attachmentPath) {
            //将多个附件的路径取出
            val attachmentPathArray = attachmentPath!!.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            if (attachmentPathArray.isNotEmpty()) {
                val files = arrayOfNulls<File>(attachmentPathArray.size)
                for (i in attachmentPathArray.indices) {
                    val file = File(attachmentPathArray[i].trim { it <= ' ' })
                    if (file.exists()) {
                        files[i] = file
                    }
                }
                //将多个附件压缩成zip
                ZipUtil.compressFiles2Zip(files, fileName)
            }

        }
        return Action.SUCCESS
    }

    companion object {

        private val serialVersionUID = 2743077909387361587L
    }


}
