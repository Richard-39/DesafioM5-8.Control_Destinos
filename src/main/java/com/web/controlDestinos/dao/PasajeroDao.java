package com.web.controlDestinos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.controlDestinos.modelo.Pasajero;

@Repository
public interface PasajeroDao extends CrudRepository<Pasajero, Integer>{

}
