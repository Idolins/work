package client

import proxy.BookProxy

/**
 * Created by young on 2017/10/30.
 */
fun main(args: Array<String>) {
    val proxy = BookProxy()
    proxy.saleBook()
 val c = BookProxy::class
    println(c)

}