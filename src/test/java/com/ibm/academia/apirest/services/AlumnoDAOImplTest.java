package com.ibm.academia.apirest.services;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ibm.academia.apirest.repositories.AlumnoRepository;

@SpringBootTest
public class AlumnoDAOImplTest 
{
	@MockBean
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private AlumnoDAO alumnoDAO;
	 
	@Test
	void buscarAlumnoPorNombreCarrera()
	{
		//When
		alumnoDAO.buscarAlumnoPorNombreCarrera(anyString());

		//Then
		verify(alumnoRepository).buscarAlumnoPorNombreCarrera(anyString());
	}
}