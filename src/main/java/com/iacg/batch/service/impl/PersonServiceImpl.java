package com.iacg.batch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iacg.batch.model.PersonModel;
import com.iacg.batch.repository.IPersonRepository;
import com.iacg.batch.service.IPersonService;

/**
 * Servicio que contiene los metodos, para manejar la logica de negocio, relacionada
 * a la entidad personas
 * 
 * @author IACG
 */
@Service
public class PersonServiceImpl implements IPersonService{
	
	/**
	 * Variable personRepository
	 */
	@Autowired
	private IPersonRepository personRepository;

	/**
	 * Metodo encargado de guardar una lista de personas
	 * @param personList Lista de personas
	 */
	@Override
	@Transactional
	public Iterable<PersonModel> saveAll(List<PersonModel> personList) {
		return personRepository.saveAll(personList);
	}

}//Fin de clase
