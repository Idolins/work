package proxy

/**
 * Created by young on 2017/10/30.
 */
class BookRealSubject : BookSubject {



   public override fun saleBook() {
        println("RealSubject sale book")
    }

    public fun makeBook(){
        println("RealSubject make book")
    }
}