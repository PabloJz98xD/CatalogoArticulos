package Evaluaci.n.Backend.CatalogoArticulos.persistence.crud;

import Evaluaci.n.Backend.CatalogoArticulos.persistence.entity.Articulo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticuloCrudRepository extends CrudRepository<Articulo, Integer> {
    List<Articulo> findByIdUnidad(int idUnidad);
}
