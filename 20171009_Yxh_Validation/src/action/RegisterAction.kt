package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport

import java.util.Objects
import java.util.regex.Pattern

/**
 * Created by young on 2017/10/10.
 */
class RegisterAction : ActionSupport() {

    var email: String? = null
    var password: String? = null
    var passwordAgain: String? = null
    var username: String? = null
    var reallyName: String? = null
    var telphone: String? = null
    var codes: String? = null

    fun validateRegister() {

        println("username is $username and reallyName is $reallyName")

        //language=RegExp
        val EMAILREG = "^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"
        if (email == null || email!!.trim { it <= ' ' } == "") {
            addFieldError("email", "邮箱不能为空")
        } else if (!Pattern.matches(EMAILREG, email)) {
            addFieldError("email", "邮箱不符合格式")
        }
        //language=RegExp
        val PASSWORDREG = "\\w{6,20}"
        if (password == null || password!!.trim { it <= ' ' } == "") {
            addFieldError("password", "密码不能为空")
        } else if (!Pattern.matches(PASSWORDREG, password)) {
            addFieldError("password", "密码不符合要求")
        } else if (password != passwordAgain) {
            addFieldError("passwordAgain", "两次输入密码不一致")
        }
        //language=RegExp
        val USERNAMEREG = "[a-zA-z0-9]{2,5}"
        if (username == null || username!!.trim { it <= ' ' } == "") {
            addFieldError("username", "用户名不能为空")
        } else if (!Pattern.matches(USERNAMEREG, username)) {
            addFieldError("username", "用户名格式错误")
        }
        //language=RegExp
        val REALLYNAME = "[\\D]{2,4}"
        if (reallyName == null || reallyName!!.trim { it <= ' ' } == "") {
            addFieldError("reallyName", "姓名不能为空")
        } else if (!Pattern.matches(REALLYNAME, reallyName)) {
            addFieldError("reallyName", "姓名格式错误")
        }
        //language=RegExp
        val TELPHONEREG = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,2,5-9]))\\d{8}$"
        if (telphone == null || telphone!!.trim { it <= ' ' } == "") {
            addFieldError("telphone", "手机号不能为空")
        } else if (!Pattern.matches(TELPHONEREG, telphone)) {
            addFieldError("telphone", "手机号格式错误")
        }
        // 空指针异常
        val code = ActionContext.getContext().session["checkCode"].toString()
        println("code is " + code)
        if (codes == null || codes != code) {
            addFieldError("codes", "验证码错误")
        }
    }

    fun register(): String {
        ActionContext.getContext().put("login", "注册成功")
        return Action.SUCCESS
    }
}
