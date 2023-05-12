package toy.market.domain.product.repository;

import toy.market.domain.product.Product;

import java.util.List;

public interface ProductRepository {
    Product find(Long productId);
    List<Product> findAll();
    Product update(Long productId, Product product);
    void delete(Long productId);

}
