package com.ibm.academia.apirest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.academia.apirest.entities.Alumno;
import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.services.AlumnoDAO;
import com.ibm.academia.apirest.services.CarreraDAO;
import com.ibm.academia.apirest.services.PersonaDAO;

@Component
public class AlumnosComandos implements CommandLineRunner
{
	@Autowired
	@Qualifier("alumnoDAOImpl")
	private PersonaDAO personaDAO;
	
	@Autowired
	private CarreraDAO carreraDAO;
	
	@Autowired
	private AlumnoDAO alumnoDAO;
	
	@Override
	public void run(String... args) throws Exception
	{
		/*Optional<Carrera> ingSistemas = carreraDAO.buscarPorId(1);
		
		Iterable<Persona> alumnos = personaDAO.buscarTodos();
		alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(ingSistemas.get()));
		alumnos.forEach(alumno -> personaDAO.guardar(alumno));
		
		Optional<Persona> alumno = alumnoDAO.buscarPorId(1);
		
		Optional<Persona> personaDni = personaDAO.buscarPorDni(alumno.get().getDni());
		System.out.println("DNI: " + personaDni.toString());*/
	}
	
}