package servlet

import java.awt.Color
import java.awt.Font
import java.awt.Graphics
import java.awt.image.BufferedImage
import java.io.ByteArrayOutputStream
import java.io.IOException
import javax.imageio.ImageIO
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


/**
 * Created by young on 2017/9/7.
 */
@WebServlet(name = "SendCodeServlet", value = "/sendCode")
class SendCodeServlet : HttpServlet() {
    private val width = 60
    private val height = 20

    @Throws(ServletException::class, IOException::class)
    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        val session = request.session
        response.contentType = "image/jpeg"
        val sos = response.outputStream
        // 设置浏览器不要缓存此图片
        response.setHeader("Pragma", "No-cache")
        response.setHeader("Cache-Control", "no-cache")
        response.setDateHeader("Expires", 0)
        // 创建内存图象并获得其图形上下文
        val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
        val g = image.graphics
        // 产生随机的认证码
        val rands = generateCheckCode()
        // 产生图像
        drawBackground(g)
        drawRands(g, rands)
        // 结束图像 的绘制 过程， 完成图像
        g.dispose()
        // 将图像输出到客户端
        val bos = ByteArrayOutputStream()
        ImageIO.write(image, "JPEG", bos)
        val buf = bos.toByteArray()
        response.setContentLength(buf.size)
        // 下面的语句也可写成： bos.writeTo(sos);
        sos.write(buf)
        bos.close()
        sos.close()
        // 将当前验证码存入到 Session 中
        session.setAttribute("code", String(rands))
        // 直接使用下面的代码将有问题， Session 对象必须在提交响应前获得
        //request.getSession().setAttribute("check_code",new String(rands));
    }

    private fun generateCheckCode(): CharArray {
        // 定义验证码的字符表
        val chars = "23456789abcdefghijklmnopqrstuvwxyz"
        val rands = CharArray(4)
        for (i in 0..3) {
            val rand = (Math.random() * 36).toInt()
            rands[i] = chars[rand]
        }
        return rands
    }

    private fun drawRands(g: Graphics, rands: CharArray) {
        g.color = Color.BLACK
        g.font = Font(null, Font.ITALIC or Font.BOLD, 18)
        // 在不同的高度上输出验证码的每个字符
        g.drawString("" + rands[0], 1, 17)
        g.drawString("" + rands[1], 16, 15)
        g.drawString("" + rands[2], 31, 18)
        g.drawString("" + rands[3], 46, 16)
        println(rands)
    }

    private fun drawBackground(g: Graphics) {
        // 画背景
        g.color = Color(0xDCDCDC)
        g.fillRect(0, 0, width, height)
        // 随机产生 120 个干扰点
        for (i in 0..119) {
            val x = (Math.random() * width).toInt()
            val y = (Math.random() * height).toInt()
            val red = (Math.random() * 255).toInt()
            val green = (Math.random() * 255).toInt()
            val blue = (Math.random() * 255).toInt()
            g.color = Color(red, green, blue)
            g.drawOval(x, y, 1, 0)
        }
    }

    @Throws(ServletException::class, IOException::class)
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        doPost(request, response)
    }
}
