package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Alumno;
import com.example.demo.service.IAlumnoService;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class Pa2U2P5DbDbApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService iEstudianteService;
	@Autowired
	private IAlumnoService iAlumnoService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5DbDbApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
	
//		
//		Estudiante estu = new Estudiante();
//		
//		estu.setApellido("Boada");
//		estu.setCedula("1720030715");
//		estu.setNombre("Marlon");
//		
//		//this.iEstudianteService.insertar(estu);
//		
//		System.out.println(this.iEstudianteService.encontrar(1));
//		
//		estu.setNombre("Alejandro");
//		this.iEstudianteService.modificar(estu);
//		
//		//eliminar
//		this.iEstudianteService.borrar(2);
		
		Alumno alu = new Alumno();
		
		alu.setNombre("David");
		//this.iAlumnoService.insertar(alu);
		
		//this.iAlumnoService.encontar(2);
		Alumno alu2 = this.iAlumnoService.encontar(1);
		alu2.setNombre("Xavier");
	
		this.iAlumnoService.modificar(alu2);
		

		
		
		
		
	}
	
	

}
