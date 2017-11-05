package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
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
//
//    fun registerValidate() {
//        if (user.username.length in 5..9) {
//
//        } else {
//
//        }
//    }


    fun login(): String {
        userService = UserServiceImp()
        val bool = userService.login(user)
        var result = Action.ERROR
        val user = bool?.get(0)
        println("user is ${user?.nickname}")
        if (user != null) {
            ActionContext.getContext().session.put("user", user)
            result = Action.SUCCESS
        } else {
            ActionContext.getContext().put("loginError", "邮箱或密码错误")
        }
        return result
    }

    fun register(): String {
        userService = UserServiceImp()
        val flag = userService.register(user)
        return if (flag == 1) {
            ActionContext.getContext().session.clear()
            Action.LOGIN
        } else {
            ActionContext.getContext().session.clear()
            Action.ERROR
        }
    }
}