package com.iacg.batch.service;

import java.util.List;

import com.iacg.batch.model.PersonModel;

/**
 * Interfaz que contiene los metodos, para manejar la logica de negocio, relacionada
 * a la entidad personas
 * 
 * @author IACG
 */
public interface IPersonService {

	/**
	 * Metodo encargado de guardar una lista de personas
	 * @param personList Lista de personas
	 */
	Iterable<PersonModel> saveAll(List<PersonModel> personList);
	
}//Fin de clase
