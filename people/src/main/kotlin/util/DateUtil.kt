package util

import java.util.*

/**
 * Created by young on 2017/10/29.
 */
object DateUtil {

    fun formUtilDateToSqlDate(date: Date): java.sql.Date {
        return java.sql.Date(date.time)
    }
}