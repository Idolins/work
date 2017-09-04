package filter

import java.io.IOException
import javax.servlet.*
import javax.servlet.annotation.WebFilter
import javax.servlet.annotation.WebInitParam

/**
 * Created by young on 2017/9/4.
 */
@WebFilter(filterName = "EncodingFilter", value = "/*",
        initParams = arrayOf(WebInitParam(name = "encoding", value = "utf-8")))
class EncodingFilter : Filter {
    lateinit var encoding:String
    override fun destroy() {}

    @Throws(ServletException::class, IOException::class)
    override fun doFilter(request: ServletRequest, response: ServletResponse, chain: FilterChain) {
        request.characterEncoding = encoding
        chain.doFilter(request, response)
    }

    @Throws(ServletException::class)
    override fun init(config: FilterConfig) {
        encoding = config.getInitParameter("encoding")
    }

}
