package filter

import java.io.IOException
import javax.servlet.*
import javax.servlet.annotation.WebFilter
import javax.servlet.http.HttpServletRequest

/**
 * Created by young on 2017/9/9.
 */
@WebFilter(filterName = "DoLoginFilter", value = "*.jsp")
class DoLoginFilter : Filter {
    override fun init(filterConfig: FilterConfig?) {

    }

    override fun destroy() {}

    @Throws(ServletException::class, IOException::class)
    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        val url = (request as HttpServletRequest).requestURL
        val user = request.session.getAttribute("user")
        if (user != null || url.toString() == "http://localhost:8080/register.jsp") {
            chain.doFilter(request, response)
        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response)
        }
    }
}



