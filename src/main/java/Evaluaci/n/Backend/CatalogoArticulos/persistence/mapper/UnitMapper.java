package Evaluaci.n.Backend.CatalogoArticulos.persistence.mapper;

import Evaluaci.n.Backend.CatalogoArticulos.domain.Unit;
import Evaluaci.n.Backend.CatalogoArticulos.persistence.entity.Unidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UnitMapper {
    @Mappings({
            @Mapping(source = "idUnidad", target = "unitId"),
            @Mapping(source = "unidad", target = "unit"),
    })
    Unit toUnit(Unidad unidad);

    @InheritInverseConfiguration
    @Mapping(target = "articulos", ignore = true)
    Unidad toUnidad(Unit unit);
}
