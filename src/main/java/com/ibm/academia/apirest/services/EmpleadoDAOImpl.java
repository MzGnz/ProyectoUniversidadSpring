package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.models.entities.Persona;
import com.ibm.academia.apirest.repositories.PersonaRepository;

@Service
public class EmpleadoDAOImpl { /*extends PersonaDAOImpl implements EmpleadoDAO
{
	@Autowired
	public EmpleadoDAOImpl(@Qualifier("repositorioEmpleados")PersonaRepository repository)
	{
		super(repository);
	}
	
	@Override
	@Transactional
	public Persona actualizar(Persona empleadoncontrado, Persona empleado) 
	{
		Persona empleadoActualizado = null;
		empleadoncontrado.setNombre(empleado.getNombre());
		empleadoncontrado.setApellido(empleado.getApellido());
		empleadoncontrado.setDireccion(empleado.getDireccion());
		empleadoActualizado = repository.save(empleadoncontrado);
		return empleadoActualizado;
	}*/
}