package com.web.controlDestinos.vo;

import java.util.List;

import com.web.controlDestinos.modelo.Pasajero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasajeroVo {

	private List<Pasajero> listaPasajero;
	private String mensaje;
	private String codigo;
}
