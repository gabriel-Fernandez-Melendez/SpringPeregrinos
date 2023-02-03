package com.codetreatise.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
//estas anotaciones me permiten no tener que declarar en los getters y setter en los pojos de clase
@Getter
@Setter
@Data
public class Carnet {

	//valores de la clase
	
	@Id  //el id que ira a base de datos del programa
	@SequenceGenerator(name="Carnetsequence",sequenceName= "CarnetSQL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator= "Carnetsequence")
	@Column(name = "id", updatable = false, nullable = false)
	private long id_c;
	
	private LocalDate fechaexp;
	
	private double distanciaRecorrida;
	
	private int n_vips;
	
	//deberia incluir aqui un peregrino para hacerlo bidireccional ?
	@OneToOne(mappedBy = "carnet")
	private Peregrino peregrino;
	
	//esta es la relacion con la parada donde se emite el carnets
	@OneToOne()
	private Parada parada;

	//constructor por defecto
	public Carnet() {
		
	}


	
	
	
	
}
