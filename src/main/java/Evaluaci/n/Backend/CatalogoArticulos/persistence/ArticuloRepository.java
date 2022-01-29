package Evaluaci.n.Backend.CatalogoArticulos.persistence;

import Evaluaci.n.Backend.CatalogoArticulos.domain.Article;
import Evaluaci.n.Backend.CatalogoArticulos.domain.repository.ArticleRepository;
import Evaluaci.n.Backend.CatalogoArticulos.persistence.crud.ArticuloCrudRepository;
import Evaluaci.n.Backend.CatalogoArticulos.persistence.entity.Articulo;
import Evaluaci.n.Backend.CatalogoArticulos.persistence.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArticuloRepository implements ArticleRepository {
    @Autowired
    private ArticuloCrudRepository articuloCrudRepository;
    @Autowired
    private ArticleMapper mapper;
    @Override
    public List<Article> getAll(){
        List<Articulo> articulos = (List<Articulo>) articuloCrudRepository.findAll();
        return mapper.toArticles(articulos);}

    @Override
    public Optional<List<Article>> getByUnit(int unitId) {
        List<Articulo> articulos = articuloCrudRepository.findByIdUnidad(unitId);
        return Optional.of(mapper.toArticles(articulos));
    }

    @Override
    public Optional<Article> getArticle(int articleId) {
        return articuloCrudRepository.findById(articleId).map(articulo -> mapper.toArticle(articulo));
    }

    @Override
    public Article save(Article article) {
        Articulo articulo = mapper.toArticulo(article);
        return mapper.toArticle(articuloCrudRepository.save(articulo));
    }
    @Override
     public void delete(int articleId) {
        articuloCrudRepository.deleteById(articleId);
        }

}
