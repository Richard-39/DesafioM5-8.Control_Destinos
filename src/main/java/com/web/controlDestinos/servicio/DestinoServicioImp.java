package com.web.controlDestinos.servicio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.controlDestinos.dao.DestinoDao;
import com.web.controlDestinos.modelo.Destino;
import com.web.controlDestinos.vo.DestinoVo;

@Service
public class DestinoServicioImp implements DestinoServicio{

	@Autowired
	DestinoDao destinoDao;
	
	DestinoVo destinoVo;
	
	private final Logger log = LoggerFactory.getLogger(DestinoServicioImp.class);
	
	@Override
	public DestinoVo findAll() {
		destinoVo = new DestinoVo(new ArrayList<Destino>(), "Ha ocurrido un error", "101");
		try {
			destinoVo.setListaDestinos((List<Destino>) destinoDao.findAll());
			destinoVo.setMensaje(String.format("Se han encontrado %d registros", destinoVo.getListaDestinos().size()));
			destinoVo.setCodigo("0");
		} catch (Exception e) {
			log.error("DestinoServicioImp : findAll " + e);
		}
		return destinoVo;
	}

	@Override
	public DestinoVo save(Destino destino) {
		destinoVo = new DestinoVo(new ArrayList<Destino>(), "Ha ocurrido un error", "102");
		try {
			destinoVo.getListaDestinos().add(destinoDao.save(destino));
			destinoVo.setMensaje(String.format("Se han guardado el destino a %s", destinoVo.getListaDestinos().get(0).getCiudad()));
			destinoVo.setCodigo("0");
		} catch (Exception e) {
			log.error("DestinoServicioImp : save " + e);
		}
		return destinoVo;
	}
 
}
