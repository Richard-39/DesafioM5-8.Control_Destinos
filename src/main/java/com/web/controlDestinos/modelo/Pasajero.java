package com.web.controlDestinos.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor	
public class Pasajero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPasajero;
	private String rut;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String ciudadNatal;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pasajero" , fetch = FetchType.EAGER)
	List<Destino> listaDestinos;

	@Override
	public String toString() {
		return "Pasajero [idPasajero=" + idPasajero + ", rut=" + rut + ", apellido=" + apellido + ", edad=" + edad
				+ ", ciudadNatal=" + ciudadNatal + "]";
	}
	
	
}
