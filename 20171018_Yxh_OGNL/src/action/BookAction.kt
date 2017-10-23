package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport
import entity.Book

/**
 * Created by young on 2017/10/18.
 */
class BookAction : ActionSupport() {

    var books: MutableList<Book> = ArrayList()

    fun addBook(): String {
        books.add(Book("Java", 20f))
        books.add(Book("Android", 20f))
        books.add(Book("python", 20f))
        books.add(Book("Kotlin", 20f))
        books.add(Book("c/c++", 20f))
        return Action.SUCCESS
    }

}