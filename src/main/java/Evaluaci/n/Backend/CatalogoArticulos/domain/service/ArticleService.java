package Evaluaci.n.Backend.CatalogoArticulos.domain.service;

import Evaluaci.n.Backend.CatalogoArticulos.domain.Article;
import Evaluaci.n.Backend.CatalogoArticulos.domain.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAll() {
        return articleRepository.getAll();
    }

    public Optional<Article> getArticle(int articleId){
        return articleRepository.getArticle(articleId);
    }

    public Optional<List<Article>> getByUnit(int unitId){
        return articleRepository.getByUnit(unitId);
    }

    public Article save(Article article){
        return articleRepository.save(article);
    }

    public boolean delete(int articleId){
        return getArticle(articleId).map(article -> {
            articleRepository.delete(articleId);
            return true;
        }).orElse(false);
    }
}
