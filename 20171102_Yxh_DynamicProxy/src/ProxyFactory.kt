import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 *
 * @author young
 * @date 2017/11/2
 */
object ProxyFactory {

    fun getProxy(`object`: Any, method: Method): Any {
        val handle = ProxyHandle(`object`, method)

        return Proxy.newProxyInstance(DogImpl::class.java.classLoader, `object`.javaClass.interfaces, handle)
    }
}
