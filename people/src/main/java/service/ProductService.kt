package service

import dao.ProductDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by young on 2017/10/14.
 */
@Service
class ProductService {

    private var productDao = ProductDao()
}