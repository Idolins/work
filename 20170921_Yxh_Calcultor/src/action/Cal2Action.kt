package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import entity.Calcultor

/**
 * Created by young on 2017/9/21.
 */
class Cal2Action : ActionSupport() {

    lateinit var cal: Calcultor

    override fun execute(): String {
        val result: Float = when (cal.op) {
            "+" -> cal.num1 + cal.num2
            "-" -> cal.num1 - cal.num2
            "*" -> cal.num1 * cal.num2
            "/" -> cal.num1 / cal.num2
            else -> 0f
        }
        ActionContext.getContext().put("result", result)
        return Action.SUCCESS
    }
}