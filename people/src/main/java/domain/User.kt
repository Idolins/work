package domain

import java.util.*

/**
 * Created by young on 2017/10/24.
 */
data class User(
        var firstName: String,
        var lastName: String,
        var age: String,
        var birthday: Date,
        var province: String,
        var city: String,
        var area: String,
        var street: String
)