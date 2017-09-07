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
@WebServlet(name = "RegisterServlet", value = "/register")
class RegisterServlet : HttpServlet() {
    private var userDao = UserDao()

    @Throws(ServletException::class, IOException::class)
    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        val user = User(request.getParameter("username"), request.getParameter("password"))
        val flag = userDao.addUser(user)
        if (flag) {
            request.setAttribute("text", "注册成功")
        } else {
            request.setAttribute("text", "注册失败")
        }
        request.getRequestDispatcher("/register.jsp").forward(request, response)
    }

    @Throws(ServletException::class, IOException::class)
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        doPost(request, response)
    }
}
