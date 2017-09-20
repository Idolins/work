package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport

/**
 * Created by young on 2017/9/13.
 */
class UserLoginAction : ActionSupport() {

    lateinit var username: String
    lateinit var password: String
    lateinit var checkCode: String

    override fun validate() {
        val code = ActionContext.getContext().session["checkCode"] as String
        if (username.trim().isEmpty()) {
            addFieldError("username", "用户名不能为空")
        }
        if (password.trim().isEmpty())
            addFieldError("password", "密码不能为空")
        if (!checkCode.trim().equals(code, true)) {
            addFieldError("code", "验证码错误")
        }
    }

    @Throws(Exception::class)
    fun login(): String {
        return if (username == "yxh" && password == "123") {
            ActionContext.getContext().session.put("username", username)
            ActionContext.getContext().session.put("type", "用户")
            Action.SUCCESS
        } else {
            ActionContext.getContext().put("error", "账号或密码错误")
            Action.ERROR
        }
    }
}
