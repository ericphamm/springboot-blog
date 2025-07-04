package eric.pham.springblog.models.dto.mappers;

import eric.pham.springblog.data.entities.ArticleEntity;
import eric.pham.springblog.models.dto.ArticleDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-24T21:55:10+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class ArticleMapperImpl implements ArticleMapper {

    @Override
    public ArticleEntity toEntity(ArticleDTO source) {
        if ( source == null ) {
            return null;
        }

        ArticleEntity articleEntity = new ArticleEntity();

        articleEntity.setArticleId( source.getArticleId() );
        articleEntity.setTitle( source.getTitle() );
        articleEntity.setDescription( source.getDescription() );
        articleEntity.setContent( source.getContent() );

        return articleEntity;
    }

    @Override
    public ArticleDTO toDTO(ArticleEntity source) {
        if ( source == null ) {
            return null;
        }

        ArticleDTO articleDTO = new ArticleDTO();

        articleDTO.setTitle( source.getTitle() );
        articleDTO.setDescription( source.getDescription() );
        articleDTO.setContent( source.getContent() );
        articleDTO.setArticleId( source.getArticleId() );

        return articleDTO;
    }

    @Override
    public void updateArticleDTO(ArticleDTO source, ArticleDTO target) {
        if ( source == null ) {
            return;
        }

        target.setTitle( source.getTitle() );
        target.setDescription( source.getDescription() );
        target.setContent( source.getContent() );
        target.setArticleId( source.getArticleId() );
    }

    @Override
    public void updateArticleEntity(ArticleDTO source, ArticleEntity target) {
        if ( source == null ) {
            return;
        }

        target.setArticleId( source.getArticleId() );
        target.setTitle( source.getTitle() );
        target.setDescription( source.getDescription() );
        target.setContent( source.getContent() );
    }
}
