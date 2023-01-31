package com.codetreatise.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
//estas anotaciones me permiten no tener que declarar en los getters y setter en los pojos de clase
@Getter
@Setter
public class Carnet {

	//valores de la clase
	
	@Id  //el id que ira a base de datos del programa
	@SequenceGenerator(name="Carnetsequence",sequenceName= "CarnetSQL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator= "Carnetsequence")
	@Column(name = "id_Carnet", updatable = false, nullable = false)
	private long idperegrino;
	
	private LocalDate fechaexp;
	
	private double distanciaRecorrida;
	
	private int n_vips;
	
	

	//constructor por defecto
	public Carnet() {
		
	}
	
	
	
	
}
