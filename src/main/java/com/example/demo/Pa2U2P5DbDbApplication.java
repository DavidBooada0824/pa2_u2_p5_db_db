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

		// this.iCiudadanoService.ingresar(ciu);

		Empleado emple = new Empleado();
		emple.setFechaIngreso(LocalDateTime.now());
		emple.setSalario(new BigDecimal(1200));
		emple.setCiudadano(ciu);

		// this.iEmpleadoService.ingresar(emple);

		Empleado emple1 = this.iCiudadanoService.buscarPorCedula("1720030723");

		System.out.println(emple1);

		

		Ciudadano ciud1 = this.iCiudadanoService.selecionarPorCedulaCiu("1720030723");
		System.err.println("Impresion NativeQuery");
		System.out.println(ciud1);

	}

}
