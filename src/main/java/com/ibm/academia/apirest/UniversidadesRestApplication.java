package com.ibm.academia.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversidadesRestApplication 
{
	/*@Autowired
	private AlumnoDAO alumnoDao;*/
	
	public static void main(String[] args) 
	{
		SpringApplication.run(UniversidadesRestApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner runner() 
	{	
		return args ->{
			/*Direccion direccion = new Direccion("Calle 3","46","223",null,null,"campin");
			Persona alumno = new Alumno(null,"Mario","Moreno","323766723",direccion);
			
			Persona personaGuardada = alumnoDao.guardar(alumno);
			System.out.println(personaGuardada.toString());
			
			List<Persona> alumnos = (List<Persona>) alumnoDao.buscarTodos();
			alumnos.forEach(System.out::println);
		};
	}*/
}