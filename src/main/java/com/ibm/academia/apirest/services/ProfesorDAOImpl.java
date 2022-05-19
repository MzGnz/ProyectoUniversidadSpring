package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.models.entities.Carrera;
import com.ibm.academia.apirest.models.entities.Persona;
import com.ibm.academia.apirest.repositories.PersonaRepository;


@Service
public class ProfesorDAOImpl extends PersonaDAOImpl implements ProfesorDAO
{
	@Autowired
	public ProfesorDAOImpl(@Qualifier("repositorioProfesores")PersonaRepository repository)
	{
		super(repository);
	}
}
	/*@Override
	public Persona actualizarProfesor(Persona profesorEncontrado, Persona profesor) {
		Persona profesorActualizado = null;
		profesorEncontrado.setNombre(profesor.getNombre());
		profesorEncontrado.setApellido(profesor.getApellido());
		profesorEncontrado.setDireccion(profesor.getDireccion());
		profesorActualizado = repository.save(profesorEncontrado);
		return profesorActualizado;
	}

	@Override
	public Iterable<Persona> buscarProfersorPorNombreCarrera(String carrera) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Persona asociarCarreraProfesor(Persona profesor, Carrera carrera) {
		// TODO Auto-generated method stub
		return null;
	}
	
}*/