package eric.pham.springblog.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ArticleDTO {

    /* Zde později přidáme ještě jeden atribut */

    @NotBlank(message = "Vyplňte titulek")
    @Size(max = 100, message = "Titulek je příliš dlouhý")
    private String title;

    @NotBlank(message = "Vyplňte popisek")
    private String description;

    @NotBlank(message = "Vyplňte obsah")
    private String content;

    private long ArticleId;

    //region: Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getArticleId() {
        return ArticleId;
    }

    public void setArticleId(long articleId) {
        ArticleId = articleId;
    }

    //endregion
}
