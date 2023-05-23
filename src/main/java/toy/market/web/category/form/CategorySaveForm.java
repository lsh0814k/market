package toy.market.web.category.form;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CategorySaveForm {
    private Long categoryId;
    @NotBlank
    private String categoryName;
    @NotNull
    private Long parentCategoryId;
}
