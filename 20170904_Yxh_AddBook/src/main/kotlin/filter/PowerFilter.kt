package filter

import javax.servlet.*
import javax.servlet.annotation.WebFilter
import java.io.IOException

/**
 * Created by young on 2017/9/4.
 */
@WebFilter(filterName = "PowerFilter",value = "/add")
class PowerFilter : Filter {
    override fun destroy() {}

    @Throws(ServletException::class, IOException::class)
    override fun doFilter(req: ServletRequest?, resp: ServletResponse?, chain: FilterChain) {
        if (req?.getParameter("bookName").isNullOrEmpty()
                || req?.getParameter("bookAuthor").isNullOrEmpty()
                || req?.getParameter("bookPrice").isNullOrEmpty()) {
            req?.setAttribute("flag", true)
            req?.getRequestDispatcher("index.jsp")?.forward(req, resp)

        } else {
            chain.doFilter(req, resp)
        }
    }

    @Throws(ServletException::class)
    override fun init(config: FilterConfig) {

    }

}
