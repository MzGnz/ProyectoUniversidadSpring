package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.models.entities.Direccion;
import com.ibm.academia.apirest.models.entities.Pabellon;

@Repository
public interface PabellonRepository extends CrudRepository<Pabellon, Integer>
{
	@Query(value = "select * from universidad.pabellones where localidad = ?1", nativeQuery = true)
	public Iterable<Pabellon> findPabellonByDireccion(Direccion direccion);
	
	@Query("select p from Pabellon p where p.nombre = ?1 ")
	public Iterable<Pabellon> findPabellonByNombre(String nombre);
}