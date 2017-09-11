package com.yonng

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport

/**
 * Created by young on 2017/9/11.
 */

class HelloAction:ActionSupport(){

    override fun execute(): String {
        return Action.SUCCESS
    }
}