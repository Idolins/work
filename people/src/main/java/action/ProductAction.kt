package action

import com.opensymphony.xwork2.Action
import com.opensymphony.xwork2.ActionSupport
import com.opensymphony.xwork2.ModelDriven
import domain.Product
import service.ProductService

/**
 * @author young
 * @date 2017/10/19
 */
class ProductAction : ActionSupport(), ModelDriven<Product> {

    var product = Product()

    var productService = ProductService()


    override fun getModel(): Product {
        return product
    }


    fun save(): String {
        println("action save")
        productService.save(product)
        return Action.NONE
    }
}
