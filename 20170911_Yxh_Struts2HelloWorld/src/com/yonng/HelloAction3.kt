package com.yonng

import com.opensymphony.xwork2.Action


/**
 * Created by young on 2017/9/11.
 */
class HelloAction3 :Action{
    override fun execute(): String {
        return Action.SUCCESS
    }
}