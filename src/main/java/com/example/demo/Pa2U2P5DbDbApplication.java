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

		//this.iEmpleadoService.ingresar(emple);

		System.out.println("NamedQuery");
		Ciudadano NamedQuery1 = this.iCiudadanoService.buscarPorApellidoNamed("Boada");
		System.err.println("NamedQuery 1 ");
		System.out.println("\t" + NamedQuery1);
		Empleado NamedQuery2 = this.iEmpleadoService.buscarPorApellidoNamed("Boada");
		System.err.println("NamedQuery 2 : ");
		System.out.println("\t" + NamedQuery2);
		Empleado NamedQuery3 = this.iEmpleadoService.buscarPorApellidonNombre("David");
		System.err.println("NamedQuery 3 : ");
		System.out.println("\t" + NamedQuery3);

		Ciudadano NamedQuery4 = this.iCiudadanoService.buscarPorNombreNamed("David");
		System.err.println("NamedQuery 4 : ");
		System.out.println("\t" + NamedQuery3);

		Ciudadano NamedQuery5 = this.iCiudadanoService.buscarPorCedulaNamed("1720030723");
		System.err.println("NamedQuery 5 : ");
		System.out.println("\t" + NamedQuery5);

		System.out.println("NativeQuery");

		Ciudadano NativeQuery1 = this.iCiudadanoService.buscarPorNombreNative("David");
		System.err.println("NativeQuery1 : ");
		System.out.println("\t" + NativeQuery1);

		Ciudadano NativeQuery2 = this.iCiudadanoService.buscarPorApellidoNative("Boada");
		System.err.println("NativeQuery2 : ");
		System.out.println("\t" + NativeQuery2);
		Ciudadano NativeQuery3 = this.iCiudadanoService.buscarPorEdadNative("18");
		System.err.println("NativeQuery3 : ");
		System.out.println("\t" + NativeQuery3);
		
		Ciudadano NativeQuery4 = this.iCiudadanoService.buscarPorHobbieNative("basquet");
		System.err.println("NativeQuery4 : ");
		System.out.println("\t" + NativeQuery4);
		
		Ciudadano NativeQuery5 = this.iCiudadanoService.buscarPorGeneroNative("masculino");
		System.err.println("NativeQuery5 : ");
		System.out.println("\t" + NativeQuery5);
		

	}

}
