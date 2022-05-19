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
import com.ibm.academia.apirest.services.PersonaDAO;

@RestController
@RequestMapping("/profesor")
public class ProfesorController 
{
	@Autowired
	@Qualifier("profesorDAOImpl")
	private PersonaDAO profesorDao;
	
	@PostMapping
	public ResponseEntity<?> crearProfesor(@RequestBody Persona profesor)
	{
		Persona profesorGuardado = profesorDao.guardar(profesor);
		return new ResponseEntity<Persona>(profesorGuardado,HttpStatus.CREATED);
	}
	
	@GetMapping("/profesores/lista")
	public ResponseEntity<?> obtenerProfesores()
	{
		List<Persona> profesores = (List<Persona>) profesorDao.buscarTodos();
		
		if(profesores.isEmpty())
			throw new NotFoundException("No existen profesores");
		return new ResponseEntity<List<Persona>>(profesores, HttpStatus.OK);	
	}
	
	@GetMapping("/profesorId/{profesorId}")
	public ResponseEntity<?> obtenerProfesorPorId(@PathVariable Integer profesorId)
	{
		Optional<Persona> oProfesor = profesorDao.buscarPorId(profesorId);
		if(!oProfesor.isPresent())
			throw new BadRequestException(String.format("El profesor con Id: %d no existe", profesorId));
		return new ResponseEntity<List<Persona>>((List<Persona>) oProfesor.get(), HttpStatus.OK);
	}
	
	@DeleteMapping("/profesorId/{profesorId}")
	public ResponseEntity<?> eliminarProfesor(@PathVariable Integer profesorId)
	{
		
		Optional<Persona> oProfesor = profesorDao.buscarPorId(profesorId);
		
		if(!oProfesor.isPresent())
			throw new NotFoundException(String.format("El profesor con ID: %d no existe", profesorId));
		
		profesorDao.eliminarPorId(oProfesor.get().getId());
		return new ResponseEntity<String>("Profesor con ID: " + profesorId + " se eliminó satisfactoriamente", HttpStatus.NO_CONTENT);
	}
	
}