package toy.market.web.category.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CategorySaveForm {

    private Long categoryId;
    @NotBlank
    private String categoryName;
    @NotNull
    private Long parentCategoryId;

    public CategorySaveForm(Long categoryId, String categoryName, Long parentCategoryId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.parentCategoryId = parentCategoryId;
    }
}
