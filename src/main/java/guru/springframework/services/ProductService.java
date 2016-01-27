package guru.springframework.services;

import guru.springframework.domain.Product;

import java.util.List;

/**
 * Created by jt on 1/26/16.
 */
public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
