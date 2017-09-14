package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport

import java.util.Objects

/**
 * Created by young on 2017/9/13.
 */
class LoginAction : ActionSupport() {

    var username: String? = null
    var password: String? = null

    @Throws(Exception::class)
    override fun execute(): String {
        return if (username == "yxh" && password == "123") {
            ActionContext.getContext().session.put("username", username)
            Action.SUCCESS
        } else {
            ActionContext.getContext().put("error", "账号或密码错误")
            Action.ERROR
        }
    }
}
