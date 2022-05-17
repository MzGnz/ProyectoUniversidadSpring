package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.enums.TipoEmpleado;
import com.ibm.academia.apirest.models.entities.Persona;

@Repository("repositorioEmpleados")
public interface EmpleadoRepository extends PersonaRepository /*CrudRepository<Persona, Integer>*/
{
	@Query("select a from Empleado a where a.tipo_empleado = ?1")
	public Iterable<Persona> buscarEmpleadoPorTipoEmpleado(TipoEmpleado tipoempleado);
}