package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){ return (List<Producto>) productoCrudRepository.findAll(); }

    /*Lista de productos que pertenecen a una categoria*/
    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByidCategoriaOrderByNombreAsc(idCategoria);
    }
    
    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }
}
