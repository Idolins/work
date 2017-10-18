package vo

import org.apache.struts2.util.StrutsTypeConverter

/**
 * Created by young on 2017/10/17.
 */
class TelConverter : StrutsTypeConverter() {
    override fun convertFromString(p0: MutableMap<Any?, Any?>?, p1: Array<out String>, p2: Class<*>?): Any {
        println("p1 is $p1")
        val tel = p1[0].split("-") as Array<String>

        return Tel(tel[0], tel[1])
    }

    override fun convertToString(p0: MutableMap<Any?, Any?>?, p1: Any?): String {
        val tel: Tel = p1 as Tel
        return tel.toString()
    }
}