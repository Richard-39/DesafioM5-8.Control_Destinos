package com.web.controlDestinos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.controlDestinos.modelo.Destino;
import com.web.controlDestinos.servicio.DestinoServicio;
import com.web.controlDestinos.servicio.PasajeroServicio;
import com.web.controlDestinos.vo.DestinoVo;

@Controller
public class DestinoController {

	@Autowired
	DestinoServicio destinoServicio;
	
	@Autowired
	PasajeroServicio pasajeroServicio;
	
	DestinoVo destinoVo;
	
	@GetMapping("/crearDestino")
	public String crearDestino(Model model) {
		model.addAttribute("destino", new Destino());
		model.addAttribute("listaPasajeros", pasajeroServicio.findAll().getListaPasajero());
		return "crear-destino";
	}
	
	@PostMapping("/crearDestino")
	public String crearDestino(@ModelAttribute Destino destino, Model model) {
		destinoVo = destinoServicio.save(destino);
		model.addAttribute("vo", destinoVo.getListaDestinos().get(0));
		model.addAttribute("mensaje", destinoVo.getMensaje());
		model.addAttribute("codigo", destinoVo.getCodigo());
		System.out.println(destinoVo.getMensaje());
		System.out.println(destinoVo.getCodigo());
		return "feedBack";
	}
	
	@GetMapping("/destinos")
	public String destinos(Model model) {
		destinoVo = destinoServicio.findAll();
		model.addAttribute("listaDestinos", destinoVo.getListaDestinos());
		model.addAttribute("mensaje", destinoVo.getMensaje());
		model.addAttribute("codigo", destinoVo.getCodigo());
		return "destinos";
	}
}
