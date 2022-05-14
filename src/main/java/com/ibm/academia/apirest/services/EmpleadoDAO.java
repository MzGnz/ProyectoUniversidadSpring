package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.models.entities.Persona;

public interface EmpleadoDAO extends PersonaDAO
{
	public Persona actualizar(Persona empleadoEncontrado, Persona empleado);

}