package toy.market.domain.product.repository;

import org.springframework.stereotype.Component;
import toy.market.domain.product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class MemoryProductRepository implements ProductRepository {
    private static Long SEQ = 1L;
    private Map<String, Product> store = new ConcurrentHashMap();
    @Override
    public Product find(Long productId) {
        return store.get(productId);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Product update(Long productId, Product product) {
        return null;
    }

    @Override
    public void delete(Long productId) {

    }
}
