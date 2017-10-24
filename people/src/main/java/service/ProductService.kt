package service

import dao.ProductDao
import domain.Product

/**
 * @author young
 * @date 2017/10/19
 */
class ProductService {

    var productDao = ProductDao()


    fun save(product: Product) {
        println("service save")
        productDao.save(product)
    }
}
