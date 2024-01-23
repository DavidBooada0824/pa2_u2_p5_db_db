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
import com.example.demo.service.IEmpleadoService;

@SpringBootApplication
public class Pa2U2P5DbDbApplication implements CommandLineRunner {

	@Autowired
	private ICiudadanoService iCiudadanoService;

	@Autowired
	private IEmpleadoService iEmpleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5DbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ciudadano ciu = new Ciudadano();

		ciu.setApellido("Boada");
		ciu.setNombre("David");
		ciu.setCedula("1720030723");
		ciu.setEdad("18");
		ciu.setGenero("masculino");
		ciu.setHobbie("basquet");

		// this.iCiudadanoService.ingresar(ciu);

		Empleado emple = new Empleado();
		emple.setFechaIngreso(LocalDateTime.now());
		emple.setSalario(new BigDecimal(1200));
		emple.setCiudadano(ciu);

		System.out.println("Deber 10");
		Ciudadano ciu1 = this.iCiudadanoService.buscarEdadGeneroPorCriteria("18", "masculino", "1720030723");
		System.out.println("\t" + ciu1 + "\n");

		Ciudadano ciu2 = this.iCiudadanoService.buscarApellidoHobbiePorCriteria("Boada", "basquet", "1720030723");
		System.out.println("\t" + ciu2 + "\n");

		Ciudadano ciu3 = this.iCiudadanoService.buscarEdadGeneroPorCriteriaAndOr("18", "masculino", "1720030723");
		System.out.println("\t" + ciu3 + "\n");

		Ciudadano ciu4 = this.iCiudadanoService.buscarApellidoHobbiePorCriteriaAndOr("Boada", "basquet", "1720030723");
		System.out.println("\t" + ciu4 + "\n");

		Ciudadano ciu5 = this.iCiudadanoService.buscarNombrePorCriteriaAndOr("David", "basquet", "1720030723");
		System.out.println("\t" + ciu5 + "\n");

	}

}
