package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionContext
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import dao.BookDao
import entity.Book

/**
 * Created by young on 2017/9/26.
 */
class BookAction : ActionSupport(), ModelDriven<Book> {
    private var book = Book()
    var bookDao = BookDao()
    override fun getModel(): Book = book

    fun add(): String {
        bookDao.addBook(book)
        return Action.SUCCESS
    }

    fun delete(): String {
        val flag: Boolean = bookDao.deleteBook(book)
        return if (flag) Action.SUCCESS else Action.ERROR

    }

    fun update(): String {
        val flag = bookDao.updateBook(book)
        return if (flag) Action.SUCCESS else Action.ERROR
    }

    fun select(): String {
        val list = bookDao.selectBook()
        ActionContext.getContext().valueStack.set("bookList", list)
        return Action.SUCCESS
    }
}