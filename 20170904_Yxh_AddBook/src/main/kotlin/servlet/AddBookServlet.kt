package servlet

import entity.Book
import java.io.IOException
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by young on 2017/9/4.
 */
@WebServlet(name = "AddBookServlet", value = "/add")
class AddBookServlet : HttpServlet() {

    private lateinit var list: ArrayList<Book>

    @Throws(javax.servlet.ServletException::class, IOException::class)
    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        val book = Book(
                request.getParameter("bookName"),
                request.getParameter("bookAuthor"),
                request.getParameter("bookPrice").toFloat())
        list.add(book)
        println(list)
        request.setAttribute("list", list)
        request.getRequestDispatcher("/show.jsp").forward(request, response)
    }

    @Throws(javax.servlet.ServletException::class, IOException::class)
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        doPost(request, response)
    }

    override fun init() {
        super.init()
        list = ArrayList()
    }
}
