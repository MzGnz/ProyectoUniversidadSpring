package com.ibm.academia.apirest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.apirest.exceptions.NotFoundException;
import com.ibm.academia.apirest.models.entities.Persona;
import com.ibm.academia.apirest.services.PersonaDAO;

/*@RestController
@RequestMapping("/persona")*/
public class PersonaController 
{
	/*@Autowired
	@Qualifier//("personaDAOImpl")
	private PersonaDAO personaDAO;
	
	@GetMapping("/nombre-apellido")
	public ResponseEntity<?> buscarPersonaPorNombreYApellido(@RequestParam String nombre, @RequestParam String apellido)
	{
		Optional<Persona> oPersona = personaDAO.buscarPorNombreYApellido(nombre, apellido);
		
		if(!oPersona.isPresent())
			throw new NotFoundException(String.format("No se encontrĂ³ a la persona con npmbre %s y apellido %s", nombre,apellido));
		
		return new ResponseEntity<Persona>(oPersona.get(), HttpStatus.OK);
	}*/
}