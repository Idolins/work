package proxy

/**
 * Created by young on 2017/10/30.
 */
class BookProxy : BookSubject {

    var bookR = BookRealSubject()


    fun preBook() {
        println("proxy show book before sale")
    }

    override fun saleBook() {
        preBook()
        bookR.saleBook()
        postBook()
    }

    fun postBook() {
        println("proxy get book after sale")
    }

    fun invoke() {
        val methods = bookR.javaClass.methods
        for (method in methods) {
            if ("saleBook" == method.name) {
                saleBook()
            } else {
                bookR.saleBook()
            }
        }
    }

}