package filter

import java.io.IOException
import javax.servlet.*
import javax.servlet.annotation.WebFilter
import javax.servlet.annotation.WebInitParam
import javax.servlet.http.HttpServletRequest


/**
 * Created by young on 2017/9/4.
 */
@WebFilter(filterName = "IsLoginFilter", value = "/*",
        initParams = arrayOf(WebInitParam(name = "excludedPages", value = "/login")))
class IsLoginFilter : Filter {

    lateinit var excludePages: String

    override fun destroy() {}

    @Throws(ServletException::class, IOException::class)
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain) {
        if (request?.getParameter("username").isNullOrEmpty()
                || request?.getParameter("password").isNullOrEmpty()) {
            request?.getRequestDispatcher("")?.forward(request, response)
        }
        var f = false
        val path = (request as HttpServletRequest).servletPath
        if (path.equals(excludePages)) {
            f = true
        }
        if (!(f || request.session != null)) {
            chain.doFilter(request, response)
        } else  {
            request.getRequestDispatcher("fail.jsp")?.forward(request, response)
        }
    }

    @Throws(ServletException::class)
    override fun init(config: FilterConfig) {
        excludePages = config.getInitParameter("excludedPages")
    }

}
