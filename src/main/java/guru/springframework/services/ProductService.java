package guru.springframework.services;

import guru.springframework.domain.Product;

import java.util.List;

/**
 * Created by Maciej on 12/07/2018
 */
public interface ProductService  {

    Product getProduct(Integer id);
    List<Product> listProducts();
}
