import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.util.zip.ZipEntry
import java.util.zip.ZipOutputStream

object ZipUtils {

    @Throws(IOException::class)
    fun doCompress(srcFile: String, zipFile: String) {
        doCompress(File(srcFile), File(zipFile))
    }

    /**
     * 文件压缩
     * @param srcFile 目录或者单个文件
     * @param zipFile 压缩后的ZIP文件
     */
    @Throws(IOException::class)
    fun doCompress(srcFile: File, zipFile: File) {
        var out: ZipOutputStream? = null
        try {
            out = ZipOutputStream(FileOutputStream(zipFile))
            doCompress(srcFile, out)
        } catch (e: Exception) {
            throw e
        } finally {
            out!!.close()//记得关闭资源
        }
    }

    @Throws(IOException::class)
    fun doCompress(filelName: String, out: ZipOutputStream) {
        doCompress(File(filelName), out)
    }

    @Throws(IOException::class)
    fun doCompress(file: File, out: ZipOutputStream) {
        doCompress(file, out, "")
    }

    @Throws(IOException::class)
    fun doCompress(inFile: File, out: ZipOutputStream, dir: String) {
        if (inFile.isDirectory) {
            val files = inFile.listFiles()
            if (files != null && files.size > 0) {
                for (file in files) {
                    var name = inFile.name
                    if ("" != dir) {
                        name = dir + "/" + name
                    }
                    ZipUtils.doCompress(file, out, name)
                }
            }
        } else {
            ZipUtils.doZip(inFile, out, dir)
        }
    }

    @Throws(IOException::class)
    fun doZip(inFile: File, out: ZipOutputStream, dir: String) {
        var entryName: String? = null
        if ("" != dir) {
            entryName = dir + "/" + inFile.name
        } else {
            entryName = inFile.name
        }
        val entry = ZipEntry(entryName!!)
        out.putNextEntry(entry)

        var len = 0
        val buffer = ByteArray(1024)
        val fis = FileInputStream(inFile)
        len = fis.read(buffer)
        while (len > 0) {
            out.write(buffer, 0, len)
            out.flush()
        }
        out.closeEntry()
        fis.close()
    }

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        doCompress("D:/最近文件/实验室/", "D:/最近文件/实验室.zip")
    }

}