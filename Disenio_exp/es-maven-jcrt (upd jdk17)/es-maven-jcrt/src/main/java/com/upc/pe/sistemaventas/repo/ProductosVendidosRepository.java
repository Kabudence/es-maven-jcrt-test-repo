package com.upc.pe.sistemaventas.repo;

import org.springframework.data.repository.CrudRepository;

import com.upc.pe.sistemaventas.model.ProductoVendido;

public interface ProductosVendidosRepository extends CrudRepository<ProductoVendido, Integer> {

}
