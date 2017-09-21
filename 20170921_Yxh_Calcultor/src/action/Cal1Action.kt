package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport

/**
 * Created by young on 2017/9/21.
 * 属性封装
 */
class Cal1Action : ActionSupport() {

    var num1: Float = 0.toFloat()
    var num2: Float = 0.toFloat()
    var op: String? = null

    @Throws(Exception::class)
    override fun execute(): String {


        val result: Float = when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> 0f
        }
        ActionContext.getContext().put("result",result)
        return Action.SUCCESS
    }
}
