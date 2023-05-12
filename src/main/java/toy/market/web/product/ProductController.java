package toy.market.web.product;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import toy.market.domain.category.repository.CategoryRepository;
import toy.market.domain.product.Product;
import toy.market.domain.product.repository.ProductRepository;
import toy.market.web.product.form.ProductSaveForm;
import toy.market.web.product.form.ProductUpdateForm;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private ProductRepository productRepository;

    private CategoryRepository categoryRepository;

    @GetMapping
    public String products(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "";
    }

    @GetMapping("/{productId}")
    public String product(@PathVariable Long productId, Model model) {
        model.addAttribute("product", productRepository.find(productId));
        return "";
    }

    @GetMapping("/save")
    public String saveForm(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categorys", categoryRepository.findAll());
        return "";
    }

    @PostMapping("/save")
    public String saveProduct(@Validated @ModelAttribute("product") ProductSaveForm product, BindingResult bindingResult,
                              RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()) {
            log.error("bindingResult errors = {}", bindingResult);
            return "";
        }
        // ProductSaveForm -> product 변경 로직
        // 저장 로직
        return "";
    }

    @GetMapping("/{productId}/update")
    public String updateForm(@PathVariable Long productId, Model model) {
        model.addAttribute("product", productRepository.find(productId));
        model.addAttribute("category", categoryRepository.findAll());
        return "";
    }

    @PostMapping("/{productId}/update")
    public String updateProduct(@Validated @ModelAttribute("product") ProductUpdateForm form, BindingResult bindingResult,
                                    RedirectAttributes redirectAttributes) {
        if(bindingResult.hasErrors()) {
            log.error("bindingResult errors = {}", bindingResult);
            return "";
        }
        // ProductUpdateForm -> Product 변경 로직
        // 수정 로직

        return "";
    }
}
