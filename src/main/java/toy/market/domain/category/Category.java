package toy.market.domain.category;


import lombok.Data;

@Data
public class Category {
    private Long categoryId;
    private String categoryName;
    private Long parentCategoryId;

    public Category() {}

    public Category(Long categoryId, String categoryName, Long parentCategoryId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.parentCategoryId = parentCategoryId;
    }
}
