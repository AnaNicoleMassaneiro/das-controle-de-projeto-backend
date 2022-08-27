package com.das.controlePedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ControleDePedidos {
	public static void main(String[] args) {
		SpringApplication.run(ControleDePedidos.class, args);
	}
}