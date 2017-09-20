package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import org.apache.struts2.ServletActionContext
import java.awt.Color
import java.awt.Font
import java.awt.Font.BOLD
import java.awt.Font.ITALIC
import java.awt.Graphics
import java.awt.image.BufferedImage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.util.*
import javax.imageio.ImageIO


/**
 * Created by young on 2017/9/14.
 */
class VerificationCode : ActionSupport() {

    private var inputStream: ByteArrayInputStream? = null
    private val WIDTH = 60
    private val HEIGHT = 20

    fun getInputStream(): ByteArrayInputStream? {
        return inputStream
    }

    private fun setInputStream(inputStream: ByteArrayInputStream) {
        this.inputStream = inputStream
    }

    private fun createRandom(): String {
        val str = "0123456789qwertyupasdfghjkzxcvbnm"
        val rands = CharArray(4)
        val random = Random()
        for (i in 0..3) {
            rands[i] = str[random.nextInt(33)]
        }
        return String(rands)
    }

    private fun drawBackground(g: Graphics) {
        // 画背景
        g.color = Color(0xDCDCDC)
        g.fillRect(0, 0, WIDTH, HEIGHT)
        // 随机产生 120 个干扰点
        for (i in 0..119) {
            val x = (Math.random() * WIDTH).toInt()
            val y = (Math.random() * HEIGHT).toInt()
            val red = (Math.random() * 255).toInt()
            val green = (Math.random() * 255).toInt()
            val blue = (Math.random() * 255).toInt()
            g.color = Color(red, green, blue)
            g.drawOval(x, y, 1, 0)
        }
    }

    private fun drawRands(g: Graphics, rands: String) {
        g.color = Color.BLACK
        g.font = Font(null, ITALIC or BOLD, 18)
        // 在不同的高度上输出验证码的每个字符
        g.drawString("" + rands[0], 1, 17)
        g.drawString("" + rands[1], 16, 15)
        g.drawString("" + rands[2], 31, 18)
        g.drawString("" + rands[3], 46, 16)

    }

    @Throws(Exception::class)
    override fun execute(): String {
        val response = ServletActionContext.getResponse()
        // 设置浏览器不要缓存此图片
        response.setHeader("Pragma", "no-cache")
        response.setHeader("Cache-Control", "no-cache")
        response.setDateHeader("Expires", 0)
        val rands = createRandom()
        val image = BufferedImage(WIDTH, HEIGHT,
                BufferedImage.TYPE_INT_RGB)

        val g = image.graphics
        // 产生图像
        drawBackground(g)
        drawRands(g, rands)

        // 结束图像 的绘制 过程， 完成图像
        g.dispose()
        val outputStream = ByteArrayOutputStream()
        ImageIO.write(image, "jpeg", outputStream)
        val input = ByteArrayInputStream(outputStream
                .toByteArray())
        this.setInputStream(input)
        ActionContext.getContext().session.put("checkCode", rands)
        input.close()
        outputStream.close()
        return Action.SUCCESS
    }
}