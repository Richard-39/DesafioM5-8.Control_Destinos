package com.web.controlDestinos;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;

@Controller
@ComponentScan("com.web.controlDestinos")
@PropertySource("classpath:database.properties")
public class AppConfig {

	@Autowired
	Environment ambiente;
	
	@Bean
	public DataSource poolDataSource() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setUsername(ambiente.getProperty("usuario"));
		dmds.setPassword(ambiente.getProperty("clave"));
		dmds.setDriverClassName(ambiente.getProperty("driver"));
		dmds.setUrl(ambiente.getProperty("url"));	
		return dmds;
	}
	
	
}
