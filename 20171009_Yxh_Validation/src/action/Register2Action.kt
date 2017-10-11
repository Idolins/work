package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import entity.User

/**
 * Created by young on 2017/10/10.
 */
class Register2Action : ActionSupport(), ModelDriven<User> {

    var user = User()

    override fun getModel(): User = user

    fun register(): String {
        println("username is ${user.username}")
        ActionContext.getContext().put("login", "注册成功")
        return Action.SUCCESS
    }

}