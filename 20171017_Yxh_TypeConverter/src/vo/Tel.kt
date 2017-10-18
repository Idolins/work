package vo

/**
 * Created by young on 2017/10/17.
 */
data class Tel(private var areaCode: String,
               private var telNumber: String) {
    override fun toString(): String {
        return areaCode + "-" + telNumber
    }
}