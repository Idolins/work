package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport

/**
 * Created by young on 2017/9/20.
 */
class calculatorAction : ActionSupport() {
    var num1: Float = 0.0f
    var num2: Float = 0.0f
    lateinit var op: String

    override fun execute(): String {
        var result = 0f
        when (op) {
            "+" -> result = num1 + num2
            "-" -> result = num1 - num2
            "*" -> result = num1 * num2
            "/" -> result = num1 / num2
        }
        ActionContext.getContext().put("result", result)
        return Action.SUCCESS
    }
}