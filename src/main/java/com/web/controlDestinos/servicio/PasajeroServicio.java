package com.web.controlDestinos.servicio;

import com.web.controlDestinos.modelo.Pasajero;
import com.web.controlDestinos.vo.PasajeroVo;

public interface PasajeroServicio {
	
	public PasajeroVo findAll();
	public PasajeroVo save(Pasajero pasajero);
}
