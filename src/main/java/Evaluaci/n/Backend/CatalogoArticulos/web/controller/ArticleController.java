package Evaluaci.n.Backend.CatalogoArticulos.web.controller;

import Evaluaci.n.Backend.CatalogoArticulos.domain.Article;
import Evaluaci.n.Backend.CatalogoArticulos.domain.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    private articleservice articleservice;

    @GetMapping("/all")
    public ResponseEntity<List<Article>> getAll() {
        return new ResponseEntity<>(articleservice.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> getArticle(@PathVariable("id") int ArticleId) {
        return articleservice.getArticle(ArticleId)
                .map(Article -> new ResponseEntity<>(Article, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<Article>> getByCategory(@PathVariable("categoryId") int categoryId) {
        return articleservice.getByCategory(categoryId)
                .map(articles -> new ResponseEntity<>(articles, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Article> save(@RequestBody Article Article) {
        return new ResponseEntity<>(articleservice.save(Article), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int ArticleId) {
        if (articleservice.delete(ArticleId)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}