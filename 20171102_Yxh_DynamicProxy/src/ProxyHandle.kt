import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * @author young
 * @date 2017/11/2
 */
class ProxyHandle internal constructor(private val target: Any, private val method: Method) : InvocationHandler {
    private val it = Intercepter()

    @Throws(Throwable::class)
    override fun invoke(proxy: Any, method: Method, args: Array<Any>): Any? {
        var result: Any? = null
        if (method.equals(method.name)) {
            it.method1()
            result = method.invoke(target, *args)
            it.method2()
        } else {
            result = method.invoke(target, *args)
        }
        return result
    }
}
