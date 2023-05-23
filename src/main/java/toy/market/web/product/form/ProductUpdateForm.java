package toy.market.web.product.form;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data @Component
public class ProductUpdateForm {
    @NotNull
    private Long productId;
    @NotBlank
    private String productName;
    @NotNull
    private String categoryId;
    @NotBlank
    private Integer ageLimit;
}
