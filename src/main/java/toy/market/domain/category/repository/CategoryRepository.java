package toy.market.domain.category.repository;

import org.springframework.stereotype.Repository;
import toy.market.domain.category.Category;

import java.util.List;

@Repository
public interface CategoryRepository {
    Category find(Long categoryId);
    List<Category> findAll();
    Category save(Category categoryDto);
    Category update(Long categoryId, Category category);
    void delete(Long categoryId);
}
