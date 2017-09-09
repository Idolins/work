package utli

import java.util.*

/**
 * Created by young on 2017/9/7.
 */
object CreateCode {
    fun getCode(): String {
        var authCode = ""
        for (i in 0..3) {
            authCode += Random().nextInt(10)
        }
        return authCode
    }
}