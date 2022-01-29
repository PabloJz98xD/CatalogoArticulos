package Evaluaci.n.Backend.CatalogoArticulos.domain.repository;

import Evaluaci.n.Backend.CatalogoArticulos.domain.service.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {
    List<Article> getAll();
    Optional<List<Article>> getByUnit(int unitId);
    Optional<List<Article>> getArticulo(int articleId);
    Article save(Article article);
    void delete(int articleId);

}
