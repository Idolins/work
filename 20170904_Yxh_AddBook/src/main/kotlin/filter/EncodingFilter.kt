package filter

import java.io.IOException
import javax.servlet.*
import javax.servlet.annotation.WebFilter
import javax.servlet.annotation.WebInitParam

/**
 * Created by young on 2017/9/4.
 */
@WebFilter(filterName = "EncodingFilter",
        initParams = arrayOf(WebInitParam(name = "encoding", value = "utf-8")))
class EncodingFilter : Filter {

    lateinit var encoding: String

    override fun destroy() {}

    @Throws(ServletException::class, IOException::class)
    override fun doFilter(req: ServletRequest, resp: ServletResponse, chain: FilterChain) {
        req.characterEncoding = encoding
        chain.doFilter(req, resp)
    }

    @Throws(ServletException::class)
    override fun init(config: FilterConfig) {
        encoding = config.getInitParameter("encoding")
    }

}
