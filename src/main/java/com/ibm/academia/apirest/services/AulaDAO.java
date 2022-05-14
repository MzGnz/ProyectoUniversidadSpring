package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.models.entities.Aula;

public interface AulaDAO extends GenericoDAO<Aula>
{
	public Aula actualizar(Aula aulaEncontrada, Aula aula);
}