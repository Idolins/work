package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import vo.User

/**
 * Created by young on 2017/10/17.
 */
class UserAction : ActionSupport(), ModelDriven<User> {
    var user = User()

    override fun getModel(): User = user


    fun add(): String {
        return Action.SUCCESS
    }
}