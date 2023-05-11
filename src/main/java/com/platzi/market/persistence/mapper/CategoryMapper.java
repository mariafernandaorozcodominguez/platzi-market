package com.platzi.market.persistence.mapper;


import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({ //Campos: source es el origen y target adonde se va a llevar
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),
    })
    Category toCategory(Categoria categoria); //Vamos a convertir una categoria en category

    @InheritInverseConfiguration //Anotacion para indicar a mapstruct que la configuracion de campos anteriores se hace inverso
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);




}
