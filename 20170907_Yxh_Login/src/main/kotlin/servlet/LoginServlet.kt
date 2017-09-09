package servlet

import dao.UserDao
import entity.User
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by young on 2017/9/7.
 */
@WebServlet(name = "LoginServlet", value = "/login")
class LoginServlet : HttpServlet() {

    var userDao = UserDao()

    @Throws(ServletException::class, IOException::class)
    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        val code = request.session.getAttribute("code")
        println("code = $code")
        val user = User(request.getParameter("username"), request.getParameter("password"))
        val flag: Boolean = userDao.getUser(user)

        var path = "index.jsp"
        var text = "登陆失败"

        if (flag) {
            path = "addbook.jsp"
            text = "登陆成功"
        }
        request.setAttribute("text", text)
        request.getRequestDispatcher(path).forward(request, response)

    }

    @Throws(ServletException::class, IOException::class)
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        doPost(request, response)
    }
}
