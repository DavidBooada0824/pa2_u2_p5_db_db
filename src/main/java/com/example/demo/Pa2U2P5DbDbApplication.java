package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Ciudadano;
import com.example.demo.repo.modelo.Empleado;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpledoService;

@SpringBootApplication
public class Pa2U2P5DbDbApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService iCiudadanoService;

	@Autowired
	private IEmpledoService iEmpledoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5DbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ciudadano ciu = new Ciudadano();
		ciu.setApellido("Boada");
		ciu.setNombre("David");
		// this.iCiudadanoService.ingresar(ciu);
		Empleado emple = new Empleado();
		emple.setFechaIngreso(LocalDateTime.now());
		emple.setSalario(new BigDecimal(1200));
		// this.iEmpledoService.ingresar(emple);

		Ciudadano ciu2 = this.iCiudadanoService.buscar(1);
		System.out.println(ciu2);
		
		ciu2.setEmpleado(emple);
		this.iCiudadanoService.ingresar(ciu2);
	}

}
