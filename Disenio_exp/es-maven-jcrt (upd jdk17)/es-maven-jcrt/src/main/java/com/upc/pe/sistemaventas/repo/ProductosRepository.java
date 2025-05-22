package com.upc.pe.sistemaventas.repo;

import org.springframework.data.repository.CrudRepository;

import com.upc.pe.sistemaventas.model.Producto;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

    Producto findFirstByCodigo(String codigo);
}
