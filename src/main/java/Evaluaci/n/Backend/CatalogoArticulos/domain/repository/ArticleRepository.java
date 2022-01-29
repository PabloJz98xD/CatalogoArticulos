package Evaluaci.n.Backend.CatalogoArticulos.domain.repository;

import Evaluaci.n.Backend.CatalogoArticulos.domain.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {
    List<Article> getAll();
    Optional<List<Article>> getByUnit(int unitId);
    Optional<Article> getArticle(int articleId);
    Article save(Article article);
    void delete(int articleId);

}
