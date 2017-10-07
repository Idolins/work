package dao

import db.BookDB
import entity.Book

/**
 * Created by young on 2017/9/26.
 */
class BookDao {
 var bookDB = BookDB.bookDB
    fun addBook(book: Book) {
        bookDB.add(book)
    }

    fun deleteBook(book: Book): Boolean {
        for (books in bookDB) {
            if (books.name == book.name
                    ) {
                bookDB.remove(books)
                return true
            }
        }
        return false
    }

    fun updateBook(book: Book): Boolean {
        for (books in bookDB) {
            if (books.name == book.name) {
                books.author = book.author
                books.price = book.price
                return true
            }
        }
        return false
    }

    fun selectBook(): List<Book> {

        return bookDB
    }

}