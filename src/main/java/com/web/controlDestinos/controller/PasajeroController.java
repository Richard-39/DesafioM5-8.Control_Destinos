package com.web.controlDestinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.controlDestinos.modelo.Destino;
import com.web.controlDestinos.modelo.Pasajero;
import com.web.controlDestinos.servicio.PasajeroServicio;
import com.web.controlDestinos.vo.PasajeroVo;

@Controller
public class PasajeroController {

	@Autowired
	PasajeroServicio pasajeroServicio;
	
	PasajeroVo pasajeroVo;
	
	@GetMapping("/crearPasajero")
	public String crearPasajero(Model model) {
		model.addAttribute("pasajero", new Pasajero());
		return "crear-pasajero";
	}
	
	@PostMapping("/crearPasajero")
	public String crearPasajero(@ModelAttribute Pasajero pasajero, Model model) {
		pasajeroVo = pasajeroServicio.save(pasajero);
		model.addAttribute("vo", pasajeroVo.getListaPasajero().get(0));
		model.addAttribute("mensaje", pasajeroVo.getMensaje());
		model.addAttribute("codigo", pasajeroVo.getCodigo());
		return "feedBack"; 
	}
	
	@GetMapping({"/pasajeros", "/"})
	public String pasajeros(Model model) {
		pasajeroVo = pasajeroServicio.findAll();
		model.addAttribute("listaPasajeros", pasajeroVo.getListaPasajero());
		model.addAttribute("mensaje", pasajeroVo.getMensaje());
		model.addAttribute("codigo", pasajeroVo.getCodigo());
		System.out.println(pasajeroVo.getListaPasajero().get(0).getListaDestinos());
		return "pasajeros";
	}
}
