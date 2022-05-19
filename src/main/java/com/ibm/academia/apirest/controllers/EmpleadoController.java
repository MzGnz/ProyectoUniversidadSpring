package com.ibm.academia.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.apirest.exceptions.BadRequestException;
import com.ibm.academia.apirest.exceptions.NotFoundException;
import com.ibm.academia.apirest.models.entities.Persona;
import com.ibm.academia.apirest.services.CarreraDAO;
import com.ibm.academia.apirest.services.EmpleadoDAO;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController 
{
	@Autowired
	@Qualifier("empleadoDAOImpl")
	private EmpleadoDAO empleadoDao;
	
	@PostMapping
	public ResponseEntity<?> crearEmpleado(@RequestBody Persona empleado)
	{
		Persona empleadoGuardado = empleadoDao.guardar(empleado);
		return new ResponseEntity<Persona>(empleadoGuardado,HttpStatus.CREATED);
	}
	
	@GetMapping("/empleados/lista")
	public ResponseEntity<?> obtenerEmpleados()
	{
		List<Persona> empleados = (List<Persona>) empleadoDao.buscarTodos();
		
		if(empleados.isEmpty())
			throw new NotFoundException("No existen empleados");
		return new ResponseEntity<List<Persona>>(empleados, HttpStatus.OK);	
	}
	
	@GetMapping("/empleadoId/{empleadoId}")
	public ResponseEntity<?> obtenerEmpleadoPorId(@PathVariable Integer empleadoId)
	{
		Optional<Persona> oEmpleado = empleadoDao.buscarPorId(empleadoId);
		if(!oEmpleado.isPresent())
			throw new BadRequestException(String.format("El empleado con Id: %d no existe", empleadoId));
		return new ResponseEntity<List<Persona>>((List<Persona>) oEmpleado.get(), HttpStatus.OK);
	}
	
	@DeleteMapping("/empleadoId/{empleadoId}")
	public ResponseEntity<?> eliminarEmpleado(@PathVariable Integer empleadoId)
	{
		
		Optional<Persona> oEmpleado = empleadoDao.buscarPorId(empleadoId);
		
		if(!oEmpleado.isPresent())
			throw new NotFoundException(String.format("El empleado con ID: %d no existe", empleadoId));
		
		empleadoDao.eliminarPorId(oEmpleado.get().getId());
		return new ResponseEntity<String>("Aula ID: " + empleadoId + " se eliminó satisfactoriamente", HttpStatus.NO_CONTENT);
	}
}