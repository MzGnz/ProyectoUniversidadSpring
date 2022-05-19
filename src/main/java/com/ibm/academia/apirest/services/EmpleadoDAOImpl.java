package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.apirest.enums.TipoEmpleado;
import com.ibm.academia.apirest.models.entities.Persona;
import com.ibm.academia.apirest.repositories.PersonaRepository;


@Service
public class EmpleadoDAOImpl extends PersonaDAOImpl implements EmpleadoDAO
{
	@Autowired
	public EmpleadoDAOImpl(@Qualifier("repositorioEmpleados")PersonaRepository repository)
	{
		super(repository);
	}
}	
	/*@Override
	@Transactional
	public Persona actualizarEmpleado(Persona empleadoencontrado, Persona empleado) 
	{
		Persona empleadoActualizado = null;
		empleadoencontrado.setNombre(empleado.getNombre());
		empleadoencontrado.setApellido(empleado.getApellido());
		empleadoencontrado.setDireccion(empleado.getDireccion());
		empleadoActualizado = repository.save(empleadoencontrado);
		return empleadoActualizado;
	}


	@Override
	public Iterable<Persona> buscarEmpleadoPorTipoEmpleado(TipoEmpleado tipoEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}	
}*/