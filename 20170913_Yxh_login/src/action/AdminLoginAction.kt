package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import entity.User

/**
 * Created by young on 2017/9/18.
 */
class AdminLoginAction : ActionSupport(), ModelDriven<User> {


    private var user: User = User()
    lateinit var checkCode: String

    override fun getModel(): User = user

    override fun validate() {
        val code = ActionContext.getContext().session["checkCode"] as String
        if (user.username.trim().isEmpty()) {
            addFieldError("username", "用户名不能为空")
        }
        if (user.password.trim().isEmpty())
            addFieldError("password", "密码不能为空")
        if (!checkCode.trim().equals(code, true)) {
            addFieldError("code", "验证码错误")
        }
    }

    @Throws(Exception::class)
    fun login(): String {
        return if (user.username == "yxh" && user.password == "456") {
            ActionContext.getContext().session.put("username", user.username)
            ActionContext.getContext().session.put("type", "管理员")
            Action.SUCCESS
        } else {
            ActionContext.getContext().put("error", "账号或密码错误")
            Action.ERROR
        }
    }
}