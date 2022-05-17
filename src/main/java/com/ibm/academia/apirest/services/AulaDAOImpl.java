package com.ibm.academia.apirest.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.enums.TipoPizarron;
import com.ibm.academia.apirest.models.entities.Aula;
import com.ibm.academia.apirest.repositories.AulaRepository;

@Service
public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO
{
	@Autowired
	public AulaDAOImpl(AulaRepository repository)
	{
		super(repository);
	}

	@Override
	@Transactional
	public Aula actualizar(Aula aulaEncontrada, Aula aula) {
		Aula aulaActualizado = null;
		aulaEncontrada.setNumeroAula(aula.getNumeroAula());
		aulaEncontrada.setCantidadPupitres(aula.getCantidadPupitres());
		aulaEncontrada.setMedidas(aula.getMedidas());
		aulaEncontrada.setPizarron(aula.getPizarron());
		aulaActualizado = repository.save(aulaEncontrada);
		return aulaActualizado;
	}

	@Override
	public Iterable<Aula> buscarAulaPorTipoPizarron(TipoPizarron tipoPizarron) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Aula> buscarAulaPorNumeroAula(Integer numeroaula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Aula> buscarAulaPorNombrePabellon(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}