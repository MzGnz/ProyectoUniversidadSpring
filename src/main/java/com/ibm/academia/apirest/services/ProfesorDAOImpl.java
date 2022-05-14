package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.models.entities.Profesor;
import com.ibm.academia.apirest.models.entities.Carrera;
import com.ibm.academia.apirest.models.entities.Persona;
import com.ibm.academia.apirest.repositories.PersonaRepository;
import com.ibm.academia.apirest.repositories.ProfesorRepository;

@Service
public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO
{
	@Autowired
	public ProfesorDAOImpl(@Qualifier("repositorioProfesores")PersonaRepository repository)
	{
		super(repository);
	}

	@Override
	public Persona actualizar(Persona profesorEncontrado, Persona profesor) {
		Persona profesorActualizado = null;
		profesorEncontrado.setNombre(profesor.getNombre());
		profesorEncontrado.setApellido(profesor.getApellido());
		profesorEncontrado.setDireccion(profesor.getDireccion());
		profesorActualizado = repository.save(profesorEncontrado);
		return profesorActualizado;
	}
	/*@Autowired
	public ProfesorDAOImpl(@Qualifier("repositorioProfesores")PersonaRepository repository)
	{
		super(repository);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Persona> buscarProfersorPorNombreCarrera(String nombre) 
	{
		
		return ((ProfesorRepository)repository).buscarProfesorPorNombreCarrera(nombre);
	}

	/*@Override
	@Transactional
	public Persona actualizarProfesor(Persona profesorEncontrado, Persona profesor) 
	{
		Persona profesorActualizado = null;
		profesorEncontrado.setNombre(profesor.getNombre());
		profesorEncontrado.setApellido(profesor.getApellido());
		profesorEncontrado.setDireccion(profesor.getDireccion());
		profesorActualizado = repository.save(profesorEncontrado);
		return profesorActualizado;
	}

	@Override
	@Transactional
	public Persona asociarCarreraProfesor(Persona profesor, Carrera carreras) 
	{
		((Profesor)profesor).setCarreras(carreras);
		return repository.save(profesor);
		return null;
	}*/

}