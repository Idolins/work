package vo

import org.apache.struts2.util.StrutsTypeConverter

/**
 * Created by young on 2017/10/18.
 */
class AddressConverter : StrutsTypeConverter() {
    override fun convertFromString(p0: MutableMap<Any?, Any?>?, p1: Array<out String>, p2: Class<*>?): Any {
        return Address(p1[0], p1[1], p1[2], p1[3])
    }

    override fun convertToString(p0: MutableMap<Any?, Any?>?, p1: Any?): String {
        val address: Address = p1 as Address
        return address.toString()
    }
}