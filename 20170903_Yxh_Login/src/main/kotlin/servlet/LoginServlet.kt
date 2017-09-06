package servlet

import entity.User
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by young on 2017/9/4.
 */
@WebServlet(name = "LoginServlet", value = "/login")
class LoginServlet : HttpServlet() {
    @Throws(ServletException::class, IOException::class)
    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        val user = User(request.getParameter("username"), request.getParameter("password"))
        var session = request.session
        if (user.username == "admin" && user.password == "admin") {
            request.setAttribute("user", user)
            session.setAttribute("user", user)
            request.getRequestDispatcher("/succeed.jsp").forward(request, response)
        } else {
            request.setAttribute("user", "该用户不存在")
            request.getRequestDispatcher("/fail.jsp").forward(request, response)
        }
    }

    @Throws(ServletException::class, IOException::class)
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        doPost(request, response)
    }
}
