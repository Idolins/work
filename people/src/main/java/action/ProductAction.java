package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Product;
import service.ProductService;

/**
 * @author young
 * @date 2017/10/19
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {

    private Product product = new Product();

    private ProductService productService;


    @Override
    public Product getModel() {
        return product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public String save() {
        System.out.println("action save");
        productService.save(product);
        return NONE;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
}
