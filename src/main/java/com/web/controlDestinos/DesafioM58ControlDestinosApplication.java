package com.web.controlDestinos;

import java.sql.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.web.controlDestinos.dao.DestinoDao;
import com.web.controlDestinos.dao.PasajeroDao;
import com.web.controlDestinos.modelo.Destino;
import com.web.controlDestinos.modelo.Pasajero;
import com.web.controlDestinos.servicio.DestinoServicioImp;
import com.web.controlDestinos.servicio.PasajeroServicioImp;

@SpringBootApplication
public class DesafioM58ControlDestinosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioM58ControlDestinosApplication.class, args);
//		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
//		PasajeroDao pasajeroDao = acac.getBean(PasajeroDao.class);
//		System.out.println(pasajeroDao.findAll());
		
//		DestinoDao destinoDao = acac.getBean(DestinoDao.class);
//		System.out.println(destinoDao.findAll());
		
//		PasajeroServicioImp p = acac.getBean(PasajeroServicioImp.class);
//  	System.out.println(p.findAll());
		
//		DestinoServicioImp d = acac.getBean(DestinoServicioImp.class);
//		System.out.println(d.findAll());
	}

}
