package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import dao.UserDao
import entity.User
import java.util.regex.Pattern

/**
 * Created by young on 2017/10/11.
 */
class LoginAction :ActionSupport(),ModelDriven<User>{

    var user = User()
    var userDao = UserDao()
    override fun getModel(): User = user

    fun login(): String {
        println("this is login")
        println("user is ${user.password} and username is ${user.email}")
        val flag = userDao.selectUser(user)
        if (flag) {
            ActionContext.getContext().session.put("info", user.email)
            return Action.SUCCESS
        } else {
            ActionContext.getContext().session.put("info", "邮箱或密码错误")
            return Action.ERROR
        }
    }

    fun validateLogin() {
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
        }
    }
}