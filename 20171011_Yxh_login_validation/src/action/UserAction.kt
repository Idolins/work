package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import dao.UserDao
import entity.User

/**
 * Created by young on 2017/10/11.
 */
class UserAction : ActionSupport(), ModelDriven<User> {

    var user = User()
    var userDao = UserDao()
    override fun getModel(): User = user

    fun register(): String {
        println("user is ${user.username} password is ${user.password}")
        userDao.insertUser(user)
        ActionContext.getContext().session.put("注册成功，请登陆", user.username)
        return Action.SUCCESS
    }



}