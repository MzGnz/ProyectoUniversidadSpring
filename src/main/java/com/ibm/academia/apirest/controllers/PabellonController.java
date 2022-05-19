package com.ibm.academia.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.ibm.academia.apirest.models.entities.Pabellon;
import com.ibm.academia.apirest.services.PabellonDAO;

@RestController
@RequestMapping("/pabellon")
public class PabellonController 
{
	@Autowired
	private PabellonDAO pabellonDao;
	
	@GetMapping("/lista/pabellones")
    public List<Pabellon> buscarTodas()
    {
        List<Pabellon> pabellones = (List<Pabellon>) pabellonDao.buscarTodos();
        if(pabellones.isEmpty())
            throw  new BadRequestException("No existen pabellones");
        return pabellones;
    }
	
	@PostMapping()
    public ResponseEntity<?> crearPabellon(@RequestBody Pabellon pabellon)
    {
        Pabellon pabellonGuardado= pabellonDao.guardar(pabellon);
        return new ResponseEntity<Pabellon>(pabellonGuardado, HttpStatus.CREATED);
    }
	
	@GetMapping("/id/{pabellonId}")
    public Pabellon buscarPabellonPorId(@PathVariable Integer pabellonId)
    {
        Optional<Pabellon> oPabellon = pabellonDao.buscarPorId(pabellonId);
        if(!oPabellon.isPresent())
            throw new BadRequestException(String.format("El Pabellon con Id: %d no existe", pabellonId));
        return  oPabellon.get();
    }
	
	@DeleteMapping("/pabellonId/{pabellonId}")
    public ResponseEntity<?> eliminarPabellon(@PathVariable Integer pabellonId)
    {
		Optional<Pabellon> oPabellon = pabellonDao.buscarPorId(pabellonId);
		
		if(!oPabellon.isPresent())
			throw new NotFoundException(String.format("El Pabellon con Id: %d no existe", pabellonId));
		
		pabellonDao.eliminarPorId(oPabellon.get().getId());
		return new ResponseEntity<String>("Pabellon con ID: " + pabellonId + " se eliminó satisfactoriamente", HttpStatus.NO_CONTENT);
    }
}