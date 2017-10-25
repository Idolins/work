package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport

/**
 * Created by young on 2017/10/25.
 */
class Lbs : ActionSupport() {
    lateinit var lbs: String

    override fun execute(): String {
        println("lbs is $lbs")
        return Action.NONE
    }

}