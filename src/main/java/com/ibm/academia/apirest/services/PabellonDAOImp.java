package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.models.entities.Pabellon;
import com.ibm.academia.apirest.repositories.PabellonRepository;

@Service
public class PabellonDAOImp extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO
{
	@Autowired
	public PabellonDAOImp(PabellonRepository repository)
	{
		super(repository);
	}

}