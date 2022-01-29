package Evaluaci.n.Backend.CatalogoArticulos.web.controller;

import Evaluaci.n.Backend.CatalogoArticulos.domain.Article;
import Evaluaci.n.Backend.CatalogoArticulos.domain.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    public List<Article> getAll(){
        return articleService.getAll();
    }

    public Optional<Article> getArticle(int articleId){
        return articleService.getArticle(articleId);
    }

    public Optional<List<Article>> getByUnit(int unitId){
        return articleService.getByUnit(unitId);
    }

    public Article save(Article article){
        return articleService.save(article);
    }

    public boolean delete(int articleId){
        return articleService.delete(articleId);
    }
}
