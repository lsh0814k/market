package toy.market.domain.product;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
public class Product {
    private Long productId;
    private String productName;
    private String categoryId;
    private Integer ageLimit;
    private Long operId;
    private LocalDateTime createTime;

    public Product() {}

    public Product(Long productId, String productName, String categoryId, Integer ageLimit) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.ageLimit = ageLimit;
    }
}
