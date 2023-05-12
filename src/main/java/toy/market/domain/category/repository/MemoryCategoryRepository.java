package toy.market.domain.category.repository;

import toy.market.domain.category.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryCategoryRepository implements CategoryRepository {
    Map<Long, Category> store = new ConcurrentHashMap();
    private static Long SEQ = 1L;
    @Override
    public Category find(Long categoryId) {
        return store.get(categoryId);
    }

    @Override
    public List<Category> findAll() {
        return new ArrayList(store.values());
    }

    @Override
    public Category save(Category category) {
        category.setCategoryId(SEQ++);
        store.put(category.getCategoryId(), category);

        return category;
    }

    @Override
    public Category update(Long categoryId, Category category) {
        Category findCategory = find(categoryId);
        findCategory.setCategoryName(category.getCategoryName());
        findCategory.setParentCategoryId(category.getParentCategoryId());

        return findCategory;
    }

    @Override
    public void delete(Long categoryId) {
        store.remove(categoryId);
    }
}
