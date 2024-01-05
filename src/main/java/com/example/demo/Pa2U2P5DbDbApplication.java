package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Habitacion;
import com.example.demo.repo.modelo.Hotel;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;

@SpringBootApplication
public class Pa2U2P5DbDbApplication implements CommandLineRunner {

	@Autowired
	private IHotelService iHotelService;
	
	@Autowired
	private IHabitacionService iHabitacionService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5DbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
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
		
		this.iHabitacionService.ingresar(habi1);
		

		

	}

}
