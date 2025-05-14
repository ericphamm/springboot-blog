package eric.pham.springblog.controllers;

import eric.pham.springblog.models.dto.ArticleDTO;
import eric.pham.springblog.models.dto.mappers.ArticleMapper;
import eric.pham.springblog.models.exceptions.ArticleNotFoundException;
import eric.pham.springblog.models.services.ArticleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ArticleMapper articleMapper;

    @GetMapping("/")
    public String redirectToArticles() {
        return "redirect:/articles";
    }


    @GetMapping
    public String renderIndex(Model model) {
        List<ArticleDTO> articles = articleService.getAll();
        model.addAttribute("articles", articles);
        return "pages/articles/index";
    }

    @GetMapping("{articleId}")
    public String renderDetail(
            @PathVariable("articleId") long articleId,
            Model model
    ) {
        ArticleDTO article = articleService.getById(articleId);
        model.addAttribute("article", article);
        return "pages/articles/detail";
    }

    @GetMapping("create")
    public String renderCreateForm(@ModelAttribute ArticleDTO article) {
        return "pages/articles/create";
    }

    @PostMapping("create")
    public String createArticle(
            @Valid @ModelAttribute ArticleDTO article,
            BindingResult result,
            RedirectAttributes redirectAttributes
    ) {
        if (result.hasErrors()) {
            return renderCreateForm(article);
        }

        articleService.create(article);
        redirectAttributes.addFlashAttribute("success", "Článek vytvořen.");
        return "redirect:/articles";
    }

    @GetMapping("edit/{articleId}")
    public String renderEditForm(
            @PathVariable("articleId") long articleId,
            ArticleDTO article
    ) {
        ArticleDTO fetchedArticle = articleService.getById(articleId);
        articleMapper.updateArticleDTO(fetchedArticle, article);
        return "pages/articles/edit";
    }

    @PostMapping("edit/{articleId}")
    public String editArticle(
            @PathVariable("articleId") long articleId,
            @Valid ArticleDTO article,
            BindingResult result,
            RedirectAttributes redirectAttributes
    ) {
        if (result.hasErrors()) {
            return renderEditForm(articleId, article);
        }

        article.setArticleId(articleId);
        articleService.edit(article);
        redirectAttributes.addFlashAttribute("success", "Článek upraven.");
        return "redirect:/articles";
    }

    @GetMapping("delete/{articleId}")
    public String deleteArticle(
            @PathVariable("articleId") long articleId,
            RedirectAttributes redirectAttributes
    ) {
        articleService.remove(articleId);
        redirectAttributes.addFlashAttribute("success", "Článek smazán.");
        return "redirect:/articles";
    }

    @ExceptionHandler({ArticleNotFoundException.class})
    public String handleArticleNotFoundException(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "Článek nenalezen.");
        return "redirect:/articles";
    }
}
