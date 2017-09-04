package filter

import javax.servlet.*
import javax.servlet.annotation.WebFilter
import java.io.IOException

/**
 * Created by young on 2017/9/4.
 */
@WebFilter(filterName = "IsLoginFilter", value = "/*")
class IsLoginFilter : Filter {
    override fun destroy() {}

    @Throws(ServletException::class, IOException::class)
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain) {
        if (request?.getParameter("username").isNullOrEmpty()
                || request?.getParameter("password").isNullOrEmpty()){
            request?.getRequestDispatcher("")?.forward(request, response)
        }
        chain.doFilter(request, response)
    }

    @Throws(ServletException::class)
    override fun init(config: FilterConfig) {

    }

}
