package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    /*Query normal @Query(value="SELESC * FROM productos WHERE id_categoria = ?", nativeQuery = true)*/
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria); /*Utilizando Query Methods*/
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
