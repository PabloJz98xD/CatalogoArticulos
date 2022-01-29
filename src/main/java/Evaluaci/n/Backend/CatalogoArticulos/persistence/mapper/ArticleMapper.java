package Evaluaci.n.Backend.CatalogoArticulos.persistence.mapper;

import Evaluaci.n.Backend.CatalogoArticulos.domain.Article;
import Evaluaci.n.Backend.CatalogoArticulos.persistence.entity.Articulo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UnitMapper.class})
public interface ArticleMapper {
    @Mappings({
            @Mapping(source = "idArticulo", target = "articleId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idUnidad", target = "unitId"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "unidad",target = "unit"),
    })
    Article toArticle(Articulo articulo);
    List<Article> toArticles(List<Articulo> articulos);

    @InheritInverseConfiguration
    Articulo toArticulo(Article article);
}
