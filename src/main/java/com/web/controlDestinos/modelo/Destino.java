package com.web.controlDestinos.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor	
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDestino;
	private String ciudad;
	private String pais;
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="id_pasajero", nullable=false)
	private Pasajero pasajero;

	@Override
	public String toString() {
		return "Destino [idDestino=" + idDestino + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha=" + fecha + "]";
	}
	
	
}
