package com.web.controlDestinos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.controlDestinos.modelo.Destino;

@Repository
public interface DestinoDao extends CrudRepository<Destino, Integer>{

}
