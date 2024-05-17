package com.iacg.batch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase de representa una Entidad en la BD
 * 
 * @author IACG
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "persons")
public class PersonModel {

	/**
	 * Variable id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Variable name
	 */
	@Column(name = "name")
	private String name;
	
	/**
	 * Variable lastName
	 */
	@Column(name = "last_name")
	private String lastName;
	
	/**
	 * Variable email
	 */
	@Column(name = "email")
	private String email;
	
	/**
	 * Variable phone
	 */
	@Column(name = "phone")
	private String phone;
	
	/**
	 * Variable age
	 */
	@Column(name = "age")
	private Integer age;
	
	/** 
	 * Variable createAt
	 */
	@Column(name = "create_at")
	private String createAt;
	
}//Fin de clase
