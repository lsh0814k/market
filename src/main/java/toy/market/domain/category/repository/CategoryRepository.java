package toy.market.domain.category.repository;

import toy.market.domain.category.Category;

import java.util.List;

public interface CategoryRepository {
    Category find(Long categoryId);
    List<Category> findAll();
    Category save(Category categoryDto);
    Category update(Long categoryId, Category category);
    void delete(Long categoryId);
}
