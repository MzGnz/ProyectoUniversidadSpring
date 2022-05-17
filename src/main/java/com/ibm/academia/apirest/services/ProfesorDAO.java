package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.models.entities.Carrera;
import com.ibm.academia.apirest.models.entities.Persona;

public interface ProfesorDAO extends PersonaDAO
{
	public Persona actualizarProfesor(Persona profesorEncontrado, Persona profesor);
	public Iterable<Persona> buscarProfersorPorNombreCarrera(String carrera);
	public Persona asociarCarreraProfesor(Persona profesor, Carrera carrera);
	
}