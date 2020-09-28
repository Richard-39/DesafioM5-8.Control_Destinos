package com.web.controlDestinos.servicio;

import com.web.controlDestinos.modelo.Destino;
import com.web.controlDestinos.vo.DestinoVo;

public interface DestinoServicio {

	public DestinoVo findAll();
	public DestinoVo save(Destino destino);
	
}
