package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.enums.TipoPizarron;
import com.ibm.academia.apirest.models.entities.Aula;
import com.ibm.academia.apirest.models.entities.Pabellon;

@Repository
public interface AulaRepository extends CrudRepository<Aula, Integer>
{
	@Query(value = "select * from universidad.aulas where tipo_pizarron =?1", nativeQuery = true)
	public Iterable<Aula> findAulasByPizarron(TipoPizarron pizarron);
	
	@Query(value = "select * from universidad.aulas where numeroAula =?1", nativeQuery = true)
	public Iterable<Aula> findAulasByNumeroAula(Integer numeroAula);
	
	//Buscar por atributo 
	@Query("select a from Aula a join fetch a.pabellon p where p.nombre = ?1")
	public Iterable<Aula> findAulasByPabellon(String nombre);

}