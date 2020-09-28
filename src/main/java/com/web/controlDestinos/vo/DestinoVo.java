package com.web.controlDestinos.vo;

import java.util.List;

import com.web.controlDestinos.modelo.Destino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DestinoVo {
	
	private List<Destino> listaDestinos;
	private String mensaje;
	private String codigo;
	
}
