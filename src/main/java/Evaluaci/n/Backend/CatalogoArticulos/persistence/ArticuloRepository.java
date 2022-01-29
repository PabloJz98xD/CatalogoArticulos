package Evaluaci.n.Backend.CatalogoArticulos.persistence;

import Evaluaci.n.Backend.CatalogoArticulos.persistence.crud.ArticuloCrudRepository;
import Evaluaci.n.Backend.CatalogoArticulos.persistence.entity.Articulo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArticuloRepository {
    private ArticuloCrudRepository articuloCrudRepository;

    public List<Articulo> getAll(){return (List<Articulo>) articuloCrudRepository.findAll();}

    public List<Articulo> getByUnidad(int idUnidad) {
        return articuloCrudRepository.findByIdUnidad(idUnidad);
        }

     public Optional<Articulo>  getArticulo(int idArticulo) {
        return articuloCrudRepository.findById(idArticulo);
        }

     public Articulo save(Articulo articulo){
        return articuloCrudRepository.save(articulo);
        }

     public void delete(int idArticulo) {
        articuloCrudRepository.deleteById(idArticulo);
        }

}
