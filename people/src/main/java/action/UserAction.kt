package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import domain.User
import service.UserService
import service.serviceImp.UserServiceImp

/**
 * Created by young on 2017/10/24.
 */
class UserAction : ActionSupport(), ModelDriven<User> {

    var user = User()

    lateinit var userService: UserService

    override fun getModel(): User = user

    fun registerValidate() {
        if (user.username.length in 5..9) {

        } else {

        }
    }


    fun login(): String {
        return Action.SUCCESS
    }

    fun register(): String {
        userService = UserServiceImp()
        println("$user")
        userService.register(user)
        return Action.LOGIN
    }
}