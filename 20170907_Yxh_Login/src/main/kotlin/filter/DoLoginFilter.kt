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

    private lateinit var urlList: MutableList<String>

    override fun destroy() {}

    @Throws(ServletException::class, IOException::class)
    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        val url = (request as HttpServletRequest).requestURL
        for (u in urlList) {
            if (u == url.toString()) {
                chain.doFilter(request, response)
                break
            }
        }

//        urlList
//                .filter { it == url.toString() }
//                .forEach { chain.doFilter(request, response)
//                }
        if (request.session.getAttribute("user") == null) {
            request.getRequestDispatcher("index.jsp").forward(request, response)
        }

    }

    @Throws(ServletException::class)
    override fun init(config: FilterConfig) {
        urlList = ArrayList()
        urlList.add("http://localhost:8080/index.jsp")
        urlList.add("http://localhost:8080/sendCode")
        urlList.add("http://localhost:8080/register.jsp")
    }

}
