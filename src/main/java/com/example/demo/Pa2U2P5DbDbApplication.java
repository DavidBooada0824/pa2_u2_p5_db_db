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

		// this.iEmpleadoService.ingresar(emple);

		Ciudadano ciu3 = this.iCiudadanoService.buscarPorApellidoCriteria("Boada");
		System.err.println("CriteriaQuery");
		System.out.println("" + ciu3+"\n");
		Ciudadano ciu4 = this.iCiudadanoService.buscarPorCriteria("David", "Boada", "1720030723");
		System.out.println("\t" + ciu4+"\n");
		
		Ciudadano ciu5 = this.iCiudadanoService.buscarPorCriteria("David", "Boada", "0520030723");
		System.out.println("\t" + ciu5+"\n");
		
//		Ciudadano ciu6 = this.iCiudadanoService.buscarPorCriteria("David", "Boada", "0620030723");
//		System.out.println("\t" + ciu6);
		System.err.println("CriteriaQueryAndOr");
		Ciudadano ciu6 =this.iCiudadanoService.buscarPorCriteriaAndOr("David", "Boada", "1720030723");
		System.out.println("\t" + ciu6+"\n");
		
		Ciudadano ciu7 =this.iCiudadanoService.buscarPorCriteriaAndOr("David", "Boada", "0520030723");
		System.out.println("\t" + ciu7+"\n");
		
		
		
	}

}
