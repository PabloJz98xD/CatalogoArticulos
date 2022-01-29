package Evaluaci.n.Backend.CatalogoArticulos.persistence.entity;

import Evaluaci.n.Backend.CatalogoArticulos.persistence.crud.ArticuloCrudRepository;

import java.util.List;

public class ArticuloRepository {
    private ArticuloCrudRepository articuloCrudRepository;

    public List<Articulo> getAll(){
        return (List<Articulo>) articuloCrudRepository.findAll();
    }
}
