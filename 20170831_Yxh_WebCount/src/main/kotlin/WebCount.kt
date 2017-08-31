import javax.servlet.ServletContext
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by young on 2017/8/31.
 */
@WebServlet(name = "WebCount", value = "/WebCount")
class WebCount : HttpServlet() {
    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {
        req?.characterEncoding = "UTF-8"
        resp?.setHeader("content-type", "text/html;charset=UTF-8")
        val application: ServletContext = req?.servletContext!!
        val count = application.getAttribute("count")
        if (count == null) {
            application.setAttribute("count", 0)
        } else {
            application.setAttribute("count", count as Int + 1)
        }
        resp?.writer?.write("总计人数为：$count")

    }

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        doPost(req, resp)
    }
}