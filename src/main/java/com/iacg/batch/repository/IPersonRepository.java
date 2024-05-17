package com.iacg.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iacg.batch.model.PersonModel;

/**
 * Interfaz que contiene la implentacion de los metodos JPA
 * Entidad asoicada: PersonModel
 * 
 * @author IACG
 */
@Repository
public interface IPersonRepository extends JpaRepository<PersonModel, Long>{

}//Fin de clase
