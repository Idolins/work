package dao

import db.BookDB
import entity.Book

/**
 * Created by young on 2017/9/6.
 */
class BookDao {
    fun addBook(book: Book) {
        BookDB.list.add(book)
    }

    fun showBooks(): MutableList<Book> = BookDB.list

}