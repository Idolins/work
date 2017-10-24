package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport

/**
 * Created by young on 2017/10/24.
 */
class UserAction : ActionSupport() {


    fun login(): String {
        return Action.SUCCESS
    }

    fun register(): String {
        return Action.LOGIN
    }



}