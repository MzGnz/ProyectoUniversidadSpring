package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.models.entities.Persona;

@Repository("repositorioProfesores")
public interface ProfesorRepository extends PersonaRepository 
{
	@Query("select a from Profesor a join fetch a.carrera c where c.nombre = ?1")
	public Iterable<Persona> buscarProfesorPorNombreCarrera(String carrera);
}