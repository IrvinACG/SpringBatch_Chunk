package com.iacg.batch.steps;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.iacg.batch.model.PersonModel;
import com.iacg.batch.service.IPersonService;

/**
 * Clase que se encarga de escribir/guardar los datosc
 * 
 * @author IACG
 */
public class PersonItemWriter implements ItemWriter<PersonModel>{

	/**
	 * Variable personService
	 */
	@Autowired
	private IPersonService personService;
	
	/**
	 * Metodo que se encarga de guardar los datos recibidos
	 */
	@Override
	public void write(List<? extends PersonModel> items) throws Exception {		
		//Guardar datos
		personService.saveAll((List<PersonModel>) items);
	}

}//Fin de clase
