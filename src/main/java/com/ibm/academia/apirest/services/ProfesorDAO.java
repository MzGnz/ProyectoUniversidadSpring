package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.models.entities.Persona;

public interface ProfesorDAO extends PersonaDAO
{
	public Persona actualizar(Persona profesorEncontrado, Persona profesor);
	/*public Iterable<Persona> buscarProfersorPorNombreCarrera(String nombre);*/
}