package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import entity.User
import java.util.regex.Pattern

/**
 * Created by young on 2017/10/11.
 */
class Register3Action : ActionSupport(), ModelDriven<User> {

    private var user = User()

    override fun getModel(): User = user

    override fun validate() {
        //language=RegExp
        val EMAILREG = "^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"
        if (user.email == "") {
            addFieldError("email", "邮箱不能为空")
        } else if (!Pattern.matches(EMAILREG, user.email)) {
            addFieldError("email", "邮箱不符合格式")
        }
        //language=RegExp
        val PASSWORDREG = "\\w{6,20}"
        if (user.password == "") {
            addFieldError("password", "密码不能为空")
        } else if (!Pattern.matches(PASSWORDREG, user.password)) {
            addFieldError("password", "密码不符合要求")
        } else if (user.password != user.passwordAgain) {
            addFieldError("passwordAgain", "两次输入密码不一致")
        }
        //language=RegExp
        val USERNAMEREG = "[a-zA-z0-9]{2,5}"
        if (user.username == "") {
            addFieldError("username", "用户名不能为空")
        } else if (!Pattern.matches(USERNAMEREG, user.username)) {
            addFieldError("username", "用户名格式错误")
        }
        //language=RegExp
        val REALLYNAME = "[\\D]{2,4}"
        if (user.reallyName == "") {
            addFieldError("reallyName", "姓名不能为空")
        } else if (!Pattern.matches(REALLYNAME, user.reallyName)) {
            addFieldError("reallyName", "姓名格式错误")
        }
        //language=RegExp
        val TELPHONEREG = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,2,5-9]))\\d{8}$"
        if (user.telphone == "") {
            addFieldError("telphone", "手机号不能为空")
        } else if (!Pattern.matches(TELPHONEREG, user.telphone)) {
            addFieldError("telphone", "手机号格式错误")
        }
        // 空指针异常
        val code = ActionContext.getContext().session["checkCode"].toString()
        if (user.codes != code) {
            addFieldError("codes", "验证码错误")
        }
    }

    fun register(): String {
        ActionContext.getContext().put("login", "注册成功")
        return Action.SUCCESS
    }

}