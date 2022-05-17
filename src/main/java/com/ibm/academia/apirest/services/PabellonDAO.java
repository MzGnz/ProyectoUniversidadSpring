package com.ibm.academia.apirest.services;

import java.util.Optional;

import com.ibm.academia.apirest.models.entities.Direccion;
import com.ibm.academia.apirest.models.entities.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>
{
	public Optional<Pabellon> buscarPabellonPorDireccion(Direccion direccion);
	
	public Optional<Pabellon> buscarPabellonPorNombre(String nombre);

}