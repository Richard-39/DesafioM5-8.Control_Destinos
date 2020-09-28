package com.web.controlDestinos.servicio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.controlDestinos.dao.PasajeroDao;
import com.web.controlDestinos.modelo.Pasajero;
import com.web.controlDestinos.vo.PasajeroVo;

@Service
public class PasajeroServicioImp implements PasajeroServicio {

	@Autowired
	PasajeroDao pasajeroDao;
	
	PasajeroVo pasajeroVo;

	private final Logger log = LoggerFactory.getLogger(PasajeroServicioImp.class);
	
	@Override
	public PasajeroVo findAll() {
		pasajeroVo = new PasajeroVo(new ArrayList<Pasajero>(), "Ha ocurrido un error", "101");
		try {
			pasajeroVo.setListaPasajero((List<Pasajero>) pasajeroDao.findAll());
			pasajeroVo.setMensaje(String.format("Se han encontrado %d registros.", pasajeroVo.getListaPasajero().size()));
			pasajeroVo.setCodigo("0");
		} catch(Exception e) {
			log.error("PasajeroServicioImp : findAll " + e);
		}
		return pasajeroVo;
	}

	@Override
	public PasajeroVo save(Pasajero pasajero) {
		pasajeroVo = new PasajeroVo(new ArrayList<Pasajero>(), "Ha ocurrido un error", "102");
		try {
			pasajeroVo.getListaPasajero().add(pasajeroDao.save(pasajero));
			pasajeroVo.setMensaje(String.format("Se han guardado el usuario %s", pasajeroVo.getListaPasajero().get(0).getNombre()));
			pasajeroVo.setCodigo("0");
		} catch(Exception e) {
			log.error("PasajeroServicioImp : save " + e);
		}
		return pasajeroVo;
	}
	

}
