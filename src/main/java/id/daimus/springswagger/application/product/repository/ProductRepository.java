package id.daimus.springswagger.application.product.repository;

import id.daimus.springswagger.application.product.entity.Product;
import id.daimus.springswagger.shared.exception.DataNotFoundException;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
}
