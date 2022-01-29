package Evaluaci.n.Backend.CatalogoArticulos.persistence.entity;

import javax.persistence.*;
import java.lang.reflect.Array;

@Entity
@Table(name = "catalogos")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArticulo")
    private Integer idArticulo;

    private String nombre;

    private Integer  idUnidad;

    private String clave;

    private Float precio;

    @ManyToOne
    @JoinColumn(name = "idUnidad", insertable = false,updatable = false)
    private Unidad unidad;


    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}
