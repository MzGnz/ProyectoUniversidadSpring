package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.models.entities.Persona;

//@Repository
public interface EmpleadoRepository extends PersonaRepository 
{
	/*//@Query("select a from Profesor a where a.carrera.nombre = ?1")
	@Query("select a from Empleado a join fetch a.carrera c where c.nombre = ?1")
	public Iterable<Persona> buscarEmpleadoPorNombreCarrera(String carrera);*/
}