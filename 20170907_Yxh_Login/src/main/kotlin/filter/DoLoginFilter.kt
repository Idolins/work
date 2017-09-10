package filter

import java.io.IOException
import javax.servlet.*
import javax.servlet.annotation.WebFilter
import javax.servlet.http.HttpServletRequest

/**
 * Created by young on 2017/9/9.
 */
@WebFilter(filterName = "DoLoginFilter", urlPatterns = arrayOf("/*"))
class DoLoginFilter : Filter {
    override fun init(filterConfig: FilterConfig?) {
        urlList = ArrayList()
        urlList.add("http://localhost:8080/index.jsp")
        urlList.add("http://localhost:8080/sendCode")
        urlList.add("http://localhost:8080/register.jsp")
    }

    private lateinit var urlList: MutableList<String>

    override fun destroy() {}

    @Throws(ServletException::class, IOException::class)
    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        val url = (request as HttpServletRequest).requestURL
        var flag = true
        for (u in urlList) {
            if (u == url.toString()) {
                println(u)
                chain.doFilter(request, response)
                flag = false
                break
            }
            if (request.session.getAttribute("user") == null && flag) {
                request.getRequestDispatcher("index.jsp").forward(request, response)
            }
        }
    }
}



