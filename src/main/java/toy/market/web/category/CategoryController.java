package toy.market.web.category;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import toy.market.domain.category.Category;
import toy.market.domain.category.repository.CategoryRepository;
import toy.market.web.category.form.CategorySaveForm;
import toy.market.web.category.form.CategoryUpdateForm;

@Controller
@RequestMapping("/categorys")
@RequiredArgsConstructor
@Slf4j
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @GetMapping
    public String categorys(Model model) {
        model.addAttribute("categorys", categoryRepository.findAll());
        return "";
    }

    @GetMapping("/{categoryId}")
    public String category(@PathVariable Long categoryId, Model model) {
        model.addAttribute("category", categoryRepository.find(categoryId));

        return "";
    }

    @GetMapping("/save")
    public String saveForm(Model model) {
        model.addAttribute("parentCategorys", categoryRepository.findAll());
        model.addAttribute("category", new Category());
        return "";
    }

    @PostMapping("/save")
    public String saveCategory(@Validated @ModelAttribute("category") CategorySaveForm category, BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            log.error("bindResult errors = {}", bindingResult);
            return "";
        }

        // 저장 로직
        return "";
    }

    @GetMapping("/{categoryId}/update")
    public String updateForm(@PathVariable Long categoryId, Model model) {
        model.addAttribute("category", categoryRepository.find(categoryId));
        return "";
    }

    @PostMapping("/{categoryId}/update")
    public String updateCategory(@PathVariable Long categoryId, @Validated @ModelAttribute("category") CategoryUpdateForm form,
                               BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            log.error("bindResult errors = {}", bindingResult);
            return "";
        }

        // 수정 로직
        return "";
    }
}
