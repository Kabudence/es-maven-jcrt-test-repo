package com.upc.pe.sistemaventas.repo;

import org.springframework.data.repository.CrudRepository;

import com.upc.pe.sistemaventas.model.Venta;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
