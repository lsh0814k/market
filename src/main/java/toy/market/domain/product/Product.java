package toy.market.domain.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter @RequiredArgsConstructor
public class Product {
    private Long productId;
    private String productName;
    private String categoryId;
    private Integer ageLimit;
    private Long operId;
    private LocalDateTime createTime;

}
