package com.ibm.academia.apirest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.enums.TipoPizarron;
import com.ibm.academia.apirest.models.entities.Aula;

@Repository
public interface AulaRepository extends CrudRepository<Aula, Integer>
{
	public Iterable<Aula> buscarAulaPorTipoPizarron(TipoPizarron pizarron);
	
	public Iterable<Aula> buscarAulaPorNombrePabellon(String nombre);
	
	public Iterable<Aula> buscarAulaPorNumeroAula(Integer numeroaula);

}