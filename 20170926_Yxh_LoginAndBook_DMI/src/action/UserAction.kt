package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import dao.UserDao
import entity.User

/**
 * Created by young on 2017/9/26.
 */
class UserAction : ActionSupport(), ModelDriven<User> {

    private var user: User = User()


    override fun getModel(): User = user

    override fun validate() {

        if (user.username.trim().isEmpty()) {
            addFieldError("username", "用户名不能为空")
        }
        if (user.password.trim().isEmpty())
            addFieldError("password", "密码不能为空")

    }


    var userDao = UserDao()
    fun login(): String {
        val flag = userDao.selectUser(user)
        return if (flag) {
            Action.LOGIN
        } else {
            Action.ERROR
        }
    }


    fun register(): String {
        userDao.insertUser(user)
        return Action.SUCCESS
    }

}