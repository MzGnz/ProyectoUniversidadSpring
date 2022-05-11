package com.ibm.academia.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.exceptions.BadRequestException;
import com.ibm.academia.apirest.exceptions.NotFoundException;
import com.ibm.academia.apirest.services.CarreraDAO;

@RestController
@RequestMapping("/carrera")
public class CarreraController 
{
	@Autowired
	private CarreraDAO carreraDAO;
	
	@GetMapping("/lista/carreras")
	public List<Carrera> buscarTodas()
	{
		List<Carrera> carreras = (List<Carrera>) carreraDAO.buscarTodos();
		if(carreras.isEmpty())
			throw new BadRequestException("No existen Carreras");
		
		return carreras;
	}
	
	@GetMapping("/id/{carreraId}")
	public Carrera buscarCarreraPorId(@PathVariable Integer carreraId)
	{
		/*Optional<Carrera> oCarrera = carreraDAO.buscarPorId(carreraId);
		if(!oCarrera.isPresent())
			throw new BadRequestException(String.format("La carrera con ID: %d no existe", carreraId));
		return oCarrera.get();*/
		
		Carrera carrera = carreraDAO.buscarPorId(carreraId).orElse(null);
		if(carrera ==null)
			throw new BadRequestException(String.format("La carrera con ID: %d no existe", carreraId));
		
		return carrera;
	}
	
	@PostMapping
	public  ResponseEntity<?> guardarCarrera(@Valid @RequestBody Carrera carrera, BindingResult result)
	{
		Map<String, Object> validaciones = new HashMap<String, Object>();
		if(result.hasErrors())
		{
			List<String> listaErrores = result.getFieldErrors()
					.stream().map(errores -> "Campo: '" + errores.getField() + "' " + errores.getDefaultMessage())
					.collect(Collectors.toList());
			validaciones.put("Lista Errores", listaErrores);
			return new ResponseEntity<Map<String, Object>>(validaciones, HttpStatus.BAD_REQUEST);
		}
		
		/*if(carrera.getCantidadAnios() < 0)
			throw new BadRequestException("El campo cantidad de años debe ser mayor a 0");
		
		if(carrera.getCantidadMaterias() < 0)
			throw new BadRequestException("El campo materias de años debe ser mayor a 0");*/
		
		Carrera carreraGuardada = carreraDAO.guardar(carrera);
		
		return new ResponseEntity<Carrera>(carreraGuardada, HttpStatus.CREATED);
	}
	
	/**
	 * EndPoint para actualizar un objeto tipo carrera
	 * @param carreraId Parametro para buscar la carrera
	 * @param carrera Objeto con la información a modificar
	 * @return Retorna un objeto de tipo Carrera con la información actualizada
	 * @NotFoundException En caso de que falle actualizando el objeto Carrera
	 * @author javieralejandrocalixtocano
	 */
	@PutMapping("/upd/carreraId/{carreraId}")
	public ResponseEntity<?> actualizarCarrera(@PathVariable Integer carreraId, @RequestBody Carrera carrera)
	{
		Optional<Carrera> oCarrera = carreraDAO.buscarPorId(carreraId);
		
		if(!oCarrera.isPresent())
			throw new NotFoundException(String.format("La carrera con ID: %d no existe", carreraId));
		
		Carrera carreraActualizada = carreraDAO.actualizar(oCarrera.get(), carrera);
		
		return new ResponseEntity<Carrera>(carreraActualizada, HttpStatus.OK);
		
	}

	@DeleteMapping("/carreraId/{carreraId}")
	public ResponseEntity<?> eliminarCarrera(@PathVariable Integer carreraId)
	{
		Map<String, Object> respuesta = new HashMap<String, Object>();
		
		Optional<Carrera> carrera = carreraDAO.buscarPorId(carreraId);
		
		if(!carrera.isPresent())
			throw new NotFoundException(String.format("La carrera con ID: %d no existe", carreraId));
		
		carreraDAO.eliminarPorId(carreraId);
		respuesta.put("Ok", "Carrera ID: " + carreraId + " eliminada exitosamente");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}
	
}