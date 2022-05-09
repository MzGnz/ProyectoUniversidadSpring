package com.ibm.academia.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.services.AlumnoDAO;

@SpringBootApplication
public class UniversidadesRestApplication 
{
	@Autowired
	private AlumnoDAO alumnoDao;
	
	public static void main(String[] args) 
	{
		SpringApplication.run(UniversidadesRestApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() 
	{	
		return args ->{
			/*Direccion direccion = new Direccion("Calle 3","46","223",null,null,"campin");
			Persona alumno = new Alumno(null,"Mario","Moreno","323766723",direccion);
			
			Persona personaGuardada = alumnoDao.guardar(alumno);
			System.out.println(personaGuardada.toString());*/
			
			/*List<Persona> alumnos = (List<Persona>) alumnoDao.buscarTodos();
			alumnos.forEach(System.out::println);*/
		};
	}
}