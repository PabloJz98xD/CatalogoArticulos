package Evaluaci.n.Backend.CatalogoArticulos.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "unidades")

public class Unidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUnidad")
    private Integer idUnidad;
    private String unidad;

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
}
