package vo

/**
 * Created by young on 2017/10/17.
 */
data class Address(private var province: String,
                   private var city: String,
                   private var area: String,
                   private var street: String) {
    override fun toString(): String {
        return province + city + area + street
    }
}