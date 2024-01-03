package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5DbDbApplication implements CommandLineRunner {

	@Autowired
	private IHotelService iHotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5DbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Ciudadano ciu = new Ciudadano(); ciu.setApellido("Boada");
		 * ciu.setNombre("Marlon"); //this.iCiudadanoService.ingresar(ciu);
		 * 
		 * Empleado emple = new Empleado(); emple.setFechaIngreso(LocalDateTime.now());
		 * emple.setSalario(new BigDecimal(1200));
		 * emple.setCiudadano(this.iCiudadanoService.buscar(1)); //
		 * this.iEmpledoService.ingresar(emple);
		 * 
		 * Empleado emple2 = new Empleado();
		 * emple2.setFechaIngreso(LocalDateTime.now()); emple2.setSalario(new
		 * BigDecimal(1000)); emple2.setCiudadano(ciu);
		 * //this.iEmpledoService.ingresar(emple2); // Empleado emple3 = new Empleado();
		 * emple3.setFechaIngreso(LocalDateTime.now()); emple3.setSalario(new
		 * BigDecimal(1000));
		 * 
		 * 
		 * Ciudadano ciu3 = new Ciudadano(); ciu3.setApellido("Boada");
		 * ciu3.setNombre("Clare"); ciu3.setEmpleado(emple3); emple3.setCiudadano(ciu3);
		 * this.iCiudadanoService.ingresar(ciu3);
		 */

		Hotel hote1 = new Hotel();

		hote1.setDireccion("Universitaria");
		hote1.setNombre("ElHueco");

		Habitacion habi1 = new Habitacion();

		habi1.setClase("Premium");
		habi1.setHotel(hote1);
		habi1.setNumero("1A");

		Habitacion habi2 = new Habitacion();

		habi2.setClase("Premium");
		habi2.setHotel(hote1);
		habi2.setNumero("1B");

		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(habi1);
		habitaciones.add(habi2);
		hote1.setHabitaciones(habitaciones);

		this.iHotelService.ingresar(hote1);

	}

}
