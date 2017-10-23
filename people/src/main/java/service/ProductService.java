package service;

import dao.ProductDao;
import domain.Product;

/**
 * @author young
 * @date 2017/10/19
 */
public class ProductService {

    private ProductDao productDao;

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }


    public void save(Product product) {
        System.out.println("service save");
        productDao.save(product);
    }
}
